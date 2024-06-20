import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class ex00H {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = teclado.nextLine();
        System.out.print("Price: ");
        product.price = teclado.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = teclado.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter ther number of products to be added in stock: ");
        int quantity = teclado.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter ther number of products to be removed from stock: ");
        quantity = teclado.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);
        teclado.close();
    }
}
