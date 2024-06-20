/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Informe um número no intervalo [0-100]: ");
        num = teclado.nextInt();

        if (num >= 0 && num <= 25){
            System.out.println("Seu número está no intervalo \033[32m[0, 25]!\033[m");
        } else if (num > 25 && num <= 50){
            System.out.println("Seu número está no intervalo \033[32m[25, 50]!\033[m");
        } else if (num > 50 && num <= 75) {
            System.out.println("Seu número está no intervalo \033[32m[50, 75]!\033[m");
        } else if (num > 75 && num <= 100) {
            System.out.println("Seu número está no intervalo \033[32m[75, 100]!\033[m");
        } else {
                System.out.println("\033[31mFora do intervalo!\033[m");
        }
        teclado.close();
    }
}
