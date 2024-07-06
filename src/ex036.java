/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */
import java.util.Locale;
import java.util.Scanner;

public class ex036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar? ");
        int n = teclado.nextInt();

        double[] vector = new double[n];
        double numeroMaior = 0.0;
        int posicao = -1;

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Digite o %d° número: ", i+1);
            vector[i] = teclado.nextDouble();
            if (vector[i] > numeroMaior) {
                numeroMaior = vector[i];
                posicao = i;
            }
        }
        System.out.printf("O maior número digitado foi %.2f na posiçao %d.", numeroMaior, posicao);
        teclado.close();
    }
}
