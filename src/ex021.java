/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1*/

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um número: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++){
            fatorial *= i;
        }
        System.out.printf("Fatorial de %d é %d.", n, fatorial);
        teclado.close();
    }
}
