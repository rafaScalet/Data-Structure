# [🢨](/readme.md) Checker

> **Está documentação refere-se ao arquivo de exercício [Checker.java](/src/exercise/Checker.java) abra-o e acompanhe junto a este documento.**

## Índice

 - [Check if is balanced](#check-if-is-balanced)

# Check if is balanced

> Demo: [CheckIfIsBalanced.java](/src/main/CheckIfIsBalanced.java)

## Introdução

no exercício eu precisava criar uma função que verificava se uma expressão estava com os caracteres de precedência ("()", "{}", "[]") estavam balanceados um com o outro

## Resolução

### Método isBalanced

1. Primeiro criei um método de tipo boolean, estático e que receberá a expressão como o parâmetro e já instancio uma nova pilha nele.

```java
public static boolean isBalanced (String expression) {
	Stack<Character> stack = new Stack<>();
}
```

2. Depois percorro a expressão usando um for, e divido ela em uma variável chamada character

```java
for (int index = 0; index < expression.length(); index++) {
	char character = expression.charAt(index);
}
```

3. Dentro do mesmo for, eu verifico se é um carácter de precedência fechado ou aberto. Se for um aberto eu o adiciono na lista e continuo a execução do for para o próximo loop.

```java
if (character == '{' || character == '[' || character == '(') {
	stack.push(character);
	continue;
}
```

4. Caso esteja fechando, eu faço outras 2 verificações, se está vazio e se os 2 são iguais (método ["isMatching"](#método-ismatching))

```java
if (stack.isEmpty()) {
	return false;
}

// pega o valor do topo da lista
char openValue = stack.pop();
// coloca o carácter fechado numa variável
char closeValue = character;

if (!isMatching(openValue, closeValue)) {
	return false;
}
```

5. Caso a pilha esteja vazia (todos tiveram pares) retornará true, caso contrário retorna false

```java
return stack.isEmpty();
```

### Método isMatching

é um método bem básico que nem requer explicação

```java
private static boolean isMatching (char opened, char closed) {
	return (
		(opened == '{' && closed == '}') ||
		(opened == '[' && closed == ']') ||
		(opened == '(' && closed == ')')
	);
}