/*Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.*/
import java.util.Scanner;

public class ex046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("What is the size of the matrix? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        int[][] mat = new int[n][n];
        int countNegative = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter position value: [%d,%d] ", i, j);
                int number = teclado.nextInt();
                teclado.nextLine();
                mat[i][j] = number;
                if (number < 0) {
                    countNegative++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("[%d]", mat[i][j]);
            }
        }
        System.out.println("\n");
        System.out.print("Main diagonal: ");
        for (int i = 0; i < n; i++) {
                System.out.printf("[%d] ", mat[i][i]);
            }
        System.out.println();
        System.out.println("Negative numbers: " + countNegative);

        teclado.close();
    }
}
