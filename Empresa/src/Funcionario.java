public abstract class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public abstract float calculaImposto();

    public void imprimeDados() {
        System.out.println("Funcionário: " + nome + ", Salário: R$ " + salario + ", Imposto: R$ " + calculaImposto() + ", Nascimento: " + nascimento);
    }
}
