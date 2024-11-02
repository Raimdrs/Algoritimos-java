import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String identificador) {
        contatos.removeIf(contato -> contato.getIdentificador().equals(identificador));
    }

    public Contato pesquisarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato pesquisarContatoPorIdentificador(String identificador) {
        for (Contato contato : contatos) {
            if (contato.getIdentificador().equals(identificador)) {
                return contato;
            }
        }
        return null;
    }

    public void exibirTodosContatos() {
        for (Contato contato : contatos) {
            contato.exibirDetalhes();
            System.out.println("------------------------------");
        }
    }

    // Método para ordenar contatos (bubble sort)
    public void ordena() {
        int n = contatos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Ordenar: Pessoa Física antes de Pessoa Jurídica
                if (contatos.get(j) instanceof PessoaJuridica && contatos.get(j + 1) instanceof PessoaFisica) {
                    // Troca as posições dos elementos
                    Contato temp = contatos.get(j);
                    contatos.set(j, contatos.get(j + 1));
                    contatos.set(j + 1, temp);
                } 
                // Se ambos são do mesmo tipo, ordena por identificador (CPF ou CNPJ)
                else if ((contatos.get(j) instanceof PessoaFisica && contatos.get(j + 1) instanceof PessoaFisica) ||
                         (contatos.get(j) instanceof PessoaJuridica && contatos.get(j + 1) instanceof PessoaJuridica)) {
                    if (contatos.get(j).getIdentificador().compareTo(contatos.get(j + 1).getIdentificador()) > 0) {
                        // Troca as posições dos elementos
                        Contato temp = contatos.get(j);
                        contatos.set(j, contatos.get(j + 1));
                        contatos.set(j + 1, temp);
                    }
                }
            }
        }
    }
}
