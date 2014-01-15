package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Sala;

public class SalaDao extends GenericoDao<Sala> {

    public void salvar(Sala sala) {
        salvar(sala);
    }

    public void alterar(Sala sala) {
        alterar(sala);
    }

    public void excluir(long id) {
        Sala sala = buscarPorId(id);
        excluir(sala);
    }

}