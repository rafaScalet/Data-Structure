package main;

import java.util.Scanner;

import exercise.Ordination;

public class SeparateString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter your expression: ");

			String expression = in.next();

			Ordination.separateCharacters(expression);

			System.out.print("\n\nWant to proceed? (y/N): ");

			char option = in.next().toLowerCase().charAt(0);

			if (option != 'y') {
				in.close();
				return;
			}
		}
	}
}
