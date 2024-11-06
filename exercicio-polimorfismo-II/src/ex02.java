class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: " + valor);
    }

    public double getValor() {
        return valor;
    }
}

class VIP extends Ingresso {
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double getValorVIP() {
        return valor+adicional;
    }

    public double getAdicional(){
        return this.adicional;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Ingresso Normal - valor: "+this.valor);
    }
}

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização: "+localizacao);
    }
}

class CamaroteSuperior extends VIP {
    private String localizacao;
    private double adicionalSuperior;

    public CamaroteSuperior(double valor, double adicional, double adicionalSuperior, String localizacao) {
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;
        this.localizacao = localizacao;
    }

    @Override
    public double getValorVIP() {
        return super.getValorVIP()+adicionalSuperior;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização: "+localizacao);
    }
}

public class ex02 {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Normal(50.0);
        ingressoNormal.imprimeValor();

        VIP ingressoVIP = new VIP(ingressoNormal.getValor(), 20.0);
        System.out.println("Valor do ingresso VIP: " + ingressoVIP.getValorVIP());

        CamaroteInferior ingressoCamaroteInferior = new CamaroteInferior(ingressoNormal.getValor(), ingressoVIP.getAdicional(), "Setor B");
        System.out.println("Valor do ingresso Camarote Inferior: "+ingressoCamaroteInferior.getValorVIP());
        ingressoCamaroteInferior.imprimeLocalizacao();

        CamaroteSuperior ingressoCamaroteSuperior = new CamaroteSuperior(ingressoNormal.getValor(), ingressoVIP.getAdicional(), 30.0, "Setor A");
        System.out.println("Valor do ingresso Camarote Superior: "+ingressoCamaroteSuperior.getValorVIP());
        ingressoCamaroteSuperior.imprimeLocalizacao();
    }
}