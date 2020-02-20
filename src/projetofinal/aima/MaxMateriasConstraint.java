

package projetofinal.aima;

import projetofinal.aima.Assignment;
import projetofinal.aima.Constraint;
import projetofinal.aima.Variable;

import java.util.ArrayList;
import java.util.List;

public class MaxMateriasConstraint<VAR extends Variable, VAL> implements Constraint<VAR, VAL> {
    private VAR var1;
    private VAR var2;
    private VAR var3;
    private List<VAR> scope;

    public MaxMateriasConstraint(VAR var1, VAR var2, VAR var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        scope = new ArrayList<>(2);
        scope.add(var1);
        scope.add(var2);
        scope.add(var3);
    }

    @Override
    public List<VAR> getScope() {
        return scope;
    }

    @Override
    public boolean isSatisfiedWith(Assignment<VAR, VAL> assignment) {
        VAL value1 = assignment.getValue(var1);
        return value1 == null || !value1.equals(assignment.getValue(var2))|| !value1.equals(assignment.getValue(var3));
    }
}
