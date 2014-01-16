package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.controller.CursosController;
import br.uff.alocadorSalas.model.Curso;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mareana
 */
public class JPanelCursos extends javax.swing.JPanel {

    //Variáveis
    EstadoTela estadoTela;
    Long idCursoCorrente;

    /**
     * Creates new form JPanelCursos
     */
    public JPanelCursos() {
        initComponents();

        idCursoCorrente = (long) 0;
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

        painelConfiguracaoCursos = new javax.swing.JPanel();
        lQntDePeriodosCurso = new javax.swing.JLabel();
        lNomeCurso = new javax.swing.JLabel();
        JSpinnerQuantidadePeriodos = new javax.swing.JSpinner();
        lSiglaCurso = new javax.swing.JLabel();
        JTextNome = new javax.swing.JTextField();
        JTextSigla = new javax.swing.JFormattedTextField();
        painelPesquisaCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePesquisa = new javax.swing.JTable();
        panelBotoesAcao = new javax.swing.JPanel();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        JButtonBuscar = new javax.swing.JButton();
        JButtonCadastrar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        painelConfiguracaoCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        painelConfiguracaoCursos.setPreferredSize(new java.awt.Dimension(600, 200));

        lQntDePeriodosCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lQntDePeriodosCurso.setText("Quantidade de períodos.:");

        lNomeCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNomeCurso.setText("Nome.:");

        JSpinnerQuantidadePeriodos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        JSpinnerQuantidadePeriodos.setName("JSpinnerQuantidadePeriodos"); // NOI18N

        lSiglaCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lSiglaCurso.setText("Sigla.:");

        JTextNome.setName("JTextNome"); // NOI18N

        JTextSigla.setName("JTextSigla"); // NOI18N

        javax.swing.GroupLayout painelConfiguracaoCursosLayout = new javax.swing.GroupLayout(painelConfiguracaoCursos);
        painelConfiguracaoCursos.setLayout(painelConfiguracaoCursosLayout);
        painelConfiguracaoCursosLayout.setHorizontalGroup(
            painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                        .addComponent(lNomeCurso)
                        .addGap(12, 12, 12)
                        .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                        .addComponent(lSiglaCurso)
                        .addGap(18, 18, 18)
                        .addComponent(JTextSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                        .addComponent(lQntDePeriodosCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JSpinnerQuantidadePeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        painelConfiguracaoCursosLayout.setVerticalGroup(
            painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfiguracaoCursosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeCurso)
                    .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSiglaCurso)
                    .addComponent(JTextSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(painelConfiguracaoCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQntDePeriodosCurso)
                    .addComponent(JSpinnerQuantidadePeriodos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        painelPesquisaCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Resultado da Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 100));

        JTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sigla", "Quantidade de Períodos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTablePesquisa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JTablePesquisa.setShowHorizontalLines(false);
        JTablePesquisa.setShowVerticalLines(false);
        jScrollPane1.setViewportView(JTablePesquisa);

        javax.swing.GroupLayout painelPesquisaCursosLayout = new javax.swing.GroupLayout(painelPesquisaCursos);
        painelPesquisaCursos.setLayout(painelPesquisaCursosLayout);
        painelPesquisaCursosLayout.setHorizontalGroup(
            painelPesquisaCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisaCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPesquisaCursosLayout.setVerticalGroup(
            painelPesquisaCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaCursosLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotoesAcao.setMaximumSize(new java.awt.Dimension(700, 75));
        panelBotoesAcao.setMinimumSize(new java.awt.Dimension(700, 75));
        panelBotoesAcao.setPreferredSize(new java.awt.Dimension(700, 75));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotoesAcao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(painelPesquisaCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelConfiguracaoCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConfiguracaoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisaCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed

        ArrayList<Curso> cursosBuscados = buscaCursos();

        if (cursosBuscados == null) {
            return;
        }

        if (cursosBuscados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum curso encontrado!");
            return;
        }        
        
        DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
        modelTable.setRowCount(0);
        for (Curso c : cursosBuscados) {
            modelTable.addRow(new Object[]{c, c.getSigla(), c.getQuantidadePeriodos()});
        }

        definirLayout(EstadoTela.inicial);

    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarActionPerformed
        if ((JTextNome.getText().equalsIgnoreCase("")) || (JTextSigla.getText().equalsIgnoreCase("")) || ((int) JSpinnerQuantidadePeriodos.getValue() == 0)) {
            JOptionPane.showMessageDialog(this, "Campos de nome ou sigla vazios, ou período igual a zero!");
            return;
        }

        if (estadoTela.equals(EstadoTela.inicial)) {
            try {
                new CursosController().salvar(JTextNome.getText(), JTextSigla.getText(), (int) JSpinnerQuantidadePeriodos.getValue());
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao cadastrar o curso!");
                return;
            }
        }

        if (estadoTela.equals(EstadoTela.alterando)) {
            if (idCursoCorrente == 0) {
                JOptionPane.showMessageDialog(this, "Nenhum curso para ser alterado!");
            } else {
                try {
                    new CursosController().alterar(idCursoCorrente, JTextNome.getText(), JTextSigla.getText(), Integer.parseInt(JSpinnerQuantidadePeriodos.getValue().toString()));
                    JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
                    idCursoCorrente = (long) 0;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Problemas ao alterar o curso!");
                    return;
                }
            }
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonCadastrarActionPerformed

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed

        if (JTablePesquisa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhum curso selecionado!");
            return;
        }

        try {
            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();

            String nomeCursoSelecionado = String.valueOf(modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0));
            Curso cursoSelecionado = (Curso) new CursosController().buscaCursoPorNome(nomeCursoSelecionado);

            new CursosController().excluir(cursoSelecionado.getId());
            modelTable.removeRow(JTablePesquisa.getSelectedRow());

            JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir o curso!");
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed
        try {
            if (JTablePesquisa.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Nenhum curso selecionado!");
                return;
            }

            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
            String nomeCursoSelecionado = String.valueOf(modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0));
            Curso cursoSelecionado = (Curso) new CursosController().buscaCursoPorNome(nomeCursoSelecionado);

            this.JTextNome.setText(cursoSelecionado.getNome());
            this.JTextSigla.setText(cursoSelecionado.getSigla());
            this.JSpinnerQuantidadePeriodos.setValue(cursoSelecionado.getQuantidadePeriodos());
            this.idCursoCorrente = cursoSelecionado.getId();
            modelTable.removeRow(JTablePesquisa.getSelectedRow());

            definirLayout(EstadoTela.alterando);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problemas na alteração!");
        }
    }//GEN-LAST:event_JButtonAlterarActionPerformed

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
            JButtonExcluir.setEnabled(true);
            JButtonAlterar.setEnabled(true);
            JButtonBuscar.setEnabled(true);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Cadastrar");

            this.JTextNome.setText("");
            this.JTextSigla.setText("");
            this.JSpinnerQuantidadePeriodos.setValue(0);
        }

        if (estadoTela.equals(EstadoTela.alterando)) {
            JButtonExcluir.setEnabled(false);
            JButtonAlterar.setEnabled(false);
            JButtonBuscar.setEnabled(false);
            JButtonCadastrar.setEnabled(true);

            JButtonCadastrar.setText("Alterar");
        }
    }

    private ArrayList<Curso> buscaCursos() {

        if ((JTextNome.getText().equalsIgnoreCase("")) && (JTextSigla.getText().equalsIgnoreCase(""))) {
            try {
                return new ArrayList<>(new CursosController().listaCursos());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar cursos!");
                return null;
            }
        } else if ((!JTextNome.getText().equalsIgnoreCase("")) && (!JTextSigla.getText().equalsIgnoreCase(""))) {
            try {
                return new ArrayList<>(new CursosController().buscaTodosPorNomeESigla(JTextNome.getText(), JTextSigla.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar cursos por nome e sigla!");
                return null;
            }
        } else if (!JTextNome.getText().equalsIgnoreCase("")) {
            try {
                return new ArrayList<>(new CursosController().buscaTodosCursoPorNome(JTextNome.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar cursos por nome!");
                return null;
            }
        } else if (!JTextSigla.getText().equalsIgnoreCase("")) {
            try {
                return new ArrayList<>(new CursosController().buscaTodosCursoPorSigla(JTextSigla.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas ao buscar cursos por sigla!");
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
    private javax.swing.JSpinner JSpinnerQuantidadePeriodos;
    private javax.swing.JTable JTablePesquisa;
    private javax.swing.JTextField JTextNome;
    private javax.swing.JFormattedTextField JTextSigla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNomeCurso;
    private javax.swing.JLabel lQntDePeriodosCurso;
    private javax.swing.JLabel lSiglaCurso;
    private javax.swing.JPanel painelConfiguracaoCursos;
    private javax.swing.JPanel painelPesquisaCursos;
    private javax.swing.JPanel panelBotoesAcao;
    // End of variables declaration//GEN-END:variables
}
