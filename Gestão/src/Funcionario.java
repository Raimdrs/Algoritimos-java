public abstract class Funcionario {
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método concreto para obter o salário base
    public double getSalarioBase() {
        return salarioBase;
    }

    // Método abstrato para calcular o pagamento
    public abstract double calcularPagamento();
}
