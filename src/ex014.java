/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int senha = 2002, tentativa;

        System.out.println("Digite a senha de acesso: ");
        tentativa = teclado.nextInt();

        while (senha != tentativa) {
            System.out.println("\033[31mSENHA INCORRETA! \033[m");
            System.out.println("Digite a senha de acesso: ");

            tentativa = teclado.nextInt();
        }
        System.out.println("\033[32mACESSO PERMITIDO\033[m");
        teclado.close();
    }
}
