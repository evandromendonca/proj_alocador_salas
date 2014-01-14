package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

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
    
    public List<Horario> buscaTodosPorHorarioEDiaSemana(String horario, String diaSemana, Sala sala) {
        Class<Horario> persistent = (Class<Horario>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();
                
        return (List<Horario>) session.createCriteria(persistent)
                .add(Restrictions.and(
                        Restrictions.ilike("horarioInicial", horario, MatchMode.ANYWHERE),
                        Restrictions.and(
                                Restrictions.eq("diaSemana", diaSemana),
                                Restrictions.eq("sala.id", sala.getId())
                        )
                )).list();
    }
}
