public class SistemaGestao {
    abstract static class Funcionario {
        protected String nome;
        protected double salarioBase;

        public Funcionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public abstract double calcularPagamento();
    }

    interface Bonus {
        double calcularBonus();
    }

    static class FuncionarioHorista extends Funcionario implements Bonus {
        private int horasTrabalhadas;
        private double valorPorHora;

        public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
            super(nome, salarioBase);
            this.horasTrabalhadas = horasTrabalhadas;
            this.valorPorHora = valorPorHora;
        }

        @Override
        public double calcularPagamento() {
            return horasTrabalhadas * valorPorHora;
        }

        @Override
        public double calcularBonus() {
            return calcularPagamento() * 0.10;
        }

        @Override
        public String toString() {
            return "Horista - Nome: " + nome +
                    ", Salário Base: R$" + salarioBase +
                    ", Bônus: R$" + calcularBonus() +
                    ", Pagamento: R$" + (calcularPagamento() + calcularBonus());
        }
    }

    static class FuncionarioAssalariado extends Funcionario implements Bonus {

        public FuncionarioAssalariado(String nome, double salarioBase) {
            super(nome, salarioBase);
        }

        @Override
        public double calcularPagamento() {
            return salarioBase;
        }

        @Override
        public double calcularBonus() {
            return calcularPagamento() * 0.15;
        }

        @Override
        public String toString() {
            return "Assalariado - Nome: " + nome +
                    ", Salário Base: R$" + salarioBase +
                    ", Bônus: R$" + calcularBonus() +
                    ", Pagamento: R$" + (calcularPagamento() + calcularBonus());
        }
    }

    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Carlos", 2000.0, 40, 50.0);
        System.out.println(horista);

        Funcionario assalariado = new FuncionarioAssalariado("Ana", 3000.0);
        System.out.println(assalariado);
    }
}