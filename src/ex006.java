import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
public class ex006 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        if (num >= 0){
            System.out.printf("O número %d é \033[32mPOSITIVO!\033[m", num);
        } else {
            System.out.printf("O número %d é \033[31mNEGATIVO!\033[m", num);
        }
        teclado.close();
    }
}
