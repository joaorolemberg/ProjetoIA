package projetofinal.backend;

import java.util.ArrayList;
import java.util.List;

import projetofinal.aima.Assignment;
import projetofinal.aima.Constraint;
import projetofinal.aima.Variable;


public class NotPrefConstraint<VAR extends Variable, VAL> implements Constraint<VAR, VAL> {

    private VAR var;
    private int[] pref;
    private List<String> dom;
    private List<VAR> scope;

    public NotPrefConstraint(VAR var, int[] pref, List<String> dom) {
        this.var = var;
        this.pref = pref;
        this.dom = dom;
        scope = new ArrayList<>(1);
        scope.add(var);
    }

    @Override
    public List<VAR> getScope() {
        return scope;
    }

    @Override
    public boolean isSatisfiedWith(Assignment<VAR, VAL> assignment) {
        VAL value1 = assignment.getValue(var);
        return value1==null || pref[dom.indexOf(value1)] == 1;
    }
}
