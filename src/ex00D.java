import java.util.Scanner;

public class ex00D {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;

        System.out.println("Quantos números você quer digitar? ");
        int x = teclado.nextInt();

        for(int i = 0; i < x; i ++){
            int cont = i + 1;
            System.out.printf("Digite o %d° número: ", cont);
            int z = teclado.nextInt();
            soma += z;
        }
        System.out.printf("A soma total: %d", soma);
        teclado.close();
    }
}
