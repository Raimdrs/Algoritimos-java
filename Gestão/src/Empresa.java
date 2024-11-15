import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularPagamentos() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Adicionando funcionários horistas e assalariados
        FuncionarioHorista horista = new FuncionarioHorista(0, 160, 20);
        FuncionarioAssalariado assalariado = new FuncionarioAssalariado(3000);

        empresa.adicionarFuncionario(horista);
        empresa.adicionarFuncionario(assalariado);

        // Calculando e exibindo pagamentos
        empresa.calcularPagamentos();
    }
}
