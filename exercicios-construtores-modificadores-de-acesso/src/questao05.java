import java.util.ArrayList;
import java.util.List;

class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

abstract class Pessoa {
    String nome;
    Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();
}

class Cliente extends Pessoa {
    int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Código: " + codigo);
        System.out.println();
    }
}

class Funcionario extends Pessoa {
    float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return salario * 0.03f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Funcionario:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Imposto: " + calculaImposto());
        System.out.println();
    }
}

class Gerente extends Funcionario {
    String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return salario * 0.05f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Área: " + area);
        System.out.println("Imposto: " + calculaImposto());
        System.out.println();
    }
}

class CadastroPessoas {
    List<Pessoa> pessoas;

    public CadastroPessoas() {
        pessoas = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pess) {
        pessoas.add(pess);
    }

    public void imprimeCadastro() {
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimeDados();
        }
    }
}

public class questao05 {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        // Cadastrando 3 clientes
        cadastro.cadastraPessoa(new Cliente("Cliente 1", new Data(1, 1, 1980), 101));
        cadastro.cadastraPessoa(new Cliente("Cliente 2", new Data(5, 7, 1990), 102));
        cadastro.cadastraPessoa(new Cliente("Cliente 3", new Data(12, 12, 2000), 103));

        // Cadastrando 3 funcionários
        cadastro.cadastraPessoa(new Funcionario("Funcionario 1", new Data(10, 5, 1985), 3000));
        cadastro.cadastraPessoa(new Funcionario("Funcionario 2", new Data(20, 6, 1995), 4000));
        cadastro.cadastraPessoa(new Funcionario("Funcionario 3", new Data(15, 8, 1988), 3500));

        // Cadastrando 3 gerentes
        cadastro.cadastraPessoa(new Gerente("Gerente 1", new Data(25, 3, 1975), 8000, "Vendas"));
        cadastro.cadastraPessoa(new Gerente("Gerente 2", new Data(30, 4, 1982), 9000, "TI"));
        cadastro.cadastraPessoa(new Gerente("Gerente 3", new Data(8, 10, 1980), 8500, "RH"));

        // Imprimindo o cadastro de todas as pessoas
        cadastro.imprimeCadastro();
    }
}
