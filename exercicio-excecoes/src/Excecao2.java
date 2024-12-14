import java.util.Scanner;

public class Excecao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        while (true) {
            try {
                System.out.print("Informe a posição (0 a 9) que deseja preencher: ");
                int posicao = scanner.nextInt();
                System.out.print("Informe o valor a ser inserido na posição "+posicao+": ");
                int valor = scanner.nextInt();
                vetor[posicao] = valor;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: A posição informada está fora do limite do vetor (0 a 9). Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor informado não é um número válido. Tente novamente.");
            }
            System.out.print("Deseja continuar? (0 - Não, 1 - Sim): ");
            int resp = scanner.nextInt();
            if (resp == 0) {
                break;
            }          
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição "+i+": "+vetor[i]);
        }
    }
}
