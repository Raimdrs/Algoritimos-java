public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    public float calculaImposto() {
        return salario * 0.05f;
    }

    public void imprimeDados() {
        System.out.println("Gerente: " + nome + ", Área: " + area + ", Salário: R$ " + salario + ", Imposto: R$ " + calculaImposto() + ", Nascimento: " + nascimento);
    }
}
