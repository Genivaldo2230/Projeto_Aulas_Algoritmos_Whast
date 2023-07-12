import java.util.Random;

/**
 * Desafio 2: Média dos Números Pares Dada uma lista de números inteiros, crie um
 * programa em Java que calcule a média dos números pares contidos na lista.
 */
public class Exercicios_2_2 {
    public static void main(String[] args) {
        Random rd = new Random(2);

        int num[] = new int[8];

        for(int i=0;i< num.length;i++){
            num[i] = rd.nextInt( );
        }
        int soma = 0;

        for(int j =0; j< num.length; j++){
            soma +=num[j];
        }
        int media = soma / num.length;

        System.out.println("Numéro solteado pelo Random ="+rd.nextInt( media ));

        System.out.println("Sua Média = " + media );


    }
}
