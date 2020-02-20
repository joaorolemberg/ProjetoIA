package projetofinal.aima;

import projetofinal.aima.Assignment;
import projetofinal.aima.Constraint;
import projetofinal.aima.Variable;

import java.util.ArrayList;
import java.util.List;

public class restriturma<VAR extends Variable, VAL> implements Constraint<VAR, VAL> {
    private VAR var1;
    private VAR var2;
    private List<VAR> scope;

    public restriturma(VAR var1, VAR var2) {
        this.var1 = var1;
        this.var2 = var2;
        scope = new ArrayList<>(2);
        scope.add(var1);
        scope.add(var2);
    }

    @Override
    public List<VAR> getScope() {
        return scope;
    }

    @Override
    public boolean isSatisfiedWith(Assignment<VAR, VAL> assignment) {
        VAL value1 = assignment.getValue(var1);
        VAL value2 = assignment.getValue(var2);
        return value1 == null || value2 == null || !value1.equals(assignment.getValue(var2));
    }
}