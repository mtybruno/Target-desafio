package Q2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        int num1 = 0, num2 = 1, num3 = 0;

        System.out.print("Digite um número: (Digite 0 para cancelar) ");
        int value = scanner.nextInt();

	    if (value == 0) {
            System.out.println("bye bye");
            break;
        }

        while (value > num3) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        if (value == 0 || value == 1 || value == num3) {
            System.out.println("O número faz parte da sequência de fibonacci.");
        } else {
            System.out.println("O número não faz parte da sequência de fibonacci.");
        }
    
    }
        
    scanner.close();
    }
}
