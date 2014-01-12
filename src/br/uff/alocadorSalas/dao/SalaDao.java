package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Sala;

public class SalaDao extends GenericDao<Sala> {

    public void salvar(Sala sala) {
        save(sala);
    }

    public void alterar(Sala sala) {
        update(sala);
    }

    public void excluir(long id) {
        Sala sala = findById(id);
        delete(sala);
    }

}