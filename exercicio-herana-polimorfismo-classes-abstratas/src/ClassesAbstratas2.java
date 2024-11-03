import java.util.ArrayList;
import java.util.List;

abstract class Contato {
    protected String nome;
    protected String endereco;
    protected String email;

    public Contato(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public abstract String getIdentificador();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", Email: " + email;
    }
}

class PessoaFisica extends Contato {
    private String cpf;
    private String dataNascimento;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNascimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento + ", Estado Civil: " + estadoCivil;
    }
}

class PessoaJuridica extends Contato {
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, String inscricaoEstadual, String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj + ", Inscrição Estadual: " + inscricaoEstadual + ", Razão Social: " + razaoSocial;
    }
}

class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato identificado por "+contato.getIdentificador()+" foi adicionado");
    }

    public void removerContato(String identificador) {
        contatos.removeIf(contato -> contato.getIdentificador().equals(identificador));
        System.out.println("Contato identificado por 123.456.789-00 foi removido");
    }

    public Contato pesquisarPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato pesquisarPorIdentificador(String identificador) {
        for (Contato contato : contatos) {
            if (contato.getIdentificador().equals(identificador)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirTodosContatos() {
        System.out.println("MINHA AGENDA");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
        System.out.println();
    }
}

public class ClassesAbstratas2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "joao@joao.com", "123.456.789-00", "01/01/1990", "Solteiro");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Avenida B, 456", "contato@empresa.com", "12.345.678/0001-99", "123456789", "XYZ Ltda");

        agenda.adicionarContato(pf);
        agenda.adicionarContato(pj);

        agenda.exibirTodosContatos();

        System.out.println("Pesquisando contato por nome 'João Silva':");
        Contato contatoNome = agenda.pesquisarPorNome("João Silva");
        System.out.println(contatoNome != null ? contatoNome : "Contato não encontrado.");
        System.out.println();
        System.out.println("Pesquisando contato por CPF/CNPJ '12.345.678/0001-99':");
        Contato contatoIdentificador = agenda.pesquisarPorIdentificador("12.345.678/0001-99");
        System.out.println(contatoIdentificador != null ? contatoIdentificador : "Contato não encontrado.");
        System.out.println();
        agenda.removerContato("123.456.789-00");
        System.out.println();
        agenda.exibirTodosContatos();
    }
}