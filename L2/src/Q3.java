import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do ano
        System.out.print("Digite o ano escolhido ");
        int ano = scanner.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 ==0)){
            System.out.println(ano +" é um ano bissexto");
        } else {
            System.out.println(ano +" Não é um ano bissexto");
        }

        scanner.close();
    }
}
