import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int N = scanner.nextInt();

        // Criação do vetor
        int[] vetor = new int[N];

        // Leitura dos elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Imprimindo a sequência invertida
        System.out.println("Sequência invertida:");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
