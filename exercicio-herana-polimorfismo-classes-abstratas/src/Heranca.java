// Classe abstrata Veiculo
abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirInformacoes();
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar() {
        System.out.println("VRUM VRUM");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Carro");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar() {
        System.out.println("VRUM VRUM");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Moto");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}

public class Heranca {
    public static void main(String[] args) {
        Carro carro = new Carro("McLaren", "P1");
        Moto moto = new Moto("Honda", "CB500");
        carro.exibirInformacoes();
        carro.acelerar();
        System.out.println();
        moto.exibirInformacoes();
        moto.acelerar();
    }
}
