/*Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas
contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz.
Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver,
conforme exemplo.*/
import java.util.Scanner;
public class ex047 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Enter the numbers of lines: ");
        int m = teclado.nextInt();
        System.out.print("Enter column numbers: ");
        int n = teclado.nextInt();
        teclado.nextLine();
        int[][] numbers = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter position value [%d,%d]: ", i, j);
                int number = teclado.nextInt();
                numbers[i][j] = number;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("[%d]", numbers[i][j]);
            }
        }
        System.out.println();
        System.out.print("Enter the value X: ");
        int x = teclado.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] == x) {
                    System.out.printf("Position: %d,%d\n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d\n", numbers[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.printf("UP: %d\n", numbers[i-1][j]);
                    }
                    if (j < numbers[i].length-1) {
                        System.out.printf("Right: %d\n", numbers[i][j+1]);
                    }
                    if (i < numbers.length-1) {
                        System.out.printf("Down: %d\n", numbers[i+1][j]);
                    }
                }
            }
        }
        teclado.close();
    }
}
