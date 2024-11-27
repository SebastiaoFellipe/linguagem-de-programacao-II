@FunctionalInterface
interface Square {
    double calculate(double value);
}

public class Main {
    public static void main(String[] args) {
        Square square = (value) -> value * value;
        double numero = 4.0;
        System.out.println("O quadrado de " + numero + " é: " + square.calculate(numero));
    }
}
