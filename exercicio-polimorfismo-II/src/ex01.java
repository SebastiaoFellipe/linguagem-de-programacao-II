abstract class Imovel {
    private String endereco;
    protected double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public abstract double getPreco();
}

class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    @Override
    public double getPreco() {
        return super.preco+adicional;
    }
}

class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return super.preco-desconto;
    }
}

public class ex01 {
    public static void main(String[] args) {
        Novo imovel_novo = new Novo("rua laranja, 321", 20000, 4300);
        Velho imovel_velho = new Velho("rua abobrinha, 123", 20000, 3500);
        System.out.println("Imovél novo\nEndereço: "+imovel_novo.getEndereco()+"\nValor: "+imovel_novo.getPreco());
        System.out.println("Imovél velho\nEndereço: "+imovel_velho.getEndereco()+"\nValor: "+imovel_velho.getPreco());
    }
}