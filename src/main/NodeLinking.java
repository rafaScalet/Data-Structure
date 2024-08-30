package main;

import data.*;

public class NodeLinking {
	public static void main(String[] args) {
		// ? Cria 3 nós numéricos
		Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);

		// ? Encadeamento dos nós
		node1.setNext(node2); // * Faz com que o "próximo" do node1 seja o node2
		node2.setPrev(node1); // * Faz com que o "anterior" do node2 seja o node1

		node2.setNext(node3); // ~ Faz com que o "próximo" do node2 seja o node3
		node3.setPrev(node2); // ~ Faz com que o "anterior" do node3 seja o node2

		// ? Acessando valores
		System.out.println("Valor do Node 1: " + node1.getValue()); // & 10
		System.out.println("Valor do Node 2: " + node2.getValue()); // & 20
		System.out.println("Valor do Node 3: " + node3.getValue()); // & 30

		// ? Navegando pelos nós
		System.out.println("Próximo de Node 1: " + node1.getNext().getValue()); // & 20
		System.out.println("Anterior de Node 3: " + node3.getPrev().getValue()); // & 20

		// ? Modificando o encadeamento. A partir deste ponto já dá para entender o que está acontecendo
		Node<Integer> node4 = new Node<>(40);
		
		node3.setNext(node4);
		node4.setPrev(node3);

		System.out.println("Valor do Node 4: " + node4.getValue());
		System.out.println("Anterior de Node 4: " + node4.getPrev().getValue());
	}
}
