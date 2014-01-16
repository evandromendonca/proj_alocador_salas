package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Aula;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class AulaDao extends GenericoDao<Aula> {

    @Override
    public void salvar(Aula aula) throws Exception {
        super.salvar(aula);
    }

    @Override
    public void alterar(Aula aula) throws Exception {
        super.alterar(aula);
    }

    public void excluir(Long id) throws Exception {
        Aula aula = buscarPorId(id);
        super.excluir(aula);
    }

    public Aula buscarPorSalaHorarioEDiaSemana(Sala sala, Horario horario, String diaSemana) {
        Class<Aula> persistent = (Class<Aula>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Aula) session.createCriteria(persistent)
                .add(Restrictions.and(
                                Restrictions.eq("sala.id", sala.getId()),
                                Restrictions.and(
                                        Restrictions.eq("horario.id", horario.getId()),
                                        Restrictions.eq("diaSemana", diaSemana)
                                )
                        )
                ).uniqueResult();
    }
}
