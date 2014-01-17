/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Mare
 */
@Entity
@Table(name = "HORARIOS")
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "horarioInicial", nullable = false)
    private long horarioInicial;

    @Column(name = "horarioFinal", nullable = false)
    private long horarioFinal;

    @OneToMany(mappedBy = "horario", targetEntity = Aula.class, cascade = CascadeType.ALL)
    private List<Aula> aulas;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the horarioInicial
     */
    public Time getHorarioInicial() {
        return new Time(horarioInicial);
    }

    /**
     * @param horarioInicial the horarioInicial to set
     */
    public void setHorarioInicial(Time horarioInicial) {
        this.horarioInicial = horarioInicial.getTime();
    }

    /**
     * @return the horarioFinal
     */
    public Time getHorarioFinal() {
        return new Time(horarioFinal);
    }

    /**
     * @param horarioFinal the horarioFinal to set
     */
    public void setHorarioFinal(Time horarioFinal) {
        this.horarioFinal = horarioFinal.getTime();
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

    public Object[] imprimeHorario() {
        return new Object[]{getHorarioInicial().toString(), getHorarioFinal().toString()};
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getHorarioInicial() + "/" + this.getHorarioFinal();
    }

}
