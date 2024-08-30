package main;

import data.*;

public class ListMethodOverloadingDemo {
	public static void main(String[] args) {
		DoubleLinearList<Integer> list = new DoubleLinearList<>();

		list.add(12); // ^ Cria um nó passando o valor dele como parâmetro
		list.add(new Node<>(24)); // ^ Cria um nó passando o mesmo como parâmetro

		list.show();
	}
}
