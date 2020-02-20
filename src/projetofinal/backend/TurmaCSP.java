package projetofinal.backend;
import projetofinal.aima.*;
import projetofinal.backend.HorariosPSR;
import java.util.ArrayList;
import java.util.List;

public class TurmaCSP extends CSP<Variable, Integer> {
        public TurmaCSP(List<Disciplina> disciplinas) {
            for (Disciplina disciplina : disciplinas)
                addVariable(new Variable(disciplina.getNome()));
            CspSolver<Variable, String> solver;

            List<Integer> horarios = new ArrayList<>();

            for(int i = 1; i <= 15; i++) horarios.add(i);
                Domain<Integer> positions = new Domain<>(horarios);

            for (Variable var : getVariables())
                setDomain(var, positions);



        }

}
