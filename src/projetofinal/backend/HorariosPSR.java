package projetofinal.backend;

import projetofinal.aima.*;
import projetofinal.backend.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HorariosPSR {
    public static void main(String[] args){

        Variable D1 = new Variable("PI");
        Variable D2 = new Variable("POO");
        Variable D3 = new Variable("ES2");
        Variable D4 = new Variable("IA");

        String P1 = "JOÃO";
        //String P2 = "GABRIEL";
        //String P3 = "LUCAS";
        //String P4 = "THIAGO";

        //CSP<Variable, String> csp = new HorariosCSP(Arrays.asList(D1,D2,D3,D4),Arrays.asList(P1,P2,P3,P4));
        CSP<Variable, String> csp = new HorariosCSP(Arrays.asList(D1,D2,D3,D4),Arrays.asList(P1));
        CspListener.StepCounter<Variable, String> stepCounter = new CspListener.StepCounter<>();
        CspSolver<Variable, String> solver;
        Optional<Assignment<Variable, String>> solution;

        //List<String> pi = Arrays.asList(P1,P2);
        //List<String> poo = Arrays.asList(P2,P3);
        //List<String> ia = Arrays.asList(P3,P4);
        //List<String> es2 = Arrays.asList(P1,P4);

        List<String> pi = Arrays.asList(P1);
        List<String> poo = Arrays.asList(P1);
        List<String> ia = Arrays.asList(P1);
        List<String> es2 = Arrays.asList(P1);

        List<List<String>> preferencias = Arrays.asList(pi,poo,ia,es2);

        solver = new MinProf<>(1000,preferencias);
        solver.addCspListener(stepCounter);
        stepCounter.reset();
        System.out.println("Horários e Professores");
        solution = solver.solve(csp);
        solution.ifPresent(System.out::println);
        System.out.println(stepCounter.getResults() + "\n");

        String[] x = solution.get().toString().replace("{","").replace(" ","").replace("}","").split(",");
        Variable[] materias = new Variable[x.length];
        Variable[] professores = new Variable[x.length];
        for (int i = 0; i < x.length; i++) {
            String[] aux = x[i].split("=");
            materias[i] = new Variable(aux[0]);
            professores[i] = new Variable(aux[1]);
        }

        List<String> horarios = new ArrayList<>();

        for(int i = 1; i <= 15; i++){
            horarios.add(Integer.toString(i));
        }

        CSP<Variable, String> csp2 = new GradeCSP(Arrays.asList(materias),horarios);
        CspListener.StepCounter<Variable, String> stepCounter2 = new CspListener.StepCounter<>();
        CspSolver<Variable, String> solver2;
        Optional<Assignment<Variable, String>> solution2;

        List<String> r1 = Arrays.asList("12","13","14","15");
        List<String> r2 = Arrays.asList("8","9","10","11","12","13","14","15");
        List<String> r3 = Arrays.asList("1","2","4","5","6","7","8","15");
        List<String> r4 = Arrays.asList("13","14","15");

        List<List<String>> restricoes = Arrays.asList(r1,r2,r3,r4);

        solver2 = new MinHorario<>(1000,restricoes);
        solver2.addCspListener(stepCounter);
        stepCounter2.reset();
        System.out.println("Disciplinas e Horários");
        solution2 = solver2.solve(csp2);
        solution2.ifPresent(System.out::println);
        System.out.println(stepCounter2.getResults() + "\n");


    }
}
