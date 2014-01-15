package br.uff.alocadorSalas.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.criterion.MatchMode;

public class GenericoDao<T extends Serializable> {

    @PersistenceContext(unitName = "ProjetoFinalPU")
    private final EntityManager entityManager;
    private final Class<T> classePersistente;

    public GenericoDao() {
        this.entityManager = EntityManagerUtil.getEntityManager();
        this.classePersistente = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected void salvar(T entidade) throws Exception {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().persist(entidade);
            tx.commit();
        } catch (Throwable t) {
            tx.rollback();
            throw t;
        }
    }

    protected void alterar(T entidade) throws Exception {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().merge(entidade);
            tx.commit();
        } catch (Throwable t) {
            tx.rollback();
            throw t;
        }
    }

    protected void excluir(T entidade) throws Exception {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().remove(entidade);
            tx.commit();
        } catch (Throwable t) {
            tx.rollback();
            throw t;
        }
    }

    public T buscarPorId(long id) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(classePersistente)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }

    public T buscarPorNome(String nome) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(classePersistente)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }

    public T buscarPorAtributo(String tipoAtributo, String atributo) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(classePersistente)
                .add(Restrictions.eq(tipoAtributo, atributo)).uniqueResult();
    }

    public T buscarPorAtributo(String tipoAtributo, Object atributo) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(classePersistente)
                .add(Restrictions.eq(tipoAtributo, atributo)).uniqueResult();
    }

    public List<T> buscarTodos() throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return session.createCriteria(classePersistente).list();
    }

    public List<T> buscarTodosPorNome(String nome) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (List<T>) session.createCriteria(classePersistente)
                .add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();
    }

    public List<T> buscarTodosPorAtributo(String tipoAtributo, String atributo) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (List<T>) session.createCriteria(classePersistente)
                .add(Restrictions.ilike(tipoAtributo, atributo, MatchMode.ANYWHERE)).list();
    }

    public List<T> buscarTodosPorAtributo(String tipoAtributo, Object atributo) throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return (List<T>) session.createCriteria(classePersistente)
                .add(Restrictions.eq(tipoAtributo, atributo)).list();
    }

    public static void close(EntityManager em) {
        if (em != null) {
            em.close();
        }
    }

}
