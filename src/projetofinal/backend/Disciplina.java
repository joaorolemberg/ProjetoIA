package projetofinal.backend;

public class Disciplina {
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
        System.out.println("Nome: "+ this.nome+"\tDepartamento: "+this.departamento+"\tCréditos: "+this.creditos);
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    
    private String nome;
    private int creditos;
    private String codigo;
    private String departamento;
}
