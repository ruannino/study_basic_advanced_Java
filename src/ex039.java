/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
import java.util.Locale;
import java.util.Scanner;
public class ex039 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int n = teclado.nextInt();

        int[] vetor = new int[n];
        double sum = 0;
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d° número: ", i+1);
            vetor[i] = teclado.nextInt();
            if (vetor[i] % 2 == 0) {
                sum += vetor[i];
                cont++;
            }
        }
        if (cont == 0) {
            System.out.print("Nenhum número par!");
        } else {
            double media = sum / cont;
            System.out.printf("Média dos pares: %.1f", media);
        }
        teclado.close();
    }
}
