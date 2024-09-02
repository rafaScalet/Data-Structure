package data; // ~ Nome do pacote para ser importado

// ? Cria uma classe chamada DoubleLinearList de um tipo genérico para ser passado na instanciação
// ? Return early é uma técnica usada para melhorar a lógica, onde ao invés de ter vários if/else eu inverto a lógica do if e retorno evitando assim o uso do else, pesquisem um pouco mais poe que uso muito ela
public class DoubleLinearList<T> {
	private Node<T> top; // ^ Cria um "ponteiro" para o "topo" da minha lista
	private Node<T> bottom; // ^ Cria um "ponteiro" para a "base" da minha lista
	private int size; // ^ Cria uma variável para armazenar o tamanho da lista

	// ? Construtor que inicializa tudo com nulo e o tamanho com zero
	public DoubleLinearList () {
		this.top = null;
		this.bottom = null;
		this.size = 0;
	}

	//! Os primeiros 3 métodos foram coisa minha, para deixar bonitinho
	// * Método head (cabeça) para pegar o topo da lista
	public T head () {
		return this.top.getValue();
	}

	// * Método tail (cauda) para pegar a base da lista
	public T tail () {
		return this.bottom.getValue();
	}

	// * Método length para retornar o valor do tamanho da lista
	public int length () {
		return this.size;
	}

	// ? Método que retorna true ou false dependendo se tem ou não algum nó na lista
	public boolean isEmpty () {
		return(this.top == null && this.bottom == null);
	}

	// ! Sobrecarga dos métodos add e append criados por mim, fiz desta forma para se assemelhar a uma implementação real de listas, um método eu passo o valor do nó, e no outro eu passo o nó propriamente dito. Notem que a lógica é a mesma nos dois métodos o que muda é a tratativa dos valores

	// ? Método do tipo void (por que não precisa retornar nada) para adicionar um novo nó
	// ? O parâmetro passado é o valor do nó a ser adicionado, ele é passado como um tipo genérico definido na hora de instanciar
	public void add (T value) {
		Node<T> node = new Node<>(value); // ^ Cria um novo nó chamado node, passando para ele o valor com o tipo T
		if (this.isEmpty()) {
			this.bottom = this.top = node; // ^ Faz com que tudo aponte para o valor passado como parâmetro, assim fazendo com que seja o único nó
			this.size++; // ^ Acrescenta 1 ao tamanho da lista
			return; // ^ Retorna, ou seja, sai do método, fazendo com que todo o código abaixo não seja executado (técnica chamada "return early")
		}

		// ! Este código só será executado caso a condição acima não seja atendida, por conta da técnica de return early

		// ? Minha lógica mais simplificada
		// ? Se viu o exemplo "NodeLinking" vai perceber um padrão
		node.setNext(this.top); // ^ Faz com que o próximo nó do "node" seja o "this.top"
		this.top.setPrev(node); // ^ Faz com que o nó anterior do "this.top" seja o "node"
		this.top = node; // ^ Faz com que o "this.top" tenha o valor do "node"
		this.size++;

		/*
		 ! Lógica do professor:
		 ? Cria uma variável temporária do tipo Node com genérico, com o valor de "this.top"
		 * Node<T> temp = this.top;
		 ? Seta o próximo ponteiro do node (valor passado como parâmetro) como sendo a variável temporária ou "this.top"
		 * node.setNext(temp);
		 ? Muda o valor da variável top para o valor passado como parâmetro
		 * this.top = node;
		 ? O ponteiro anterior da variável temporária passa a apontar para a parte de cima
		 * temp.setPrev(this.top);
		*/
	}

