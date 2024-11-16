public class SistemaPagamentos {

    abstract static class Pagamento {
        protected double valor;

        public Pagamento(double valor) {
            this.valor = valor;
        }

        public abstract void realizarPagamento();
    }

    interface Autenticacao {
        boolean autenticar();
    }

    static class CartaoCredito extends Pagamento implements Autenticacao {
        public CartaoCredito(double valor) {
            super(valor);
        }

        @Override
        public boolean autenticar() {
            System.out.println("Autenticando Cartão de Crédito...");
            return true;
        }

        @Override
        public void realizarPagamento() {
            if (autenticar()) {
                System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
            } else {
                System.out.println("Falha na autenticação do Cartão de Crédito.");
            }
        }
    }

    static class BoletoBancario extends Pagamento implements Autenticacao {
        public BoletoBancario(double valor) {
            super(valor);
        }

        @Override
        public boolean autenticar() {
            System.out.println("Validando Boleto Bancário...");
            return true;
        }

        @Override
        public void realizarPagamento() {
            if (autenticar()) {
                System.out.println("Pagamento de R$" + valor + " realizado com Boleto Bancário.");
            } else {
                System.out.println("Falha na validação do Boleto Bancário.");
            }
        }
    }

    static class PIX extends Pagamento implements Autenticacao {
        public PIX(double valor) {
            super(valor);
        }

        @Override
        public boolean autenticar() {
            System.out.println("Autenticando PIX...");
            return true;
        }

        @Override
        public void realizarPagamento() {
            if (autenticar()) {
                System.out.println("Pagamento de R$" + valor + " realizado com PIX.");
            } else {
                System.out.println("Falha na autenticação do PIX.");
            }
        }
    }
    
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito(100.0);
        cartao.realizarPagamento();

        Pagamento boleto = new BoletoBancario(200.0);
        boleto.realizarPagamento();

        Pagamento pix = new PIX(50.0);
        pix.realizarPagamento();
    }
}