package projetofinal.backend;



import projetofinal.aima.Variable;
import projetofinal.aima.Domain;
import projetofinal.aima.CSP;
import java.util.*;

public class DisciplinasCSP extends CSP<Variable, Disciplina> {
    public DisciplinasCSP(List<Disciplina> disciplinas, List<Professor> professores) {
        for (Professor professor : professores)
            addVariable(new Variable(professor.getNome()));

        Domain<Disciplina> positions = new Domain<>(disciplinas);

        for (Variable var : getVariables())
            setDomain(var, positions);


    }
}