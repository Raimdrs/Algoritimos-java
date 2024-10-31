import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {
    // Atributo para armazenar a lista de nomes
    private static ArrayList<String> listaNomes = new ArrayList<>();

    // Função para obter a memória consumida antes
    public static long antes() {
        System.gc(); // Sugere ao Garbage Collector que execute antes de medir
        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memória usada antes: " + memoriaUsada + " bytes");
        return memoriaUsada;
    }

    // Função para chamar o Garbage Collector e calcular a memória liberada
    public static void depois(long memoriaInicial) {
        System.gc(); // Solicita ao Garbage Collector que libere a memória não utilizada
        long memoriaUsadaDepois = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoriaLiberada = memoriaInicial - memoriaUsadaDepois;
        System.out.println("Memória usada depois: " + memoriaUsadaDepois + " bytes");
        System.out.println("Memória liberada: " + memoriaLiberada + " bytes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        long memoriaInicial = antes(); // Chama a função antes()

        // Loop para adicionar e remover nomes
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar nome");
            System.out.println("2. Remover nome");
            System.out.println("3. Parar");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome para adicionar: ");
                    String nome = scanner.nextLine();
                    listaNomes.add(nome);
                    break;

                case "2":
                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = scanner.nextLine();
                    listaNomes.remove(nomeRemover);
                    break;

                case "3":
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("3"));

        // Exibir todos os nomes armazenados
        System.out.println("Nomes armazenados:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Chama a função depois() para verificar o consumo de memória após liberar
        depois(memoriaInicial);
        scanner.close();
    }
}