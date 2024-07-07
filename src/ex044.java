/*A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos
identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
uma quantidade N representando o número de estudantes que vão alugar quartos
(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes, bem
como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um
quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupaçoes
do pensionato, por ordem de quarto, conforme exemplo.
Ex Level Medium*/
import entities.Rent;
import java.util.Scanner;
import java.util.Locale;
public class ex044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Hom many rooms will be rented? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        Rent[] quartos = new Rent[10];

        for (int q = 0; q < n; q++) {
            System.out.printf("Rent #%d: \n", q+1);
            System.out.print("Name: ");
            String name = teclado.nextLine();
            System.out.print("Email: ");
            String email = teclado.next();
            System.out.print("Room: ");
            int roomNumber = teclado.nextInt();
            teclado.nextLine();
            quartos[roomNumber] = new Rent(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int q = 0; q < quartos.length; q++) {
            if (quartos[q] != null) {
                System.out.printf("%d: %s\n", q, quartos[q]);
            }
        }
        teclado.close();
    }
}
