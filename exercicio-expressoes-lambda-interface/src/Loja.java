import java.util.*;
import java.util.stream.Collectors;

public class Loja {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Ana", 25, 3000.0),
            new Pessoa("Bruno", 35, 4000.0),
            new Pessoa("Carla", 22, 2500.0),
            new Pessoa("Daniel", 40, 5000.0)
        );

        List<Pessoa> pessoasFiltradas = pessoas.stream() // Transforma em um fluxo de dados para aplicar operações funcionais
                .filter(pessoa -> pessoa.getIdade() >= 30) // operações nos dados
                .collect(Collectors.toList()); // finaliza o fluxo e converte os elementos em uma nova lista
        System.out.println("Pessoas com idade maior ou igual a 30:");
        pessoasFiltradas.forEach(pessoa -> System.out.println(pessoa));

        List<Pessoa> pessoasOrdenadas = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList());
        System.out.println("\nPessoas ordenadas por nome:");
        pessoasOrdenadas.forEach(pessoa -> System.out.println(pessoa));

        Desconto desconto = pessoa -> pessoa.getSalario() * 0.9;
        List<Pessoa> pessoasComDesconto = pessoas.stream()
                .map(pessoa -> {
                    pessoa.setSalario(desconto.aplicar(pessoa));
                    return pessoa;
                })
                .collect(Collectors.toList());
        System.out.println("\nPessoas com salário após desconto:");
        pessoasComDesconto.forEach(pessoa -> System.out.println(pessoa));
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nome='%s' | Idade=%d | Salário=%.2f", nome, idade, salario);
    }
}

@FunctionalInterface
interface Desconto {
    double aplicar(Pessoa pessoa);
}