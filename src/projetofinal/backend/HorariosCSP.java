package projetofinal.backend;

import projetofinal.aima.CSP;
import projetofinal.aima.Domain;
import projetofinal.aima.Variable;

import java.util.ArrayList;
import java.util.List;

public class HorariosCSP extends CSP<Variable, Integer> {
    public HorariosCSP(List<Disciplina> disciplinas) {
        for (Disciplina disciplina : disciplinas)
            addVariable(new Variable(disciplina.getNome()));

        List<Integer> horarios = new ArrayList<>();

        for(int i = 1; i <= 15; i++) horarios.add(i);
        Domain<Integer> positions = new Domain<>(horarios);

        for (Variable var : getVariables())
            setDomain(var, positions);
    }
}
