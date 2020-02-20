package projetofinal.aima;

import projetofinal.aima.Assignment;
import projetofinal.aima.Tasks;
import projetofinal.aima.Util;
import projetofinal.aima.Variable;
import projetofinal.aima.CspSolver;
import java.util.*;

public class MinProf<VAR extends Variable, VAL> extends MinConflictsSolver<VAR, VAL>{
    private int maxSteps;
    private List<List<String>> preferencias;

    /**
     * Constructs a min-conflicts strategy with a given number of steps allowed
     * before giving up.
     *
     * @param maxSteps the number of steps allowed before giving up
     */
    public MinProf(int maxSteps,List<List<String>> preferencias) {
        super(maxSteps);
        this.maxSteps = maxSteps;
        this.preferencias = preferencias;
    }

    public Optional<Assignment<VAR, VAL>> solve(CSP<VAR, VAL> csp) {
        Assignment<VAR, VAL> current = generateProfAssignment(csp);
        fireStateChanged(csp, current, null);
        for (int i = 0; i < maxSteps && !Tasks.currIsCancelled(); i++) {
            if (current.isSolution(csp)) {
                return Optional.of(current);
            } else {
                Set<VAR> vars = getConflictedVariables(current, csp);
                VAR var = Util.selectRandomlyFromSet(vars);
                VAL value = getMinConflictValueFor(var, current, csp);
                current.add(var, value);
                fireStateChanged(csp, current, var);
            }
        }
        return Optional.empty();
    }



    private Assignment<VAR, VAL> generateRandomAssignment(CSP<VAR, VAL> csp) {
        Assignment<VAR, VAL> result = new Assignment<>();
        for (VAR var : csp.getVariables()) {
            VAL randomValue = Util.selectRandomlyFromList(csp.getDomain(var).asList());
            result.add(var, randomValue);
        }
        return result;
    }

    private Assignment<VAR, VAL> generateProfAssignment(CSP<VAR, VAL> csp) {
        Assignment<VAR, VAL> result = new Assignment<>();
        for (int i = 0; i <csp.getVariables().size(); i++) {
            VAR var = csp.getVariables().get(i);

            Boolean b = false;
            int k=0;
            while(b == false){
                VAL randomValue = Util.selectRandomlyFromList(csp.getDomain(var).asList());
                if(preferencias.get(i).contains((String) randomValue)|| k>maxSteps){
                    result.add(var, randomValue);
                    b = true;
                }
            }
        }
        return result;
    }

    private Set<VAR> getConflictedVariables(Assignment<VAR, VAL> assignment, CSP<VAR, VAL> csp) {
        Set<VAR> result = new LinkedHashSet<>();
        csp.getConstraints().stream().filter(constraint -> !constraint.isSatisfiedWith(assignment)).
                map(Constraint::getScope).forEach(result::addAll);
        return result;
    }

    private VAL getMinConflictValueFor(VAR var, Assignment<VAR, VAL> assignment, CSP<VAR, VAL> csp) {
        List<Constraint<VAR, VAL>> constraints = csp.getConstraints(var);
        Assignment<VAR, VAL> testAssignment = assignment.clone();
        int minConflict = Integer.MAX_VALUE;
        List<VAL> resultCandidates = new ArrayList<>();
        for (VAL value : csp.getDomain(var)) {
            testAssignment.add(var, value);
            int currConflict = countConflicts(testAssignment, constraints);
            if (currConflict <= minConflict) {
                if (currConflict < minConflict) {
                    resultCandidates.clear();
                    minConflict = currConflict;
                }
                resultCandidates.add(value);
            }
        }
        return (!resultCandidates.isEmpty()) ? Util.selectRandomlyFromList(resultCandidates) : null;
    }

    private int countConflicts(Assignment<VAR, VAL> assignment, List<Constraint<VAR, VAL>> constraints) {
        return (int) constraints.stream().filter(constraint -> !constraint.isSatisfiedWith(assignment)).count();
    }
}
