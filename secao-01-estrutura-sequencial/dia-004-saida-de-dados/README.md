# Dia 004 — Saída de Dados

## Conteúdo

Nesta aula foi estudada a saída de dados em Java.

A saída de dados acontece quando o programa informa alguma informação para o usuário. Essa operação também pode ser chamada de escrita.

Foram apresentados os principais comandos utilizados para realizar saída de dados em Java:

- `System.out.print()`
- `System.out.println()`
- `System.out.printf()`

## System.out.print()

O comando `System.out.print()` é utilizado para exibir uma informação na tela sem realizar uma quebra de linha.

Exemplo:

```java
System.out.print("Olá ");
System.out.print("mundo!");
```

Saída:

```text
Olá mundo!
```

As duas mensagens são exibidas na mesma linha.

## System.out.println()

O comando `System.out.println()` é utilizado para exibir uma informação na tela e realizar uma quebra de linha após a impressão.

Exemplo:

```java
System.out.println("Olá");
System.out.println("mundo!");
```

Saída:

```text
Olá
mundo!
```

### Diferença entre print e println

```text
print()   → escreve sem quebra de linha
println() → escreve e realiza uma quebra de linha
```

## Impressão de Variáveis

Também é possível utilizar os comandos de saída para imprimir o conteúdo armazenado em variáveis.

Exemplo:

```java
int y = 32;

System.out.println(y);
```

Saída:

```text
32
```

Também podemos concatenar textos com valores utilizando o operador `+`.

Exemplo:

```java
double x = 10.35784;

System.out.println("Valor = " + x);
```

Saída:

```text
Valor = 10.35784
```

## System.out.printf()

O comando `System.out.printf()` permite realizar uma saída de dados formatada.

Ele pode ser utilizado para controlar a quantidade de casas decimais de um número.

Exemplo:

```java
double x = 10.35784;

System.out.printf("%.2f%n", x);
```

Saída:

```text
10,36
```

O marcador:

```text
%.2f
```

indica que o número será apresentado com duas casas decimais.

O marcador:

```text
%n
```

é utilizado para realizar uma quebra de linha.

## Formatação de Números

Podemos alterar a quantidade de casas decimais exibidas utilizando `printf()`.

Exemplo:

```java
double x = 10.35784;

System.out.printf("%.2f%n", x);
System.out.printf("%.4f%n", x);
```

Saída:

```text
10,36
10,3578
```

Dessa forma:

```text
%.2f → duas casas decimais
%.4f → quatro casas decimais
```

## Locale

Foi apresentado o uso da classe `Locale` para configurar a localidade utilizada na formatação dos números.

Para utilizar `Locale`, é necessário importar a classe:

```java
import java.util.Locale;
```

Depois podemos definir a localidade padrão:

```java
Locale.setDefault(Locale.US);
```

Com a configuração `Locale.US`, o separador decimal utilizado será o ponto.

Exemplo:

```java
Locale.setDefault(Locale.US);

double x = 10.35784;

System.out.printf("%.3f", x);
```

Saída:

```text
10.358
```

## Marcadores de Formatação

Foram apresentados alguns marcadores utilizados pelo `printf()`.

| Marcador | Tipo |
|----------|------|
| %f | Número de ponto flutuante |
| %d | Número inteiro |
| %s | Texto |

Exemplo:

```java
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf(
    "%s tem %d anos e ganha %.2f reais%n",
    nome,
    idade,
    renda
    );
```

Saída:

```text
Maria tem 31 anos e ganha 4000,00 reais
```

Os valores são informados depois do texto e seguem a ordem dos respectivos marcadores.

## Concatenação

Também podemos utilizar o operador `+` para juntar textos e valores.

Exemplo:

```java
String nome = "Maria";
int idade = 31;

System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
```

Saída:

```text
Nome: Maria
Idade: 31
```

## Exemplos Estudados

### Exemplo 1

Utilização de `print()`:

```java
System.out.print("Bom dia!");
System.out.print("Boa tarde!");
```

Saída:

```text
Bom dia!Boa tarde!
```

### Exemplo 2

Utilização de `println()`:

```java
System.out.println("Bom dia!");
System.out.println("Boa tarde!");
```

Saída:

```text
Bom dia!
Boa tarde!
```

### Exemplo 3

Impressão de uma variável:

```java
double x = 10.35784;

System.out.println(x);
```

Saída:

```text
10.35784
```

### Exemplo 4

Formatação utilizando `printf()`:

```java
double x = 10.35784;

System.out.printf("%.2f%n", x);
```

Saída:

```text
10,36
```

### Exemplo 5

Utilização de diferentes marcadores:

```java
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf(
    "%s tem %d anos e ganha %.2f reais%n",
    nome,
    idade,
    renda
    );
```

Saída:

```text
Maria tem 31 anos e ganha 4000,00 reais
```

## O que aprendi

- O conceito de saída de dados.
- Como utilizar `System.out.print()`.
- Como utilizar `System.out.println()`.
- A diferença entre `print()` e `println()`.
- Como imprimir valores armazenados em variáveis.
- Como realizar concatenação utilizando `+`.
- Como utilizar `System.out.printf()`.
- Como formatar números de ponto flutuante.
- Como definir a quantidade de casas decimais.
- Como utilizar `%n` para quebra de linha.
- Como utilizar os marcadores `%f`, `%d` e `%s`.
- Como utilizar a classe `Locale`.
- Como configurar `Locale.US`.
- Como realizar saídas formatadas com diferentes tipos de dados.

## Prática

Foi desenvolvido um código em Java para praticar os comandos de saída de dados, impressão de variáveis, concatenação, formatação de números e utilização do `printf()`.

Também foi realizado o exercício de fixação proposto pelo professor.

O código pode ser encontrado em:

```text
src/Main.java
```

## Desafio

Foi realizado o exercício de fixação proposto pelo professor.

O exercício utiliza variáveis de diferentes tipos e comandos de saída para produzir uma saída formatada na tela.

Foram praticados:

- `System.out.println()`
- `System.out.printf()`
- Variáveis
- Concatenação
- Formatação de números decimais
- Marcadores `%f`, `%d` e `%s`
- `Locale.US`

## Status

✅ Aula concluída.