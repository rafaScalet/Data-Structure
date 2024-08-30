package main;

import java.util.Scanner;

import exercise.RPN;

public class ResolveRPN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter a Post-Fix expression: ");

			String expression = in.next();

			System.out.println("\nResult: " + RPN.resolve(expression));

			System.out.print("\nWant to proceed? (y/N): ");

			char option = in.next().toLowerCase().charAt(0);

			if (option != 'y') {
				in.close();
				return;
			}
		}
	}
}
