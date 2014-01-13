package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Disciplina;
import br.uff.alocadorSalas.model.Turma;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
    
    public Turma buscarPorNomeESigla(String nome, Disciplina disciplina) {

        Class<Turma> persistent = (Class<Turma>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Turma) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.eq("nome", nome),
                        Restrictions.eq("disciplina.id", disciplina.getId())
                )).uniqueResult();
    }

    public List<Turma> buscarTodasPorNomeESigla(String nome, Disciplina disciplina) {

        Class<Turma> persistent = (Class<Turma>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (List<Turma>) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.eq("nome", nome),
                        Restrictions.eq("disciplina.id", disciplina.getId())
                )).list();
    }
    
}
