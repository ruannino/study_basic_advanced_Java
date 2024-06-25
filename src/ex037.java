import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */
public class ex037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos elementos deve ter cada array? ");
        int n = teclado.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] soma = new int[n];
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o %d° número do array A: ", i+1);
            A[i] = teclado.nextInt();
        }
        for (int j = 0; j < B.length; j++) {
            System.out.printf("Digite o %d° número do array B: ", j+1);
            B[j] = teclado.nextInt();
        }
        System.out.println("RESULTADO DA SOMA DOS VETORES: ");
        for (int k = 0; k < soma.length; k++) {
            soma[k] = A[k] + B[k];
            System.out.println(soma[k]);
        }
        teclado.close();
    }
}
