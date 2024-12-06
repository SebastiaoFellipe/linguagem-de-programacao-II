import java.util.HashMap;

public class Estoque {

    public static void main(String[] args) {
        HashMap<Integer, String> produtos = new HashMap<>();
        HashMap<Integer, Integer> quantidades = new HashMap<>();

        produtos.put(1, "Arroz");
        quantidades.put(1, 36);
        
        produtos.put(2, "Feijão");
        quantidades.put(2, 25);
        
        produtos.put(3, "Macarrão");
        quantidades.put(3, 12);
        
        produtos.put(4, "Biscoito");
        quantidades.put(4, 52);
        
        produtos.put(5, "Sal");
        quantidades.put(5, 15);

        produtos.put(5, "Açúcar");
        quantidades.put(5, 28);

        System.out.println("Produtos com quantidade menor do que 30 unidades:");
        for (HashMap.Entry<Integer, Integer> entry : quantidades.entrySet()) {
            if (entry.getValue() < 30) {
                System.out.println("ID: "+entry.getKey()+" | Produto: "+produtos.get(entry.getKey())+" - Quantidade: "+entry.getValue());
            }
        }
    }
}
