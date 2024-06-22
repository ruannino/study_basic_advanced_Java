/*Crie uma classe Carro que contenha as informações de um carro:
marca, modelo e ano. A marca e o modelo podem ser alterados,
mas o ano do carro não pode ser modificado uma vez definido.
Forneça métodos para obter e alterar a marca e o modelo,
e um método para obter o ano do carro. Escreva um programa que crie um objeto Carro,
exiba suas informações, altere a marca e o modelo, e exiba novamente as informações atualizadas.
 */
import entities.Carro;
import java.util.Scanner;
public class ex029 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a marca: ");
        String marca = teclado.nextLine();

        System.out.println("Informe o modelo: ");
        String modelo = teclado.nextLine();

        System.out.println("Informe a ano: ");
        int ano = teclado.nextInt();

        System.out.println("Informação do Carro:");
        Carro carro = new Carro(marca, modelo, ano);
        System.out.println(carro);

        System.out.println("Deseja alterar a marca ou modelo ? ");
        char select = teclado.next().charAt(0);
        teclado.nextLine();

        if (select == 's' || select == 'S'){
            System.out.println("Informe a marca: ");
            String novaMarca = teclado.nextLine();
            carro.setCarroMarca(novaMarca);

            System.out.println("Informe o modelo: ");
            String novoModelo = teclado.nextLine();
            carro.setCarroModelo(novoModelo);
        } else {
            System.out.println("Dados mantidos!");
        }

        System.out.println("Informação Atualizadas: ");
        System.out.println(carro);

    }
}
