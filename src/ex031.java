/*Fazer um programa para ler um número inteiro N e os dados (nome e
        preço) de N Produtos. Armazene os N produtos em um vetor. Em
        seguida, mostrar o preço médio dos produtos*/

import entities.Product_B;
import java.util.Locale;
import java.util.Scanner;

public class ex031 {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos produtos? ");
        int n = teclado.nextInt();
        Product_B[] vect = new Product_B[n];

        for (int i = 0; i < n; i++) {
            teclado.nextLine();
            String name = teclado.nextLine();
            double price = teclado.nextDouble();
            vect[i] = new Product_B(name, price);
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPreco();
        }
        double media = soma / n;
        System.out.println("AVERAGE PRICE: " + String.format("%.2f", media));
        teclado.close();
    }
}
