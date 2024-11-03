import java.util.ArrayList;
import java.util.List;

abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void calcularJuros();

    public void exibirSaldo() {
        System.out.println("Saldo atual: "+saldo);
    }
}

class ContaCorrente extends Conta {
    private static final double TAXA_JUROS = 0.01;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * TAXA_JUROS;
        System.out.println("Juros da Conta Corrente aplicados.");
    }
}

class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.05;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * TAXA_JUROS;
        System.out.println("Juros da Conta Poupança aplicados.");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new ContaCorrente(1000.0));
        contas.add(new ContaCorrente(1700.0));
        contas.add(new ContaPoupanca(2000.0));
        contas.add(new ContaCorrente(1500.0));
        contas.add(new ContaPoupanca(3000.0));
        for (Conta conta : contas) {
            System.out.println("Saldo anterior: "+conta.saldo);
            conta.calcularJuros();
            conta.exibirSaldo();
            System.out.println();
        }
    }
}
