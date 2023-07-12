/**
 * Desafio 1: Soma dos Elementos Dado um array de números inteiros, crie um
 * programa em Java que calcule a soma de todos os elementos do array.
 * Exemplo:
 * Entrada: [5, 2, 9, 1]
 * Saída: 17
 */
public class Exercicios_1 {
    public static void main(String[] args) {
        int vetor[] = new int[4];
        int soma = 0;
        vetor[0] = 2;
        vetor[1] = 5;
        vetor[2] = 9;
        vetor[3] = 1;

        for(int i = 0; i< vetor.length; i++){
         soma += vetor[i];

        }



        System.out.println("Soma dos numero do vetor = ["+ soma +"]");
    }
}