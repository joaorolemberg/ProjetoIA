package projetofinal.backend;

import projetofinal.aima.Variable;
import java.util.List;

public class Professor extends Variable {
    public Professor(String name) {
        super(name);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<Disciplina> preferencias) {
        this.preferencias = preferencias;
    }

    public String getRestricaoHorario() {
        return restricaoHorario;
    }

    public void setRestricaoHorario(String restricaoHorario) {
        this.restricaoHorario = restricaoHorario;
    }

    private String nome;
    private List<Disciplina> preferencias;
    private String restricaoHorario;
}
