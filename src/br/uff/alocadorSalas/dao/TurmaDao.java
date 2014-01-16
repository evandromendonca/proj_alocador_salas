package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Disciplina;
import br.uff.alocadorSalas.model.Turma;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class TurmaDao extends GenericoDao<Turma> {

    @Override
    public void salvar(Turma turma) throws Exception {
        super.salvar(turma);
    }

    @Override
    public void alterar(Turma turma) throws Exception {
        super.alterar(turma);
    }

    public void excluir(String nome, Disciplina disciplina) throws Exception {
        Turma turma = buscarPorNomeEDisciplina(nome, disciplina);
        super.excluir(turma);
    }
    
    public Turma buscarPorNomeEDisciplina(String nome, Disciplina disciplina) {

        Class<Turma> persistent = (Class<Turma>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (Turma) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.eq("nome", nome),
                        Restrictions.eq("disciplina.id", disciplina.getId())
                )).uniqueResult();
    }

    public List<Turma> buscarTodasPorNomeEDisciplina(String nome, Disciplina disciplina) {

        Class<Turma> persistent = (Class<Turma>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Session session = (Session) getEntityManager().getDelegate();

        return (List<Turma>) session.createCriteria(persistent).add(
                Restrictions.and(Restrictions.eq("nome", nome),
                        Restrictions.eq("disciplina.id", disciplina.getId())
                )).list();
    }
    
}
