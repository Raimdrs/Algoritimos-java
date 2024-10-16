import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];  // Declaração da matriz 5x5
        int maiorValor = Integer.MIN_VALUE;  // Inicializa o maior valor com o menor valor possível
        int linhaMaior = 0, colunaMaior = 0;  // Para armazenar a posição do maior valor

        // Preenchendo a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores para preencher a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verificando se o valor atual é o maior
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // Imprimindo a matriz
        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");  // "\t" é utilizado para dar espaçamento entre os números
            }
            System.out.println();  // Pula para a próxima linha da matriz
        }

        // Imprimindo o maior valor e sua posição
        System.out.println("\nMaior valor encontrado: " + maiorValor);
        System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);

        scanner.close();
    }
}
