/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal.frontend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import projetofinal.aima.Assignment;
import projetofinal.aima.CSP;
import projetofinal.aima.CspListener;
import projetofinal.aima.CspSolver;
import projetofinal.aima.Variable;
import projetofinal.backend.Disciplina;
import projetofinal.backend.HorariosCSP;
import projetofinal.backend.Professor;

/**
 *
 * @author rolemberg
 */
public class InstanciarProblema extends javax.swing.JFrame {

    /**
     * Creates new form InstanciarProblema
     */
    static List<Disciplina> disciplinas;
    static List<Professor> professores;
    
    static List<Disciplina>  instanciaDisc;
    static List<Professor> instanciaProf;
    
    
    
    public InstanciarProblema(List<Disciplina> discParam,List<Professor> profParam,List<Disciplina> discInst ,List<Professor> profInst) {
        initComponents();
        this.setVisible(true);
        disciplinas=discParam;
        professores=profParam;
        instanciaDisc=discInst;
        instanciaProf=profInst;
        
        listProfInst.removeAll();
        listDiscInst.removeAll();
        DefaultListModel modelProfessor = new DefaultListModel();
        DefaultListModel modelDisciplina = new DefaultListModel();
        if(instanciaDisc!=null){
            int n = instanciaDisc.size();
            for (int i=0; i<n; i++) {
            modelDisciplina.addElement("Codigo:"+instanciaDisc.get(i).getCodigo());
            modelDisciplina.addElement("Nome: "+ instanciaDisc.get(i).getNome());
            modelDisciplina.addElement("Departamento: "+instanciaDisc.get(i).getDepartamento());
            modelDisciplina.addElement("Créditos: "+instanciaDisc.get(i).getCreditos());
            modelDisciplina.addElement("Horarios Fixos:"+instanciaDisc.get(i).getRestricaoHorario());
            modelDisciplina.addElement("*****************************************************************");
            
            }
            listDiscInst.setModel(modelDisciplina);
        
        }
        
        if(instanciaProf!=null){
            int n = instanciaProf.size();
            
            for (int i=0; i<n; i++) {

                modelProfessor.addElement("Matricula:"+instanciaProf.get(i).getMatricula());
                modelProfessor.addElement("Nome:"+instanciaProf.get(i).getNome());
                modelProfessor.addElement("Preferencias:");
                int j=instanciaProf.get(i).getPreferencias().size();
                for (int k = 0; k < j; k++) {
                    modelProfessor.addElement(instanciaProf.get(i).getPreferencias().get(k).getCodigo()+"-"+instanciaProf.get(i).getPreferencias().get(k).getNome());
                }
            
                modelProfessor.addElement("Horarios Indis.:"+instanciaProf.get(i).getRestricaoHorario());
                modelProfessor.addElement("********************************************************************");  
            }
            listProfInst.setModel(modelProfessor);
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAlocarDisc = new javax.swing.JButton();
        btnAlocarProf = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProfInst = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listDiscInst = new javax.swing.JList<>();
        btnExecutar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Instanciar Problema");

        btnAlocarDisc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAlocarDisc.setText("Alocar Disciplinas");
        btnAlocarDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlocarDiscActionPerformed(evt);
            }
        });

        btnAlocarProf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAlocarProf.setText("Alocar Professores");
        btnAlocarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlocarProfActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listProfInst);

        jScrollPane4.setViewportView(listDiscInst);

        btnExecutar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnAlocarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(btnAlocarDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlocarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlocarDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlocarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarProfActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlocarProfessor(disciplinas,professores,instanciaDisc,instanciaProf).setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAlocarProfActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            new Gui().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(InstanciarProblema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlocarDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarDiscActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlocarDisciplina(disciplinas,professores,instanciaDisc,instanciaProf).setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAlocarDiscActionPerformed

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        // TODO add your handling code here:
        
        //executar codigo de csp e chamar tela com resultado
        //Recebe disciplinas como variaveis
        
        int tamDisc=instanciaDisc.size();
        List<Variable> varDisc= new ArrayList<>();
        for (int i = 0; i < tamDisc; i++) {
            Variable temp = new Variable(instanciaDisc.get(i).getNome());
            //System.out.println(instanciaDisc.get(i).getNome());
            varDisc.add(temp);
        }
        
        //recebe nome dos professores como string
        ArrayList<String> strProf=new ArrayList<>();
        int tamProf=instanciaProf.size();
        
        for (int i = 0; i < tamProf; i++) {
            strProf.add(instanciaProf.get(i).getNome());
            //System.out.println(instanciaDisc.get(i).getNome());
        }
       
        CSP<Variable,String> csp=new HorariosCSP(varDisc,strProf);
        CspListener.StepCounter<Variable,String> stepCounter = new CspListener.StepCounter<>();
        CspSolver<Variable,String> solver;
        Optional<Assignment<Variable,String>> solution;
        /*
        List<List<String>> preferencias;
        for (int i = 0; i < tamDisc; i++) {
            
            for (int j = 0; j < 10; j++) {
                List<String> materia
            }
            
        }
        */
        
        
        String[] resultadoAlocacao={"h1","h2","h3","h4","h5","h6","h7","h8","h9","h10","h11","h12","h13","h14","h15"};
        
        
        List<String> profsNaoAlocados=new ArrayList<>();
        List<String> materiasNaoAlocadas=new ArrayList<>();
        
        profsNaoAlocados.add("prof1");
        profsNaoAlocados.add("prof2");
        profsNaoAlocados.add("prof3");
        
        materiasNaoAlocadas.add("mat1");
        materiasNaoAlocadas.add("mat2");
        materiasNaoAlocadas.add("mat3");
        
        
        this.dispose();
        new Resultado(disciplinas,professores,instanciaDisc,instanciaProf,resultadoAlocacao,profsNaoAlocados,materiasNaoAlocadas).setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnExecutarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstanciarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstanciarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstanciarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstanciarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
    
                new InstanciarProblema(disciplinas,professores,instanciaDisc,instanciaProf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlocarDisc;
    private javax.swing.JButton btnAlocarProf;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listDiscInst;
    private javax.swing.JList<String> listProfInst;
    // End of variables declaration//GEN-END:variables
}
