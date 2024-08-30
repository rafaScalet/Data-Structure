package main;

import java.util.Scanner;
import exercise.RPN;

public class InfixToPostfix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter a infix expression: ");

			String infixExpression = in.next();

			System.out.println("\nYour Postfix expression: " + RPN.infixToPostfix(infixExpression));

			System.out.print("\nWant to proceed? (y/N): ");

			char option = in.next().toLowerCase().charAt(0);

			if (option != 'y') {
				in.close();
				return;
			}
		}
	}
}
