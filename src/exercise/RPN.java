package exercise;

import data.Stack;

public class RPN {
	public static int resolve (String expression) {
		Stack<Integer> stack = new Stack<>();

		for (int index = 0; index < expression.length(); index++) {
			char character = expression.charAt(index);

			if (Character.isDigit(character)) {
				int value = character - '0';
				stack.push(value);
				continue;
			}

			int firstValue = stack.pop();
			int secondValue = stack.pop();

			int result;

			switch (character) {
				case '+': result = firstValue + secondValue; break;
				case '-': result = firstValue - secondValue; break;
				case '*': result = firstValue * secondValue; break;
				case '/': result = firstValue / secondValue; break;
				default: result = 0; break;
			}

			stack.push(result);
		}

		return stack.pop();
	}
}
