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
       
        new Gui().setVisible(true);

    }
    
}
