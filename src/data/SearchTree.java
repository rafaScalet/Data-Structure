package data;

public class SearchTree<T> {
	private Node<T> root;

	public SearchTree () { }

	public SearchTree (Node<T> root) {
		this.root = root;
	}

	public void add (T value) {
		if (root == null) {
			this.root = new Node<>(value);
			return;
		}

		if (root.getPrev() == null) {
			root.setNext(new Node<>(value));
			return;
		}

		if (root.getNext() == null) {
			root.setPrev(new Node<>(value));
			return;
		}

		this.add(value);
	}
}
