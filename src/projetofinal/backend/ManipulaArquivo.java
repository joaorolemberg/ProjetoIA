/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.backend;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

/**
 *
 * @author João Pedro
 */
public class ManipulaArquivo {
    
    
    
    
    public static List<Disciplina> leitorDisciplina(String path) throws IOException {
        
        List<Disciplina> discD = new ArrayList<Disciplina>();
        
        List<String> disc = new ArrayList<String>();
        
        String[] atributos; 
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        
        try{
            while (buffRead.ready()) {
               
                Disciplina temp= new Disciplina();
                
                linha = buffRead.readLine();
                
                
                atributos=linha.split(";");
               
                temp.setCodigo(atributos[0]);
                temp.setNome(atributos[1]);
                temp.setDepartamento(atributos[2]);
                temp.setCreditos(Integer.parseInt(atributos[3]));
                temp.printAll();
                
                discD.add(temp);
                
            }
            
            buffRead.close();
            
            
            return discD;
            
        }catch(Exception e ){
            
            System.out.println(e);
                    
            return discD;
        }
        
    }
 
    public static void escritor(String path) throws IOException {
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
 
}
    

