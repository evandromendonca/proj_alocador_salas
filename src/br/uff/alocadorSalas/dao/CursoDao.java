package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Curso;

public class CursoDao extends GenericDao<Curso> {
 
    public void salvar(Curso curso) {
        save(curso);
    }
 
    public void alterar(Curso curso) {
        update(curso);
    }
 
    public void excluir(long id) {
        Curso curso = findById(id);
        delete(curso);
    }
 
}