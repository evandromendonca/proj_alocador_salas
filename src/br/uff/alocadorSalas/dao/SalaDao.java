package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Sala;

public class SalaDao extends GenericoDao<Sala> {

    @Override
    public void salvar(Sala sala) throws Exception {
        super.salvar(sala);
    }

    @Override
    public void alterar(Sala sala) throws Exception {
        super.alterar(sala);
    }

    public void excluir(long id) throws Exception {
        Sala sala = buscarPorId(id);
        super.excluir(sala);
    }

}
