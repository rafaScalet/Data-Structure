package main;

import java.util.Scanner;
import exercise.Fibonacci;

public class GenerateFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("\nEnter a number o generate a Fibonacci sequence: ");
			int quantity = in.nextInt();

			Fibonacci.generate(quantity);

			System.out.print("\nWant ot proceed? (y/N)");

			if (in.next().toLowerCase().charAt(0) != 'y') {
				in.close();
				return;
			}
		}
	}
}
