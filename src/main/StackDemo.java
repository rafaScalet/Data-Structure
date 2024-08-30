package main;

import java.util.Scanner;

import data.Stack;


public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); // ^ Cria um objeto stack que é do tipo Stack, passando integer (int) como sendo o tipo da lista
		Scanner in = new Scanner(System.in); // ^ Scanner para pegar o input do usuário

		// ? Este loop vai se repetir infinitamente até a opção 4 ser escolhida
		while (true) {
			// ? Um simples menu para pedir ao usuário uma opção
			System.out.println("\n|---------------------|");
			System.out.println("| Chose an option:    |");
			System.out.println("| [1]push [5]length   |");
			System.out.println("| [2]peek [6]pop      |");
			System.out.println("| [3]show [7]is empty |");
			System.out.println("| [4]exit             |");
			System.out.println("|---------------------|");
			System.out.print("↳ ");

			String option = in.next();

			switch (option) {
				case "1":
					System.out.print("\nEnter a number to add: ");
					int value = in.nextInt();
					stack.push(value);
					break;
				case "2":
					System.out.println("\nPeek of the Stack: " + stack.peek());
					break;
				case "3":
					System.out.println("\nYour Stack: ");
					stack.show();
					break;
				case "4":
					System.out.println("\nExiting...");
					in.close();
					return;
				case "5":
					System.out.println("\nStack length: " + stack.length());
					break;
				case "6":
					System.out.println("\nPopped value: " + stack.pop());
					break;
				case "7":
					System.out.println("\nIs Empty? " + (stack.isEmpty() ? "Yes" : "No"));
					break;
				default:
					System.out.println("\nEnter a valid value");
					break;
			}
		}
	}
}
