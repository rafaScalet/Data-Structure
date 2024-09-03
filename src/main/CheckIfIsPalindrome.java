package main;

import java.util.Scanner;

import exercise.Checker;

public class CheckIfIsPalindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter your expression: ");

			String expression = in.next();

			if (Checker.isPalindrome(expression)) {
				System.out.println("Expression: " + expression + " is an palindrome");
			} else {
				System.out.println("Expression: " + expression + " is not an palindrome");
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
