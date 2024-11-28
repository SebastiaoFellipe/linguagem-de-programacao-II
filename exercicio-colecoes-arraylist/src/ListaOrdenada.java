import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaOrdenada {

    public static int buscaBinaria(ArrayList<Integer> lista, int valor){
        int inicio = 0, fim = lista.size()-1;
        while (inicio <= fim) {
            int meio = inicio+(fim-inicio)/2;
            if (lista.get(meio) == valor) {
                return meio;
            }
            if (lista.get(meio) < valor) {
                inicio = meio+1;
            } else {
                fim = meio-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            lista.add(scanner.nextInt());
        }
        Collections.sort(lista);
        System.out.print("Lista ordenada: ");
        lista.forEach(num -> System.out.print(num+" "));
        System.out.println();
        while (true){
            System.out.print("Insira o valor da busca: ");
            int resultado = buscaBinaria(lista, scanner.nextInt());
            if (resultado != -1) {
                System.out.println("Valor encontrado na posição "+(resultado+1));
                break;
            } else {
                System.out.println("Valor não encontrado.");
            }
        }
    }
}
