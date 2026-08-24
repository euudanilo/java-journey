public class Main {
    public static void main(String[] args) {

        // Operadores aritméticos
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int resto = 10 % 5;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + resto);

        // Precedência dos operadores
        int resultado = 3 + 2 * 4;
        System.out.println("3 + 2 * 4: " + resultado);

        // Uso de parênteses
        int resultado2 = (3 + 2) * 4;
        System.out.println("(3 + 2) * 4 = " + resultado2);

        // Expressão com divisão e multiplicação
        int resultado3 = 60 / (3 + 2) * 4;
        System.out.println("60 / (3 + 2) * 4 = " + resultado3);

        // Expressão com diferentes níveis de parênteses
        int resultado4 = 60 / ((3 + 2) * 4);
        System.out.println("60 / ((3 + 2) * 4) = " + resultado4);

        // Operador módulo
        int resultado5 = 19 % 5;
        System.out.println("19 % 5 = " + resultado5);
    }
}