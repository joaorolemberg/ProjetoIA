package projetofinal.backend;

import java.io.Serializable;
import java.util.List;

public class Disciplina implements Serializable {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void printAll(){
        System.out.println("Codigo:"+this.getCodigo()+"\tNome: "+ this.nome+"\tDepartamento: "+this.departamento+"\tCréditos: "+this.creditos);
        System.out.println("Horario pre definido:"+this.restricaoHorario);
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getRestricaoHorario() {
        return restricaoHorario;
    }

    public void setRestricaoHorario(List<String> restricaoHorario) {
        this.restricaoHorario = restricaoHorario;
    }
    
    private String nome;
    private int creditos;
    private String codigo;
    private String departamento;
    private List<String> restricaoHorario;
}
