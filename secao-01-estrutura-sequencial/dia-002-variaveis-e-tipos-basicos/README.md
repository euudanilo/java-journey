# Dia 002 — Variáveis e Tipos Básicos

## Conteúdo

Nesta aula foram estudadas as variáveis e os tipos básicos de dados utilizados em Java.

Uma variável é uma porção de memória RAM utilizada para armazenar dados durante a execução de um programa.

Para declarar uma variável, é necessário informar o tipo, o nome da variável e, opcionalmente, um valor inicial.

Exemplo:

```java
int idade = 25;
```

Nesse exemplo:

- `int` é o tipo da variável.
- `idade` é o nome da variável.
- `25` é o valor inicial.

A declaração de uma variável termina com ponto e vírgula (`;`).

## Tipos Primitivos

Java possui oito tipos primitivos.

Eles são:

| Tipo | Descrição |
|------|-----------|
| byte | Número inteiro de 8 bits |
| short | Número inteiro de 16 bits |
| int | Número inteiro de 32 bits |
| long | Número inteiro de 64 bits |
| float | Número com ponto flutuante de 32 bits |
| double | Número com ponto flutuante de 64 bits |
| char | Caractere Unicode |
| boolean | Valor lógico verdadeiro ou falso |

## Tipos Inteiros

Os tipos inteiros são utilizados para armazenar números sem casas decimais.

São eles:

- `byte`
- `short`
- `int`
- `long`

O tipo `byte` possui 8 bits e pode armazenar valores de -128 até 127.

O tipo `short` possui 16 bits.

O tipo `int` possui 32 bits e geralmente é o tipo inteiro mais utilizado.

O tipo `long` possui 64 bits e pode ser utilizado quando é necessário armazenar valores inteiros maiores.

### Exemplo

```java
int idade = 25;
```

## Tipos com Ponto Flutuante

Os tipos `float` e `double` são utilizados para representar números com casas decimais.

```java
float altura = 1.80f;
double salario = 5000.50;
```

O tipo `double` possui 64 bits e geralmente é utilizado para representar números com casas decimais por possuir maior precisão.

## Tipo char

O tipo `char` é utilizado para armazenar um único caractere Unicode.

Um caractere pode ser uma letra, símbolo de pontuação, dígito ou outro caractere.

Exemplo:

```java
char sexo = 'F';
```

Um caractere pode ser representado diretamente ou utilizando seu código Unicode.

Exemplo:

```java
char letra = '\u0061';
```

## Tipo boolean

O tipo `boolean` é utilizado para armazenar um valor lógico.

Os valores possíveis são:

- `true`
- `false`

Exemplo:

```java
boolean ativo = true;
```

## String

Além dos tipos primitivos, Java possui o tipo `String`, utilizado para armazenar uma cadeia de caracteres, como palavras e textos.

Exemplo:

```java
String nome = "Maria";
```

## Estrutura de uma Variável

Uma declaração de variável pode ser representada pela seguinte estrutura:

```java
tipo nome = valor;
```

Exemplo:

```java
double altura = 1.80;
```

Nesse caso:

- `double` → tipo
- `altura` → nome
- `1.80` → valor

## Regras para Nomes de Variáveis

Existem algumas regras para definir nomes de variáveis.

### Não iniciar com um número

Não é permitido iniciar o nome de uma variável com um dígito.

Errado:

```java
int 5minutos;
```

Correto:

```java
int minutos5;
```

### Não utilizar espaços

Nomes de variáveis não podem possuir espaços em branco.

Errado:

```java
double salario do funcionario;
```

Correto:

```java
double salarioDoFuncionario;
```

### Evitar acentos e caracteres especiais

Não é recomendado utilizar acentos, til ou outros caracteres especiais nos nomes das variáveis.

Prefira:

```java
double salario;
```

em vez de:

```java
double salário;
```

### Convenção camelCase

Para nomes compostos, foi apresentada a convenção camelCase.

A primeira palavra começa com letra minúscula e cada nova palavra começa com letra maiúscula.

Exemplo:

```java
double salarioDoFuncionario;
```

Nesse exemplo:

- salario
- Do
- Funcionario

A primeira palavra começa com letra minúscula e as palavras seguintes começam com letra maiúscula.

## Exemplos Estudados

### Exemplo 1

```java
int idade = 25;
```

Variável do tipo inteiro armazenando o valor 25.

### Exemplo 2

```java
double altura = 1.80;
```

Variável do tipo double armazenando um número com casas decimais.

### Exemplo 3

```java
char sexo = 'F';
```

Variável do tipo char armazenando o caractere F.

### Exemplo 4

```java
boolean ativo = true;
```

Variável do tipo boolean armazenando o valor lógico true.

### Exemplo 5

```java
String nome = "Maria";
```

Variável do tipo String armazenando uma cadeia de caracteres.

## O que aprendi

- O que são variáveis.
- Como as variáveis são utilizadas para armazenar dados durante a execução de um programa.
- Como declarar uma variável em Java.
- A relação entre tipo, nome e valor de uma variável.
- Os oito tipos primitivos de Java.
- Os tipos inteiros byte, short, int e long.
- Os tipos float e double.
- O tipo char para caracteres Unicode.
- O tipo boolean para valores verdadeiros ou falsos.
- O tipo String para armazenar textos.
- As regras para criação de nomes de variáveis.
- A convenção camelCase.

## Prática

Foi desenvolvido um código em Java para praticar a declaração de variáveis e a utilização dos diferentes tipos de dados estudados.

O código pode ser encontrado em:

```text
src/Main.java
```

## Desafio

Nenhum desafio foi proposto pelo professor nesta aula.

## Status

✅ Aula concluída.