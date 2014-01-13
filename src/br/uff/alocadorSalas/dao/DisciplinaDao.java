/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Disciplina;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Evandro
 */
public class DisciplinaDao extends GenericDao<Disciplina> {
 
    public void salvar(Disciplina disciplina) {
        save(disciplina);
    }
 
    public void alterar(Disciplina disciplina) {
        update(disciplina);
    }
 
    public void excluir(long id) {
        Disciplina disciplina = findById(id);
        delete(disciplina);
    }
 
    public Disciplina buscarPorNomeECurso(String nome, Curso curso) {

        Class<Disciplina> persistent = (Class<Disciplina>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Disciplina) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE), Restrictions.eq("curso.id", curso.getId()))).uniqueResult();
    }
    
    public List<Disciplina> buscarTodosPorNomeECurso(String nome, Curso curso) {

        Class<Disciplina> persistent = (Class<Disciplina>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (List<Disciplina>) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE), Restrictions.eq("curso.id", curso.getId()))).list();
    }
    
}