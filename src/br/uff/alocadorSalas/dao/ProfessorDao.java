package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Professor;

public class ProfessorDao extends GenericDao<Professor> {
    
    public void salvar(Professor professor) {
        save(professor);
    }
 
    public void alterar(Professor professor) {
        update(professor);
    }
 
    public void excluir(long id) {
        Professor professor = findById(id);
        delete(professor);
    }
    
}
