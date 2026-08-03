# 📅 Dia 001 - Expressões Aritméticas

## 📖 Conteúdo Estudado

Nesta aula aprendi os conceitos fundamentais das expressões aritméticas em Java e como elas são avaliadas durante a execução de um programa.

---

## 🧠 O que aprendi

### Operadores aritméticos

Os principais operadores utilizados em Java são:

| Operador | Descrição |
|----------|-----------|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão |
| `%` | Resto da divisão (Módulo) |

---

## 📌 Precedência dos operadores

Os operadores seguem uma ordem de prioridade.

1. Parênteses `()`
2. Multiplicação `*`
3. Divisão `/`
4. Módulo `%`
5. Adição `+`
6. Subtração `-`

Quando dois operadores possuem a mesma prioridade, a expressão é resolvida da esquerda para a direita.

### Exemplo

```java
2 * 6 / 3
```

Resultado:

```text
4
```

---

## 📌 Uso dos parênteses

Os parênteses alteram a ordem natural das operações.

### Sem parênteses

```java
3 + 2 * 4
```

Resultado

```text
11
```

### Com parênteses

```java
(3 + 2) * 4
```

Resultado

```text
20
```

---

## 📌 Operador módulo (`%`)

O operador `%` retorna o resto de uma divisão inteira.

Exemplos

```java
14 % 3
```

Resultado

```text
2
```

```java
19 % 5
```

Resultado

```text
4
```

---

## 💻 Exemplos estudados

```text
2 * 6 / 3 = 4

3 + 2 * 4 = 11

(3 + 2) * 4 = 20

60 / (3 + 2) * 4 = 48

60 / ((3 + 2) * 4) = 3

14 % 3 = 2

19 % 5 = 4
```

---

## 🎯 Conclusão

Nesta aula aprendi como construir expressões aritméticas em Java, compreendi a precedência entre os operadores, a importância do uso de parênteses para alterar a ordem das operações e o funcionamento do operador de módulo (`%`), utilizado para obter o resto de uma divisão.

---

## ✅ Status

Concluído ✔️