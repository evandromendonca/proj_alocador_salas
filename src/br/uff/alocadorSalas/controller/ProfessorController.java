package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.ProfessorDao;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Professor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfessorController {

    public void salvar(String nome, Curso curso) throws Exception {
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setCurso(curso);

        new ProfessorDao().salvar(professor);
    }

    public void alterar(long id, String nome, Curso curso) throws Exception {
        Professor professor = new Professor();
        professor.setId(id);
        professor.setNome(nome);
        professor.setCurso(curso);

        new ProfessorDao().alterar(professor);
    }

    public List<Professor> listaProfessors() throws Exception {
        ProfessorDao dao = new ProfessorDao();
        try {
            return dao.findAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar professores" + e.getLocalizedMessage());
        }
        return null;
    }

    public void excluir(long id) throws Exception {
        new ProfessorDao().excluir(id);
    }

    public Professor buscaProfessorPorNome(String nome) throws Exception {
        ProfessorDao dao = new ProfessorDao();
        return dao.findByName(nome);
    }
}
