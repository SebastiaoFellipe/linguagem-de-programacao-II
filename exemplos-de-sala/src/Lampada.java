public class Lampada {
    public String cor = "vermelho";
    public int intensidade = 50;
    public boolean ligada = false;

    public void acender(){
        this.ligada = true;
    }

    public void apagar(){
        this.ligada = false;
    }

    public void informarEstado(){
        if (this.ligada == true) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public void informacoesGerais(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Intensidade: "+this.intensidade);
        informarEstado();
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        if (cor == "vermelho" || cor == "verde" || cor == "azul") {
            this.cor = cor;
        } else {
            System.out.println("Erro ao modificar a cor. As cores permitidas são: vermelho, verde e azul.");
        }
    }

    public int getIntensidade(){
        return this.intensidade;
    }

    public void setIntensidade(int intensidade){
        if (intensidade>=0 && intensidade<=255) {
            this.intensidade = intensidade;
        } else {
            System.out.println("Erro ao modificar a intensidade. Digite um valor entre 0 e 255.");
        }
        
    }

    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        lamp.informacoesGerais();
        lamp.setCor("azul");
        lamp.setIntensidade(255);
        lamp.acender();
        lamp.informacoesGerais();
    }
}