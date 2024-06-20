import java.util.Scanner;
import entities.Triangle;

public class ex00G {
    public static void main(String[] args){
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os três lados de um triângulo X: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        System.out.println("Digite os três lados de um triângulo X: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        double areaX = x.areaTriangle();
        double areaY = y.areaTriangle();

        Triangle.maiorTriangulo(areaX, areaY);


        teclado.close();
    }
}
