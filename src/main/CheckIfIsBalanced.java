package main;

import exercise.Checker;

import java.util.Scanner;

public class CheckIfIsBalanced {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter your expression: ");

			String expression = in.next();

			if (Checker.isBalanced(expression)) {
				System.out.println("\nThe expression is balanced");
			} else {
				System.out.println("\nThe expression is not balanced");
			}

			System.out.print("\nWant to proceed? (y/N): ");

			char option = in.next().toLowerCase().charAt(0);

			if (option != 'y') {
				in.close();
				return;
			}
		}
	}
}
