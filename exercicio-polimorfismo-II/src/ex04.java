class DespesaMes {
    private int mes;
    private float valor;

    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }

    public int getMes() {
        return mes;
    }

    public float getValor() {
        return valor;
    }
}

class DespesaDia extends DespesaMes {
    private int dia;

    public DespesaDia(int dia, int mes, float valor) {
        super(mes, valor);
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}

class DespesasIndividuo {
    private String cpf;
    private DespesaMes[] despesas;

    public DespesasIndividuo(String cpf, DespesaMes[] despesas) {
        this.cpf = cpf;
        this.despesas = despesas;
    }

    public String getCPF() {
        return cpf;
    }

    public DespesaMes totalizaMes(int mes) {
        float total = 0.0f;

        for (DespesaMes despesa : despesas) {
            if (despesa.getMes() == mes) {
                total += despesa.getValor();
            }
        }

        return new DespesaMes(mes, total);
    }
}

public class ex04 {
    public static void main(String[] args) {
        DespesaMes despesa1 = new DespesaMes(1, 200.0f);
        DespesaMes despesa2 = new DespesaDia(5, 1, 50.0f);
        DespesaMes despesa3 = new DespesaDia(10, 1, 75.0f);

        DespesaMes[] despesas = {despesa1, despesa2, despesa3};
        DespesasIndividuo individuo = new DespesasIndividuo("123.456.789-00", despesas);

        System.out.println("CPF do indivíduo: "+individuo.getCPF());

        int mes = 1;
        DespesaMes totalMes = individuo.totalizaMes(mes);
        System.out.println("Total de despesas do mês "+mes+": "+totalMes.getValor());
    }
}
