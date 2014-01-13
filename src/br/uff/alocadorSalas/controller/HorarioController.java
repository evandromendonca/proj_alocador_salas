package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.HorarioDao;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import br.uff.alocadorSalas.model.Turma;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class HorarioController {

    public void salvar(String horarioInicial, String horarioFinal, String diaSemanha, Sala sala, Turma turma) throws Exception {
        Horario horario = new Horario();
        horario.setHorarioInicial(horarioInicial);
        horario.setHorarioFinal(horarioFinal);
        horario.setDiaSemana(diaSemanha);
        horario.setSala(sala);
        horario.setTurma(turma);

        new HorarioDao().salvar(horario);
    }

    public void alterar(long id, String horarioInicial, String horarioFinal, String diaSemanha, Sala sala, Turma turma) throws Exception {
        Horario horario = new Horario();
        horario.setId(id);
        horario.setHorarioInicial(horarioInicial);
        horario.setHorarioFinal(horarioFinal);
        horario.setDiaSemana(diaSemanha);
        horario.setSala(sala);
        horario.setTurma(turma);

        new HorarioDao().alterar(horario);
    }    

    public void excluir(long id) throws Exception {
        new HorarioDao().excluir(id);
    }
    
    public List<Horario> listaHorarios() throws Exception {
        HorarioDao dao = new HorarioDao();
        try {
            return dao.findAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar horarios" + e.getLocalizedMessage());
        }
        return null;
    }
    
    public List<Horario> buscaTodosPorTurma(Turma turma) {
        HorarioDao dao = new HorarioDao();
        try {
            return dao.findAllByAttribute("turma.id", turma.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar horarios" + e.getLocalizedMessage());
        }
        return null;
    }

}
