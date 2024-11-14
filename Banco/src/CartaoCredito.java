// src/CartaoCredito.java
import java.util.Scanner;

public class CartaoCredito extends Pagamento implements Autenticacao {
    private String numeroCartao;
    private String codigoSeguranca;

    public CartaoCredito(double valor, String numeroCartao, String codigoSeguranca) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código de segurança do cartão: ");
        String codigoInserido = scanner.nextLine();
        return codigoInserido.equals(this.codigoSeguranca);
    }

    public void realizarPagamento() {
        if (autenticar()) {
            System.out.println("Pagamento com Cartão de Crédito aprovado no valor de R$" + valor);
        } else {
            System.out.println("Falha na autenticação do Cartão de Crédito.");
        }
    }
}