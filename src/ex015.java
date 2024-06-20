/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double x, y;

        while (true){
            System.out.println("Digite as coordenadas de X: ");
            x = teclado.nextDouble();

            System.out.println("Digite as coordenadas de y: ");
            y = teclado.nextDouble();

            if (x == 0 || y == 0){
                break;
            }
            if (x > 0 && y > 0){
                System.out.println("Quadrante Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante Q4");
            }
        }
        teclado.close();
    }
}
