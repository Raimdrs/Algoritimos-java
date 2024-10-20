import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho do tabuleiro
        int N = 8;
        char[][] tabuleiro = new char[N][N];

        // Inicializando o tabuleiro com '-'
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        // Leitura da posição da torre
        System.out.print("Digite a linha em que a torre se encontra (1 a 8): ");
        int linhaTorre = scanner.nextInt() - 1; // Subtraímos 1 para ajustar ao índice da matriz
        System.out.print("Digite a coluna em que a torre se encontra (1 a 8): ");
        int colunaTorre = scanner.nextInt() - 1;

        // Marca a posição da torre
        tabuleiro[linhaTorre][colunaTorre] = 'T';

        // Marca os movimentos possíveis (linhas e colunas)
        for (int i = 0; i < N; i++) {
            if (i != linhaTorre) {
                tabuleiro[i][colunaTorre] = 'X'; // Movimentos na coluna
            }
            if (i != colunaTorre) {
                tabuleiro[linhaTorre][i] = 'X'; // Movimentos na linha
            }
        }

        // Exibe o tabuleiro
        System.out.println("Movimentos possíveis:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
