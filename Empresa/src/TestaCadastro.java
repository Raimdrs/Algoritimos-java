public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        // Cadastrando clientes
        cadastro.cadastraPessoa(new Cliente("Alice", new Data(10, 3, 1990), 1));
        cadastro.cadastraPessoa(new Cliente("Bob", new Data(15, 7, 1985), 2));
        cadastro.cadastraPessoa(new Cliente("Carlos", new Data(5, 11, 1992), 3));

        // Cadastrando funcionários
        cadastro.cadastraPessoa(new Funcionario("Daniel", new Data(20, 6, 1980), 2500f) {

            public float calculaImposto() {
                return salario * 0.03f;
            }
        });
        cadastro.cadastraPessoa(new Funcionario("Elisa", new Data(12, 1, 1978), 3000f) {

            public float calculaImposto() {
                return salario * 0.03f;
            }
        });
        cadastro.cadastraPessoa(new Funcionario("Fabio", new Data(9, 9, 1982), 2800f) {

            public float calculaImposto() {
                return salario * 0.03f;
            }
        });

        // Cadastrando gerentes
        cadastro.cadastraPessoa(new Gerente("Gustavo", new Data(30, 4, 1975), 5000f, "Vendas"));
        cadastro.cadastraPessoa(new Gerente("Helena", new Data(22, 10, 1988), 4500f, "Marketing"));
        cadastro.cadastraPessoa(new Gerente("Ivo", new Data(8, 3, 1983), 4800f, "RH"));

        // Imprimindo o cadastro
        cadastro.imprimeCadastro();
    }
}
