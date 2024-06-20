/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/
import java.util.Scanner;

public class ex017 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número entre [1 - 1000]: ");
        int x = teclado.nextInt();

        for (int cont = 1; cont <= x; cont++)
            if (cont % 2 != 0){
                System.out.println(cont);
            }
        teclado.close();
    }
}
