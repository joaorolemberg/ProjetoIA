package projetofinal.backend;


import projetofinal.aima.*;

import java.util.Arrays;
import java.util.List;

public class GradeCSP extends CSP<Variable, String> {

    public GradeCSP(List<Variable> variables, List<String> domains) {
        super(variables);

        Domain<String> d = new Domain<>(domains);
        for (Variable var : getVariables())
            setDomain(var, d);

        for(int i = 0; i < getVariables().size(); i++){
            Variable var1 = getVariables().get(i);
            for(int j = i+1; j < getVariables().size(); j++){
                Variable var2 = getVariables().get(j);
                addConstraint(new NotEqualConstraint<>(var1,var2));
            }
        }
    }
}