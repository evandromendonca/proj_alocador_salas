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

    public void excluir(long id) throws Exception {
        new CursoDao().excluir(id);
    }

    public Curso buscaCursoPorNome(String nome) throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.findByName(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos por nome" + e.getLocalizedMessage());
        }
        return null;
    }

    public Curso buscaCursoPorSigla(String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.findByAttribute("sigla", sigla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos por sigla" + e.getLocalizedMessage());
        }
        return null;
    }

    public Curso buscaPorNomeESigla(String nome, String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.buscarPorNomeESigla(nome, sigla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos por nome e sigla" + e.getLocalizedMessage());
        }
        return null;
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

    public List<Curso> buscaTodosPorNomeESigla(String nome, String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.buscarTodosPorNomeESigla(nome, sigla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos por nome e sigla" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Curso> buscaTodosCursoPorNome(String nome) throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.findAllByName(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos por nome" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Curso> buscaTodosCursoPorSigla(String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        try {
            return dao.findAllByAttribute("sigla", sigla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar cursos por sigla" + e.getLocalizedMessage());
        }
        return null;
    }
    
}
