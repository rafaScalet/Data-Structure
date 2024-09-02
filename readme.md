# Estudos de Estruturas de dados

Criei este repositório para ajudar meus amigos com os estudos de estruturas de dados deles. Implementarei as estruturas vistas em aulas conforme o professor for disponibilizando.

## Como usar

1. Clone o repositório
```bash
# via git clone
git clone https://github.com/rafaScalet/Data-Structure.git

# ou via CLI (tenha certeza de ter instalado)
gh repo clone rafaScalet/Data-Structure
```

2. Navegue até a pasta do projeto
```bash
cd Data-Structure
```

3. Compile o programa
```bash
javac -d bin src/**/*.java
```
>Tenha certeza de ter algum [JDK](https://www.oracle.com/br/java/technologies/downloads/) instalado ou utilize um version manager para java como o [asdf](https://asdf-vm.com/guide/getting-started.html) (este sendo um gerenciador "universal")

4. Rode um dos exemplos descritos na [lista de exemplos](#lista-de-exemplos) ou qualquer dos arquivos dentro do diretório [/src/main](/src/main/)
```bash
java -cp bin main.<exemplo>
```

## Estrutura
o código está estruturado todo dentro do diretório /src e tudo que está fora são arquivos de configuração, documentação ou de binários

```
root/
├── src/
│   ├── main/
│   │   ├── StackDemo.java
│   │   └── ListDemo.java
│   ├── data/
│   │   ├── Node.java
│   │   └── OtherData.java
│   └── exercises/
│       ├── RPN.java
│       └── Checker.java
├── docs/
│   └── references/
├── .gitignore
├── .java-version
├── .editorconfig
├── LICENSE
└── readme.md
```
tudo que está dentro do diretório [main](/src/main/) são os exemplos de como funciona cada funcionalidade. [Exercises](/src/exercise/) são os exercícios feitos em aula e [Data](/src/data/) estão as estruturas implementadas. Já o [Docs](/docs/) é onde toda o documentação está

## Lista de Exemplos

A lista está em ordem de implementações , tente segui-la para melhor entendimento

 - [Node](/docs/node/Node.md)
 - [Node Types](/docs/node/NodeTypes.md)
 - [Node Linking](/docs/node/NodeLinking.md)
 - [DoubleLinearList](/docs/list/DoubleLinearList.md)
 - [Stack](/docs/stack/Stack.md)

### Exercícios

Os "exercises" podem ser vistos na ordem que quiser, por não ser uma implementação real de algo. Alguns deles usam estruturas implementadas, caso isso ocorra, veja as estruturas antes.

 - [Resolve Reverse Polish Notation](/docs/exercises/RPN.md)
 - [Infix Expression to Postfix](/docs/exercises/RPN.md)
 - [Check If Is Balanced](/docs/exercises/Checker.md)