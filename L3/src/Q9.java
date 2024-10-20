import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho da matriz
        int N = 3;
        int[][] matriz = new int[N][N];
        int soma = 0;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a soma dos elementos da diagonal principal
        for (int i = 0; i < N; i++) {
            soma += matriz[i][i]; // Elementos da diagonal principal têm i == j
        }

        // Imprimindo a soma
        System.out.println("A soma dos elementos da diagonal principal é: " + soma);

        scanner.close();
    }
}
