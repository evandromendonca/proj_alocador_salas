/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.alocador;

import br.uff.alocadorSalas.controller.AulaController;
import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.model.Aula;
import br.uff.alocadorSalas.model.Sala;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mare
 */
public class AlocadorSala {

    public void alocarSalas() {
        try {

            ArrayList<Aula> aulasSemSala = (ArrayList<Aula>) new AulaController().buscaTodasSemSala();
            ArrayList<Sala> salas = (ArrayList<Sala>) new SalaController().listaSalas();

            for (Aula aula : aulasSemSala) {
                for (Sala sala : salas) {
                    if (aulaCabeEmSala(aula, sala)) {
                        aula.setSala(sala);
                        new AulaController().alterar(aula.getId(), aula.getDiaSemana(), aula.getTurma(), aula.getSala(), aula.getHorario());
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas na alocação dinâmica");
        }
    }

    public boolean aulaCabeEmSala(Aula aula, Sala s) {

        ArrayList<Aula> aulasDaSala = (ArrayList<Aula>) s.getAulas();

        for (Aula aulaSala : aulasDaSala) {
            if ((aula.getHorario().getHorarioInicial().getTime() < aulaSala.getHorario().getHorarioFinal().getTime())
                    && (aula.getHorario().getHorarioFinal().getTime() > aulaSala.getHorario().getHorarioInicial().getTime())
                    && (aula.getDiaSemana().equals(aulaSala.getDiaSemana()))) {
                return false;
            }
        }

        return true;
    }
}
