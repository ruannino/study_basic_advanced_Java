/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

import java.util.Scanner;

public class ex032 {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número [1-10]: ");
        int n = teclado.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = teclado.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i : vetor) {
            if (i < 0) {
                System.out.printf("%d ", i);
            }
        }

        teclado.close();
    }
}
