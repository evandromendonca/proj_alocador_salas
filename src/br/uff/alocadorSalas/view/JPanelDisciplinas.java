/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.controller.CursosController;
import br.uff.alocadorSalas.controller.DisciplinaController;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Disciplina;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evandro
 */
public class JPanelDisciplinas extends javax.swing.JPanel {

    /**
     * Variáveis
     */
    EstadoTela estadoTela;
    Long idDisciplinaCorrente;

    /**
     * Creates new form JPanelDisciplinas
     */
    public JPanelDisciplinas() {
        initComponents();

        idDisciplinaCorrente = (long) 0;

        configInicial();
        definirLayout(EstadoTela.inicial);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConfiguracaoDisciplinas = new javax.swing.JPanel();
        lNomeDisciplina = new javax.swing.JLabel();
        lCursoDisciplina = new javax.swing.JLabel();
        lPeriodoDisciplina = new javax.swing.JLabel();
        JTextNome = new javax.swing.JTextField();
        JComboBoxCurso = new javax.swing.JComboBox();
        JComboBoxPeriodo = new javax.swing.JComboBox();
        lNomeDisciplina1 = new javax.swing.JLabel();
        JTextCodigo = new javax.swing.JTextField();
        JButtonBuscar = new javax.swing.JButton();
        JButtonCadastrar = new javax.swing.JButton();
        panelBotoesAcao = new javax.swing.JPanel();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        painelPesquisaCursos4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePesquisa = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));

        painelConfiguracaoDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        lNomeDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeDisciplina.setText("Nome.:");

        lCursoDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lCursoDisciplina.setText("Curso.:");

        lPeriodoDisciplina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lPeriodoDisciplina.setText("Período.:");

        JComboBoxCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxCursoItemStateChanged(evt);
            }
        });

        lNomeDisciplina1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeDisciplina1.setText("Código.:");

        javax.swing.GroupLayout painelConfiguracaoDisciplinasLayout = new javax.swing.GroupLayout(painelConfiguracaoDisciplinas);
        painelConfiguracaoDisciplinas.setLayout(painelConfiguracaoDisciplinasLayout);
        painelConfiguracaoDisciplinasLayout.setHorizontalGroup(
            painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCursoDisciplina)
                    .addComponent(lPeriodoDisciplina)
                    .addComponent(lNomeDisciplina)
                    .addComponent(lNomeDisciplina1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JComboBoxPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelConfiguracaoDisciplinasLayout.setVerticalGroup(
            painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoDisciplinasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeDisciplina)
                    .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeDisciplina1)
                    .addComponent(JTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCursoDisciplina)
                    .addComponent(JComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelConfiguracaoDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPeriodoDisciplina)
                    .addComponent(JComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        painelPesquisaCursos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Resultado da Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 100));

        JTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Curso", "Período"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTablePesquisa.setShowHorizontalLines(false);
        JTablePesquisa.setShowVerticalLines(false);
        jScrollPane1.setViewportView(JTablePesquisa);

        javax.swing.GroupLayout painelPesquisaCursos4Layout = new javax.swing.GroupLayout(painelPesquisaCursos4);
        painelPesquisaCursos4.setLayout(painelPesquisaCursos4Layout);
        painelPesquisaCursos4Layout.setHorizontalGroup(
            painelPesquisaCursos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursos4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPesquisaCursos4Layout.setVerticalGroup(
            painelPesquisaCursos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursos4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(painelConfiguracaoDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPesquisaCursos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfiguracaoDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(painelPesquisaCursos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed

        ArrayList<Disciplina> disciplinasBuscados = buscaDisciplinas();

        if (disciplinasBuscados == null) {
            return;
        }

        if (disciplinasBuscados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma disciplina encontrada!");
            return;
        }

        DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
        modelTable.setRowCount(0);
        for (Disciplina d : disciplinasBuscados) {
            modelTable.addRow(new Object[]{d, d.getCodigo(), d.getCurso(), d.getPeriodoAssociado()});
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarActionPerformed
        if ((JTextNome.getText().equalsIgnoreCase("")) || (JComboBoxCurso.getSelectedIndex() == 0) || (JComboBoxPeriodo.getSelectedIndex() == 0)) {
            JOptionPane.showMessageDialog(this, "Campos de busca 'Nome'ou 'Curso' ou 'Periodo' vazios!");
            return;
        }

        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        DefaultComboBoxModel modelPeriodo = (DefaultComboBoxModel) JComboBoxPeriodo.getModel();

        if (JButtonCadastrar.getText().equalsIgnoreCase("Cadastrar")) {
            try {
                new DisciplinaController().salvar(JTextNome.getText(),
                        (int) modelPeriodo.getSelectedItem(),
                        (Curso) modelCurso.getElementAt(JComboBoxCurso.getSelectedIndex()),
                        JTextCodigo.getText());
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao cadastrar o curso!");
                return;
            }
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Alterar")) {

            if (idDisciplinaCorrente == 0) {
                JOptionPane.showMessageDialog(this, "Nenhuma disciplina para ser alterada!");
            } else {
                try {
                    new DisciplinaController().alterar(idDisciplinaCorrente,
                            JTextNome.getText(),
                            (int) modelPeriodo.getSelectedItem(),
                            (Curso) modelCurso.getElementAt(JComboBoxCurso.getSelectedIndex()),
                            JTextCodigo.getText());
                    JOptionPane.showMessageDialog(this, "Alterada com sucesso!");
                    idDisciplinaCorrente = (long) 0;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Problemas ao alterar a disciplina!");
                    return;
                }
            }
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonCadastrarActionPerformed

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed

        if (JTablePesquisa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum disciplina selecionada!");
            return;
        }

        try {
            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();

            String nomeDisciplinaSelecionada = String.valueOf(modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0));
            Disciplina disciplinaSelecionada = (Disciplina) new DisciplinaController().buscaDisciplinaPorNome(nomeDisciplinaSelecionada);

            new DisciplinaController().excluir(disciplinaSelecionada.getId());
            modelTable.removeRow(JTablePesquisa.getSelectedRow());

            JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir a disciplina!");
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed
        try {
            if (JTablePesquisa.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Nenhuma disciplina selecionada!");
                return;
            }

            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
            String nomeDisciplinaSelecionada = String.valueOf(modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0));
            Disciplina disciplina = (Disciplina) new DisciplinaController().buscaDisciplinaPorNome(nomeDisciplinaSelecionada);

            this.JTextNome.setText(disciplina.getNome());
            this.JComboBoxCurso.setSelectedItem(disciplina.getCurso());
            this.JComboBoxPeriodo.setSelectedItem(disciplina.getPeriodoAssociado());
            this.JTextCodigo.setText(disciplina.getCodigo());
            this.idDisciplinaCorrente = disciplina.getId();
            modelTable.removeRow(JTablePesquisa.getSelectedRow());

            definirLayout(EstadoTela.alterando);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problemas na alteração!");
        }
    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JComboBoxCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxCursoItemStateChanged
        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();

        if (JComboBoxCurso.getSelectedIndex() > 0) {
            try {
                preencherComboPeriodo((Curso) modelCurso.getSelectedItem());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao selecionar o curso");
            }
        } else {
            preencherComboPeriodo(new Curso());
        }
    }//GEN-LAST:event_JComboBoxCursoItemStateChanged

    private void configInicial() {
        Color c = new Color(this.getBackground().getRGB());

        this.JButtonAlterar.setBackground(c);
        this.JButtonBuscar.setBackground(c);
        this.JButtonCadastrar.setBackground(c);
        this.JButtonExcluir.setBackground(c);
    }

    private void definirLayout(EstadoTela estado) {
        estadoTela = estado;

        if (estadoTela.equals(EstadoTela.inicial)) {

            preencherComboCurso();

            JButtonExcluir.setEnabled(true);
            JButtonAlterar.setEnabled(true);
            JButtonBuscar.setEnabled(true);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Cadastrar");

            this.JTextNome.setText("");
            this.JTextCodigo.setText("");
            this.JComboBoxCurso.setSelectedIndex(0);
            this.JComboBoxPeriodo.setSelectedIndex(0);
        }

        if (estadoTela.equals(EstadoTela.alterando)) {
            JButtonExcluir.setEnabled(false);
            JButtonAlterar.setEnabled(false);
            JButtonBuscar.setEnabled(false);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Alterar");
        }
    }

    private void preencherComboCurso() {
        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        modelCurso.removeAllElements();

        String mensagem = "Preencha com um curso!";
        modelCurso.addElement(mensagem);

        try {
            ArrayList<Curso> cursosBuscados = new ArrayList<>(new CursosController().listaCursos());
            for (Curso c : cursosBuscados) {
                modelCurso.addElement(c);
            }
        } catch (Exception ex) {
            Logger.getLogger(JPanelDisciplinas.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelCurso.setSelectedItem(mensagem);
    }

    public void preencherComboPeriodo(Curso c) {
        DefaultComboBoxModel modelPeriodo = (DefaultComboBoxModel) JComboBoxPeriodo.getModel();
        modelPeriodo.removeAllElements();

        String mensagem = "Preencha com um período!";
        modelPeriodo.addElement(mensagem);

        for (int i = 1; i <= c.getQuantidadePeriodos(); i++) {
            modelPeriodo.addElement(i);
        }

        modelPeriodo.setSelectedItem(mensagem);
    }

    private ArrayList<Disciplina> buscaDisciplinas() {

        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();

        if ((JTextNome.getText().equalsIgnoreCase("")) && (JComboBoxCurso.getSelectedIndex() <= 0)) {
            try {
                return new ArrayList<>(new DisciplinaController().listaDisciplinas());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar disciplinas!");
                return null;
            }
        } else if (!(JTextNome.getText().equalsIgnoreCase("")) && !(JComboBoxCurso.getSelectedIndex() <= 0)) {
            try {
                return new ArrayList<>(new DisciplinaController().buscaTodasDisciplinaPorNomeECurso(JTextNome.getText(), (Curso) JComboBoxCurso.getSelectedItem()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar disciplinas por nome e curso!");
                return null;
            }
        } else if (!JTextNome.getText().equalsIgnoreCase("")) {
            try {
                return new ArrayList<>(new DisciplinaController().buscaTodasDisciplinaPorNome(JTextNome.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar disciplinas por nome!");
                return null;
            }
        } else if (JComboBoxCurso.getSelectedIndex() > 0) {
            try {
                return new ArrayList<>(new DisciplinaController().buscaTodasDisciplinaPorCurso((Curso) modelCurso.getSelectedItem()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar disciplinas curso!");
                return null;
            }
        }

        return new ArrayList<>();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCadastrar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JComboBox JComboBoxCurso;
    private javax.swing.JComboBox JComboBoxPeriodo;
    private javax.swing.JTable JTablePesquisa;
    private javax.swing.JTextField JTextCodigo;
    private javax.swing.JTextField JTextNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCursoDisciplina;
    private javax.swing.JLabel lNomeDisciplina;
    private javax.swing.JLabel lNomeDisciplina1;
    private javax.swing.JLabel lPeriodoDisciplina;
    private javax.swing.JPanel painelConfiguracaoDisciplinas;
    private javax.swing.JPanel painelPesquisaCursos4;
    private javax.swing.JPanel panelBotoesAcao;
    // End of variables declaration//GEN-END:variables
}
