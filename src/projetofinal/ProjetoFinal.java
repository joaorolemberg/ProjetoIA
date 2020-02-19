/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.io.FileNotFoundException;
import java.io.IOException;
import projetofinal.frontend.*;
import projetofinal.backend.*;

import java.util.ArrayList;
import java.util.List;
import static projetofinal.backend.ManipulaArquivo.busca3D;
import static projetofinal.backend.ManipulaArquivo.busca4D;
import static projetofinal.backend.ManipulaArquivo.gravarDisciplina;
import static projetofinal.backend.ManipulaArquivo.gravarProfessor;

import static projetofinal.backend.ManipulaArquivo.leitorDisciplina;
import static projetofinal.backend.ManipulaArquivo.leitorProfessor;





/**
 *
 * @author João Pedro
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        
        List<Disciplina> disciplina = new ArrayList<Disciplina>();
        
        
        disciplina=leitorDisciplina("src/projetofinal/disciplinas.txt");
        
        int n = disciplina.size();
        for (int i=0; i<n; i++) {
            disciplina.get(i).printAll();
        }
        
        List<Professor> professores = new ArrayList<>();
        professores=leitorProfessor("src/projetofinal/ProfessorObj.txt");
        n = professores.size();
        for (int i=0; i<n; i++) {
            professores.get(i).printAll();
        }
        
        
        /*
        Professor prof1 = new Professor("joao");
        prof1.setMatricula(2);
        disciplina=busca3D("COMP0427","COMP0455","COMP0463","src/projetofinal/disciplinas.txt");
        prof1.setPreferencias(disciplina);
        List<String> restricaoHorario=new ArrayList<>();
        restricaoHorario.add("h10");
        restricaoHorario.add("h2");
        restricaoHorario.add("h13");
        prof1.setRestricaoHorario((ArrayList<String>) restricaoHorario);
        gravarProfessor(prof1,"src/projetofinal/ProfessorObj.txt");
        
        List<Professor> professores = new ArrayList<>();
        professores=leitorProfessor("src/projetofinal/ProfessorObj.txt");
        professores.get(0).printAll();
        professores.get(1).printAll();
        
        */
        
        
        
        new Gui().setVisible(true);

    }
    
}
