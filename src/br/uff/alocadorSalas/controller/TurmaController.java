package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.TurmaDao;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Disciplina;
import br.uff.alocadorSalas.model.Professor;
import br.uff.alocadorSalas.model.Turma;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class TurmaController {

    public void salvar(String nome, int quantidadeAlunos, Disciplina disciplina, Professor professor, Curso curso) throws Exception {
        Turma turma = new Turma();
        turma.setNome(nome);
        turma.setQuantidadeAlunos(quantidadeAlunos);
        turma.setDisciplina(disciplina);
        turma.setProfessor(professor);
        turma.setCurso(curso);

        new TurmaDao().salvar(turma);
    }

    public void alterar(long id, String nome, int quantidadeAlunos, Disciplina disciplina, Professor professor, Curso curso) throws Exception {
        Turma turma = new Turma();
        turma.setId(id);
        turma.setNome(nome);
        turma.setQuantidadeAlunos(quantidadeAlunos);
        turma.setDisciplina(disciplina);
        turma.setProfessor(professor);
        turma.setCurso(curso);

        new TurmaDao().alterar(turma);
    }

    public void excluir(long id) throws Exception {
        new TurmaDao().excluir(id);
    }

    public Turma buscaTurmaPorNome(String nome) throws Exception {
        TurmaDao dao = new TurmaDao();
        return dao.buscarPorNome(nome);
    }

    public Turma buscaTurmaPorNomeEDisciplina(String nome, Disciplina disciplina) throws Exception {
        TurmaDao dao = new TurmaDao();
        return dao.buscarPorNomeESigla(nome, disciplina);
    }

    public List<Turma> buscaTodasTurmaPorNome(String nome) throws Exception {
        TurmaDao dao = new TurmaDao();
        return dao.buscarTodosPorNome(nome);
    }

    public List<Turma> buscaTodasPorDisciplina(Disciplina disciplina) {
        TurmaDao dao = new TurmaDao();
        try {
            return dao.buscarTodosPorAtributo("disciplina.id", disciplina.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar turmas por disciplina" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Turma> buscaTodasPorCurso(Curso curso) {
        TurmaDao dao = new TurmaDao();
        try {
            return dao.buscarTodosPorAtributo("curso.id", curso.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar turmas por curso" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Turma> buscaTodasPorProfessor(Professor professor) {
        TurmaDao dao = new TurmaDao();
        try {
            return dao.buscarTodosPorAtributo("professor.id", professor.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar turmas por professor" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Turma> buscaTodasTurmaPorNomeEDisciplina(String nome, Disciplina disciplina) throws Exception {
        TurmaDao dao = new TurmaDao();
        return dao.buscarTodasPorNomeESigla(nome, disciplina);
    }

    public List<Turma> listaTurmas() throws Exception {
        TurmaDao dao = new TurmaDao();
        try {
            return dao.buscarTodos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar turmas" + e.getLocalizedMessage());
        }
        return null;
    }

}
