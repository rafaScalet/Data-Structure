package data; // ~ Nome do pacote para ser importado

// ? Cria uma classe Stack (pilha em inglês) com um tipo genérico sendo passado
public class Stack<T> {
	private Node<T> top; // ^ Diferente da lista, só cria o ponteiro para a "parte de cima"
	private int size; // ^ Tamanho da pilha

	// ^ Método peek (pico) para pegar o topo da lista
	public T peek () {
		return this.top.getValue();
	}

	// ^ Método length para retornar o valor do tamanho da lista
	public int length() {
		return this.size;
	}

	// ^ Método que retorna true ou false dependendo se tem ou não algum nó na lista
	public boolean isEmpty () {
		return this.top == null;
	}

	// ? Método push, equivalente ao add da lista, bem mais simplificado pois não precisa fazer uma ligação dupla e por que este eu implementei por conta própria, já que o professor usa o método add da lista como sendo o método push da pilha
	public void push (T value) {
		Node<T> node = new Node<>(value);
		node.setPrev(this.top); // ^ Faz com que o "próximo" nó do que foi passado pelo parâmetro seja o "this.top"
		this.top = node; // ^ coloca o nó passado por parâmetro no "this.top" da pilha
		this.size++;
	}

	// ? método pop, equivalente ao método de mesmo nome da lista, ficou mais simples pelos mesmos motivos do push
	// ? neste eu tentei fazer mais parecido com a lógica do professor, pois a minha deixaria muito simplificado e provavelmente seria mais complicado de entender a do professor depois
	public T pop () {
		// ? verifica se a lista estiver nula, se estiver retorna null
		if (isEmpty()) {
			return null;
		}
		Node<T> temp = this.top; // ^ Cria uma variável temporária com o valor de "this.top"
		this.top = this.top.getPrev(); // ^ Atribui o "próximo" valor do "this.top" ao próprio "this.top"
		this.size--;
		return temp.getValue(); // ^ Retorna o valor inicial do "this.top"
	}

	// ? Método show com uma lógica mais "clean"
	public void show () {
		Node<T> temp = this.top;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getPrev();
		}
	}
}