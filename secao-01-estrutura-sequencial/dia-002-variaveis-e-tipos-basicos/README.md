# 📅 Dia 002 - Variáveis e Tipos Básicos em Java

## 📖 Conteúdo Estudado

Nesta aula aprendi o conceito de variáveis, como elas são armazenadas na memória durante a execução de um programa e os principais tipos de dados básicos da linguagem Java.

---

# 🧠 O que aprendi

## O que é uma variável?

Uma variável é um espaço na memória RAM utilizado para armazenar dados enquanto o programa está em execução.

Cada variável possui:

- Nome (identificador)
- Tipo
- Valor
- Endereço na memória

---

## Declaração de variáveis

Em Java, uma variável é declarada da seguinte forma:

```java
tipo nomeDaVariavel = valor;
```

Exemplos:

```java
int idade = 25;
double altura = 1.78;
char sexo = 'F';
String nome = "Maria";
```

Toda declaração termina com ponto e vírgula (`;`).

---

# 🧩 Tipos primitivos do Java

## Números inteiros

| Tipo | Tamanho |
|-------|----------|
| byte | 8 bits |
| short | 16 bits |
| int | 32 bits |
| long | 64 bits |

O tipo mais utilizado é o `int`.

---

## Números com casas decimais

| Tipo | Tamanho |
|-------|----------|
| float | 32 bits |
| double | 64 bits |

O tipo `double` oferece maior precisão e é o mais utilizado.

---

## Caracteres

```java
char letra = 'A';
```

O tipo `char` armazena um único caractere Unicode.

---

## Valores lógicos

```java
boolean ativo = true;
```

O tipo `boolean` possui apenas dois valores possíveis:

- true
- false

---

## Texto

```java
String nome = "Maria";
```

O tipo `String` é utilizado para armazenar palavras e textos.

---

# 📌 Convenções para nomes de variáveis

Aprendi algumas boas práticas:

✅ Começar o nome com uma letra.

✅ Utilizar nomes que façam sentido.

✅ Não utilizar espaços.

✅ Evitar acentos e caracteres especiais.

✅ Utilizar o padrão **camelCase**.

Exemplos:

```java
idade
altura
salarioFuncionario
nomeCompleto
```

---

# 💻 Exemplos estudados

```java
int idade = 25;

double altura = 1.78;

char sexo = 'F';

boolean ativo = true;

String nome = "Maria";
```

---

# 🎯 Conclusão

Nesta aula aprendi o conceito de variáveis em Java, como declarar variáveis corretamente, conheci os principais tipos primitivos da linguagem (`byte`, `short`, `int`, `long`, `float`, `double`, `char` e `boolean`) e também o tipo `String`. Além disso, aprendi as boas práticas para nomear variáveis utilizando o padrão camelCase.

---

# ✅ Status

Concluído ✔️