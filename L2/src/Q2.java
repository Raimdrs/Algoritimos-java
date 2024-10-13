import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do caractere
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);  // Lê o primeiro caractere da entrada

        // Verificação se é um número
        if (Character.isDigit(caractere)) {
            System.out.println("O caractere é um número.");
        } 
        // Verificação se é uma letra
        else if (Character.isLetter(caractere)) {
            char caractereMinusculo = Character.toLowerCase(caractere);  // Converte para minúsculo para facilitar

            // Verificação se é uma vogal
            if (caractereMinusculo == 'a' || caractereMinusculo == 'e' || 
                caractereMinusculo == 'i' || caractereMinusculo == 'o' || 
                caractereMinusculo == 'u') {
                System.out.println("O caractere é uma vogal.");
            } 
            // Caso contrário, é uma consoante
            else {
                System.out.println("O caractere é uma consoante.");
            }
        } 
        // Qualquer outro caractere é considerado símbolo
        else {
            System.out.println("O caractere é um símbolo.");
        }

        scanner.close();
    }
}
