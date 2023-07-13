/**
 * Desafio 2: Média dos Números Pares Dada uma lista de números inteiros, crie um
 * programa em Java que calcule a média dos números pares contidos na lista.
 * Exemplo:
 * Entrada: [4, 7, 2, 9, 10, 16]
 * Saída: 8.0
 */
public class Exercicios_2_1 {
    public static void main(String[] args) {

        int[] num = new int[7];
        double soma = 0;
        int qtdPares = 0;

        num[0] = 4;
        num[1] = 7;
        num[2] = 2;
        num[3] = 9;
        num[4] = 10;
        num[5] = 16;

        for (int j : num) {  //usamos o for each

            if (j % 2 == 0) { // verifica se o número é par

                soma += j; // soma o número par à variável soma

                qtdPares++; // incrementa a quantidade de números pares
            }

        }

        if (qtdPares > 0) { // verifica se há números pares na lista

            double media = soma / qtdPares; // calcula a média dos números pares

            System.out.println("A média dos números pares é: " + media);

        } else {

            System.out.println("Não há números pares na lista.");

        }
    }
}