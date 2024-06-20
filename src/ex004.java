/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais*/

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int cod, horas;
        double valorH, total;

        System.out.println("Digite o código do Funcionário: ");
        cod = teclado.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        horas = teclado.nextInt();

        System.out.println("Valor por hora trabalhada: ");
        valorH = teclado.nextDouble();

        total = horas * valorH;

        System.out.printf("CÓD.: %s - Horas Trabalhadas: %d - Valor Hora: R$ %.2f Total: %.2f",
                cod, horas, valorH, total);
        teclado.close();

    }
}
