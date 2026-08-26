import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        // Processamento
        double soma = numero1 + numero2;

        // Saida de dados
        System.out.println("Resultado: " + soma);

        sc.close();
    }
}