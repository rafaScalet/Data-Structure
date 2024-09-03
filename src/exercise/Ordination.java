package exercise;

import data.Queue;

public class Ordination {
	public static void separateCharacters (String expression) {
		Queue<Character> upperCaseLetters = new Queue<>();
		Queue<Character> lowerCaseLetters = new Queue<>();
		Queue<Character> numbers= new Queue<>();
		Queue<Character> symbols = new Queue<>();

		for (int index = 0; index < expression.length(); index++) {
			char character = expression.charAt(index);

			if (Character.isLowerCase(character)) {
				lowerCaseLetters.add(character);
				continue;
			}

			if (Character.isUpperCase(character)) {
				upperCaseLetters.add(character);
				continue;
			}

			if (Character.isDigit(character)) {
				numbers.add(character);
				continue;
			}

			symbols.add(character);
		}

		System.out.print("\nMinúsculas: ");
		lowerCaseLetters.showInLine();

		System.out.print("\nMaiúsculas: ");
		upperCaseLetters.showInLine();

		System.out.print("\nNúmeros: ");
		numbers.showInLine();

		System.out.print("\nOutros: ");
		symbols.showInLine();
	}
}
