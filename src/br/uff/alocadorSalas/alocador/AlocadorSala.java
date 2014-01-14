/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.alocador;

import br.uff.alocadorSalas.controller.HorarioController;
import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.controller.TurmaController;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import br.uff.alocadorSalas.model.Turma;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mare
 */
public class AlocadorSala {
    
    ArrayList<Horario> aulasNaoAlocadas = new ArrayList<>();
    
    public void alocarDinamicamente() {
        try {            
            List<Sala> sala = new SalaController().listaSalas();
            Collections.sort(sala);
            Collections.reverse(sala);
 
            List<Horario> horario = new HorarioController().listaHorarios();
            ArrayList<Time> horarios = new ArrayList<>();
            for (Horario h : horario) {
                if (!horarios.contains(Time.valueOf(h.getHorarioInicial() + ":00"))) {
                    horarios.add(Time.valueOf(h.getHorarioInicial() + ":00"));
                }
                if (!horarios.contains(Time.valueOf(h.getHorarioFinal() + ":00"))) {
                    horarios.add(Time.valueOf(h.getHorarioFinal() + ":00"));
                }
            }
            Collections.sort(horarios);

            ArrayList<String> diaSemana = new ArrayList<>();
            diaSemana.add("Segunda");
            diaSemana.add("Terça");
            diaSemana.add("Quarta");
            diaSemana.add("Quinta");
            diaSemana.add("Sexta");
            diaSemana.add("Sábado");
            for (String dia : diaSemana) {
                for (Time hora : horarios) {
                    for (Horario aula : new HorarioController().buscaTodosPorHorarioEDiaSemana(hora.toString(), dia, new Sala())) {                        
                        for (Sala s : sala) {
                            if (aula.getTurma().getQuantidadeAlunos() <= s.getQuantidadeUtil()) {
                                if (comparaHorariosSala(s, aula)) {
                                    aula.setSala(s);
                                    break;
                                }
                            }
                        }
                        aulasNaoAlocadas.add(aula);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AlocadorSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean comparaHorariosSala(Sala s, Horario h) {
        Time horaInicial = Time.valueOf(h.getHorarioInicial() + ":00");
        Time horaFinal = Time.valueOf(h.getHorarioFinal() + ":00");

        for (Horario horarioSala : s.getHorarios()) {
            Time horaSalaInicial = Time.valueOf(horarioSala.getHorarioInicial() + ":00");
            Time horaSalaFinal = Time.valueOf(horarioSala.getHorarioFinal() + ":00");
            if ((horaInicial.getTime() < horaSalaFinal.getTime()) && (horaFinal.getTime() > horaSalaInicial.getTime()) && (horarioSala.getDiaSemana().equals(h.getDiaSemana()))) {
                return false;
            }
        }
        return true;
    }
}
