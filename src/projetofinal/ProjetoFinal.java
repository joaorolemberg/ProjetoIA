/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.io.IOException;
import projetofinal.frontend.*;
import projetofinal.backend.*;

import java.util.ArrayList;
import java.util.List;
import static projetofinal.backend.ManipulaArquivo.leitorDisciplina;



/**
 *
 * @author João Pedro
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        List<Disciplina> disciplina = new ArrayList<Disciplina>();
        disciplina=leitorDisciplina("C:\\Users\\João Pedro\\Documents\\NetBeansProjects\\ProjetoFinal\\src\\projetofinal\\disciplinas.txt");
        
        
        int n = disciplina.size();
        for (int i=0; i<n; i++) {
            disciplina.get(i).printAll();
        }       
        new Gui(disciplina).setVisible(true);
        
    }
    
}
