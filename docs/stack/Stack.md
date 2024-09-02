# [🢨](/readme.md) Stack

> **Está documentação refere-se ao arquivo [Stack.java](/src/data/Stack.java) abra-o e acompanhe junto a este documento**

## Descrição

As pilhas (ou stacks em inglês) são estruturas de dados que usam como entrada e saída o **LIFO (last-in first-out)**. São basicamente pilhas da vida real, quando se está empilhando algo, não se retira nada da base, é sempre do topo, e quando se adiciona também. 

## Características

Diferentemente da lista, ela somente tem o top, pois não precisamos mexer na base (bottom)

```java
private Node<T> top;
private int size;
```

o método push (equivalente ao add do DoubleLinearList) é bem pequeno, pois implementei do zero com a minha lógica e também não é necessário usar o next.

```java
public void push (T value) {
	// Cria um novo nó com o valor passado
	Node<T> node = new Node<>(value);
	// Faz com que o anterior deste nó seja o top
	node.setPrev(this.top);
	// Coloca o top como sendo o novo nó
	this.top = node;
	// Incrementa o valor do tamanho
	this.size++;
}
```

O método pop é similar ao método do professor, mas com uma lógica mais simples, sem verificar se tem um ou mais nós na pilha.

```java
public T pop () {
	// Verifica se a pilha estiver nula, e retorna null
	if (isEmpty()) {
		return null;
	}
	// Variável temporária com o valor de "this.top"
	Node<T> temp = this.top; 
	// Atribui o "próximo" valor do "top" ao próprio "top"
	this.top = this.top.getPrev(); 
	// Decrementa um ao tamanho
	this.size--;
	// Retorna o valor inicial do "this.top"
	return temp.getValue(); 
}
```

> já o método show é exatamente igual aos da [listas duplamente encadeadas (DoubleLinearList)](/docs/list/DoubleLinearList.md)