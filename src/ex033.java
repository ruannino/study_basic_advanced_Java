import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */
public class ex033 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar? ");
        int n = teclado.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o %d° número:%n ", i+1);
            vetor[i] = teclado.nextDouble();
        }
        System.out.print("Números do vetor: ");
        double soma = 0.0;
        for (double v : vetor) {
            System.out.printf("%.2f ", v);
            soma += v;
        }
        double media = soma / vetor.length;
        System.out.printf("\nSoma total: %.2f%n", soma);
        System.out.printf("Média do vetor: %.2f", media);
        teclado.close();
    }
}

