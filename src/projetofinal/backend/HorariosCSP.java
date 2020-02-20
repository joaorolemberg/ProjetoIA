package projetofinal.backend;

import projetofinal.aima.CSP;
import projetofinal.aima.Domain;
import projetofinal.aima.MaxMateriasConstraint;
import projetofinal.aima.Variable;


import java.util.*;

public class HorariosCSP extends CSP<Variable, String> {

    public HorariosCSP(List<Variable> variables, List<String> domains) {
        super(variables);

        Domain<String> d = new Domain<>(domains);
        for (Variable var : getVariables())
            setDomain(var, d);

        for(int i = 0; i < getVariables().size(); i++){
            Variable var1 = getVariables().get(i);
            for(int j = i+1; j < getVariables().size(); j++){
                Variable var2 = getVariables().get(j);
                for(int k = j+1; k < getVariables().size(); k++){
                    Variable var3 = getVariables().get(k);
                    addConstraint(new MaxMateriasConstraint<>(var1,var2,var3));
                }

            }
        }
    }
}