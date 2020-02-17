/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.backend;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                
                discD.add(temp);
                
            }
            
            buffRead.close();
            
            
            return discD;
            
        }catch(Exception e ){
            
            System.out.println(e);
                    
            return discD;
        }
        
    }
    
    public static List<Disciplina> busca3D(String disc1,String disc2,String disc3,String path) throws IOException {
        
        List<Disciplina> discD = new ArrayList<Disciplina>();
        
        String[] atributos; 
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = null;
        
        try{
            while (buffRead.ready()) {
               
                Disciplina temp= new Disciplina();
                
                linha = buffRead.readLine();
                
                
                atributos=linha.split(";");
                
                if(atributos[0].equals(disc1)){
                    temp.setCodigo(atributos[0]);
                    temp.setNome(atributos[1]);
                    temp.setDepartamento(atributos[2]);
                    temp.setCreditos(Integer.parseInt(atributos[3]));
                    discD.add(temp);
                }else if(atributos[0].equals(disc2)){
                        temp.setCodigo(atributos[0]);
                        temp.setNome(atributos[1]);
                        temp.setDepartamento(atributos[2]);
                        temp.setCreditos(Integer.parseInt(atributos[3]));
                        discD.add(temp);
                       }else if(atributos[0].equals(disc3)){
                        temp.setCodigo(atributos[0]);
                        temp.setNome(atributos[1]);
                        temp.setDepartamento(atributos[2]);
                        temp.setCreditos(Integer.parseInt(atributos[3]));
                        discD.add(temp);
                       }
                
                if(discD.size()==3){
                    break;
                }
            }
            
            buffRead.close();
            
            
            return discD;
            
        }catch(Exception e ){
            
            System.out.println(e);
                    
            return discD;
        }
    }
    
    public static List<Disciplina> busca4D(String disc1,String disc2,String disc3,String disc4,String path) throws IOException {
        
        List<Disciplina> discD = new ArrayList<Disciplina>();
        
        String[] atributos; 
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = null;
        
        try{
            while (buffRead.ready()) {
               
                Disciplina temp= new Disciplina();
                
                linha = buffRead.readLine();
                
                
                atributos=linha.split(";");
                
                if(atributos[0].equals(disc1)){
                    temp.setCodigo(atributos[0]);
                    temp.setNome(atributos[1]);
                    temp.setDepartamento(atributos[2]);
                    temp.setCreditos(Integer.parseInt(atributos[3]));
                    discD.add(temp);
                }else if(atributos[0].equals(disc2)){
                        temp.setCodigo(atributos[0]);
                        temp.setNome(atributos[1]);
                        temp.setDepartamento(atributos[2]);
                        temp.setCreditos(Integer.parseInt(atributos[3]));
                        discD.add(temp);
                       }else if(atributos[0].equals(disc3)){
                            temp.setCodigo(atributos[0]);
                            temp.setNome(atributos[1]);
                            temp.setDepartamento(atributos[2]);
                            temp.setCreditos(Integer.parseInt(atributos[3]));
                            discD.add(temp);
                            }else if(atributos[0].equals(disc4)){
                                temp.setCodigo(atributos[0]);
                                temp.setNome(atributos[1]);
                                temp.setDepartamento(atributos[2]);
                                temp.setCreditos(Integer.parseInt(atributos[3]));
                                discD.add(temp);
                            }
                
                if(discD.size()==4){
                    break;
                }
            }
            
            buffRead.close();
            
            
            return discD;
            
        }catch(Exception e ){
            
            System.out.println(e);
                    
            return discD;
        }
    }
    
    public static List<Disciplina> busca5D(String disc1,String disc2,String disc3,String disc4,String disc5,String path) throws IOException {
        
        List<Disciplina> discD = new ArrayList<Disciplina>();
        
        String[] atributos; 
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = null;
        
        try{
            while (buffRead.ready()) {
               
                Disciplina temp= new Disciplina();
                
                linha = buffRead.readLine();
                
                
                atributos=linha.split(";");
                
                if(atributos[0].equals(disc1)){
                    temp.setCodigo(atributos[0]);
                    temp.setNome(atributos[1]);
                    temp.setDepartamento(atributos[2]);
                    temp.setCreditos(Integer.parseInt(atributos[3]));
                    discD.add(temp);
                }else if(atributos[0].equals(disc2)){
                        temp.setCodigo(atributos[0]);
                        temp.setNome(atributos[1]);
                        temp.setDepartamento(atributos[2]);
                        temp.setCreditos(Integer.parseInt(atributos[3]));
                        discD.add(temp);
                       }else if(atributos[0].equals(disc3)){
                            temp.setCodigo(atributos[0]);
                            temp.setNome(atributos[1]);
                            temp.setDepartamento(atributos[2]);
                            temp.setCreditos(Integer.parseInt(atributos[3]));
                            discD.add(temp);
                            }else if(atributos[0].equals(disc4)){
                                temp.setCodigo(atributos[0]);
                                temp.setNome(atributos[1]);
                                temp.setDepartamento(atributos[2]);
                                temp.setCreditos(Integer.parseInt(atributos[3]));
                                discD.add(temp);
                                }else if(atributos[0].equals(disc5)){
                                    temp.setCodigo(atributos[0]);
                                    temp.setNome(atributos[1]);
                                    temp.setDepartamento(atributos[2]);
                                    temp.setCreditos(Integer.parseInt(atributos[3]));
                                    discD.add(temp);
                                }
                
                if(discD.size()==5){
                    break;
                }
            }
            
            buffRead.close();
            
            
            return discD;
            
        }catch(Exception e ){
            
            System.out.println(e);
                    
            return discD;
        }
    } 
    
    public static void gravarDisciplina(Disciplina disciParam,String path) throws IOException {
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
        String guardar = disciParam.getCodigo()+";"+disciParam.getNome()+";"+disciParam.getDepartamento()+";"+disciParam.getCreditos();
        buffWrite.append(guardar+"\n");
        buffWrite.close();
    }
    
    public static void gravarProfessor(Professor profParam,String path) throws IOException {
        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path,true));
        String guardar = null;
        switch (profParam.getPreferencias().size()) {
            case 3:
                guardar = profParam.getName()+";"+"3"+";";
                guardar=guardar+profParam.getPreferencias().get(0).getCodigo()+";"+profParam.getPreferencias().get(1).getCodigo()+";"+profParam.getPreferencias().get(2).getCodigo()+";";
                guardar=guardar+profParam.getRestricaoHorario().size()+";"+profParam.getRestricaoString();
                break;
            case 4:
                guardar = profParam.getName()+";"+"4"+";";
                guardar=guardar+profParam.getPreferencias().get(0).getCodigo()+";"+profParam.getPreferencias().get(1).getCodigo()+";"+profParam.getPreferencias().get(2).getCodigo()+";"+profParam.getPreferencias().get(3).getCodigo()+";";
                guardar=guardar+profParam.getRestricaoHorario().size()+";"+profParam.getRestricaoString();
                break;
            case 5:
                guardar = profParam.getName()+";"+"5"+";";
                guardar=guardar+profParam.getPreferencias().get(0).getCodigo()+";"+profParam.getPreferencias().get(1).getCodigo()+";"+profParam.getPreferencias().get(2).getCodigo()+";"+profParam.getPreferencias().get(3).getCodigo()+";"+profParam.getPreferencias().get(4).getCodigo()+";";
                guardar=guardar+profParam.getRestricaoHorario().size()+";"+profParam.getRestricaoString();
            break;
            default:
                break;
        }
         
        buffWrite.append(guardar+"\n");
        buffWrite.close();
    }
    
    public static List<Professor> leitorProfessor(String path) throws IOException {

            List<Professor> profP = new ArrayList<Professor>();
            List<Disciplina> discD = new ArrayList<Disciplina>();
            
            
            String[] atributos; 

            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            String linha = null;

            try{
                while (buffRead.ready()) {

                    Professor temp= new Professor("0");
                    linha = buffRead.readLine();
                    
                    atributos=linha.split(";");
                    temp.setNome(atributos[0]);
                    int n = atributos.length; //-1 pq ela deve dar um split no vazio
                    int i= n;
                    List<String> restricao = new ArrayList<>();
                    switch (Integer.parseInt(atributos[1])) {
                        
                        case 3:
                            discD=busca3D(atributos[2],atributos[3],atributos[4],"src/projetofinal/disciplinas.txt");
                            
                            for (i= i- Integer.parseInt(atributos[5]); i<n ; i++) {
                                
                                    restricao.add(atributos[i]);
                                    //System.out.println(atributos[i]);
                         
                                }
                            temp.setPreferencias(discD);
                            temp.setRestricaoHorario((ArrayList<String>) restricao);
                            profP.add(temp);
                                
                            break;
  
                        case 4:
                            
                            discD=busca4D(atributos[2],atributos[3],atributos[4],atributos[5],"src/projetofinal/disciplinas.txt");
                            
                            for (i= i- Integer.parseInt(atributos[6]); i<n ; i++) {
                                
                                    restricao.add(atributos[i]);
                         
                                }
                            temp.setPreferencias(discD);
                            temp.setRestricaoHorario((ArrayList<String>) restricao);
                            profP.add(temp);
                                
                            break;
                            
                        case 5:
                            
                            discD=busca5D(atributos[2],atributos[3],atributos[4],atributos[5],atributos[6],"src/projetofinal/disciplinas.txt");
                            
                            for (i= i- Integer.parseInt(atributos[7]); i<n ; i++) {
                                
                                    restricao.add(atributos[i]);
                         
                                }
                            temp.setPreferencias(discD);
                            temp.setRestricaoHorario((ArrayList<String>) restricao);
                            profP.add(temp);
                                
                            break;
                            
                        default:
                           break;
                    
                    }
                    
                    
                    

                    

                }

                buffRead.close();


                return profP;

            }catch(Exception e ){
                System.out.println("porra");
                System.out.println(e);

                return profP;
            }

        }


   
}