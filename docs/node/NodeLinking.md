# [🢨](/docs/node/Node.md) Node Linking

> **Está documentação refere-se ao arquivo de demonstração [NodeLinking.java](/src/main/NodeLinking.java) abra-o e acompanhe junto a este documento**

O comportamento desta lógica é bem simples, dentro da minha classe [Node](/src/data/Node.java) eu terei 2 atributos de tipo Node\<T> o prev e o next, cada um deles serve para armazenar a referência de outro nó (respectivamente o anterior e o sucessor). No arquivo que é usado, teremos um exemplo similar a este:

```java
// Passo 1:
Node<Integer> node1 = new Node<>(10);
Node<Integer> node2 = new Node<>(20);

// Passo 2:
node1.setNext(node2);

// Passo 3:
node2.setPrev(node1);
```

basicamente fazendo com que o nó posterior ao nó "node1" seja o "node2" e o anterior do "node2" seja o "node1"

**Representação gráfica**

```mermaid
flowchart TD
subgraph Passo 3
	node6(node2) --> node5(node1);
	node5(node1) --> node6(node2);
end
subgraph Passo 2
	node3(node1) --> node4(node2);
end
subgraph Passo 1
	node1(node1); node2(node2);
end
```

Assim nós temos uma Lista Linear Duplamente Encadeada, ou como o professor chama DoubleLinearList

Isto é feito com mais nós, como mostra o exemplo do arquivo citado. Agora, vamos adicionar outro nó.
```java
// Passo 1:
Node<Integer> node3 = new Node<>(30);

// Passo 2:
node2.setNext(node3);

// Passo 3:
node3.setPrev(node2);
```

**Representação gráfica**

```mermaid
flowchart TD
subgraph Passo 2
	node6(node2) --> node5(node1);
	node5(node1) --> node6(node2);
	node6(node2) --> node7(node3)
	node7(node3) --> node6(node2)
end
subgraph Passo 2
	node3(node2) --> node2(node1);
	node2(node1) --> node3(node2);
	node3(node2) --> node4(node3)
end
subgraph Passo 1
	node1(node3);
end
```

Todos os métodos das estruturas são montados encima desta lógica. É bem simples depois que pega o jeito.

> 💡 **Dica importante:** Não se importe com a posição abstrata destes elementos (cima, baixo, esquerda ou direita), só se preocupe com as posições "relativas" (antes e depois). Vai facilitar muita na hora de implementar algo.