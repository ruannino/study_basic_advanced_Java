/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)*/

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int in = 0, out = 0;

        System.out.println("Quantos valores você quer digitar? ");
        int x = teclado.nextInt();

        for (int cont = 0; cont < x; cont++) {
            System.out.println("Digite o número: ");
            int z = teclado.nextInt();
            if (z >= 10 && z <= 20) {
                System.out.printf("%d \033[32mIN\033[m.%n", z);
                in += 1;
            } else {
                System.out.printf("%d \033[31mOUT\033[m.%n", z);
                out += 1;
            }
        }
        System.out.println("-------------");
        System.out.printf("Total in: %d%n", in);
        System.out.printf("Total out: %d", out);
        teclado.close();
    }
}
