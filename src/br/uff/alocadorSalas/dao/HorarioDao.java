package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Horario;

public class HorarioDao extends GenericDao<Horario> {

    public void salvar(Horario horario) {
        save(horario);
    }

    public void alterar(Horario horario) {
        update(horario);
    }

    public void excluir(long id) {
        Horario horario = findById(id);
        delete(horario);
    }

}
