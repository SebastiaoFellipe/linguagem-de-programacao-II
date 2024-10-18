// Classe Cliente: representa um cliente do banco
class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}

class ContaBancaria {
    private Cliente cliente;
    private double saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Depósito não realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void extrato() {
        System.out.println("Saldo atual: R$"+saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }
}

public class Banco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sebastião", "123.456.789-00",20);
        ContaBancaria conta = new ContaBancaria(cliente);

        System.out.println("Cliente: " + conta.getCliente().getNome());
        conta.extrato();

        conta.depositar(500.0);
        conta.extrato();

        conta.sacar(200.0);
        conta.extrato();

        conta.sacar(400.0);
    }
}

