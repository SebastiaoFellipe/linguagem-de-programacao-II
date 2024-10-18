class Carro {
    private String modelo;
    private String placa;
    private boolean disponivel;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.disponivel = true;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}

class Reserva {
    private Cliente cliente;
    private Carro carro;
    private boolean estaReservado;

    public Reserva(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
        this.estaReservado = false;
    }

    public void alugarCarro() {
        if (this.carro.isDisponivel()) {
            this.carro.setDisponivel(false);
            this.estaReservado = true;
            System.out.println("Carro "+this.carro.getModelo()+" alugado para "+this.cliente.getNome()+"!");
        } else {
            System.out.println("Carro "+this.carro.getModelo()+" não está disponível no momento.");
        }
    }

    public void devolverCarro() {
        if (this.estaReservado) {
            this.carro.setDisponivel(true);
            this.estaReservado = false;
            System.out.println("Carro " + this.carro.getModelo() + " devolvido por " + this.cliente.getNome()+".");
        } else {
            System.out.println("Nenhuma reserva ativa para este carro.");
        }
    }

    public boolean estaReservado() {
        return this.estaReservado;
    }
}

public class ReservaDeCarros {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sebastião", "123.456.789-00");
        Carro carro = new Carro("Honda Civic", "ABC-1234");
        Reserva reserva = new Reserva(cliente, carro);

        reserva.alugarCarro();
        reserva.alugarCarro();
        reserva.devolverCarro();
        reserva.devolverCarro();
    }
}