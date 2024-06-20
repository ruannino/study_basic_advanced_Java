import java.util.Scanner;
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/
public class ex010 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cod, qnt;
        double cQuente, XSalada, XBacon, TSimples, Refri, total;
        cQuente = 4.00; XSalada = 4.50; XBacon = 5.00; TSimples = 2.00; Refri = 1.50;

        System.out.println("Digite o código do produto: ");
        cod = teclado.nextInt();

        System.out.println("Digite a quantidade do produto: ");
        qnt = teclado.nextInt();

        if (cod == 1){
            total = qnt * cQuente;
            System.out.printf("Total: R$ %.2f", total);
        } else if (cod == 2) {
            total = qnt * XSalada;
            System.out.printf("Total: R$ %.2f", total);
        } else if (cod == 3) {
            total = qnt * XBacon;
            System.out.printf("Total: R$ %.2f", total);
        } else if (cod == 4) {
            total = qnt * TSimples;
            System.out.printf("Total: R$ %.2f", total);
        } else if (cod == 5) {
            total = qnt * Refri;
            System.out.printf("Total: R$ %.2f", total);
        } else {
            System.out.println("Código ou quantidade informados estão \033[31mERRADOS!\033[m");
        }
        teclado.close();
    }
}
