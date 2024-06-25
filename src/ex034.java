/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

import java.util.Locale;
import java.util.Scanner;

public class ex034 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas pessoas você irá inserir informações? ");
        int n = teclado.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        for (int a = 0; a < n; a++) {
            teclado.nextLine();
            System.out.printf("Digite o nome da %d° pessoa: ", a+1);
            nomes[a] = teclado.nextLine();
            System.out.printf("Digite a idade da %d° pessoa: ", a+1);
            idade[a] = teclado.nextInt();
            System.out.printf("Digite a altura da %d° pessoa: ", a+1);
            altura[a] = teclado.nextDouble();
        }
        int menorIdade = 0;
        double alturaTotal = 0.0;
        for (int j = 0; j < n; j++) {
            alturaTotal += altura[j];
            if (idade[j] <= 16){
                menorIdade++;
            }
        }
        double percentualMenores = ((double)menorIdade / n) * 100.0;
        double alturaMedia = alturaTotal / n;
        System.out.printf("Altura média das pessoas: %.2f%n", alturaMedia);
        System.out.printf("Média de pessoas menores: %.1f%%\n", percentualMenores);

        System.out.print("Nome das pessoas menores: ");
        if (menorIdade > 0) {
            for (int k = 0; k < n; k++) {
                if (idade[k] <= 16) {
                    System.out.printf("%s ", nomes[k]);
                }
            }
        }
        teclado.close();
    }
}
