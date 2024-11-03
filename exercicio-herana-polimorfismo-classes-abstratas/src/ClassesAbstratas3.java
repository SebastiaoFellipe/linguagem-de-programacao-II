abstract class FiguraGeometrica {
    protected String cor;
    protected boolean filled;

    public FiguraGeometrica(String cor, boolean filled) {
        this.cor = cor;
        this.filled = filled;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(String cor, boolean filled, double raio) {
        super(cor, filled);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean filled, double largura, double altura) {
        super(cor, filled);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

class Quadrado extends Retangulo {
    public Quadrado(String cor, boolean filled, double lado) {
        super(cor, filled, lado, lado);
    }

    public double getLado() {
        return getLargura();
    }

    public void setLado(double lado) {
        setLargura(lado);
        setAltura(lado);
    }
}

public class ClassesAbstratas3 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("vermelho", true, 5.0);
        System.out.println("Círculo - Cor: " + circulo.getCor() + ", Preenchido: " + (circulo.isFilled() ? "Sim" : "Não") +
                ", Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());

        Retangulo retangulo = new Retangulo("azul", false, 4.0, 6.0);
        System.out.println("Retângulo - Cor: " + retangulo.getCor() + ", Preenchido: " + (retangulo.isFilled() ? "Sim" : "Não") +
                ", Área: " + retangulo.calcularArea() + ", Perímetro: " + retangulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado("verde", true, 3.0);
        System.out.println("Quadrado - Cor: " + quadrado.getCor() + ", Preenchido: " + (quadrado.isFilled() ? "Sim" : "Não") +
                ", Área: " + quadrado.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro());
    }
}