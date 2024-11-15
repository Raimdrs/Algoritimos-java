public class FuncionarioAssalariado extends Funcionario implements Bonus {
    public FuncionarioAssalariado(double salarioBase) {
        super(salarioBase);
    }

    public double calcularPagamento() {
        // Assalariado recebe o salário base como pagamento
        return salarioBase;
    }

    public double calcularBonus() {
        // Exemplo de cálculo de bônus para assalariado: 10% do salário base
        return salarioBase * 0.10;
    }

    public String toString() {
        return "Funcionario Assalariado - Pagamento: R$ " + calcularPagamento() + ", Bônus: R$ " + calcularBonus();
    }
}
