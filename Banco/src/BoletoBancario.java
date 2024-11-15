// src/BoletoBancario.java
public class BoletoBancario extends Pagamento implements Autenticacao {
    private String codigoBoleto;

    public BoletoBancario(double valor, String codigoBoleto) {
        super(valor);
        this.codigoBoleto = codigoBoleto;
    }

    public boolean autenticar() {
        System.out.println("Autenticando Boleto Bancário com código: " + codigoBoleto);
        return true; // Autenticação simulada para boletos
    }

    public void realizarPagamento() {
        if (autenticar()) {
            System.out.println("Pagamento com Boleto Bancário aprovado no valor de R$" + valor);
        } else {
            System.out.println("Falha na autenticação do Boleto Bancário.");
        }
    }
}
