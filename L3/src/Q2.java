import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 10;

        // Criação do vetor
        int[] numeros = new int[N];

        // Leitura dos elementos do vetor
        System.out.println("Digite 10 números: ");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordenar o array em ordem decrescente
        Arrays.sort(numeros); // Ordena em ordem crescente primeiro

        // Imprimindo a sequência invertida
        System.out.println("Ordem decrescente: ");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
