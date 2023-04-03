import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é maior que o segundo número.");
        } else if(num2 > num1) {
            System.out.println("O segundo número (" + num2 + ") é maior que o primeiro número.");
        } else {
            System.out.println("Os dois números são iguais");
        }
        input.close();
    }
}
