import java.util.Scanner;

public class ex00B {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são? ");
        hora = teclado.nextInt();

        if (hora < 12){
            System.out.println("Bom dia!");
        }
        if (hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!");
        }
        if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        }
        teclado.close();
    }
}
