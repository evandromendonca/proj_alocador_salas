package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.AulaDao;
import br.uff.alocadorSalas.model.Aula;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import br.uff.alocadorSalas.model.Turma;
import java.util.List;
import javax.swing.JOptionPane;

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

        new AulaDao().salvar(aula);
    }

    public void excluir(long id) throws Exception {
        new AulaDao().excluir(id);
    }
    
    public Aula buscarPorSalaHorarioeDiaSemana(Sala s, Horario h, String diaSemana) throws Exception {
        AulaDao dao = new AulaDao();
        try {
            return dao.buscarPorSalaHorarioEDiaSemana(s, h, diaSemana);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar aulas!" + e.getLocalizedMessage());
        }
        return null;
    }

    public List<Aula> buscaTodosPorTurma(Turma turma) {
        AulaDao dao = new AulaDao();
        try {
            return dao.buscarTodosPorAtributo("turma.id", turma.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar horarios" + e.getLocalizedMessage());
        }
        return null;
    }
    
}
