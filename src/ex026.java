/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.*/
import java.util.Scanner;
import entities.Aluno;

public class ex026 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome do Aluno(a): ");
        aluno.name = teclado.nextLine();

        System.out.println("Digite as notas: ");
        aluno.nota1 = teclado.nextDouble();
        aluno.nota2 = teclado.nextDouble();
        aluno.nota3 = teclado.nextDouble();

        System.out.println(aluno);
        teclado.close();
    }
}
