package tds.ltp.blog;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        while (true) {
            System.out.print("Digite um número: ");
            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                soma += numero;
            } else {
                System.out.println("Entrada inválida! Tente novamente.");
                scanner.next();
            }
            System.out.println("Soma atual: " + soma);
        }
    }
}
