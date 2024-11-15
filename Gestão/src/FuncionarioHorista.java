public class FuncionarioHorista extends Funcionario implements Bonus {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(double salarioBase, double horasTrabalhadas, double valorPorHora) {
        super(salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    public double calcularBonus() {
        // Exemplo de cálculo de bônus para horista: 5% do pagamento total
        return calcularPagamento() * 0.05;
    }

    public String toString() {
        return "Funcionario Horista - Pagamento: R$ " + calcularPagamento() + ", Bônus: R$ " + calcularBonus();
    }
}
