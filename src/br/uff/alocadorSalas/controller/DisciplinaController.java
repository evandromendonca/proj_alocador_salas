package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.DisciplinaDao;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Disciplina;
import java.util.List;

public class DisciplinaController {

    public void salvar(String nome, int periodo, Curso curso, String codigo) throws Exception {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setPeriodoAssociado(periodo);
        disciplina.setCurso(curso);
        disciplina.setCodigo(codigo);

        new DisciplinaDao().salvar(disciplina);
    }

    public void alterar(long id, String nome, int periodo, Curso curso, String codigo) throws Exception {
        Disciplina disciplina = new Disciplina();
        disciplina.setId(id);
        disciplina.setNome(nome);
        disciplina.setPeriodoAssociado(periodo);
        disciplina.setCurso(curso);
        disciplina.setCodigo(codigo);

        new DisciplinaDao().alterar(disciplina);
    }

    public void excluir(long id) throws Exception {
        new DisciplinaDao().excluir(id);
    }

    public Disciplina buscaDisciplinaPorNome(String nome) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarPorNome(nome);
    }

    public Disciplina buscaDisciplinaPorCurso(Curso curso) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarPorAtributo("curso.id", curso.getId());
    }

    public Disciplina buscarDisciplinaPorCodigo(String codigo) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarPorAtributo("codigo", codigo);
    }

    public Disciplina buscaDisciplinaPorNomeECurso(String nome, Curso curso) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarPorNomeECurso(nome, curso);
    }

    public List<Disciplina> listaDisciplinas() throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarTodos();
    }

    public List<Disciplina> buscaTodasDisciplinasPorNome(String nome) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarTodosPorNome(nome);
    }

    public List<Disciplina> buscaTodasDisciplinasPorCurso(Curso curso) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarTodosPorAtributo("curso.id", curso.getId());
    }

    public List<Disciplina> buscaTodasDisciplinasPorCodigo(String codigo) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarTodosPorAtributo("codigo", codigo);
    }

    public List<Disciplina> buscaTodasDisciplinasPorNomeECurso(String nome, Curso curso) throws Exception {
        DisciplinaDao dao = new DisciplinaDao();
        return dao.buscarTodosPorNomeECurso(nome, curso);
    }

}
