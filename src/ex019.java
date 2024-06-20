/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5*/

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número de testes de caso: ");
        int x = teclado.nextInt();

        for (int i = 0; i < x; i++){
            System.out.println("Digite o primeiro valor: ");
            double valor1 = teclado.nextDouble();

            System.out.println("Digite o segundo valor: ");
            double valor2 = teclado.nextDouble();

            System.out.println("Digite o segundo valor ");
            double valor3 = teclado.nextDouble();

            double mediaPonderada = (((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3+ 5));

            System.out.printf("A media ponderada: %.1f%n", mediaPonderada);
        }
        teclado.close();
    }
}
