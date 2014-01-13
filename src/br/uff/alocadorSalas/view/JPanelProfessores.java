/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.controller.CursosController;
import br.uff.alocadorSalas.controller.DisciplinaController;
import br.uff.alocadorSalas.model.Curso;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Evandro
 */
public class JPanelProfessores extends javax.swing.JPanel {

    /**
     * Creates new form JPanelProfessores
     */
    public JPanelProfessores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConfiguracaoProfessores = new javax.swing.JPanel();
        lNomeProfessores = new javax.swing.JLabel();
        lCursoProfessores = new javax.swing.JLabel();
        tNomeProfessor = new javax.swing.JTextField();
        comboBoxCursoProfessores = new javax.swing.JComboBox();
        panelBotoesAcao = new javax.swing.JPanel();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        JButtonBuscar = new javax.swing.JButton();
        JButtonCadastrar = new javax.swing.JButton();
        painelPesquisaCursos4 = new javax.swing.JPanel();
        scrollPesquisaCursos4 = new javax.swing.JScrollPane();
        JListPesquisa4 = new javax.swing.JList();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        painelConfiguracaoProfessores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Professores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        lNomeProfessores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeProfessores.setText("Nome.:");

        lCursoProfessores.setDisplayedMnemonic('C');
        lCursoProfessores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lCursoProfessores.setText("Curso.:");

        comboBoxCursoProfessores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cursos" }));

