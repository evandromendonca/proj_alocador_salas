package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Professor;

public class ProfessorDao extends GenericoDao<Professor> {
    
    public void salvar(Professor professor) {
        salvar(professor);
    }
 
    public void alterar(Professor professor) {
        alterar(professor);
    }
 
    public void excluir(long id) {
        Professor professor = buscarPorId(id);
        excluir(professor);
    }
    
}
