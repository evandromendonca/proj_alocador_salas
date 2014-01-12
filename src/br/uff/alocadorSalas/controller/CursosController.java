package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.CursoDao;
import br.uff.alocadorSalas.model.Curso;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
 
public class CursosController {
 
    public void salvar(String nome, String sigla, int quantidadePeriodos) throws Exception {
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setSigla(sigla);
        curso.setQuantidadePeriodos(quantidadePeriodos);
        
        new CursoDao().salvar(curso);
    }
 
    public void alterar(long id, String nome, String sigla, int quantidadePeriodos) throws Exception {
        Curso curso = new Curso();
        curso.setId(id);
        curso.setNome(nome);
        curso.setSigla(sigla);
        curso.setQuantidadePeriodos(quantidadePeriodos);
 
        new CursoDao().alterar(curso);
    }
 
    public List<Curso> listaCursos() throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.findAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos" + e.getLocalizedMessage());
        }
        return null;
    }
 
    public void excluir(long id) throws Exception {
        new CursoDao().excluir(id);
    }
 
    public Curso buscaCursoPorNome(String nome) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.findByName(nome);
    }
}