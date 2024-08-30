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

	public static String infixToPostfix (String infixExpression) {
		Stack<Character> operatorStack = new Stack<>();
		String postfixExpression = "";

		for (int index = 0; index < infixExpression.length(); index++) {
			char character = infixExpression.charAt(index);

			if (Character.isAlphabetic(character)) {
				postfixExpression += character;
				continue;
			}

			if (character == '(') {
				operatorStack.push(character);
				continue;
			}

			if (character == ')') {
				while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
					postfixExpression += operatorStack.pop();
				}
				operatorStack.pop();
				continue;
			}

			while(!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(character)) {
				postfixExpression += operatorStack.pop();
				continue;
			}

			operatorStack.push(character);
		}

		while (!operatorStack.isEmpty()) {
			postfixExpression += operatorStack.pop();
		}

		return postfixExpression;
	}

	private static int getPrecedence (char operator) {
		switch (operator) {
			case '+': case '-': return 1;
			case '*': case '/': return 2;
			case '^': return 3;
			default: return 0;
		}
	}
}