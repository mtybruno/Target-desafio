package Q5;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite algo: ");
        String inputString = scanner.nextLine();

        
        String invertedString = inverterString(inputString);

        System.out.println("String origem: " + inputString);
        System.out.println("String invertida: " + invertedString);

        scanner.close();
    }

    private static String inverterString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;


        // O proximo bloco de codigo é um loop while que inverte uma parte do array de caracteres (charArray).
        // a função é fazer uma troca de caracteres entre start e end
        // o loop continua até start seja igual ou maior que end
        // cada interação troca os valores nas posições start e end, modificando a posição dos indices
        while (start < end) {

            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }
}
