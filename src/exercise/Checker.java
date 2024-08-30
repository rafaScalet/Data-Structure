package exercise;

import data.Stack;

public class Checker {
	public static boolean isBalanced (String expression) {
		Stack<Character> stack = new Stack<>();

		for (int index = 0; index < expression.length(); index++) {
			char character = expression.charAt(index);

			if (character == '{' || character == '[' || character == '(') {
				stack.push(character);
				continue;
			}

			if (character == '}' || character == ']' || character == ')') {
				if (stack.isEmpty()) {
					return false;
				}

				char openValue = stack.pop();
				char closeValue = character;

				if (!isMatching(openValue, closeValue)) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	private static boolean isMatching (char opened, char closed) {
		return (
			(opened == '{' && closed == '}') ||
			(opened == '[' && closed == ']') ||
			(opened == '(' && closed == ')')
		);
	}
}
