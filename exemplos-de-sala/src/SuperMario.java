class Personagem {
    String nome = "Mario";
    int vida = 100;
    String sprite = "mario.png";
    int poder = 50;

    public void pular() {
        System.out.println(nome + " pulou!");
    }
}

class Inimigo {
    String nome = "Vilão";
    int vida = 80;
    String sprite = "vilao.png";

    public void atacar() {
        System.out.println(nome + " atacou!");
    }
}

class Item {
    String tipo = "Cura";
    String efeito = "Recupera 50 de vida";
    int duracao = 10;

    public void aplicarEfeito(Personagem personagem) {
        System.out.println("Item do tipo " + tipo + " aplicado a " + personagem.nome + " com efeito: " + efeito);
    }
}

class Interface {
    int temporizador = 300;
    int pontuacao = 1000;
    int moedas = 5;

    public void update() {
        System.out.println("Interface atualizada: Temporizador = " + temporizador + ", Pontuação = " + pontuacao + ", Moedas = " + moedas);
    }
}

class CaixaFlutuante {
    boolean status = true;
    int posicaoX = 10;
    int posicaoY = 20;

    public void quebrar() {
        if (status) {
            status = false;
            System.out.println("Caixa quebrada na posição (" + posicaoX + ", " + posicaoY + ")");
        } else {
            System.out.println("Caixa já foi quebrada.");
        }
    }
}

public class SuperMario {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Inimigo inimigo = new Inimigo();
        Item item = new Item();
        Interface jogoInterface = new Interface();
        CaixaFlutuante caixa = new CaixaFlutuante();

        personagem.pular();
        inimigo.atacar();
        item.aplicarEfeito(personagem);
        jogoInterface.update();
        caixa.quebrar();
    }
}
