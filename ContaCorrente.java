// ContaCorrente.java
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double limiteChequeEspecial) {
        super(numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta corrente " + getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para realizar saque na conta corrente " + getNumeroConta());
        }
    }
}
