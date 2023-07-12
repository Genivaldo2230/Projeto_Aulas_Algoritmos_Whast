/**
 * Desafio 2: Média dos Números Pares Dada uma lista de números inteiros, crie um
 * programa em Java que calcule a média dos números pares contidos na lista.
 * Exemplo:
 * Entrada: [4, 7, 2, 9, 10, 16]
 * Saída: 8.0
 */
public class Exercicios_2 {

    public static void main(String[] args) {

     int num[] = new int[7];
     double soma =0;

     num[0] = 4;
     num[1] = 7;
     num[2] = 2;
     num[3] = 9;
     num[4] = 10;
     num[5] = 16;

     for(int i =0; i< num.length; i++){
      soma+=num[i];
     }
     System.out.println("A media do numeros são = " +soma /6);

    }

}
