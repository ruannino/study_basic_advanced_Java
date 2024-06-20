/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos*/
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1, n2, soma;

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        soma = n1 + n2;

        System.out.println("Entrada: " + n1 + " e " + n2);
        System.out.println("Soma = " + soma);
        teclado.close();
    }
}
