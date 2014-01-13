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

public class GenericDao<T extends Serializable> {

    @PersistenceContext(unitName = "ProjetoFinalPU")
    private final EntityManager entityManager;
    private final Class<T> persistentClass;

    public GenericDao() {
        this.entityManager = EntityManagerUtil.getEntityManager();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected void save(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().persist(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        }
    }

    protected void update(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().merge(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        }
    }

    protected void delete(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().remove(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        }// finally {
        //   close();
        //}
    }

    public T findById(long id) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(persistentClass)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }

    public T findByName(String nome) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(persistentClass)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }

    public T findByAttribute(String attributeType, String attribute) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(persistentClass)
                .add(Restrictions.eq(attributeType, attribute)).uniqueResult();
    }
    
    public T findByAttribute(String attributeType, Object attribute) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(persistentClass)
                .add(Restrictions.eq(attributeType, attribute)).uniqueResult();
    }

    public List<T> findAll() throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return session.createCriteria(persistentClass).list();
    }

    public List<T> findAllByName(String nome) {
        Session session = (Session) getEntityManager().getDelegate();
        return (List<T>) session.createCriteria(persistentClass)
                .add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();
    }

    public List<T> findAllByAttribute(String attributeType, String attribute) {
        Session session = (Session) getEntityManager().getDelegate();
        return (List<T>) session.createCriteria(persistentClass)
                .add(Restrictions.ilike(attributeType, attribute, MatchMode.ANYWHERE)).list();
    }
    
    public List<T> findAllByAttribute(String attributeType, Object attribute) {
        Session session = (Session) getEntityManager().getDelegate();
        return (List<T>) session.createCriteria(persistentClass)
                .add(Restrictions.eq(attributeType, attribute)).list();
    }

    private void close() {
        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
    }

}
