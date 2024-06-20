/*Ler um número inteiro N e calcular todos os seus divisores.*/

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double n = teclado.nextDouble();

        for (double i = 1; i <= n; i++){
            if(n % i == 0){
                double x = (n / i);
                System.out.printf("%.2f ÷ %.2f = %.2f%n", n, i, x);
            }
        }
        teclado.close();
    }
}
