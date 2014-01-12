package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Turma;

public class TurmaDao extends GenericDao<Turma> {

    public void salvar(Turma turma) {
        save(turma);
    }

    public void alterar(Turma turma) {
        update(turma);
    }

    public void excluir(long id) {
        Turma turma = findById(id);
        delete(turma);
    }

}
