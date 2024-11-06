class ItemOrcamento {
    private String historico;
    private float valor;

    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }
}

class ItemOrcamentoComplexo extends ItemOrcamento {
    private ItemOrcamento[] subitens;

    public ItemOrcamentoComplexo(String historico, ItemOrcamento[] subitens) {
        super(historico, 0);
        this.subitens = subitens;
    }

    @Override
    public float getValor() {
        float valorTotal = super.getValor();
        for (ItemOrcamento item : subitens) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    public ItemOrcamento encontraItem(String historico) {
        for (ItemOrcamento item : subitens) {
        if (item.getHistorico().equals(historico)) {
            return item;
        }
    }
    return null;
    }
}

public class ex03 {
    public static void main(String[] args) {
        ItemOrcamento item1 = new ItemOrcamento("Material de construção", 500.0f);
        ItemOrcamento item2 = new ItemOrcamento("Mão de obra", 1500.0f);
        ItemOrcamento item3 = new ItemOrcamento("Serviço de pintura", 300.0f);

        ItemOrcamento[] subitens1 = { item1, item2, item3 };
        ItemOrcamentoComplexo projetoGeral = new ItemOrcamentoComplexo("Projeto Geral da Obra", subitens1);

        System.out.println("Valor total do Projeto Geral da Obra: " + projetoGeral.getValor());

        ItemOrcamento encontrado = projetoGeral.encontraItem("Serviço de pintura");
        if (encontrado != null) {
            System.out.println("Item encontrado: "+encontrado.getHistorico()+" - Valor: "+encontrado.getValor());
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}