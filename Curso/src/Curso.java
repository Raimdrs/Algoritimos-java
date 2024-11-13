// src/Curso.java
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Aula> aulas;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.aulas = new ArrayList<>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public void removerAulas() {
        aulas.clear();
    }

    public void listarAulas() {
        if (aulas.isEmpty()) {
            System.out.println("Nenhuma aula disponível.");
        } else {
            System.out.println("Aulas do curso " + nomeCurso + ":");
            for (Aula aula : aulas) {
                System.out.println("- " + aula.getNomeAula());
            }
        }
    }
}
