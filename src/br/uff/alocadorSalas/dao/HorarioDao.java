package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Horario;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class HorarioDao extends GenericoDao<Horario> {

    @Override
    public void salvar(Horario horario) throws Exception {
        super.salvar(horario);
    }

    @Override
    public void alterar(Horario horario) throws Exception {
        super.alterar(horario);
    }

    public void excluir(Long id) throws Exception {
        Horario horario = buscarPorId(id);
        super.excluir(horario);
    }

    public Horario buscarPorHorarioInicialEFinal(Long horarioInicial, Long horarioFinal) {
        Class<Horario> persistent = (Class<Horario>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Horario) session.createCriteria(persistent)
                .add(Restrictions.and(
                                Restrictions.eq("horarioInicial", horarioInicial),
                                Restrictions.eq("horarioFinal", horarioFinal)
                        )
                ).uniqueResult();
    }
}
