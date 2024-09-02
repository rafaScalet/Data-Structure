# [🢨](/docs/node/Node.md) Generics

De forma bem resumida é como se eu passasse um tipo na hora de instanciar minha classe, caso eu queira que ela tenha tipos "dinâmicos"

> Usei a letra "T" por ser convenção quando se trabalha com generics em java, mas não é uma regra para todas as linguagens.

1. Criação:
```java
public class MinhaClasse<T> {
	private T ValorClasse;

	public T getValorClasse () {
		return this.ValorClasse;
	}

	public void setValorClasse (T valorClasse) {
		this.ValorClasse = valorClasse;
	}
}
```

2. Instanciação
```java
public static void main(String[] args) {
	// Definirá o tipo "T" como sendo um integer (int)
	MinhaClasse<Integer> numero = new MinhaClasse<>();

	// Já identifica que o "T" é int
	numero.setValorClasse(12);
	// Se eu tentar passar uma string dará um erro
	numero.setValorClasse("12");

	// Definirá o tipo "T" como sendo um string
	MinhaClasse<String> frase = new MinhaClasse<>();

	// Assim eu posso passar uma string
	frase.setValorClasse("12");
}
```


Esta abordagem é muito útil para evitar [Hard Code](https://blog.betrybe.com/tecnologia/hardcode/), principalmente em um sistema como este, em que vários exemplos foram criados.