package data; // ~ Nome do pacote para ser importado

// ? Cria uma classe Queue (fila em inglês) com um tipo genérico sendo passado
// ! Todos os métodos desta classe tem a mesma implementação da classe DoubleLinearList
public class Queue<T> {
	private Node<T> top;
	private Node<T> bottom;
	private int size;

	public T head () {
		return this.top.getValue();
	}

	public T tail () {
		return this.bottom.getValue();
	}

	public int length () {
		return this.size;
	}

	public boolean isEmpty () {
		return(this.top == null && this.bottom == null);
	}

	// ? equivalente ao método add da class DoubleLinearList
	public void add (T value) {
		Node<T> node = new Node<>(value);

		if (this.isEmpty()) {
			this.bottom = this.top = node;
			this.size++;
			return;
		}

		node.setPrev(this.bottom);
		this.bottom.setNext(node);
		this.bottom = node;
		this.size++;
	}

	// ? Equivalente a classe de mesmo nome da classe DoubleLinearList
	public T remove () {
    if (isEmpty()) {
			return null;
		}

		Node<T> currentTop = this.top;

		this.top = this.top.getNext();

		if (this.top == null) {
			this.bottom = null;
		} else {
			this.top.setPrev(null);
			currentTop.setNext(null);
		}

		this.size--;

		return currentTop.getValue();
	}

	// ? Método show com uma lógica mais "clean"
	public void show () {
		Node<T> temp = this.top;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}
}
