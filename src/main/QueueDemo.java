package main;

import java.util.Scanner;

import data.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("\n|---------------------|");
			System.out.println("| Chose an option:    |");
			System.out.println("| [1]add  [5]length   |");
			System.out.println("| [2]head [6]remove   |");
			System.out.println("| [3]tail [7]is empty |");
			System.out.println("| [4]show [8]exit     |");
			System.out.println("|---------------------|");
			System.out.print("↳ ");

			String option = in.next();

			switch (option) {
				case "1":
					System.out.print("\nEnter a number to add: ");
					int value = in.nextInt();
					queue.add(value);
					break;
				case "2":
					System.out.println("Queue head: " + queue.head());
					break;
				case "3":
					System.out.println("\nQueue tail: " + queue.tail());
					break;
				case "4":
					System.out.println("\nYour Queue: ");
					queue.show();
					break;
				case "5":
					System.out.println("\nQueue length: " + queue.length());
					break;
				case "6":
					System.out.println("\nRemoved value: " + queue.remove());
					break;
				case "7":
					System.out.println("\nIs Empty? " + (queue.isEmpty() ? "Yes" : "No"));
					break;
				case "8":
					System.out.println("\nExiting...");
					in.close();
					return;
				default: break;
			}
		}
	}
}
