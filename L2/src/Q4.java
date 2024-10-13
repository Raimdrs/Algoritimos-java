import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234; //Senha do sistema
        int senhaDigitada;

        do{
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if(senhaDigitada == senhaCorreta){
                System.out.println("ACESSO PERMITIDO");
            } else {
                System.out.println("ACESSO NEGADO");
            }
        } while (senhaDigitada != senhaCorreta);  // Vai repetir ate a senha ser correta
        
        scanner.close();
    }
}
