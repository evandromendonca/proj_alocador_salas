package br.uff.alocadorSalas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CURSOS")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="nome", nullable = false, unique = true)
    private String nome;

    @Column(name="sigla", nullable = false)
    private String sigla;

    @Column(name="quantidadePeriodos", nullable = false)
    private int quantidadePeriodos;

    @OneToMany(mappedBy = "curso", targetEntity = Disciplina.class, cascade = CascadeType.ALL)
    private List<Disciplina> disciplinas;

    @OneToMany(mappedBy = "curso", targetEntity = Turma.class, cascade = CascadeType.ALL)
    private List<Turma> turmas;

    /**
     * @return Id do Curso
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id Id destinado ao Curso
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Nome do Curso
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome Nome destinado ao Curso
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Sigla do Curso
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla Sigla destinado ao Curso
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return Quantidade de períodos do Curso
     */
    public int getQuantidadePeriodos() {
        return quantidadePeriodos;
    }

    /**
     * @param quantidadePeriodos Quantidade de períodos destinada a Curso
     */
    public void setQuantidadePeriodos(int quantidadePeriodos) {
        this.quantidadePeriodos = quantidadePeriodos;
    }

    /**
     * @return Lista de Disciplinas do Curso
     */
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas Lista de Disciplinas destinada ao Curso
     */
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    /**
     * @return the Lista de Turmas do Curso
     */
    public List<Turma> getTurmas() {
        return turmas;
    }

    /**
     * @param turmas Lista de Turmas destinada ao Curso
     */
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
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
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

}
