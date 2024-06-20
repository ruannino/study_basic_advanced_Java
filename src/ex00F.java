import java.util.Scanner;

public class ex00F {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite três números: ");
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    int num3 = teclado.nextInt();

    int maior = Verif(num1, num2, num3);

    showResult(maior);

    teclado.close();
    }
    public static int Verif(int x, int y, int z){
        int resp;
        if(x > y && x > z){
            resp = x;
        } else if (y > x && y > z){
            resp = y;
        } else {
            resp = z;
        }
        return resp;
    }
    public static void showResult(int value) {
        System.out.println("Maior: " + value);
    }
}
