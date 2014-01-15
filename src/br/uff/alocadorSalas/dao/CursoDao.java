package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Curso;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class CursoDao extends GenericoDao<Curso> {

    @Override
    public void salvar(Curso curso) throws Exception {
        super.salvar(curso);
    }

    @Override
    public void alterar(Curso curso) throws Exception {
        super.alterar(curso);
    }

    public void excluir(long id) throws Exception {
        //O excluir precisa ser feito dessa maneira pois a mesma entidade de
        //conexão que busca o curso deve ser utilizada para excluí-lo.
        Curso curso = buscarPorId(id);
        super.excluir(curso);
    }

    public Curso buscarPorNomeESigla(String nome, String sigla) throws Exception {

        Class<Curso> classePersistente = (Class<Curso>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Curso) session.createCriteria(classePersistente).add(
                Restrictions.and(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE),
                        Restrictions.ilike("sigla", sigla, MatchMode.ANYWHERE)
                )).uniqueResult();
    }

    public List<Curso> buscarTodosPorNomeESigla(String nome, String sigla) throws Exception {

        Class<Curso> classePersistente = (Class<Curso>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (List<Curso>) session.createCriteria(classePersistente).add(
                Restrictions.and(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE),
                        Restrictions.ilike("sigla", sigla, MatchMode.ANYWHERE)
                )).list();
    }

}
