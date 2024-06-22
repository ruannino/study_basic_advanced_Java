import java.util.Scanner;
import entities.ContaBancaria;
/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
        titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
        inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
        conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
        o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
        exemplo).
        Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
        isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
        realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
        suficiente para realizar o saque e/ou pagar a taxa.
        Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
        informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
        mostrando os dados da conta após cada operação.*/
public class ex028 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // Cadastro da classe
        System.out.print("Informe o número da conta: ");
        int numeroConta = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Informe o nome do titular: ");
        String nomeTitular = teclado.nextLine();


        System.out.print("Deseja fazer um deposito inicial ? [s/n] ");
        char resposta = teclado.next().charAt(0);

        ContaBancaria conta;

        if (resposta == 's' || resposta == 'S') {
            System.out.print("Informe o valor do depósito inicial: ");
            double depositoInicial = teclado.nextDouble();
            conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
        } else {
            conta = new ContaBancaria(numeroConta, nomeTitular);
        }

        // Exibir dados da conta
        System.out.println("\nDados da conta: ");
        System.out.println(conta);
        // Realizar depósito
        System.out.println("\nInforme um valor para depósito: ");
        double valorDeposito = teclado.nextDouble();
        conta.depositar(valorDeposito);
        // Exibir dados atualizados após depósito
        System.out.println("\nDados da conta atualizados: ");
        System.out.println(conta);
        // Realizar saque
        System.out.println("\nInforme um  valor para saque: ");
        double valorSaque = teclado.nextDouble();
        conta.sacar(valorSaque);
        // Exibir dados atualizados após saque
        System.out.println("\nDados da conta atualizados: ");
        System.out.println(conta);

        teclado.close();
    }
}
