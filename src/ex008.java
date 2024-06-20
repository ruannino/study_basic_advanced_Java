/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int A, B;

        System.out.println("Digite o número A: ");
        A = teclado.nextInt();

        System.out.println("Digite o número B: ");
        B = teclado.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("Os valores digitados são \033[32mMÚLTIPLOS!\033[m");
        } else {
            System.out.println("Os valores digitados \033[31mNÃO\033[m são múltiplos!");
        }

        teclado.close();
    }
}
