package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.TurmaDao;
import br.uff.alocadorSalas.model.Disciplina;
import br.uff.alocadorSalas.model.Professor;
import br.uff.alocadorSalas.model.Turma;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
 
public class TurmaController {
 
    public void salvar(String nome, int quantidadeAlunos, Disciplina disciplina, Professor professor) throws Exception {
        Turma turma = new Turma();
        turma.setNome(nome);                
        turma.setQuantidadeAlunos(quantidadeAlunos);
        turma.setDisciplina(disciplina);
        turma.setProfessor(professor);
        
        new TurmaDao().salvar(turma);
    }
 
    public void alterar(long id, String nome, int quantidadeAlunos, Disciplina disciplina, Professor professor) throws Exception {
        Turma turma = new Turma();
        turma.setId(id);
        turma.setNome(nome);                
        turma.setQuantidadeAlunos(quantidadeAlunos);
        turma.setDisciplina(disciplina);
        turma.setProfessor(professor);
        
        new TurmaDao().salvar(turma);
    }
 
    public List<Turma> listaTurmas() throws Exception {
        TurmaDao dao = new TurmaDao();
        try {
            return dao.findAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar turmas" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public void excluir(long id) throws Exception {
        new TurmaDao().excluir(id);
    }
 
    public Turma buscaTurmaPorNome(String nome) throws Exception {
        TurmaDao dao = new TurmaDao();
        return dao.findByName(nome);
    }
}