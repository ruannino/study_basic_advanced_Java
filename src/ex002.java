/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double raio, area, pi;
        pi = 3.14159;
        System.out.print("Digite o raio do círculo: ");
        raio = teclado.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.4f%n", area);
        teclado.close();
    }
}

