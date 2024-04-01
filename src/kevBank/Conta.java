package kevBank;
public class Conta {
    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("O valor digitado é menor, ou igual a zero, operação cancelada.");
        }
    }
    
    public void sacar(double valor){
        if (valor < saldo || valor <= 0){
            this.saldo -= valor;
        } else {
            System.out.println("O valor que foi tentado sacar, é maior que o saldo da conta, ou igual/menor que zero. Saldo atual: " + this.saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}