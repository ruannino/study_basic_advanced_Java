/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */
import java.util.Locale;
import java.util.Scanner;
public class ex041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos cadastraremos? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite o nome do %d° aluno: ", i+1);
            nome[i] = teclado.nextLine();
            System.out.printf("Digite a 1° nota do %d° aluno: ", i+1);
            nota1[i] = teclado.nextDouble();
            System.out.printf("Digite a 2° nota do %d° aluno: ", i+1);
            nota2[i] = teclado.nextDouble();
            teclado.nextLine();

            media[i] = (nota1[i] + nota2[i]) / 2;
        }
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < media.length; i++) {
            if (media[i] >= 6.0) {
                System.out.println(nome[i]);
            }
        }
        teclado.close();
    }
}
