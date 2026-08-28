public class Main {
    public static void main(String[] args) {

        // Exemplo 1 - Atribuição
        int x = 5;
        int y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        // Exemplo 2 - Resultado como double
        double z = 2 * x;

        System.out.println(z);

        // Exemplo 3 - Área de um trapézio
        double b = 6.0;
        double B = 8.0;
        double h = 5.0;

        double area = (b + B) / 2.0 * h;

        System.out.println(area);

        // Exemplo 4 - Divisão de inteiros
        int a = 5;
        int c = 2;

        double resultado = a / c;

        System.out.println(resultado);

        // Exemplo 5 - Casting
        resultado = (double) a / c;

        System.out.println(resultado);

        // Exemplo 6 - Conversão de double para int
        double valor = 5.0;
        int inteiro = (int) valor;

        System.out.println(inteiro);
    }
}