        javax.swing.GroupLayout painelConfiguracaoProfessoresLayout = new javax.swing.GroupLayout(painelConfiguracaoProfessores);
        painelConfiguracaoProfessores.setLayout(painelConfiguracaoProfessoresLayout);
        painelConfiguracaoProfessoresLayout.setHorizontalGroup(
            painelConfiguracaoProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoProfessoresLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelConfiguracaoProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfiguracaoProfessoresLayout.createSequentialGroup()
                        .addComponent(lCursoProfessores)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxCursoProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelConfiguracaoProfessoresLayout.createSequentialGroup()
                        .addComponent(lNomeProfessores)
                        .addGap(18, 18, 18)
                        .addComponent(tNomeProfessor)))
                .addContainerGap())
        );
        painelConfiguracaoProfessoresLayout.setVerticalGroup(
            painelConfiguracaoProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoProfessoresLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelConfiguracaoProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeProfessores)
                    .addComponent(tNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(painelConfiguracaoProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCursoProfessores)
                    .addComponent(comboBoxCursoProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panelBotoesAcao.setMaximumSize(new java.awt.Dimension(700, 75));
        panelBotoesAcao.setMinimumSize(new java.awt.Dimension(700, 75));

        JButtonExcluir.setText("Excluir");
        JButtonExcluir.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonExcluir.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonExcluir.setName("JButtonExcluir"); // NOI18N
        JButtonExcluir.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExcluirActionPerformed(evt);
            }
        });

        JButtonAlterar.setText("Alterar");
        JButtonAlterar.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonAlterar.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonAlterar.setName("JButtonAlterar"); // NOI18N
        JButtonAlterar.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesAcaoLayout = new javax.swing.GroupLayout(panelBotoesAcao);
        panelBotoesAcao.setLayout(panelBotoesAcaoLayout);
        panelBotoesAcaoLayout.setHorizontalGroup(
            panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelBotoesAcaoLayout.setVerticalGroup(
            panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAcaoLayout.createSequentialGroup()
                .addGroup(panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JButtonBuscar.setText("Buscar");
        JButtonBuscar.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonBuscar.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonBuscar.setName("JButtonBuscar"); // NOI18N
        JButtonBuscar.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
            }
        });

        JButtonCadastrar.setText("Cadastrar");
        JButtonCadastrar.setMaximumSize(new java.awt.Dimension(150, 50));
        JButtonCadastrar.setMinimumSize(new java.awt.Dimension(150, 50));
        JButtonCadastrar.setName("JButtonCadastrar"); // NOI18N
        JButtonCadastrar.setPreferredSize(new java.awt.Dimension(150, 50));
        JButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadastrarActionPerformed(evt);
            }
        });

        painelPesquisaCursos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Resultado da Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        JListPesquisa4.setModel(new DefaultListModel());
        JListPesquisa4.setName("JListPesquisa"); // NOI18N
        scrollPesquisaCursos4.setViewportView(JListPesquisa4);

        javax.swing.GroupLayout painelPesquisaCursos4Layout = new javax.swing.GroupLayout(painelPesquisaCursos4);
        painelPesquisaCursos4.setLayout(painelPesquisaCursos4Layout);
        painelPesquisaCursos4Layout.setHorizontalGroup(
            painelPesquisaCursos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursos4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPesquisaCursos4)
                .addContainerGap())
        );
        painelPesquisaCursos4Layout.setVerticalGroup(
            painelPesquisaCursos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursos4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPesquisaCursos4, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConfiguracaoProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(painelPesquisaCursos4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfiguracaoProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisaCursos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed

        if (JListPesquisa.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum curso selecionado");
            return;
        }

        try {
            DefaultListModel model = (DefaultListModel) JListPesquisa.getModel();
            String textoSelecionado = (String) model.getElementAt(JListPesquisa.getSelectedIndex());
            Long id = new CursosController().buscaCursoPorNome(textoSelecionado.split("/")[0]).getId();
            new CursosController().excluir(id);
            model.remove(JListPesquisa.getSelectedIndex());
        } catch (Exception ex) {
            Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed

        if (JListPesquisa.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum curso selecionado");
            return;
        }

        try {
            DefaultListModel model = (DefaultListModel) JListPesquisa.getModel();
            String textoSelecionado = (String) model.getElementAt(JListPesquisa.getSelectedIndex());
            Curso curso = new CursosController().buscaCursoPorNome(textoSelecionado.split("/")[0]);

//            this.JTextNome.setText(curso.getNome());
//            this.JTextSigla.setText(curso.getSigla());
//            this.JSpinnerQuantidadePeriodos.setValue(curso.getQuantidadePeriodos());
//            this.idCursoCorrente = curso.getId();
            model.remove(JListPesquisa.getSelectedIndex());
        } catch (Exception ex) {
            Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

        definirLayout(EstadoTela.alterando);
    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed
//        ArrayList<Disciplina> cursosBuscados = new ArrayList<>();
//
//        if ((JTextNome.getText().equalsIgnoreCase("")) && (JTextSigla.getText().equalsIgnoreCase(""))) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().listaCursos());
//            } catch (Exception e) {
//                return;
//            }
//        } else if ((!JTextNome.getText().equalsIgnoreCase("")) && (!JTextSigla.getText().equalsIgnoreCase(""))) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().buscaTodosPorNomeESigla(JTextNome.getText(), JTextSigla.getText()));
//            } catch (Exception e) {
//                return;
//            }
//        } else if (!JTextNome.getText().equalsIgnoreCase("")) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().buscaTodosCursoPorNome(JTextNome.getText()));
//            } catch (Exception e) {
//                return;
//            }
//        } else if (!JTextSigla.getText().equalsIgnoreCase("")) {
//            try {
//                cursosBuscados = new ArrayList<>(new CursosController().buscaTodosCursoPorSigla(JTextSigla.getText()));
//            } catch (Exception e) {
//                return;
//            }
//        }
//
//        if (cursosBuscados.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Nenhum curso encontrado!");
//            return;
//        }
//
//        DefaultListModel model = (DefaultListModel) JListPesquisa.getModel();
//        model.clear();
//
//        for (Curso c : cursosBuscados) {
//            model.add(model.getSize(), c.getNome() + "/" + c.getSigla() + "/" + c.getQuantidadePeriodos());
//        }
//
//        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarActionPerformed
        if ((JTextNome.getText().equalsIgnoreCase("")) || (JComboBoxCurso.getSelectedIndex() == -1) || (JComboBoxPeriodo.getSelectedIndex() == -1)) {
            JOptionPane.showMessageDialog(this, "Campos de busca 'Nome'ou 'Curso' ou 'Periodo' vazios!");
            return;
        }

        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        DefaultComboBoxModel modelPeriodo = (DefaultComboBoxModel) JComboBoxPeriodo.getModel();

        if (JButtonCadastrar.getText().equalsIgnoreCase("Cadastrar")) {
            try {
                new DisciplinaController().salvar(JTextNome.getText(), Integer.parseInt(modelPeriodo.getSelectedItem().toString()), (Curso) modelCurso.getSelectedItem());
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Alterar")) {

            if (idDisciplinaCorrente == 0) {
                JOptionPane.showMessageDialog(this, "Nenhuma disciplina para ser alterada!");
                return;
            }

            try {
                new DisciplinaController().alterar(idDisciplinaCorrente, JTextNome.getText(), Integer.parseInt(modelPeriodo.getSelectedItem().toString()), (Curso) modelCurso.getSelectedItem());
                JOptionPane.showMessageDialog(this, "Alterada com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(JPanelCursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCadastrar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JList JListPesquisa4;
    private javax.swing.JComboBox comboBoxCursoProfessores;
    private javax.swing.JLabel lCursoProfessores;
    private javax.swing.JLabel lNomeProfessores;
    private javax.swing.JPanel painelConfiguracaoProfessores;
    private javax.swing.JPanel painelPesquisaCursos4;
    private javax.swing.JPanel panelBotoesAcao;
    private javax.swing.JScrollPane scrollPesquisaCursos4;
    private javax.swing.JTextField tNomeProfessor;
    // End of variables declaration//GEN-END:variables
}
