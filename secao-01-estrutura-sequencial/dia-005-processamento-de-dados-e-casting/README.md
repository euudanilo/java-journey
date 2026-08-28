# Dia 005 — Processamento de Dados e Casting

## Conteúdo

Nesta aula foi estudado o processamento de dados em Java e como ele é realizado por meio do comando de atribuição.

O comando de atribuição possui a seguinte estrutura:

```java
variavel = expressao;
```

A variável fica do lado esquerdo do sinal de `=` e a expressão fica do lado direito.

A regra de execução é:

1. A expressão do lado direito é calculada.
2. O resultado é armazenado na variável do lado esquerdo.

## Comando de Atribuição

Exemplo:

```java
int x = 5;
int y;

y = 2 * x;
```

Nesse caso, a expressão:

```text
2 * x
```

é calculada utilizando o valor de `x`.

Como:

```text
x = 5
2 * 5 = 10
```

O valor 10 será armazenado na variável `y`.

Portanto:

```text
x = 5
y = 10
```

## Processamento de Dados

O processamento de dados ocorre quando o programa realiza cálculos ou operações utilizando os valores armazenados nas variáveis.

Exemplo:

```java
int x = 5;
int y = 2 * x;

System.out.println(x);
System.out.println(y);
```

Saída:

```text
5
10
```

Nesse exemplo, o valor de `y` é obtido a partir do processamento da expressão `2 * x`.

## Operações com Números de Ponto Flutuante

Também foi estudado o uso de variáveis do tipo `double` no processamento de dados.

Exemplo:

```java
int x = 5;
double y = 2 * x;

System.out.println(x);
System.out.println(y);
```

Saída:

```text
5
10.0
```

Como `y` é do tipo `double`, o resultado é representado como um número de ponto flutuante.

## Exemplo com Área de um Trapézio

Foi utilizado como exemplo o cálculo da área de um trapézio.

A fórmula utilizada foi:

```text
área = (base menor + base maior) / 2 * altura
```

Considerando:

```text
base menor = 6
base maior = 8
altura = 5
```

O cálculo é:

```text
(6 + 8) / 2 * 5
```

Primeiro:

```text
6 + 8 = 14
```

Depois:

```text
14 / 2 = 7
```

Por último:

```text
7 * 5 = 35
```

Portanto:

```text
área = 35
```

Em Java:

```java
double b = 6.0;
double B = 8.0;
double h = 5.0;

double area = (b + B) / 2.0 * h;

System.out.println(area);
```

Resultado:

```text
35.0
```

## Boa Prática com Valores Double

Foi apresentada a prática de utilizar `.0` quando um valor representa um número do tipo `double`.

Exemplo:

```java
double b = 6.0;
double B = 8.0;
double h = 5.0;
```

Mesmo quando o número não possui casas decimais, o `.0` ajuda a indicar que aquele valor está sendo utilizado como um número de ponto flutuante.

## Divisão de Números Inteiros

Um ponto importante estudado foi o comportamento da divisão quando os dois valores são do tipo `int`.

Exemplo:

```java
int a = 5;
int b = 2;

double resultado = a / b;
```

Apesar de `resultado` ser do tipo `double`, a expressão:

```text
a / b
```

é uma divisão entre dois números inteiros.

O resultado da divisão inteira será:

```text
5 / 2 = 2
```

Portanto:

```text
resultado = 2.0
```

As casas decimais são descartadas durante a divisão inteira.

## Casting

Para obter o resultado com as casas decimais, é necessário realizar uma conversão explícita de tipo.

Essa conversão é chamada de **casting**.

Exemplo:

```java
int a = 5;
int b = 2;

double resultado = (double) a / b;
```

Nesse caso, o valor de `a` é convertido explicitamente para `double`.

A expressão passa a ser interpretada como:

```text
5.0 / 2
```

Resultado:

```text
2.5
```

## Conversão Explícita

O casting é realizado colocando o tipo desejado entre parênteses antes do valor.

Exemplo:

```java
(double) a
```

Nesse caso, o valor armazenado em `a` é convertido para `double`.

Outro exemplo:

```java
(int) a
```

converte o valor para `int`.

## Conversão de Double para Int

Também foi apresentado o caso em que uma variável `double` precisa ser atribuída a uma variável `int`.

Exemplo:

```java
double a = 5.0;
int b = (int) a;
```

Nesse caso, o casting informa explicitamente ao compilador que o valor de `a` deve ser convertido para `int`.

O resultado será:

```text
5
```

Quando o valor possui casas decimais, elas podem ser perdidas durante a conversão.

Exemplo:

```java
double a = 5.7;
int b = (int) a;
```

Resultado:

```text
5
```

Portanto, o casting pode causar perda de informação quando o tipo de destino não suporta a mesma quantidade de informação do tipo original.

## O que aprendi

- O que é processamento de dados.
- Como funciona o comando de atribuição.
- A estrutura do comando de atribuição.
- Como uma expressão é calculada antes de ser armazenada em uma variável.
- Como realizar cálculos utilizando variáveis.
- A diferença entre `int` e `double` em operações matemáticas.
- O comportamento da divisão entre números inteiros.
- Como realizar conversões explícitas de tipos.
- O conceito de casting.
- Como utilizar `(double)` em uma expressão.
- Como converter um `double` para `int`.
- Que uma conversão pode causar perda de informação.
- A boa prática de utilizar `.0` em valores double.

## Prática

Foi desenvolvido um código em Java para praticar o processamento de dados por meio de atribuições e expressões matemáticas.

Também foram praticados cálculos utilizando diferentes tipos numéricos e conversões explícitas de tipos.

O código pode ser encontrado em:

```text
src/Main.java
```

## Desafio

Nenhum desafio foi proposto pelo professor nesta aula.

## Status

✅ Aula concluída.