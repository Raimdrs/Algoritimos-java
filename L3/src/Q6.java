public class Q6 {
    public static void main(String[] args) {
        // Definindo o tamanho da matriz
        int N = 5;
        int[][] matriz = new int[N][N];

        // Preenchendo a matriz com 1 na diagonal principal e 0 nos demais elementos
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Preenche a diagonal principal com 1
                } else {
                    matriz[i][j] = 0; // Preenche o restante com 0
                }
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha após imprimir cada linha da matriz
        }
    }
}
