/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.alocador;

import br.uff.alocadorSalas.controller.HorarioController;
import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.controller.TurmaController;
import br.uff.alocadorSalas.model.Disciplina;
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
    
    public void alocarDinamicamente(){
        try {
            List<Turma> turma = new TurmaController().listaTurmas();
            Collections.sort(turma);
            Collections.reverse(turma);
            List<Sala> sala = new SalaController().listaSalas();
            Collections.sort(sala);
            Collections.reverse(sala);
            List<Horario> horario = new HorarioController().listaHorarios();
            
            
            ArrayList<Time> horarios = new ArrayList<>();
            
            for(Horario h : horario){
                if(!horarios.contains(Time.valueOf(h.getHorarioInicial()+":00")))
                    horarios.add(Time.valueOf(h.getHorarioInicial()+":00"));
                if(!horarios.contains(Time.valueOf(h.getHorarioFinal()+":00")))
                    horarios.add(Time.valueOf(h.getHorarioFinal()+":00"));
            }
            Collections.sort(horarios);
            
            
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(AlocadorSala.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
