import java.util.Vector;

abstract class Pessoa {
    public Pessoa() {}

    @Override
    public String toString() {
        return "Dados da pessoa:";
    }
}

abstract class PessoaIMC extends Pessoa {
    private double peso;
    private double altura;

    public PessoaIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC(double peso, double altura) {
        return peso/(altura*altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}

class Homem extends PessoaIMC {
    public Homem(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(getPeso(), getAltura());
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc <= 34.9) {
            return "Obesidade grau I";
        } else {
            return "Obesidade grau II ou superior";
        }
    }
}

class Mulher extends PessoaIMC {
    public Mulher(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(getPeso(), getAltura());
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc <= 34.9) {
            return "Obesidade grau I";
        } else {
            return "Obesidade grau II ou superior";
        }
    }
}

// Classe Programa com o método main
public class questao4 {
    public static void main(String[] args) {
        Vector<PessoaIMC> pessoas = new Vector<>();

        pessoas.add(new Homem(80, 1.75));
        pessoas.add(new Mulher(60, 1.65));

        for (PessoaIMC pessoa : pessoas) {
            System.out.println(pessoa);
            System.out.println("IMC: " + pessoa.calculaIMC(pessoa.getPeso(), pessoa.getAltura()));
            System.out.println("Resultado IMC: " + pessoa.resultIMC());
            System.out.println();
        }
    }
}