	// ? Método do tipo void (por que não precisa retornar nada) para adicionar um novo nó
	// ? O parâmetro passado é o nó a ser adicionado, ele é passado com um tipo genérico definido na hora de instanciar
	public void add (Node<T> node) {
		// ? Verifica se está vazia para fazer a primeira inserção na lista
		// ? Isso é importante pois o "this.top" não pode ser nulo para a próxima parte do código funcionar
		if (this.isEmpty()) {
			this.bottom = this.top = node; // ^ Faz com que tudo aponte para o valor passado como parâmetro, assim fazendo com que seja o único nó
			this.size++; // ^ Acrescenta 1 ao tamanho da lista
			return; // ^ Retorna, ou seja, sai do método, fazendo com que todo o código abaixo não seja executado (técnica chamada "return early")
		}

		// ! Este código só será executado caso a condição acima não seja atendida, por conta da técnica de return early

		// ? Minha lógica mais simplificada
		// ? Se viu o exemplo "NodeLinking" vai perceber um padrão
		node.setNext(this.top); // ^ Faz com que o próximo nó do "node" seja o "this.top"
		this.top.setPrev(node); // ^ Faz com que o nó anterior do "this.top" seja o "node"
		this.top = node; // ^ Faz com que o "this.top" tenha o valor do "node"
		this.size++;

		/*
		 ! Lógica do professor:
		 ? Cria uma variável temporária do tipo Node com genérico, com o valor de "this.top"
		 * Node<T> temp = this.top;
		 ? Seta o próximo ponteiro do node (valor passado como parâmetro) como sendo a variável temporária ou "this.top"
		 * node.setNext(temp);
		 ? Muda o valor da variável top para o valor passado como parâmetro
		 * this.top = node;
		 ? O ponteiro anterior da variável temporária passa a apontar para a parte de cima
		 * temp.setPrev(this.top);
		*/
	}

	// ? Método do tipo void (por que não precisa retornar nada) para encaixar (append) um novo nó, passa um parâmetro com tipo genérico
	public void append (T value) {
		Node<T> node = new Node<>(value);
		// ? Verifica se está vazia para fazer a primeira inserção na lista
		// ? Isso é importante pois o "this.top" não pode ser nulo para a próxima parte do código funcionar
		if (this.isEmpty()) {
			this.bottom = this.top = node; // ^ Faz com que tudo aponte para o valor passado como parâmetro, assim fazendo com que seja o único nó
			this.size++; // ^ Acrescenta 1 ao tamanho da lista
			return; // ^ Retorna, ou seja, sai do método, fazendo com que todo o código abaixo não seja executado (técnica chamada "return early")
		}

		// ! Este código só será executado caso a condição acima não seja atendida, por conta da técnica de return early

		// ? Minha lógica mais simplificada
		// ? Se viu o exemplo "NodeLinking" vai perceber um padrão
		node.setPrev(this.bottom); // ^ Faz com que o nó anterior do "this.bottom" seja o "node"
		this.bottom.setNext(node); // ^ Faz com que o próximo nó do "node" seja o "this.bottom"
		this.bottom = node; // ^ Faz com que o "this.bottom" tenha o valor do "node"
		this.size++;

		/*
		! Lógica do professor
		 ? Cria uma variável temporária do tipo Node com genérico, com o valor de "this.bottom"
		 * Node<T> temp = this.bottom;
		 ? Seta o ponteiro anterior do node (valor passado como parâmetro) como sendo a variável temporária ou "this.bottom"
		 * node.setPrev(temp);
		 ?Muda o valor da variável top para o valor passado como parâmetro
		 * this.bottom = node;
		 ? O ponteiro anterior da variável temporária passa a apontar para a parte de cima
		 * temp.setNext(this.bottom);
		*/
	}

