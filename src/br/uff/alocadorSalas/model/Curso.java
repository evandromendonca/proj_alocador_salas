package br.uff.alocadorSalas.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Esta classe é utilizada para simular um Curso de uma universidade.
 * <p>
 * Um exemplo de sua utilização é simular o curso de 'Ciência da Computação'.
 *
 * @author Mareana Pereira
 *
 */
@Entity
@Table(name = "CURSOS")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Id do Curso utilizado como chave primária
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nome do Curso
     */
    private String nome;

    /**
     * Sigla do Curso
     */
    private String sigla;

    /**
     * Quantidade de períodos do Curso
     */
    private int quantidadePeriodos;

    /**
     * Lista de Disciplinas do Curso
     */
    @OneToMany(mappedBy = "curso", targetEntity = Disciplina.class, cascade = CascadeType.ALL)
    private List<Disciplina> disciplinas;

    /**
     * Lista de Turmas do Curso
     */
    @OneToMany(mappedBy = "curso", targetEntity = Disciplina.class, cascade = CascadeType.ALL)
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
        return "Nome: " + this.getNome() + "     Sigla: " + this.getSigla() + "     Quantidade períodos: " + this.getQuantidadePeriodos();
    }

}
