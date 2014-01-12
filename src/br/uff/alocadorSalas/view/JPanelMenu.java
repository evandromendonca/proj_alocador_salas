/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.uff.alocadorSalas.view;

import java.awt.Color;

/**
 *
 * @author Evandro
 */
public class JPanelMenu extends javax.swing.JPanel {

    /**
     * Creates new form JPanelMenu
     */
    public JPanelMenu() {
        initComponents();
        definirLayout();
        
        //Inicia com o botão início selecionado
        Color c = new Color(this.getBackground().getRGB());
        JButtonInicio.setBackground(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonInicio = new javax.swing.JButton();
        JButtonSalas = new javax.swing.JButton();
        JButtonCursos = new javax.swing.JButton();
        JButtonProfessores = new javax.swing.JButton();
        JButtonDisciplinas = new javax.swing.JButton();
        JButtonTurmas = new javax.swing.JButton();
        JButtonHorarios = new javax.swing.JButton();
        JButtonGrade = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(100, 600));
        setMinimumSize(new java.awt.Dimension(100, 600));
        setPreferredSize(new java.awt.Dimension(100, 600));

        JButtonInicio.setText("Início");
        JButtonInicio.setAlignmentY(0.0F);
        JButtonInicio.setBorder(null);
        JButtonInicio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonInicio.setMaximumSize(new java.awt.Dimension(100, 40));
        JButtonInicio.setMinimumSize(new java.awt.Dimension(100, 40));
        JButtonInicio.setName("JButtonInicio"); // NOI18N
        JButtonInicio.setPreferredSize(new java.awt.Dimension(100, 40));
        JButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInicioActionPerformed(evt);
            }
        });

        JButtonSalas.setText("Salas");
        JButtonSalas.setAlignmentY(0.0F);
        JButtonSalas.setBorder(null);
        JButtonSalas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonSalas.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonSalas.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonSalas.setName("JButtonSalas"); // NOI18N
        JButtonSalas.setPreferredSize(new java.awt.Dimension(100, 80));

        JButtonCursos.setText("Cursos");
        JButtonCursos.setAlignmentY(0.0F);
        JButtonCursos.setBorder(null);
        JButtonCursos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonCursos.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonCursos.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonCursos.setName("JButtonCursos"); // NOI18N
        JButtonCursos.setPreferredSize(new java.awt.Dimension(100, 80));
        JButtonCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCursosActionPerformed(evt);
            }
        });

        JButtonProfessores.setText("Professores");
        JButtonProfessores.setAlignmentY(0.0F);
        JButtonProfessores.setBorder(null);
        JButtonProfessores.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonProfessores.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonProfessores.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonProfessores.setName("JButtonProfessores"); // NOI18N
        JButtonProfessores.setPreferredSize(new java.awt.Dimension(100, 80));

        JButtonDisciplinas.setText("Disciplinas");
        JButtonDisciplinas.setAlignmentY(0.0F);
        JButtonDisciplinas.setBorder(null);
        JButtonDisciplinas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonDisciplinas.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonDisciplinas.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonDisciplinas.setName("JButtonDisciplinas"); // NOI18N
        JButtonDisciplinas.setPreferredSize(new java.awt.Dimension(100, 80));

        JButtonTurmas.setText("Turmas");
        JButtonTurmas.setAlignmentY(0.0F);
        JButtonTurmas.setAutoscrolls(true);
        JButtonTurmas.setBorder(null);
        JButtonTurmas.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonTurmas.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonTurmas.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonTurmas.setName("JButtonTurmas"); // NOI18N
        JButtonTurmas.setPreferredSize(new java.awt.Dimension(100, 80));

        JButtonHorarios.setText("Horários");
        JButtonHorarios.setAlignmentY(0.0F);
        JButtonHorarios.setAutoscrolls(true);
        JButtonHorarios.setBorder(null);
        JButtonHorarios.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonHorarios.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonHorarios.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonHorarios.setName("JButtonHorarios"); // NOI18N
        JButtonHorarios.setPreferredSize(new java.awt.Dimension(100, 80));

        JButtonGrade.setText("Grade");
        JButtonGrade.setAlignmentY(0.0F);
        JButtonGrade.setAutoscrolls(true);
        JButtonGrade.setBorder(null);
        JButtonGrade.setMargin(new java.awt.Insets(0, 0, 0, 0));
        JButtonGrade.setMaximumSize(new java.awt.Dimension(100, 80));
        JButtonGrade.setMinimumSize(new java.awt.Dimension(100, 80));
        JButtonGrade.setName("JButtonGrade"); // NOI18N
        JButtonGrade.setPreferredSize(new java.awt.Dimension(100, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JButtonSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JButtonCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JButtonProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JButtonDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JButtonTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JButtonHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JButtonGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JButtonGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCursosActionPerformed
        definirLayout();
        Color c = new Color(this.getBackground().getRGB());
        JButtonCursos.setBackground(c);
        
        JPanelGlobal panelGlobal = (JPanelGlobal)this.getParent();
        panelGlobal.alteraVisibilidade("JButtonCursos");
    }//GEN-LAST:event_JButtonCursosActionPerformed

    private void JButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInicioActionPerformed
        definirLayout();
        Color c = new Color(this.getBackground().getRGB());
        JButtonInicio.setBackground(c);
        
        JPanelGlobal panelGlobal = (JPanelGlobal)this.getParent();
        panelGlobal.alteraVisibilidade("JButtonInicial");
    }//GEN-LAST:event_JButtonInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCursos;
    private javax.swing.JButton JButtonDisciplinas;
    private javax.swing.JButton JButtonGrade;
    private javax.swing.JButton JButtonHorarios;
    private javax.swing.JButton JButtonInicio;
    private javax.swing.JButton JButtonProfessores;
    private javax.swing.JButton JButtonSalas;
    private javax.swing.JButton JButtonTurmas;
    // End of variables declaration//GEN-END:variables

    private void definirLayout() {        
        
        Color c = new Color(180, 180, 180);
        
        JButtonCursos.setBackground(c);
        JButtonDisciplinas.setBackground(c);
        JButtonGrade.setBackground(c);
        JButtonHorarios.setBackground(c);
        JButtonInicio.setBackground(c);
        JButtonProfessores.setBackground(c);
        JButtonSalas.setBackground(c);
        JButtonTurmas.setBackground(c);
        
    }
    
}