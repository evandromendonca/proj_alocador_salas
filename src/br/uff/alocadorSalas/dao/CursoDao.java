package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Curso;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class CursoDao extends GenericDao<Curso> {

    public void salvar(Curso curso) {
        save(curso);
    }

    public void alterar(Curso curso) {
        update(curso);
    }

    public void excluir(long id) {
        Curso curso = findById(id);
        delete(curso);
    }

    public Curso buscarPorNomeESigla(String nome, String sigla) {

        Class<Curso> persistent = (Class<Curso>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Curso) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE),
                        Restrictions.ilike("sigla", sigla, MatchMode.ANYWHERE)
                )).uniqueResult();
    }

    public List<Curso> buscarTodosPorNomeESigla(String nome, String sigla) {

        Class<Curso> persistent = (Class<Curso>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (List<Curso>) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE),
                        Restrictions.ilike("sigla", sigla, MatchMode.ANYWHERE)
                )).list();
    }

}
