package projetofinal.backend;

import java.util.ArrayList;
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

    public List<String> getRestricaoHorario() {
        return restricaoHorario;
    }

    public String getRestricaoString() {
        int n = this.restricaoHorario.size();
        String temp="";
        for (int i=0; i<n; i++) {
            temp=temp+this.restricaoHorario.get(i)+";";
        } 
        return temp;
    }

    
     
    public void setRestricaoHorario(ArrayList<String> restricaoHorario) {
        this.restricaoHorario = restricaoHorario;
    }
    public void printAll(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.preferencias);
        System.out.println(this.restricaoHorario);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    private String nome;
    private List<Disciplina> preferencias;
    private List<String> restricaoHorario;
    private int matricula;
    
}
