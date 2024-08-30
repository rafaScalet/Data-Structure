package main; // ~ Nome do pacote a ser chamado


// ? Imports necessários para o funcionamento do programa
import java.util.Scanner;

import data.DoubleLinearList;

public class ListDemo {
	public static void main(String[] args) {
		DoubleLinearList<Integer> list = new DoubleLinearList<>(); // ^ Cria um objeto list que é do tipo DoubleLinearList, passando o integer (int) como sendo o tipo da lista
		Scanner in = new Scanner(System.in); // ^ Scanner para pegar o input do usuário

		// ? Este loop vai se repetir infinitamente até a opção 10 ser escolhida, pois ela retorna, assim saindo do loop
		while (true) {
			// ? Um simples menu para pedir ao usuário uma opção
			System.out.println("\n|-------------------------|");
			System.out.println("| Choose an option:       |");
			System.out.println("| [01]add    [06]show     |");
			System.out.println("| [02]append [07]head     |");
			System.out.println("| [03]remove [08]tail     |");
			System.out.println("| [04]pop    [09]is empty |");
			System.out.println("| [05]length [10]exit     |");
			System.out.println("|-------------------------|");
			System.out.print("↳ ");

			String option = in.next(); // ^ Lê a opção que o usuário passou

			// ? switch case com a opção do usuário, se digitar um valor inválido só vai repetir o loop
			switch (option) {
				case "1":
					System.out.print("\nEnter a number to add: ");
					int valueToAdd = in.nextInt();
					list.add(valueToAdd);
					break;
				case "2":
					System.out.print("\nEnter a value to append: ");
					int valueToAppend = in.nextInt();
					list.append(valueToAppend);
					break;
				case "3":
					System.out.println("\nRemoved value: " + list.remove());
					break;
				case "4":
					System.out.println("\nPopped value: " + list.pop());
					break;
				case "5":
					System.out.println("\nList length: " + list.length());
					break;
				case "6":
					System.out.println("\nYour List: ");
					list.show();
					break;
				case "7":
					System.out.println("\nHead of the List: " + list.head());
					break;
				case "8":
					System.out.println("\nTail of the List: " + list.tail());
					break;
				case "9":
					System.out.println("\nIs Empty? " + (list.isEmpty() ? "Yes" : "No"));
					break;
				case "10":
					System.out.println("\nExiting...");
					in.close();
					return;
				default:
					System.out.println("\nEnter a valid value");
					break;
			}
		}
	}
}
