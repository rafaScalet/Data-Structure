package main;

import data.*;

public class NodeTypes {
	public static void main(String[] args) {
		// * Cria um novo nó usando o tipo Integer, armazenando o valor 12
		Node<Integer> number = new Node<>(12);

		// * Cria um novo nó usando o tipo String, armazenando o valor "hello world"
		Node<String> phrase = new Node<>("hello world");

		// * Cria um novo nó usando o tipo Character, armazenando o caractere '+'
		Node<Character> character = new Node<>('+');

		// * Cria um novo nó usando o tipo Boolean, armazenando o valor false
		Node<Boolean> bool = new Node<>(false);

		// ? Acessa e imprime os valores de cada nó usando o método getValue()
		System.out.println("Value of 'number': " + number.getValue());       // & Output: 12
		System.out.println("Value of 'phrase': " + phrase.getValue());       // & Output: hello world
		System.out.println("Value of 'character': " + character.getValue()); // & Output: +
		System.out.println("Value of 'bool': " + bool.getValue());           // & Output: false
	}
}
