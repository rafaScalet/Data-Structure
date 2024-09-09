# [🢨](/readme.md) Node

> **Está documentação refere-se ao arquivo [Node.java](/src/data/Node.java) abra-o e acompanhe junto a este documento**

## Descrição

Os nós (ou "nodes" em inglês) seriam basicamente os itens adicionados em nossas estruturas, como listas, filas ou pilhas funcionando literalmente como sendo um nó daquela estrutura.

## Características

> Eu estou usando [generics](/docs/misc/Generics.md), para evitar [hard code](https://blog.betrybe.com/tecnologia/hardcode/).

Em minha implementação eles terão terão um valor (ou "value") de tipo T (genérico) e dois ponteiros o prev e o next (respectivamente "anterior" e "sucessor").

```java
private T value;
private Node<T> next;
private Node<T> prev;
```
Note que todos são privados e tanto o next quanto o prev são do tipo Node\<T> ou seja, recebem outros nós que na lógica do programa seriam anterior e sucessor. 

Cada um destes atributos tem um Get e um Set, menos o valor, pois ele é passado somente na criação de um novo nó, não sendo mais possível alterar

```java
public T getValue() {
	return value;
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
```

Além de termos dois construtores, um em que não é preciso passar o valor e outro em que é

```java
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
```

## Demonstrações

As demonstrações de como o node funcionam são as seguintes:
	
- [Node Types](/docs/node/NodeTypes.md) para a demonstração dos tipos genéricos.
