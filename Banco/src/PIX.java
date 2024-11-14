// src/PIX.java
import java.util.Scanner;

public class PIX extends Pagamento implements Autenticacao {
    private String chavePix;

    public PIX(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a chave PIX para autenticação: ");
        String chaveInserida = scanner.nextLine();
        return chaveInserida.equals(this.chavePix);
    }

    public void realizarPagamento() {
        if (autenticar()) {
            System.out.println("Pagamento via PIX aprovado no valor de R$" + valor);
        } else {
            System.out.println("Falha na autenticação do PIX.");
        }
    }
}
