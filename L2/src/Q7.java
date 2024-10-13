import java.util.Scanner;

public class Q7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do número N fornecido pelo usuário
        System.out.print("Digite um número para calcular o fatorial: ");
        int n = scanner.nextInt();
        
        long fatorial = 1;  // Variável para armazenar o valor do fatorial

        // Cálculo do fatorial
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        // Exibir o fatorial
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        
        scanner.close();
    }
}
