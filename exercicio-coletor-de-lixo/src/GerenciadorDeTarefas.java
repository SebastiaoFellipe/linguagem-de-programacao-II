import java.util.Scanner;

public class GerenciadorDeTarefas {
    private String[] tarefas;
    private int quantidadeTarefas;

    public GerenciadorDeTarefas(int capacidadeInicial) {
        tarefas = new String[capacidadeInicial];
        quantidadeTarefas = 0;
    }

    public void adicionarTarefa(String tarefa) {
        if (quantidadeTarefas == tarefas.length) {
            System.out.println("A lista de tarefas está cheia.");
        } else {
            tarefas[quantidadeTarefas++] = tarefa;
            exibirUsoDeMemoria();
            System.out.println("=== Tarefa adicionada ===");
            exibirUsoDeMemoria();
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < quantidadeTarefas) {
            System.arraycopy(tarefas, indice + 1, tarefas, indice, quantidadeTarefas - indice - 1);
            tarefas[--quantidadeTarefas] = null;
            exibirUsoDeMemoria();
            System.out.println("=== Tarefa removida ===");
            exibirUsoDeMemoria();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarTarefas() {
        if (quantidadeTarefas == 0) {
            System.out.println("Nenhuma tarefa adicionada.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < quantidadeTarefas; i++) {
                System.out.println((i + 1) + ". " + tarefas[i]);
            }
        }
    }

    public void exibirUsoDeMemoria() {
        Runtime runtime = Runtime.getRuntime();
        long memoriaUsada = runtime.totalMemory() - runtime.freeMemory();
        double MB = 1024.0 * 1024.0;
        System.out.printf("Memória livre: %.2f MB\n", runtime.freeMemory()/MB);
        System.out.printf("Memória usada: %.2f MB\n", memoriaUsada/MB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade inicial para a lista de tarefas: ");
        int capacidadeInicial = scanner.nextInt();

        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas(capacidadeInicial);
        int opcao;

        System.out.println("Bem-vindo ao Gerenciador de Tarefas!");
        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Exibir Uso de Memória");
            System.out.println("5. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    gerenciador.adicionarTarefa(tarefa);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt() - 1;
                    gerenciador.removerTarefa(indice);
                    break;
                case 3:
                    gerenciador.listarTarefas();
                    break;
                case 4:
                    gerenciador.exibirUsoDeMemoria();
                    break;
                case 5:
                    System.out.println("Obrigado pela preferência!");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            Runtime.getRuntime().gc();
        }
    }
}