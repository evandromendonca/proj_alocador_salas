/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.uff.alocadorSalas.dao;

import br.uff.alocadorSalas.model.Disciplina;

/**
 *
 * @author Evandro
 */
public class DisciplinaDao extends GenericDao<Disciplina> {
 
    public void salvar(Disciplina disciplina) {
        save(disciplina);
    }
 
    public void alterar(Disciplina disciplina) {
        update(disciplina);
    }
 
    public void excluir(long id) {
        Disciplina disciplina = findById(id);
        delete(disciplina);
    }
 
}