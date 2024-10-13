import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do número par
        System.out.print("Digite um número natural inteiro par: ");
        int numero = scanner.nextInt();

        // Verificar se o número é par
        if (numero % 2 != 0) {
            System.out.println("O número não é par. Por favor, insira um número par.");
        } else {
            System.out.println("Divisores de " + numero + ":");
            
            int divisor = 1; // Iniciando com o primeiro divisor
            while (divisor <= numero) {
                if (numero % divisor == 0) {
                    System.out.println(divisor);  // Imprimir o divisor
                }
                divisor++;
            }
        }

        scanner.close();
    }
}
