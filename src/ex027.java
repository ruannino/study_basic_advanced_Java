/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
        uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
        que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
        para ser responsável pelos cálculos.
        Exemplo:
        What is the dollar price? 3.10
        How many dollars will be bought? 200.00
        Amount to be paid in reais = 657.20*/

import java.util.Scanner;
import util.CurrencyConverter;
public class ex027 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double valueDollar = teclado.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double buyDollar = teclado.nextDouble();

        double totalAmount = CurrencyConverter.converteDollar(valueDollar, buyDollar);

        System.out.println("Amount to be paid in reais = R$" + String.format("%.2f", totalAmount));

        teclado.close();
    }
}
