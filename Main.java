// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta corrente: ");
        String numContaCorrente = scanner.nextLine();
        System.out.print("Digite o limite do cheque especial da conta corrente: ");
        double limiteChequeEspecial = scanner.nextDouble();

        System.out.print("Digite o número da conta poupança: ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String numContaPoupanca = scanner.nextLine();
        System.out.print("Digite a taxa de rendimento da conta poupança (por exemplo, 0,05 para 5%): ");
        double taxaRendimento = scanner.nextDouble();

        ContaCorrente cc1 = new ContaCorrente(numContaCorrente, limiteChequeEspecial);
        ContaPoupanca cp1 = new ContaPoupanca(numContaPoupanca, taxaRendimento);

        // Exemplo de operações bancárias
        cc1.depositar(2000.0);
        cp1.depositar(500.0);

        cc1.sacar(500.0);
        cp1.sacar(100.0);

        cc1.transferir(cp1, 300.0);

        cp1.aplicarRendimento();

        System.out.println("Saldo da conta corrente " + cc1.getNumeroConta() + ": R$" + cc1.getSaldo());
        System.out.println("Saldo da conta poupança " + cp1.getNumeroConta() + ": R$" + cp1.getSaldo());

        scanner.close();
    }
}
