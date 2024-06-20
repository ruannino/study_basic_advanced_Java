import java.util.Scanner;

public class ex00C {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num, total = 0;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        while (num != 0){
            total += num;
            System.out.println("Digite um número: ");
            num = teclado.nextInt();
        }
        System.out.printf("O valor total: %d", total);
        teclado.close();
    }
}
