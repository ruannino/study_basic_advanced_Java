/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo*/

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = teclado.nextInt();

        for (int l = 1; l <= n; l++){
            double lq = Math.pow(l, 2);
            double lc = Math.pow(l, 3);
            System.out.printf("%d %.0f %.0f %n", l, lq, lc);
        }

        teclado.close();
    }
}
