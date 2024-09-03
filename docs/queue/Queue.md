# [🢨](/readme.md) Queue

> **Está documentação refere-se ao arquivo [Stack.java](/src/data/Stack.java) abra-o e acompanhe junto a este documento**

## Descrição

As fila ou Queue em inglês, são estruturas de dados que usam o tipo de entrada e saída de dados **FIFO (First-in, First-out)**. Assim como as pilhas se assemelham as da vida real, as filas também são basicamente as filas da vida real, onde o primeiro elemento a entrar na fila, será o primeiro a sair da fila também

## Características

Se assemelhando as Listas, as pilhas possuem o top e o bottom, pois, para ter sua característica atendida, devemos guardar estas duas referências

```java
private Node<T> top;
private Node<T> bottom;
private int size;
```

O método add, é o equivalente ao append das listas

```java
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
```

O método remove, é o equivalente ao método de mesmo nome da classe lista

```java
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
```

As filas são bem fáceis de de entender depois que pegou a manha com as outras estruturas