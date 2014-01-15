package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.CursoDao;
import br.uff.alocadorSalas.model.Curso;
import java.util.List;

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

    public Curso buscaCursoPorId(Long id) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarPorId(id);
    }

    public Curso buscaCursoPorNome(String nome) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarPorNome(nome);
    }

    public Curso buscaCursoPorSigla(String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarPorAtributo("sigla", sigla);
    }

    public Curso buscaPorNomeESigla(String nome, String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarPorNomeESigla(nome, sigla);
    }

    public List<Curso> listaCursos() throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarTodos();
    }

    public List<Curso> buscaTodosPorNomeESigla(String nome, String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarTodosPorNomeESigla(nome, sigla);
    }

    public List<Curso> buscaTodosCursoPorNome(String nome) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarTodosPorNome(nome);
    }

    public List<Curso> buscaTodosCursoPorSigla(String sigla) throws Exception {
        CursoDao dao = new CursoDao();
        return dao.buscarTodosPorAtributo("sigla", sigla);
    }

}
