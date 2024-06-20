/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos pares de número você quer dividir ? ");
        int n = teclado.nextInt();

        for (int cont = 0; cont < n; cont ++){
            System.out.println("Digite o numerador: ");
            double numerador = teclado.nextDouble();

            System.out.println("Digite o denominador: ");
            double denominador = teclado.nextDouble();

            if (denominador == 0) {
                System.out.println("\033[31mDivisão Impossivel!\033[m");
            } else {
                double divisao = (numerador / denominador);
                System.out.printf("Resultado: \033[32m%.2f\033[m%n", divisao);
            }
        }
        teclado.close();
    }
}