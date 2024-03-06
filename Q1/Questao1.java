package Q1;

public class Questao1 {
    public static void main(String[] args) {
        
        int Indice = 13, soma = 0, k = 0;

        while (k < Indice) {
            k = k + 1;
            soma = soma + k;
        
        }

            System.out.println(soma);
    }
}
/* Este é um While Loop onde a variável K recebe o valor de 1 até 13
   E a cada ciclo a mesma é somada com a váriavel SOMA e o loop continua
   ATé que K seja maior que a varável INDICE, ou seja, 13.
   Logo o resultado final da soma de todos os valores é 91.
 */