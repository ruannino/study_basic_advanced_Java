package entities;

public class ContaBancaria {
    // Atributos privados
    private final int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor inicial
    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }
    // Construtor sem depósito inial
    public ContaBancaria(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }
    // Métodos públicos para acessar e modificar os atributos
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    // <étodo para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    // Método para sacar dinheiro
    public void sacar(double valor){
        if (valor > 0) {
            saldo -= (valor + 5.00);
        }
    }
    // Método para exibir informações da conta
    public String toString(){
        return "Conta " + numeroConta
                + "\nTitular: " + nomeTitular
                + "\nSaldo: R$ " + String.format("%.2f", saldo);
    }
}
