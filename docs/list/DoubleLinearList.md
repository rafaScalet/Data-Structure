# [🢨](/readme.md) Double Linear List

> **Está documentação refere-se ao arquivo [DoubleLinearList.java](/src/data/DoubleLinearList.java) abra-o e acompanhe junto a este documento**

## Descrição

Este tipo de lista tem este nome por guardar a referência do anterior e do posterior (em inglês previous and next), sendo mais conhecida em português como Listas duplamente encadeadas.

## Características

Nas primeiras linhas da classe, vemos a criação de 3 atributos privados o top, bottom e o size.

```java
private Node<T> top;
private Node<T> bottom;
private int size;
```

O top e o bottom são do tipo Node\<T>, para que sejam capazes de guardar a referência de outro nó. Já o size, simplesmente armazena o tamanho da lista

> Lembrando sempre que intuitivamente pensaremos que o top fica "encima" e o bottom "embaixo" mas tentem não fazer esta associação e pensem em somente 2 extremos

Em seguida temos um construtor que inicializa tudo vazio, ou seja, quando instanciado "cria uma nova lista".

```java
public DoubleLinearList () {
	this.top = null;
	this.bottom = null;
	this.size = 0;
}
```

Como está descrito no [DoubleLinearList.java](/src/data/DoubleLinearList.java) os 3 primeiros métodos foram coisa minha só para deixar bonito, e são também bem simples de entender, então nem me darei ao trabalho de explicar. Já o "isEmpty" é usado para verificar se a lista está vazia, sendo bem simples de entender também.

> **Agora são os métodos mais complicados**

### ADD (minha forma)

> Este método é do tipo Node\<T> e recebe um "T value" como parâmetro

Primeiramente criamos um novo nó com o valor passado como parâmetro

```java
Node<T> node =  new Node<>(value); // value é do tipo "T"
```

**Representação Gráfica**

![a](/docs/assets/list/add/step1.drawio.svg)

Depois, verificamos se a lista está vazia, e aplicamos a lógica caso esteja

```java
if (this.isEmpty()) {
	this.bottom = this.top = node;
	this.size++;
	return;
}
```

**Representação Gráfica**

![a](/docs/assets/list/add/step2.drawio.svg)

Caso não esteja vazio, aplica a lógica convencional de adição

```java
// Se estiver acompanhando certo os exemplos, já deve ter visto este padrão
node.setNext(this.top);
this.top.setPrev(node);

// Faz com que o "Topo" da lista seja o novo nó, e aumenta o tamanho 
this.top = node;
this.size++;
```

**Representação Gráfica**

![a](/docs/assets/list/add/step3.drawio.svg)

### APPEND (minha forma)

> O método append segue os mesmos passos do método "ADD", porém, com a lógica sendo aplicada ao "outro lado".

```java
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
```

### REMOVE

> Este método é do tipo "T" e não recebe parâmetros

Como descrito no documento, tem 3 funcionalidades dependendo do estado da lista, se estiver vazio, com um elemento ou com mais de um elemento.

> Este código é executado antes das checagens descritas acima

```java
// Armazena o valor do topo para ser usado depois
Node<T> currentTop = this.top;

// Faz com que o "topo" seja um "depois" dele
this.top = this.top.getNext();
```

1. Se estiver vazio retorna nulo
```java
if (isEmpty()) {
	return null;
}
```

2. Se estiver com um elemento faz com que o bottom também seja nulo
```java
if (this.top == null) {
	this.bottom = null;
}
```

3. Se estiver com mais de um elemento faz a lógica "padrão"
```java
else {
	this.top.setPrev(null);
	currentTop.setNext(null);
}
```

4. Depois de tudo, decrementa um do "size" e retorna o valor do "currentTop"

```java
this.size--;

return currentTop.getValue();
```

### POP

> O método pop segue os mesmos passos do método "REMOVE", porém, com a lógica sendo aplicada ao "outro lado".

```java
if (isEmpty()) {
	return null;
}

Node<T> currentBottom = this.bottom;

this.bottom = this.bottom.getNext();

if (this.bottom == null) {
	this.top = null;
} else {
	this.bottom.setNext(null);
	currentBottom.setPrev(null);
}

this.size--;

return currentBottom.getValue();
```

### SHOW

O método show é bem básico, somente mostra o valor de cada nó até acabar, caso queira inverter a forma como é mostrada, mude top para bottom e o getNext para getPrev

```java
public void show () {
	Node<T> temp = this.top;
	while (temp != null) {
		System.out.println(temp.getValue());
		temp = temp.getNext();
	}
}
```