	// ? Método do tipo void (por que não precisa retornar nada) para encaixar (append) um novo nó, passa um parâmetro com tipo genérico
	public void append (Node<T> node) {
		// ? Verifica se está vazia para fazer a primeira inserção na lista
		// ? Isso é importante pois o "this.top" não pode ser nulo para a próxima parte do código funcionar
		if (this.isEmpty()) {
			this.bottom = this.top = node; // ^ Faz com que tudo aponte para o valor passado como parâmetro, assim fazendo com que seja o único nó
			this.size++; // ^ Acrescenta 1 ao tamanho da lista
			return; // ^ Retorna, ou seja, sai do método, fazendo com que todo o código abaixo não seja executado (técnica chamada "return early")
		}

		// ! Este código só será executado caso a condição acima não seja atendida, por conta da técnica de return early

		// ? Minha lógica mais simplificada
		// ? Se viu o exemplo "NodeLinking" vai perceber um padrão
		node.setPrev(this.bottom); // ^ Faz com que o nó anterior do "this.bottom" seja o "node"
		this.bottom.setNext(node); // ^ Faz com que o próximo nó do "node" seja o "this.bottom"
		this.bottom = node; // ^ Faz com que o "this.bottom" tenha o valor do "node"
		this.size++;

		/*
		! Lógica do professor
		 ? Cria uma variável temporária do tipo Node com genérico, com o valor de "this.bottom"
		 * Node<T> temp = this.bottom;
		 ? Seta o ponteiro anterior do node (valor passado como parâmetro) como sendo a variável temporária ou "this.bottom"
		 * node.setPrev(temp);
		 ?Muda o valor da variável top para o valor passado como parâmetro
		 * this.bottom = node;
		 ? O ponteiro anterior da variável temporária passa a apontar para a parte de cima
		 * temp.setNext(this.bottom);
		*/
	}

	// ? Cria um método com um tipo genérico passado na instanciação da classe, ou seja, retorna o valor que eu pedir para retornar na hora de instanciar
	// ? No do professor, o método retorna um nó (Node) o meu retorna o valor do nó (usando o método getValue da class Node) por isso uso um tipo genérico ao invés de Node
	// ? Funciona de forma diferente para 3 casos, se estiver vazio, se conter apenas um nó e se tiver mais que um
	public T remove () {
		// ~ Caso 1: Vazio -> Se estiver vazio retorna nulo, pois não tem nada para remover
    if (isEmpty()) {
			return null;
		}

		// ! Este código só será executado se a condição acima não for atendida (técnica return early)

		Node<T> currentTop = this.top; // ^ Armazena o valor do topo atual para ser removido e retornado no final

		this.top = this.top.getNext(); // ^ Faz com que o "this.top" receba o valor de próximo nó

		// ~ Caso 2 -> único elemento da lista
		if (this.top == null) {
			this.bottom = null; //^  Se a lista estiver vazia, atualiza o bottom para null
		} else {
			// ~ Caso 3 -> Mais de um elemento
			this.top.setPrev(null); // ^ Remove a referência do antigo topo
			currentTop.setNext(null);
		}

		this.size--;

		return currentTop.getValue(); // * Retorna o valor do nó removido
	}

	// ? Cria um método com um tipo genérico passado na instanciação da classe, ou seja, retorna o valor que eu pedir para retornar na hora de instanciar
	// ? Tudo o que eu disse sobre o método remove vale para este
	public T pop () {
		// ~ Caso 1: Vazio -> Se estiver vazio retorna nulo, pois não tem nada para remover
		if (isEmpty()) {
			return null;
		}

		// ! Este código só será executado se a condição acima não for atendida (técnica return early)

		Node<T> currentBottom = this.bottom; // ^ Armazena o valor da base atual para ser removido e retornado no final

		this.bottom = this.bottom.getPrev(); // ^ Faz com que o "this.bottom" receba o valor do nó anterior

		if (this.bottom == null) {
			this.top = null;
		} else {
			this.bottom.setNext(null);
			currentBottom.setPrev(null);
		}

		this.size--;

		return currentBottom.getValue();
	}

	// ? Cria um método show para mostrar a lista quando chamado
	// ? Para inverter a ordem de exibição substitua top por bottom e getNext por getPrev e vice-e-versa
	public void show () {
		Node<T> temp = this.top;
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}
}