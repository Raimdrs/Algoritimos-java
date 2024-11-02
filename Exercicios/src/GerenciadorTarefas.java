import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    // Lista dinâmica para armazenar as tarefas
    private ArrayList<String> tarefas = new ArrayList<>();

    // Função para verificar a memória antes da alocação
    public void antes() {
        System.out.println("Memória disponível antes: " + Runtime.getRuntime().freeMemory() / 1024 + " KB");
    }

    // Função para verificar a memória depois da alocação e chamar o Garbage Collector
    public void depois() {
        System.gc(); // chama o Garbage Collector
        System.out.println("Memória disponível depois: " + Runtime.getRuntime().freeMemory() / 1024 + " KB");
    }

    // Função para adicionar uma tarefa
    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    // Função para remover uma tarefa
    public void removerTarefa(String tarefa) {
        if (tarefas.remove(tarefa)) {
            System.out.println("Tarefa removida: " + tarefa);
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    // Função para listar todas as tarefas
    public void listarTarefas() {
        System.out.println("Lista de Tarefas:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }
    }

    // Função principal
    public static void main(String[] args) {
        GerenciadorTarefas app = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGerenciador de Tarefas:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Verificar Memória");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefaAdicionar = scanner.nextLine();
                    app.adicionarTarefa(tarefaAdicionar);
                    break;
                case 2:
                    System.out.print("Digite a tarefa a ser removida: ");
                    String tarefaRemover = scanner.nextLine();
                    app.removerTarefa(tarefaRemover);
                    break;
                case 3:
                    app.listarTarefas();
                    break;
                case 4:
                    app.antes(); // mostra a memória antes
                    app.depois(); // limpa e mostra a memória depois
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}