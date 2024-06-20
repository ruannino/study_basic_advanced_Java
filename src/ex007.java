import java.util.Scanner;
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

public class ex007 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        if (num % 2 == 0){
            System.out.printf("O número %d é \033[32mPAR!\033[m", num);
        } else {
            System.out.printf("O número %d é \033[33mÍMPAR!\033[m", num);
        }
        teclado.close();
    }
}
