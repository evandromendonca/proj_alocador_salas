package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Professor;

public class ProfessorDao extends GenericoDao<Professor> {

    @Override
    public void salvar(Professor professor) throws Exception {
        super.salvar(professor);
    }

    @Override
    public void alterar(Professor professor) throws Exception {
        super.alterar(professor);
    }

    public void excluir(long id) throws Exception {
        Professor professor = buscarPorId(id);
        super.excluir(professor);
    }

}
