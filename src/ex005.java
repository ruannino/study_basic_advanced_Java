/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cod1,cod2, n1, n2;
        double v1, v2, total;

        System.out.println("Código da Peça: ");
        cod1 = teclado.nextInt();

        System.out.println("Quantidade da Peça: ");
        n1 = teclado.nextInt();

        System.out.println("O valor R$ da Peça: ");
        v1 = teclado.nextDouble();

        System.out.println("Código da Peça: ");
        cod2 = teclado.nextInt();

        System.out.println("Quantidade da Peça: ");
        n2 = teclado.nextInt();

        System.out.println("O valor R$ da Peça: ");
        v2 = teclado.nextDouble();

        total = (n1 * v1) + (n2 * v2);

        System.out.printf("Pedidos de peças %d e %d %nValor a pagar: R$ %.2f", cod1, cod2, total);
        teclado.close();
    }
}
