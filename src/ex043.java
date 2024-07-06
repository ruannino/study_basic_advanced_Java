/*A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos
identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
uma quantidade N representando o número de estudantes que vão alugar quartos
(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes, bem
como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um
quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupaçoes
do pensionato, por ordem de quarto, conforme exemplo.
Ex Level Basic*/
import java.util.Scanner;
import java.util.Locale;
public class ex043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        String[] quartos = new String[10];
        System.out.print("Hom many rooms will be rented? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        for (int h = 0; h < n; h++) {
            System.out.printf("Rent #%d:\n", h+1);
            System.out.print("Name: ");
            String nome = teclado.nextLine();
            System.out.print("Email: ");
            String email = teclado.nextLine();
            System.out.print("Room: ");
            int q = teclado.nextInt();
            teclado.nextLine();
            quartos[q] = String.format("%s, %s", nome, email);
        }
        System.out.println("Busy rooms: ");
        for (int h = 0; h < 10; h++) {
            if (quartos[h] != null) {
                System.out.println(h + ": " + quartos[h]);
            }
        }
        teclado.close();
    }
}
