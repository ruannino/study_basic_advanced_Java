/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/
import java.util.Scanner;

public class ex016 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, var;

        while (true) {
            System.out.println("Qual o código do combustível abastecido: ");
            var = teclado.nextInt();

            if (var == 1) {
                alcool += 1;
            } else if (var == 2) {
                gasolina += 1;
            } else if (var == 3) {
                diesel += 1;
            } else if (var == 4) {
                break;
            } else continue;
        }
        System.out.printf("Muito Obrigado!%n" + "Alcool: %d%n" + "Gasolina: %d%n" + "Diesel: %d%n"
                , alcool, gasolina, diesel);

        teclado.close();
    }
}
