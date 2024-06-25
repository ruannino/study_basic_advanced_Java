/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos números você quer ler? ");
        int n = teclado.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d número: ", i+1);
            vetor[i] = teclado.nextInt();
        }
        int totalPares = 0;
        System.out.print("NUMEROS PARES: ");
        for (int i : vetor) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
                totalPares++;
            }
        }
        System.out.printf("\nQUANTIDADE DE PARES: %d", totalPares);
        teclado.close();
    }
}
