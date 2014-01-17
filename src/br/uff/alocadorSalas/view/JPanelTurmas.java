/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.view;

import br.uff.alocadorSalas.controller.AulaController;
import br.uff.alocadorSalas.controller.CursosController;
import br.uff.alocadorSalas.controller.DisciplinaController;
import br.uff.alocadorSalas.controller.HorarioController;
import br.uff.alocadorSalas.controller.ProfessorController;
import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.controller.TurmaController;
import br.uff.alocadorSalas.model.Aula;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Disciplina;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Professor;
import br.uff.alocadorSalas.model.Sala;
import br.uff.alocadorSalas.model.Turma;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evaulandro
 */
public class JPanelTurmas extends javax.swing.JPanel {

    /**
     * Vaulariáveis
     */
    EstadoTela estadoTela;
    Turma turmaCorrente;
    List<Aula> listaAulasCorrente;

    /**
     * Creaulates new form JPaulanelTurmaulas
     */
    public JPanelTurmas() {
        initComponents();

        turmaCorrente = null;

        configInicial();
        preencherComboCurso();
        preencherComboProfessores();
        preencherComboDiaSemana();
        preencherComboSalas();
        definirLayout(EstadoTela.inicial);
    }

    /**
     * Thoraulariois methoraulariood is caulalled from withoraularioin
     * thoraularioe constructor to initiaulalize thoraularioe form. WARNING: Do
     * NOT modify thoraulariois code. Thoraularioe content of thoraulariois
     * methoraulariood is aulalwaulays regeneraulated by thoraularioe Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JSpinnerQuantidadeAlunos = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JComboBoxCurso = new javax.swing.JComboBox();
        JComboBoxProfessor = new javax.swing.JComboBox();
        JComboBoxDisciplina = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JComboBoxSala = new javax.swing.JComboBox();
        JComboBoxDiaSemana = new javax.swing.JComboBox();
        JButtonIncluiAula = new javax.swing.JButton();
        JButtonRemoveAula = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableAulas = new javax.swing.JTable();
        JTextHorarioInicial = new javax.swing.JTextField();
        JTextHorarioFinal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JButtonBuscar = new javax.swing.JButton();
        JButtonCadastrar = new javax.swing.JButton();
        painelPesquisaCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePesquisa = new javax.swing.JTable();
        JButtonExcluir = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        JButtonExcluirTodasTurmas = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turmas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome.:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Quantidade de alunos.:");

        JSpinnerQuantidadeAlunos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        JSpinnerQuantidadeAlunos.setName("JSpinnerQuantidadeAlunos"); // NOI18N
        JSpinnerQuantidadeAlunos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSpinnerQuantidadeAlunosStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Disciplina.:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Professor.:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Curso.:");

        JComboBoxCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxCursoItemStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Horários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("<html><font color=black>Sala</font> <font color=red>*</font></html>");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Dia da Semana.:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Horário Inicial.:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Horário Final.:");

        JButtonIncluiAula.setText("->");
        JButtonIncluiAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonIncluiAulaActionPerformed(evt);
            }
        });

        JButtonRemoveAula.setText("<-");
        JButtonRemoveAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRemoveAulaActionPerformed(evt);
            }
        });

        jScrollPane3.setPreferredSize(new java.awt.Dimension(50, 50));

        JTableAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horário Inicial", "Horário Final", "Dia Semana", "Sala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAulas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JTableAulas.setShowHorizontalLines(false);
        JTableAulas.setShowVerticalLines(false);
        jScrollPane3.setViewportView(JTableAulas);

        JTextHorarioInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextHorarioInicialFocusLost(evt);
            }
        });
        JTextHorarioInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTextHorarioInicialKeyReleased(evt);
            }
        });

        JTextHorarioFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextHorarioFinalFocusLost(evt);
            }
        });
        JTextHorarioFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTextHorarioFinalKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JComboBoxSala, javax.swing.GroupLayout.Alignment.TRAILING, 0, 142, Short.MAX_VALUE)
                                    .addComponent(JComboBoxDiaSemana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTextHorarioInicial)
                                    .addComponent(JTextHorarioFinal))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JButtonIncluiAula)
                            .addComponent(JButtonRemoveAula)))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JComboBoxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JComboBoxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonIncluiAula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JButtonRemoveAula)
                    .addComponent(JTextHorarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(JTextHorarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setText("Valor entre 1 e 200");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JSpinnerQuantidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JComboBoxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JComboBoxProfessor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JComboBoxDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JSpinnerQuantidadeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JComboBoxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("* Campo opcional");

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

        painelPesquisaCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Resultado da Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 100));

        JTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade de alunos", "Curso", "Disciplina", "Professor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );
        painelPesquisaCursosLayout.setVerticalGroup(
            painelPesquisaCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

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

        JButtonExcluirTodasTurmas.setText("<html><font color=red>Excluir Tudo</font></html>");
        JButtonExcluirTodasTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExcluirTodasTurmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPesquisaCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonExcluirTodasTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonExcluirTodasTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPesquisaCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean verificarConflitoHoraEAula(Horario hora, Aula aula) {

        return (aula.getHorario().getHorarioInicial().getTime() < hora.getHorarioFinal().getTime())
                && (aula.getHorario().getHorarioFinal().getTime() > hora.getHorarioInicial().getTime());
    }

    public void salvaOuAlteraAula(int i, Horario horario, Turma turma) throws Exception {

        DefaultTableModel modelTableAulas = (DefaultTableModel) JTableAulas.getModel();
        Aula aula = null;

        //Se a SALA estiver preenchida, ele verifica, senao, ele só aloca
        if (modelTableAulas.getValueAt(i, 3) != null) {

            //Pega lista de todas as aulas da SALA no DIA DA SEMANA
            List<Aula> aulasNoDiaSemana = new AulaController().buscaTodosPorSalaEDiaSemana(
                    (Sala) modelTableAulas.getValueAt(i, 3),
                    String.valueOf(modelTableAulas.getValueAt(i, 2)));

            //Verifica se a aula já é uma aula existente no banco, com as definições da tabela SALA, HORARIO e DIA SEMANA
            for (Aula a : aulasNoDiaSemana) {
                if (verificarConflitoHoraEAula(horario, a)) {
                    aula = a;
                    break;
                }
            }
        }

        //Caso nenhuma aula conflitante seja encontrada, ele criará uma nova aula
        if (aula == null) {
            new AulaController().salvar(
                    String.valueOf(modelTableAulas.getValueAt(i, 2)),
                    turma,
                    (Sala) modelTableAulas.getValueAt(i, 3),
                    horario);
        } else {
            //Caso tenha sido encontrada aula conflitante, ele avisa que nao pode ser alocado.
            JOptionPane.showMessageDialog(this, "Aula em: " + aula.getSala() + " às " + aula.getHorario().toString() + " ao " + aula.getDiaSemana() + " já existente!");
            throw new Exception();
        }

    }

    public Horario salvaOuAlteraHorario(int i) throws Exception {

        DefaultTableModel modelTableAulas = (DefaultTableModel) JTableAulas.getModel();

        //Checando se o horario já é um horario existente no banco
        Horario horario = new HorarioController().buscarPorHorarioInicialEFinal(
                Time.valueOf(modelTableAulas.getValueAt(i, 0).toString()),
                Time.valueOf(modelTableAulas.getValueAt(i, 1).toString()));

        if (horario == null) {
            //Caso negativo, cria um novo horario
            new HorarioController().salvar(
                    Time.valueOf(modelTableAulas.getValueAt(i, 0).toString()),
                    Time.valueOf(modelTableAulas.getValueAt(i, 1).toString()));
        } else {
            //Caso positivo, atualiza o horario
            new HorarioController().alterar(horario.getId(), horario.getHorarioInicial(), horario.getHorarioFinal());
        }

        //Busca o horario novo ou alterado, para que ele possa ser utilizado na aula
        horario = new HorarioController().buscarPorHorarioInicialEFinal(
                Time.valueOf(modelTableAulas.getValueAt(i, 0).toString()),
                Time.valueOf(modelTableAulas.getValueAt(i, 1).toString()));

        return horario;
    }

    private void JButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarActionPerformed
        //Variáveis utilizadas para pegar dados da tela
        DefaultTableModel modelTableAulas = (DefaultTableModel) JTableAulas.getModel();
        DefaultComboBoxModel modelDisciplinas = (DefaultComboBoxModel) JComboBoxDisciplina.getModel();
        DefaultComboBoxModel modelCursos = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        DefaultComboBoxModel modelProfessores = (DefaultComboBoxModel) JComboBoxProfessor.getModel();

        if ((JTextNome.getText().equalsIgnoreCase(""))
                || (JComboBoxCurso.getSelectedIndex() <= 0)
                || (JComboBoxDisciplina.getSelectedIndex() <= 0)
                || (JComboBoxProfessor.getSelectedIndex() <= 0)
                || ((int) JSpinnerQuantidadeAlunos.getValue() < 1)
                || (modelTableAulas.getRowCount() <= 0)) {
            JOptionPane.showMessageDialog(this, "Algum campo vazio!");
            return;
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Cadastrar")) {
            Turma turma = null;
            try {
                //Salva a nova turma
                new TurmaController().salvar(JTextNome.getText(),
                        (int) JSpinnerQuantidadeAlunos.getValue(),
                        (Disciplina) modelDisciplinas.getSelectedItem(),
                        (Professor) modelProfessores.getSelectedItem(),
                        (Curso) modelCursos.getSelectedItem());

                //Busca  a nova turma salva
                turma = new TurmaController().buscaTurmaPorNomeEDisciplina(JTextNome.getText(), (Disciplina) modelDisciplinas.getSelectedItem());

                //Remove todas as aulas da turma para que as novas sejam salvas
                List<Aula> aulas = new AulaController().buscaTodosPorTurma(turma);
                for (Aula a : aulas) {
                    new AulaController().excluir(a.getId());
                }

                for (int i = 0; i < modelTableAulas.getRowCount(); i++) {

                    //Salva os horários das aulas
                    Horario horario = salvaOuAlteraHorario(i);

                    //Salva as aulas
                    salvaOuAlteraAula(i, horario, turma);
                }

                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");

            } catch (Exception e) {
                try {
                    //Se houve problemas para cadastrar, exclui a turma
                    new TurmaController().excluir(turma.getId());
                    JOptionPane.showMessageDialog(this, "Problemas no cadastro!");
                    return;
                } catch (Exception ex) {
                    System.out.println("Problema na exclusao após o cadastro!");
                }
            }
        }

        if (JButtonCadastrar.getText().equalsIgnoreCase("Alterar")) {
            if (turmaCorrente == null) {
                JOptionPane.showMessageDialog(this, "Nenhuma turma para ser alterada!");
                return;
            }
            try {
                new TurmaController().alterar(
                        turmaCorrente.getId(),
                        JTextNome.getText(),
                        (int) JSpinnerQuantidadeAlunos.getValue(),
                        (Disciplina) modelDisciplinas.getSelectedItem(),
                        (Professor) modelProfessores.getSelectedItem(),
                        (Curso) modelCursos.getSelectedItem());

                //Remove todas as aulas da turma
                List<Aula> aulas = new AulaController().buscaTodosPorTurma(turmaCorrente);
                for (Aula a : aulas) {
                    new AulaController().excluir(a.getId());
                }

                for (int i = 0; i < modelTableAulas.getRowCount(); i++) {

                    Horario horario = salvaOuAlteraHorario(i);

                    salvaOuAlteraAula(i, horario, turmaCorrente);

                }

                JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
                turmaCorrente = null;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Problemas na alteração");
                return;
            }
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonCadastrarActionPerformed

    private void JButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirActionPerformed
        if (JTablePesquisa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma turma selecionada");
            return;
        }

        try {
            DefaultTableModel model = (DefaultTableModel) JTablePesquisa.getModel();

            Turma turmaSelecionado = (Turma) model.getValueAt(JTablePesquisa.getSelectedRow(), 0);

            new TurmaController().excluir(turmaSelecionado.getId());
            model.removeRow(JTablePesquisa.getSelectedRow());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir turma!");
        }
    }//GEN-LAST:event_JButtonExcluirActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed

        if (JTablePesquisa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma turma selecionada");
            return;
        }

        try {
            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
            Turma turma = (Turma) modelTable.getValueAt(JTablePesquisa.getSelectedRow(), 0);

            this.JTextNome.setText(turma.getNome());
            this.JSpinnerQuantidadeAlunos.setValue(turma.getQuantidadeAlunos());
            this.JComboBoxCurso.setSelectedItem(turma.getCurso());
            this.JComboBoxDisciplina.setSelectedItem(turma.getDisciplina());
            this.JComboBoxProfessor.setSelectedItem(turma.getProfessor());

            DefaultTableModel modelAulas = (DefaultTableModel) JTableAulas.getModel();
            modelAulas.setRowCount(0);

            List<Aula> aulas = new AulaController().buscaTodosPorTurma(turma);
            for (Aula a : aulas) {
                modelAulas.addRow(new Object[]{a.getHorario().getHorarioInicial(), a.getHorario().getHorarioFinal(), a.getDiaSemana(), a.getSala()});
            }

            listaAulasCorrente = aulas;
            turmaCorrente = turma;
            modelTable.removeRow(JTablePesquisa.getSelectedRow());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problema ao alterar turma!");
        }

        definirLayout(EstadoTela.alterando);
    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void JButtonIncluiAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonIncluiAulaActionPerformed
        DefaultComboBoxModel modelDiaSemana = (DefaultComboBoxModel) JComboBoxDiaSemana.getModel();
        DefaultComboBoxModel modelSala = (DefaultComboBoxModel) JComboBoxSala.getModel();

        if ((JComboBoxDiaSemana.getSelectedIndex() <= 0)
                || (JTextHorarioInicial.getText().equalsIgnoreCase(""))
                || (JTextHorarioFinal.getText().equalsIgnoreCase(""))) {
            JOptionPane.showMessageDialog(this, "Por favor, insira os campos de horário e dia semana!");
            return;
        }

        //Cria horario com as definições do horário
        Horario horario = new Horario();
        horario.setHorarioInicial(Time.valueOf(JTextHorarioInicial.getText()));
        horario.setHorarioFinal(Time.valueOf(JTextHorarioFinal.getText()));

        //Cria uma aula com as definições de aula
        Aula aula = new Aula();
        aula.setHorario(horario);
        aula.setDiaSemana(modelDiaSemana.getSelectedItem().toString());
        if (JComboBoxSala.getSelectedIndex() > 0) {
            aula.setSala((Sala) modelSala.getSelectedItem());
        }

        //Retira aula aula dos campos e insere na tabela
        DefaultTableModel modelAulas = (DefaultTableModel) JTableAulas.getModel();
        modelAulas.addRow(new Object[]{aula.getHorario().getHorarioInicial(), aula.getHorario().getHorarioFinal(), aula.getDiaSemana(), aula.getSala()});
    }//GEN-LAST:event_JButtonIncluiAulaActionPerformed

    private void JButtonRemoveAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRemoveAulaActionPerformed
        DefaultComboBoxModel modelDiaSemana = (DefaultComboBoxModel) JComboBoxDiaSemana.getModel();
        DefaultComboBoxModel modelSala = (DefaultComboBoxModel) JComboBoxSala.getModel();
        DefaultTableModel modelAulas = (DefaultTableModel) JTableAulas.getModel();

        if (modelAulas.getRowCount() == 0) {
            return;
        }

        //Cria horario com as definições do horário
        Horario horario = new Horario();
        horario.setHorarioInicial(Time.valueOf(modelAulas.getValueAt(JTableAulas.getSelectedRow(), 0).toString()));
        horario.setHorarioFinal(Time.valueOf(modelAulas.getValueAt(JTableAulas.getSelectedRow(), 1).toString()));

        //Cria uma aula com as definições de aula
        Aula aula = new Aula();
        aula.setHorario(horario);
        aula.setDiaSemana(modelAulas.getValueAt(JTableAulas.getSelectedRow(), 2).toString());
        aula.setSala((Sala) modelAulas.getValueAt(JTableAulas.getSelectedRow(), 3));

        //Retira aula aula da tabela e insire nos respectivos campos
        modelDiaSemana.setSelectedItem(aula.getDiaSemana());
        JTextHorarioInicial.setText(aula.getHorario().getHorarioInicial().toString());
        JTextHorarioFinal.setText(aula.getHorario().getHorarioFinal().toString());
        if (aula.getSala() != null) {
            modelSala.setSelectedItem(aula.getSala());
        }
        modelAulas.removeRow(JTableAulas.getSelectedRow());
    }//GEN-LAST:event_JButtonRemoveAulaActionPerformed

    private void JComboBoxCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxCursoItemStateChanged
        DefaultComboBoxModel modelCurso = (DefaultComboBoxModel) JComboBoxCurso.getModel();

        if (JComboBoxCurso.getSelectedIndex() > 0) {
            preencherComboDisciplina((Curso) modelCurso.getSelectedItem());
        } else {
            preencherComboDisciplina(new Curso());
        }
    }//GEN-LAST:event_JComboBoxCursoItemStateChanged

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed

        DefaultComboBoxModel modelDisciplinas = (DefaultComboBoxModel) JComboBoxDisciplina.getModel();
        DefaultComboBoxModel modelCursos = (DefaultComboBoxModel) JComboBoxCurso.getModel();
        DefaultComboBoxModel modelProfessores = (DefaultComboBoxModel) JComboBoxProfessor.getModel();
        ArrayList<Turma> turmasBuscadas = new ArrayList<>();

        try {
            if ((JTextNome.getText().equalsIgnoreCase(""))
                    && (JComboBoxCurso.getSelectedIndex() <= 0)
                    && (JComboBoxDisciplina.getSelectedIndex() <= 0)
                    && (JComboBoxProfessor.getSelectedIndex() <= 0)) {

                turmasBuscadas = new ArrayList<>(new TurmaController().listaTurmas());

            } else if (!JTextNome.getText().equalsIgnoreCase("") && (JComboBoxDisciplina.getSelectedIndex() >= 0)) {

                turmasBuscadas = new ArrayList<>(new TurmaController().buscaTodasTurmaPorNomeEDisciplina(JTextNome.getText(), (Disciplina) modelDisciplinas.getElementAt(JComboBoxDisciplina.getSelectedIndex())));

            } else if (!JTextNome.getText().equalsIgnoreCase("")) {

                turmasBuscadas = new ArrayList<>(new TurmaController().buscaTodasTurmaPorNome(JTextNome.getText()));

            } else if (JComboBoxCurso.getSelectedIndex() >= 0) {

                turmasBuscadas = new ArrayList<>(new TurmaController().buscaTodasPorCurso((Curso) modelCursos.getElementAt(JComboBoxCurso.getSelectedIndex())));

            } else if (JComboBoxDisciplina.getSelectedIndex() >= 0) {

                turmasBuscadas = new ArrayList<>(new TurmaController().buscaTodasPorDisciplina((Disciplina) modelDisciplinas.getElementAt(JComboBoxDisciplina.getSelectedIndex())));

            } else if (JComboBoxProfessor.getSelectedIndex() >= 0) {

                turmasBuscadas = new ArrayList<>(new TurmaController().buscaTodasPorProfessor((Professor) modelProfessores.getElementAt(JComboBoxProfessor.getSelectedIndex())));

            }
        } catch (Exception ex) {
            Logger.getLogger(JPanelTurmas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        if (turmasBuscadas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma turma encontrada!");
            return;
        }

        DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
        modelTable.setRowCount(0);

        for (Turma t : turmasBuscadas) {
            modelTable.addRow(new Object[]{t, t.getQuantidadeAlunos(), t.getCurso(), t.getDisciplina(), t.getProfessor()});
        }

        definirLayout(EstadoTela.inicial);
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JTextHorarioFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextHorarioFinalKeyReleased
        if (!(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)) {
            JTextHorarioFinal.setText(insereMascaraHorario(JTextHorarioFinal.getText()));
        }
    }//GEN-LAST:event_JTextHorarioFinalKeyReleased

    private void JTextHorarioInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextHorarioInicialKeyReleased
        if (!(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)) {
            JTextHorarioInicial.setText(insereMascaraHorario(JTextHorarioInicial.getText()));
        }
    }//GEN-LAST:event_JTextHorarioInicialKeyReleased

    private void JTextHorarioInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextHorarioInicialFocusLost
        if (JTextHorarioInicial.getText().length() < 8) {
            JTextHorarioInicial.setText(completaHora(JTextHorarioInicial.getText()));
        }
    }//GEN-LAST:event_JTextHorarioInicialFocusLost

    private void JTextHorarioFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextHorarioFinalFocusLost
        if (JTextHorarioFinal.getText().length() < 8) {
            JTextHorarioFinal.setText(completaHora(JTextHorarioFinal.getText()));
        }
    }//GEN-LAST:event_JTextHorarioFinalFocusLost

    private void JSpinnerQuantidadeAlunosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSpinnerQuantidadeAlunosStateChanged
        preencherComboSalas();
    }//GEN-LAST:event_JSpinnerQuantidadeAlunosStateChanged

    private void JButtonExcluirTodasTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExcluirTodasTurmasActionPerformed
        try {
            List<Turma> turmas = new TurmaController().listaTurmas();
            List<Horario> horarios = new HorarioController().listaHorarios();

            for (Turma t : turmas) {
                new TurmaController().excluir(t.getId());
            }

            for (Horario h : horarios) {
                new HorarioController().excluir(h.getId());
            }

            DefaultTableModel modelTable = (DefaultTableModel) JTablePesquisa.getModel();
            modelTable.setRowCount(0);

            JOptionPane.showMessageDialog(this, "Todos registros excluidos!");
            definirLayout(EstadoTela.inicial);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problemas ao excluir todas as turmas e horarios!");
        }
    }//GEN-LAST:event_JButtonExcluirTodasTurmasActionPerformed

    private String completaHora(String texto) {
        while (texto.length() < 8) {
            texto = insereMascaraHorario(texto + "0");
        }
        return texto;
    }

    private String insereMascaraHorario(String texto) {

        if (texto.isEmpty()) {
            return "";
        }

        if (!((texto.charAt(texto.length() - 1) >= 48) && (texto.charAt(texto.length() - 1) <= 57))) {
            texto = texto.substring(0, (texto.length() - 1));
        }

        if (texto.length() == 3) {
            if (texto.charAt(texto.length() - 1) != 58) {
                texto = texto.substring(0, 2) + ":";
            }
        }

        if (texto.length() == 6) {
            if (texto.charAt(texto.length() - 1) != 58) {
                texto = texto.substring(0, 5) + ":";
            }
        }

        if (texto.length() == 2) {
            int hora = Integer.parseInt(texto.substring(0, 2));
            if (hora > 24) {
                texto = "24";
            }
            texto = texto + ":";
        }

        if (texto.length() == 5) {
            int minuto = Integer.parseInt(texto.substring(3, 5));
            if (minuto > 59) {
                texto = texto.substring(0, 3) + "59";
            }
            texto = texto + ":";
        }

        if (texto.length() > 8) {
            int segundo = Integer.parseInt(texto.substring(6, 8));
            if (segundo > 59) {
                texto = texto.substring(0, 6) + "59";
            }
            texto = texto.substring(0, 8);
        }

        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCadastrar;
    private javax.swing.JButton JButtonExcluir;
    private javax.swing.JButton JButtonExcluirTodasTurmas;
    private javax.swing.JButton JButtonIncluiAula;
    private javax.swing.JButton JButtonRemoveAula;
    private javax.swing.JComboBox JComboBoxCurso;
    private javax.swing.JComboBox JComboBoxDiaSemana;
    private javax.swing.JComboBox JComboBoxDisciplina;
    private javax.swing.JComboBox JComboBoxProfessor;
    private javax.swing.JComboBox JComboBoxSala;
    private javax.swing.JSpinner JSpinnerQuantidadeAlunos;
    private javax.swing.JTable JTableAulas;
    private javax.swing.JTable JTablePesquisa;
    private javax.swing.JTextField JTextHorarioFinal;
    private javax.swing.JTextField JTextHorarioInicial;
    private javax.swing.JTextField JTextNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel painelPesquisaCursos;
    // End of variables declaration//GEN-END:variables

    private void configInicial() {
        Color c = new Color(this.getBackground().getRGB());

        this.JButtonAlterar.setBackground(c);
        this.JButtonBuscar.setBackground(c);
        this.JButtonCadastrar.setBackground(c);
        this.JButtonExcluir.setBackground(c);
        this.JButtonExcluirTodasTurmas.setBackground(c);
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
            this.JComboBoxCurso.setSelectedIndex(0);
            this.JComboBoxDisciplina.setSelectedIndex(0);
            this.JComboBoxSala.setSelectedIndex(0);
            this.JComboBoxProfessor.setSelectedIndex(0);
            this.JComboBoxDiaSemana.setSelectedIndex(0);
            this.JTextHorarioInicial.setText("");
            this.JTextHorarioFinal.setText("");
            this.JSpinnerQuantidadeAlunos.setValue(0);

            DefaultTableModel modelTable = (DefaultTableModel) JTableAulas.getModel();
            modelTable.setRowCount(0);
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
            Logger.getLogger(JPanelDisciplinas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        modelCurso.setSelectedItem(mensagem);
    }

    private void preencherComboDisciplina(Curso curso) {
        try {
            DefaultComboBoxModel modelDisciplina = (DefaultComboBoxModel) JComboBoxDisciplina.getModel();
            modelDisciplina.removeAllElements();

            String mensagem = "Preencha com uma disciplina!";
            modelDisciplina.addElement(mensagem);

            List<Disciplina> disciplinas = new DisciplinaController().buscaTodasDisciplinasPorCurso(curso);

            for (Disciplina d : disciplinas) {
                modelDisciplina.addElement(d);
            }

            modelDisciplina.setSelectedItem(mensagem);

        } catch (Exception ex) {
            Logger.getLogger(JPanelTurmas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void preencherComboProfessores() {
        DefaultComboBoxModel modelProfessores = (DefaultComboBoxModel) JComboBoxProfessor.getModel();
        modelProfessores.removeAllElements();

        String mensagem = "Preencha com um professor!";
        modelProfessores.addElement(mensagem);

        try {
            ArrayList<Professor> professoresBuscados = new ArrayList<>(new ProfessorController().listaProfessor());
            for (Professor p : professoresBuscados) {
                modelProfessores.addElement(p);

            }
        } catch (Exception ex) {
            Logger.getLogger(JPanelDisciplinas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        modelProfessores.setSelectedItem(mensagem);
    }

    private void preencherComboDiaSemana() {
        DefaultComboBoxModel modelDiaSemana = (DefaultComboBoxModel) JComboBoxDiaSemana.getModel();
        String mensagem = "Preencha o dia da semana!";
        modelDiaSemana.addElement(mensagem);
        modelDiaSemana.addElement("Segunda");
        modelDiaSemana.addElement("Terça");
        modelDiaSemana.addElement("Quarta");
        modelDiaSemana.addElement("Quinta");
        modelDiaSemana.addElement("Sexta");
        modelDiaSemana.addElement("Sábado");

        modelDiaSemana.setSelectedItem(mensagem);
    }

    private void preencherComboSalas() {
        try {
            DefaultComboBoxModel modelSalas = (DefaultComboBoxModel) JComboBoxSala.getModel();
            modelSalas.removeAllElements();

            String mensagem = "Preenche a sala!";
            modelSalas.addElement(mensagem);

            List<Sala> salas = new SalaController().listaSalas();

            for (Sala s : salas) {
                if (s.getQuantidadeUtil() >= (int) JSpinnerQuantidadeAlunos.getValue()) {
                    modelSalas.addElement(s);
                }
            }

            modelSalas.setSelectedItem(mensagem);

        } catch (Exception ex) {
            Logger.getLogger(JPanelTurmas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

}
