/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mare
 */
@Entity
@Table(name = "HORARIOS")
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "horarioInicial", nullable = false)
    private String horarioInicial;

    @Id
    @Column(name = "horarioFinal", nullable = false)
    private String horarioFinal;

    @OneToMany(mappedBy = "horario", targetEntity = Aula.class, cascade = CascadeType.ALL)
    private List<Aula> aulas;

    /**
     * @return the horarioInicial
     */
    public String getHorarioInicial() {
        return horarioInicial;
    }

    /**
     * @param horarioInicial the horarioInicial to set
     */
    public void setHorarioInicial(String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    /**
     * @return the horarioFinal
     */
    public String getHorarioFinal() {
        return horarioFinal;
    }

    /**
     * @param horarioFinal the horarioFinal to set
     */
    public void setHorarioFinal(String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    /**
     * @return the aulas
     */
    public List<Aula> getAula() {
        return aulas;
    }

    /**
     * @param aulas the aulas to set
     */
    public void setAula(List<Aula> aulas) {
        this.aulas = aulas;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        return (this.getHorarioInicial() != null || other.getHorarioInicial() == null) && (this.getHorarioInicial() == null || this.horarioInicial.equals(other.horarioInicial)) && (this.getHorarioFinal() != null || other.getHorarioFinal() == null) && (this.getHorarioFinal() == null || this.horarioInicial.equals(other.horarioFinal));
    }

    @Override
    public String toString() {
        return this.getHorarioInicial() + " " + this.getHorarioFinal();
    }

}
