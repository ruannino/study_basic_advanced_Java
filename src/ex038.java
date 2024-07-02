/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
import java.util.Locale;
import java.util.Scanner;
public class ex038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos elementos terá o vetor? ");
        int n = teclado.nextInt();

        double[] vetor = new double[n];
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d° número: ", i+1);
            vetor[i] = teclado.nextDouble();
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.printf("Média do Vetor: %.3f%n", media);
        System.out.print("Elementos abaixo da média: ");
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] < media) {
                System.out.printf("%.1f  ", vetor[j]);
            }
        }
        teclado.close();
    }
}
