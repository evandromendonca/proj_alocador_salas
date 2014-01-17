package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.AulaDao;
import br.uff.alocadorSalas.model.Aula;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import br.uff.alocadorSalas.model.Turma;
import java.util.List;

public class AulaController {

    public void salvar(String diaSemana, Turma turma, Sala sala, Horario horario) throws Exception {
        Aula aula = new Aula();
        aula.setDiaSemana(diaSemana);
        aula.setHorario(horario);
        aula.setSala(sala);
        aula.setTurma(turma);

        new AulaDao().salvar(aula);
    }

    public void alterar(long id, String diaSemana, Turma turma, Sala sala, Horario horario) throws Exception {
        Aula aula = new Aula();
        aula.setId(id);
        aula.setDiaSemana(diaSemana);
        aula.setHorario(horario);
        aula.setSala(sala);
        aula.setTurma(turma);

        new AulaDao().alterar(aula);
    }

    public void excluir(long id) throws Exception {
        new AulaDao().excluir(id);
    }

    public Aula buscarPorSalaHorarioeDiaSemana(Sala s, Horario h, String diaSemana) throws Exception {
        AulaDao dao = new AulaDao();
        return dao.buscarPorSalaHorarioEDiaSemana(s, h, diaSemana);
    }

    public List<Aula> buscaTodosPorTurma(Turma turma) throws Exception {
        AulaDao dao = new AulaDao();
        return dao.buscarTodosPorAtributo("turma.id", turma.getId());
    }
    
    public List<Aula> buscaTodasSemSala() throws Exception {
        AulaDao dao = new AulaDao();
        return dao.buscarTodosSemSala();
    }

    public List<Aula> listaAulas() throws Exception {
        AulaDao dao = new AulaDao();
        return dao.buscarTodos();
    }
    
    public List<Aula> buscaTodosPorHorarioEDiaSemana(Horario horario, String diaSemana) {
        AulaDao dao = new AulaDao();
        return dao.buscaTodosPorHorarioInicialEDiaSemana(horario, diaSemana);
    }
    
}
