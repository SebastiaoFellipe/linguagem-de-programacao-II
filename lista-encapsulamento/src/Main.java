import java.util.Scanner;

class Retangulo {
    private double altura;
    private double largura;

    public void setAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo: ");
        this.altura = scanner.nextDouble();
    }

    public void setLargura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da largura do retângulo: ");
        this.largura = scanner.nextDouble();
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return 2 * (this.largura + this.altura);
    }
}

class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    public void setCatetoBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do cateto base do triângulo: ");
        this.catetoBase = scanner.nextDouble();
    }

    public void setCatetoAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do cateto altura do triângulo: ");
        this.catetoAltura = scanner.nextDouble();
    }

    public void calcularHipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(this.catetoBase, 2) + Math.pow(this.catetoAltura, 2));
    }

    public double getHipotenusa() {
        return this.hipotenusa;
    }

    public double area() {
        return (this.catetoBase * this.catetoAltura) / 2.0;
    }

    public double perimetro() {
        return this.catetoBase + this.catetoAltura + this.hipotenusa;
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura();
        retangulo.setLargura();
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());
        System.out.println("----------------------------------------");
        TrianguloRetangulo triangulo = new TrianguloRetangulo();
        triangulo.setCatetoBase();
        triangulo.setCatetoAltura();
        triangulo.calcularHipotenusa();
        System.out.println("Hipotenusa do triângulo: " + triangulo.getHipotenusa());
        System.out.println("Área do triângulo: " + triangulo.area());
        System.out.println("Perímetro do triângulo: " + triangulo.perimetro());
    }
}
