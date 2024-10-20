import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de linhas do triângulo
        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        int n = scanner.nextInt();

        // Matriz para armazenar os valores do Triângulo de Pascal
        int[][] triangulo = new int[n][n];

        // Construindo o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // Definindo o valor 1 nas bordas
                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {
                    // Soma dos dois números acima no triângulo
                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
                // Imprime o valor atual
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println(); // Nova linha para cada linha do triângulo
        }

        scanner.close();
    }
}
