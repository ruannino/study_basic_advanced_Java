/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */
import java.util.Locale;
import java.util.Scanner;
public class ex042 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas pessoas vamos cadastrar? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        double[] altura = new double[n];
        char[] gen = new char[n];
        int contM = 0;
        int contF = 0;
        double somaAF = 0;
        double alturaMaior = Double.MIN_VALUE;
        double alturaMenor = Double.MAX_VALUE;

        for (int i = 0; i < altura.length; i++) {
            System.out.printf("Altura da %d° pessoa: ", i+1);
            altura[i] = teclado.nextDouble();
            System.out.printf("Gênero da %d° pessoa [F/M]: ", i+1);
            gen[i] = teclado.next().charAt(0);
            teclado.nextLine();
            if (gen[i] == 'm' || gen[i] == 'M') {
                contM += 1;
            } else if (gen[i] == 'f' || gen[i] == 'F') {
                somaAF += altura[i];
                contF += 1;
            }
            if (altura[i] > alturaMaior) {
                alturaMaior = altura[i];
            }
            if (altura[i] < alturaMenor) {
                alturaMenor = altura[i];
            }
        }
        System.out.println("RESULTADOS!");
        System.out.printf("Menor altura do grupo: %.2f\n", alturaMenor);
        System.out.printf("Maior altura do grupo: %.2f\n", alturaMaior);
        if (contF > 0) {
            double media = somaAF / contF;
            System.out.printf("Média de altura das mulheres: %.2f\n", media);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }
        System.out.printf("Homens cadastrados: %d\n", contM);

        teclado.close();
    }
}
