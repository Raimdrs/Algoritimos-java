import java.util.Scanner;

public class Permuta {

    // Função para permutar o vetor em ordem crescente
    public static void PermutarVetor(int[] VNum) {
        int troca;
        for (int i = 0; i < VNum.length; i++) {
            for (int j = i; j < VNum.length; j++) {
                if (VNum[i] > VNum[j]) {
                    troca = VNum[i];
                    VNum[i] = VNum[j];
                    VNum[j] = troca;
                }
            }
        }
    }

    // Função para mostrar os elementos do vetor
    public static void MostrarVetor(int[] VNum) {
        System.out.println("A ordem crescente eh:");
        for (int num : VNum) {
            System.out.print(num + " ");
        }
        System.out.println(); // Para pular a linha ao final
    }

    public static void main(String[] args) {
        int[] VNum = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d numero: ", i + 1);
            VNum[i] = scanner.nextInt();
        }

        // Chama a função para permutar o vetor
        PermutarVetor(VNum);
        
        // Exibe o vetor ordenado
        MostrarVetor(VNum);

        scanner.close();
    }
}
