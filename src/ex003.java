/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, resultado;

        System.out.println("Digite o valor de A: ");
        A = teclado.nextInt();

        System.out.println("Digite o valor de B: ");
        B = teclado.nextInt();

        System.out.println("Digite o valor de C: ");
        C = teclado.nextInt();

        System.out.println("Digite o valor de D: ");
        D = teclado.nextInt();

        resultado = (A * B) - (C * D);
        System.out.printf("DIFERENÇA = %d", resultado);
    }
}
