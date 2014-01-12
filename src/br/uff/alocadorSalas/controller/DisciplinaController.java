package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.DisciplinaDao;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Disciplina;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
 
public class DisciplinaController {
 
    public void salvar(String nome, int periodo, Curso curso) throws Exception {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);                
        disciplina.setCurso(curso);
        
        new DisciplinaDao().salvar(disciplina);
    }
 
    public void alterar(long id, String nome, Curso curso) throws Exception {
        Disciplina disciplina = new Disciplina();
        disciplina.setId(id);
        disciplina.setNome(nome);        
        disciplina.setCurso(curso);
 
        new DisciplinaDao().alterar(disciplina);
    }
 
    public List<Disciplina> listaDisciplinas() throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        try {
            return dao.findAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar disciplinas" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public void excluir(long id) throws Exception {
        new DisciplinaDao().excluir(id);
    }
 
    public Disciplina buscaDisciplinaPorNome(String nome) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.findByName(nome);
    }
}