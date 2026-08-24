# Dia 001 — Expressões Aritméticas

## Conteúdo

Nesta aula foram estudadas as expressões aritméticas e os principais operadores utilizados em programação.

Uma expressão aritmética é uma expressão que, quando calculada, produz um valor numérico.

Exemplo:
```text
4 + 5 = 9
```

## Operadores Aritméticos

Os cinco principais operadores estudados foram:

| Operador | Operação |
|----------|----------|
| +        | Adição |
| -        | Subtração |
| *        | Multiplicação |
| /        | Divisão |
| %        | Resto da divisão (módulo) |

O operador `%` representa o resto da divisão e não uma operação de porcentagem.

Exemplo:
```text
14 % 3 = 2
```

Isso acontece porque:
```text
14 / 3 = 4
4 * 3 = 12
14 - 12 = 2
```

Portanto, o resto da divisão de 14 por 3 é 2.

## Precedência dos Operadores

Os operadores possuem uma ordem de precedência.

A multiplicação (`*`), divisão (`/`) e módulo (`%`) possuem precedência maior que a adição (`+`) e a subtração (`-`).

Quando operadores possuem a mesma precedência, a expressão é resolvida da esquerda para a direita.

### Exemplo

```text
2 * 6 / 3
```

Primeiro:
```text
2 * 6 = 12
```

Depois:
```text
12 / 3 = 4
```

Resultado:
```text
4
```

## Uso de Parênteses

Os parênteses podem ser utilizados para alterar a ordem de resolução de uma expressão.

Tudo que estiver dentro dos parênteses será resolvido primeiro.

### Exemplo

```text
(3 + 2) * 4
```

Primeiro:
```text
3 + 2 = 5
```

Depois:
```text
5 * 4 = 20
```

Resultado:
```text
20
```

## Exemplos Estudados

### Exemplo 1

```text
3 + 2 * 4
```

A multiplicação possui maior precedência que a adição.
```text
2 * 4 = 8
3 + 8 = 11
```

Resultado:
```text
11
```

### Exemplo 2

```text
(3 + 2) * 4
```

O conteúdo dentro dos parênteses é resolvido primeiro.
```text
3 + 2 = 5
5 * 4 = 20
```

Resultado:
```text
20
```

### Exemplo 3

```text
60 / (3 + 2) * 4
```

Primeiro:
```text
3 + 2 = 5
```

A expressão passa a ser:
```text
60 / 5 * 4
```

Como divisão e multiplicação possuem a mesma precedência, a resolução ocorre da esquerda para a direita.
```text
60 / 5 = 12
12 * 4 = 48
```

Resultado:
```text
48
```

### Exemplo 4

Quando existem diferentes níveis de parênteses, a resolução começa pelo parêntese mais interno.

```text
60 / ((3 + 2) * 4)
```

Primeiro:
```text
3 + 2 = 5
```

Depois:
```text
5 * 4 = 20
```

Por último:
```text
60 / 20 = 3
```

Resultado:
```text
3
```

## O que aprendi

- O que são expressões aritméticas.
- Os cinco principais operadores aritméticos.
- O funcionamento do operador módulo (`%`).
- A precedência dos operadores.
- A resolução da esquerda para a direita quando os operadores possuem a mesma precedência.
- Como utilizar parênteses para alterar a precedência.
- Como resolver expressões com diferentes níveis de parênteses.

## Prática

Foi desenvolvido um código em Java para praticar os operadores aritméticos, a precedência dos operadores, o uso de parênteses e o operador módulo.

O código pode ser encontrado em:
```text
src/Main.java
```

## Desafio

Nenhum desafio foi proposto pelo professor nesta aula.

## Status

✅ Aula concluída.