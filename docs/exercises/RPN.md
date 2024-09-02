# [🢨](/readme.md) RPN - Reverse Polish Notation

> **Está documentação refere-se ao arquivo de exercício [RPN.java](/src/exercise/RPN.java) abra-o e acompanhe junto a este documento.**

## Índice

 - [Resolve](#resolve)
 - [Infix to Postfix](#infix-to-postfix)

# Resolve

> Demo: [ResolveRPN.java](/src/main/ResolveRPN.java)

## Introdução

O exercício pediu para exibir o resultado de uma expressão infixa fornecida pelo usuário

## Resolução

### Método resolve

1. Primeiro criei um método de tipo boolean, estático e que receberá a expressão como o parâmetro e já instancio uma nova pilha nele.

```java
public static boolean resolve (String expression) {
	Stack<Character> stack = new Stack<>();
}
```

2. Depois percorro a expressão usando um for, e divido ela em uma variável chamada character

```java
for (int index = 0; index < expression.length(); index++) {
	char character = expression.charAt(index);
}
```

3. Depois eu verifico se o carácter fornecido é um número e faço uma conversão de char para int, coloco na pilha e continuo para o loop for

```java
if (Character.isDigit(character)) {
	int value = character - '0';
	stack.push(value);
	continue;
}
```

4. Caso não seja um digito (teoricamente sendo um operador) eu dou pop em dois elementos da lista e realizo a operação em um switch case, para depois retornar o valor na pilha

```java
int firstValue = stack.pop();
int secondValue = stack.pop();

int result;

switch (character) {
	case '+': result = firstValue + secondValue; break;
	case '-': result = firstValue - secondValue; break;
	case '*': result = firstValue * secondValue; break;
	case '/': result = firstValue / secondValue; break;
	default: result = 0; break;
}

stack.push(result);
```

5. Quando acabar todos os número, eu retorno um pop, que deve ser o resultado da minha expressão

```java
return stack.pop();
```

# Infix to Postfix

> Demo: [InfixToPostfix.java](/src/main/InfixToPostfix.java)

## Introdução

Neste exercício, devo pegar uma expressão infixa (notação com a qual estamos acostumados) e converter para uma pós-fixa. Nesta expressão só será passada letras e não números, além do único carácter de precedência permitido ser o parenteses "()".

## Resolução

### Método infixToPostfix

1. Primeiro criei um método de tipo String, estático e que receberá a expressão como o parâmetro e já instancio uma nova pilha nele, além de criar uma string vazia para retornar no final

```java
public static String infixToPostfix (String expression) {
	Stack<Character> stack = new Stack<>();
	String postfixExpression = "";
}
```

2. Depois percorro a expressão usando um for, e divido ela em uma variável chamada character

```java
for (int index = 0; index < expression.length(); index++) {
	char character = expression.charAt(index);
}
```

3. Depois, faço uma série de checagens para descobrir que carácter é, se é uma letra, um operador de precedência aberto ou um fechado

4. Se for uma letra, adiciona na string e volta para o loop for

```java
if (Character.isAlphabetic(character)) {
	postfixExpression += character;
	continue;
}
```

5. Se for um operador de precedência aberto eu coloco na pilha e volto para o loop for
```java
if (character == '(') {
	operatorStack.push(character);
	continue;
}
```

6. Se for um fechado, faz um loop em que, enquanto não acabar os carácteres abertos na pilha, fica adicionando tudo que tem na pilha a minha string, e quando para, remove o parenteses da pilha, sem coloca-lo na expressão

```java
if (character == ')') {
	while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
		postfixExpression += operatorStack.pop();
	}
	operatorStack.pop();
	continue;
}
```

7. Se não passar por nenhuma destas checagens, significa que é um operador. Entra em um loop que só para depois que o topo tiver uma precedência menor que o carácter em que o loop for está, se não entrar no loop, simplesmente adiciona o carácter na pilha. (Usa o método [getPrecedence](#método-getprecedence))

```java
while(!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(character)) {
	postfixExpression += operatorStack.pop();
	continue;
}

operatorStack.push(character);
```

8. Depois de sair do loop for, pega todos os elementos restantes da pilha e adiciona a minha string, que, por final é retornada

```java
while (!operatorStack.isEmpty()) {
	postfixExpression += operatorStack.pop();
}

return postfixExpression;
```

### Método getPrecedence

Um simples método que retorna as precedências dos operadores em inteiros para poderem serem comparados

```java
private static int getPrecedence (char operator) {
	switch (operator) {
		case '+': case '-': return 1;
		case '*': case '/': return 2;
		case '^': return 3;
		default: return 0;
	}
}
```