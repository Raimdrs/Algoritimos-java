import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas 
        System.out.println("Digite a Primeira Nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a Segunda Nota");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a Terceira Nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 6.0){
            System.out.println("Aprovado com media " + media);
        }else if(media >= 4.0 && media < 6.0){
            System.out.println("O aluno tera que fazer prova de reposição");
        }else{
            System.out.println("Reprovado com media " + media);
        }

        scanner.close();

    }
}
