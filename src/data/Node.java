package data; // ~ Nome do pacote para ser importado

// ? Cria uma classe chamada Node (nó em inglês) de um tipo genérico para ser passado na instanciação
// ? Tipo genérico funciona como uma variável que armazena o tipo, tudo que for do tipo "T" tera seu tipo mudado depois da instanciação do Node<T>
public class Node<T> {
	private T value; // ^ Cria um valor privado para este nó com o tipo passado na instanciação
	private Node<T> next; // ^ Cria um "ponteiro" (java não trabalha com ponteiros, mas isso é como se fosse) para o próximo nó
	private Node<T> prev; // ^ Cria um "ponteiro" (java não trabalha com ponteiros, mas isso é como se fosse) para o nó anterior

	// * Métodos Getters e Setters para cada atributo.

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	// Construtores a serem chamados na instanciação, um com tudo nulo só para facilitar testes e outro que passa o valor do nó
	public Node() {
		this.value = null;
		this.next = null;
		this.prev = null;
	}

	public Node(T value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
}