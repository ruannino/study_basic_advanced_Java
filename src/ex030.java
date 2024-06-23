/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.*/

import java.util.Locale;
import java.util.Scanner;

public class ex030 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas pessoas ? ");
        int n = teclado.nextInt();

        double[] vect = new double[n];

        for (int i=0; i < n; i++) {
            vect[i] = teclado.nextDouble();
        }
        double soma = 0;
        for (int i=0; i<n; i++) {
            soma += vect[i];
        }
        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", soma / n));
        teclado.close();
    }
}
