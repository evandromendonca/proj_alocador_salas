package br.uff.alocadorSalas.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AULAS")
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "diaSemana", nullable = false)
    private String diaSemana;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_sala", referencedColumnName = "id", nullable = false)
    private Sala sala;

    @Id
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "horario_inicial", referencedColumnName = "horarioInicial", nullable = false),
        @JoinColumn(name = "horario_final", referencedColumnName = "horarioFinal", nullable = false)
    })
    private Horario horario;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "id_disciplina", referencedColumnName = "id_disciplina", nullable = false),
        @JoinColumn(name = "nome_turma", referencedColumnName = "nome", nullable = false)
    })
    private Turma turma;

    /**
     * @return the diaSemana
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    /**
     * @return the turmas
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aula)) {
            return false;
        }
        Aula other = (Aula) object;
        return (this.getDiaSemana() != null || other.getDiaSemana() == null) && (this.getDiaSemana() == null || this.diaSemana.equals(other.diaSemana)) && (this.getHorario() != null || other.getHorario() == null) && (this.getHorario() == null || this.horario.equals(other.horario)) && (this.getSala() != null || other.getSala() == null) && (this.getSala() == null || this.sala.equals(other.sala));
    }

    @Override
    public String toString() {
        return this.getTurma().toString() + " " + this.getSala().toString() + " " + this.getHorario().toString();
    }

}
