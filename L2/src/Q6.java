import java.util.Scanner;

public class Q6 {
    
    // Função para calcular o fatorial de um número
    public static long fatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de termos da série
        System.out.print("Digite o número de termos da série para calcular o valor de Euler: ");
        int n = scanner.nextInt();

        double euler = 0.0;  // Variável para armazenar a soma da série

        // Cálculo da série de Taylor para e
        for (int i = 0; i < n; i++) {
            euler += 1.0 / fatorial(i);
        }

        // Impressão do valor aproximado de Euler
        System.out.println("O valor aproximado de Euler com " + n + " termos é: " + euler);

        scanner.close();
    }
}
