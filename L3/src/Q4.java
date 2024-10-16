import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das matrizes
        int[][] matrizA = new int[2][3]; // Matriz 2x3
        int[][] matrizB = new int[3][2]; // Matriz 3x2
        int[][] resultado = new int[2][2]; // Resultado será uma matriz 2x2

        // Leitura dos elementos da matriz A (2x3)
        System.out.println("Digite os elementos da matriz A (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Leitura dos elementos da matriz B (3x2)
        System.out.println("\nDigite os elementos da matriz B (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Realizando a multiplicação de matrizes
        // matrizA (2x3) * matrizB (3x2) = resultado (2x2)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = 0;  // Inicializando com 0
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprimindo o resultado da multiplicação (matriz 2x2)
        System.out.println("\nResultado da multiplicação (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}