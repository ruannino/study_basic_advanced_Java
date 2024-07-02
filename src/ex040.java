import java.util.Scanner;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */
public class ex040 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos cadastros? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        String[] nome = new String[n];
        int[] idade = new int[n];
        int mIdade = 0;
        String velho = "";

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite o nome da %d° pessoa: ", i+1);
            nome[i] = teclado.nextLine();
            System.out.printf("Digite a idade da %d° pessoa: ", i+1);
            idade[i] = teclado.nextInt();
            teclado.nextLine();
            if(idade[i] > mIdade) {
                mIdade = idade[i];
                velho = nome[i];
            }
        }
        System.out.println("Pessoa mais velha: " + velho);
        teclado.close();
    }
}
