import java.util.Scanner;

class ExcecaoAcimaDeCem extends Exception {
    public ExcecaoAcimaDeCem(String mensagem) {
        super(mensagem);
    }
}

public class Excecao1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, quant = 0;
        while (soma<100) {
            System.out.print("Digite o "+(quant+1)+"º número: ");
            try {
                soma += scanner.nextInt();
                quant++;
                if (soma>100) {
                    throw new ExcecaoAcimaDeCem("A soma dos números ultrapassou 100!");
                }
            } catch (ExcecaoAcimaDeCem e) {
                System.out.println("\nExceção lançada: " + e.getMessage());
                break;
            }
        }
        System.out.println(quant+" números somados");
        System.out.println("Média: "+soma*1.0/quant*1.0);
    }
}
