package projetofinal.backend;

import projetofinal.aima.*;

import java.util.*;


public class restricaoturma extends CSP<Variable, String> {

    public restricaoturma(Optional<Assignment<Variable, String>> solution, List<String> domains){
        String[] x = solution.get().toString().replace("{","").replace(" ","").replace("}","").split(",");
        Variable[] materias = new Variable[x.length];
        Variable[] professores = new Variable[x.length];
        int contador=0;
        for (int i = 0; i < x.length; i++) {
            String[] aux = x[i].split("=");
            materias[i] = new Variable(aux[0]);
            professores[i] = new Variable(aux[1]);
            contador++;
        }

        Domain<String> disc = new Domain<>(domains);


        for(int k = 0; k < contador; k++){
            Variable var1 = materias[k];
            Variable varaux=professores[k];
            for(int j = k+1; j < contador; j++){
                Variable var2 = materias[j];
                Variable varaux2=professores[k];
                /*
                if(addConstraint(new restriturma(var1, var2))){
                    addConstraint(new restriturma(varaux, varaux2));
                }
                */
            }
        }

    }

}


/*
    public void restricaoturma(Optional<Assignment<Variable, String>> solution) {
        String[] x = solution.get().toString().replace("{","").replace(" ","").replace("}","").split(",");
        Variable[] materias = new Variable[x.length];
        Variable[] professores = new Variable[x.length];
        int contador=0;
        for (int i = 0; i < x.length; i++) {
            String[] aux = x[i].split("=");
            materias[i] = new Variable(aux[0]);
            professores[i] = new Variable(aux[1]);
            contador++;
        }
        for(int k = 0; k < contador; k++){
            Variable var1 = materias[k];
            Variable vart = professores[k];
            for(int j = k+1; j < getVariables().size(); j++){
                Variable var2 = materias[j];
                Variable vart2= professores[j];
                boolean teste= addConstraint(new NotEqualConstraint<>(var1,var2));
                boolean testes= addConstraint(new NotEqualConstraint <> (vart,vart2));
                if(teste && testes){
                    removeConstraint(new NotEqualConstraint <> (var1,var2));
                }

            }
        }

 */





