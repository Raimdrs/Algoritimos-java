// src/SistemaPagamento.java
import java.util.Scanner;

public class SistemaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha o tipo de pagamento:");
            System.out.println("1 - Cartão de Crédito");
            System.out.println("2 - Boleto Bancário");
            System.out.println("3 - PIX");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            Pagamento pagamento;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorCartao = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer
                    System.out.print("Digite o número do cartão: ");
                    String numeroCartao = scanner.nextLine();
                    System.out.print("Digite o código de segurança: ");
                    String codigoSeguranca = scanner.nextLine();
                    pagamento = new CartaoCredito(valorCartao, numeroCartao, codigoSeguranca);
                    pagamento.realizarPagamento();
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorBoleto = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer
                    System.out.print("Digite o código do boleto: ");
                    String codigoBoleto = scanner.nextLine();
                    pagamento = new BoletoBancario(valorBoleto, codigoBoleto);
                    pagamento.realizarPagamento();
                    break;

                case 3:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer
                    System.out.print("Digite a chave PIX: ");
                    String chavePix = scanner.nextLine();
                    pagamento = new PIX(valorPix, chavePix);
                    pagamento.realizarPagamento();
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Encerrando o sistema de pagamento.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (continuar) {
                System.out.println("Deseja realizar outro pagamento? (s/n)");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Encerrando o sistema de pagamento.");
                }
            }
        }

        scanner.close();
    }
}
