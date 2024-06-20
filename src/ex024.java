/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado*/
import entities.Rectangle;

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Rectangle rectangle;
        rectangle = new Rectangle();

        System.out.println("Digite a largura e altura do triângulo: ");
        rectangle.lar = teclado.nextDouble();
        rectangle.alt = teclado.nextDouble();

        double area = rectangle.areaRectangle();
        double perimeter = rectangle.perimeterRectangle();
        double diagonal = rectangle.diagonalRectangle();

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PERIMETER = %.2f%n", perimeter);
        System.out.printf("DIAGONAL = %.2f%n", diagonal);

        teclado.close();
    }
}
