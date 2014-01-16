package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.HorarioDao;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import br.uff.alocadorSalas.model.Turma;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class HorarioController {

    public void salvar(Long horarioInicial, Long horarioFinal) throws Exception {
        Horario horario = new Horario();
        horario.setHorarioInicial(horarioInicial);
        horario.setHorarioFinal(horarioFinal);

        new HorarioDao().salvar(horario);
    }

    public void alterar(long id, Long horarioInicial, Long horarioFinal) throws Exception {
        Horario horario = new Horario();
        horario.setId(id);
        horario.setHorarioInicial(horarioInicial);
        horario.setHorarioFinal(horarioFinal);

        new HorarioDao().alterar(horario);
    }

    public void excluir(long id) throws Exception {
        new HorarioDao().excluir(id);
    }

    public List<Horario> listaHorarios() throws Exception {
        HorarioDao dao = new HorarioDao();
        try {
            return dao.buscarTodos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar horarios" + e.getLocalizedMessage());
        }
        return null;
    }

    public Horario buscarPorHorarioInicialEFinal(Long horarioInicial, Long horarioFinal) {
        HorarioDao dao = new HorarioDao();
        try {
            return dao.buscarPorHorarioInicialEFinal(horarioInicial, horarioFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar horarios" + e.getLocalizedMessage());
        }
        return null;
    }

}
