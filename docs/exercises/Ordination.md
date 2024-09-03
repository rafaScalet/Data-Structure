# [🢨](/readme.md) Ordination

> **Está documentação refere-se ao arquivo de exercício [Ordination.java](/src/exercise/Ordination.java) abra-o e acompanhe junto a este documento.**

## Índice

 - [Separate Characters](#separate-string)

# Separate String

> Demo: [SeparateString.java](/src/main/SeparateString.java)

## Introdução

A intenção do exercício era usar as filas para separar os carácteres de uma string.

## Resolução

### Método separateCharacters

1. Primeiro criei um método de tipo boolean, estático e que receberá a expressão como o parâmetro e já instancio 4 novas filas nele.

```java
public static boolean separateCharacters (String expression) {
	Queue<Character> upperCaseLetters = new Queue<>();
	Queue<Character> lowerCaseLetters = new Queue<>();
	Queue<Character> numbers= new Queue<>();
	Queue<Character> symbols = new Queue<>();
}
```

2. Depois percorro a expressão usando um for, e divido ela em uma variável chamada character

```java
for (int index = 0; index < expression.length(); index++) {
	char character = expression.charAt(index);
}
```

3. Depois, faço diversas checagens para descobrir que tipo de carácter

4. A primeira checagem seria para saber se o carácter é uma letra minúscula

```java
if (Character.isLowerCase(character)) {
	lowerCaseLetters.add(character);
	continue;
}
```

5. A segunda, é para letras maiúsculas

```java
if (Character.isUpperCase(character)) {
	upperCaseLetters.add(character);
	continue;
}
```

6. A última checagem é para saber se o carácter é um número

```java
if (Character.isDigit(character)) {
	numbers.add(character);
	continue;
}
```

7. Caso não tenha entrado em nenhuma checagem, já se entende que é um símbolo

```java
symbols.add(character);
```

8. Por exibe todas as listas

```java
System.out.print("\nMinúsculas: ");
lowerCaseLetters.showInLine();

System.out.print("\nMaiúsculas: ");
upperCaseLetters.showInLine();

System.out.print("\nNúmeros: ");
numbers.showInLine();

System.out.print("\nOutros: ");
symbols.showInLine();
```