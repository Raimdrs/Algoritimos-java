// src/SistemaGestaoCursos.java
import java.util.Scanner;

public class SistemaGestaoCursos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        Curso curso = new Curso(nomeCurso);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Aula");
            System.out.println("2 - Listar Aulas");
            System.out.println("3 - Concluir Curso (Apagar Aulas)");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da aula: ");
                    String nomeAula = scanner.nextLine();
                    Aula aula = new Aula(nomeAula);
                    curso.adicionarAula(aula);
                    System.out.println("Aula adicionada com sucesso.");
                    break;

                case 2:
                    curso.listarAulas();
                    break;

                case 3:
                    curso.removerAulas();
                    System.out.println("Curso concluído e aulas apagadas.");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
