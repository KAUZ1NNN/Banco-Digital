// ContaBancaria.java
public class ContaBancaria {
    private String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente para realizar saque na conta " + numeroConta);
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada da conta "
                               + numeroConta + " para conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para realizar transferência da conta "
                               + numeroConta + " para conta " + destino.getNumeroConta());
        }
    }
}
