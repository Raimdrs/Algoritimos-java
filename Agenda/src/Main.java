public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        PessoaFisica pf1 = new PessoaFisica("João Silva", "Rua A, 123", "joao@gmail.com", "12345678900", "01/01/1990", "Solteiro");
        PessoaJuridica pj1 = new PessoaJuridica("Empresa X", "Rua B, 456", "contato@empresax.com", "98765432000100", "123456789", "Empresa X LTDA");

        agenda.adicionarContato(pf1);
        agenda.adicionarContato(pj1);

        System.out.println("Todos os Contatos:");
        agenda.exibirTodosContatos();

        System.out.println("Pesquisa por Nome 'João Silva':");
        Contato contato = agenda.pesquisarContatoPorNome("João Silva");
        if (contato != null) {
            contato.exibirDetalhes();
        }

        System.out.println("Remover contato com CPF '12345678900'");
        agenda.removerContato("12345678900");

        System.out.println("Todos os Contatos após remoção:");
        agenda.exibirTodosContatos();
    }
}
