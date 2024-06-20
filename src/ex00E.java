import java.util.Scanner;

public class ex00E {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        char x;
        do {
            System.out.print("Informe a temperatura em Celcius: C° ");
            double celcius = teclado.nextDouble();
            double fahrenheit = 9.0 * celcius / 5.0 + 32.0;
            System.out.printf("%nSua temperatura em Fahrenheit é: %.1fF°%n", fahrenheit);
            System.out.println("Deseja repetir? [s/n] ");
            x = teclado.next().charAt(0);
        } while ( x != 'n');
        teclado.close();
    }
}
