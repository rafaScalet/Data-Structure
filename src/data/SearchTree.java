package data;

public class SearchTree<T> {
	private Node<T> root;

	public SearchTree () { }

	public SearchTree (Node<T> root) {
		this.root = root;
	}

	public void add (T value) {
		Node<T> node = new Node<>(value);

		if (this.root == null) {
			this.root = node;
			return;
		}

		if ((int) value <= (int) root.getValue()) {
			node = add(root.getPrev(), value);
			root.setPrev(node);
			return;
		}

		node = add(root.getNext(), value);
		root.setNext(node);
	}

	private Node<T> add (Node<T> root, T value) {
		Node<T> node = new Node<>(value);

		if (root == null) {
			root = node;
			return root;
		}

		if ((int) value <= (int) root.getValue()) {
			node = add(root.getPrev(), value);
			root.setPrev(node);
			return node;
		}

		node = add(root.getNext(), value);
		root.setNext(node);
		return node;
	}
}
