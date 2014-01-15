package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.SalaDao;
import br.uff.alocadorSalas.model.Sala;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class SalaController {

    public void salvar(String nome, int quantidadeUtil) throws Exception {
        Sala sala = new Sala();
        sala.setNome(nome);
        sala.setQuantidadeUtil(quantidadeUtil);

        new SalaDao().salvar(sala);
    }

    public void alterar(Long id, String nome, int quantidadeUtil) throws Exception {
        Sala sala = new Sala();
        sala.setId(id);
        sala.setNome(nome);
        sala.setQuantidadeUtil(quantidadeUtil);

        new SalaDao().alterar(sala);
    }

    public List<Sala> listaSalas() throws Exception {
        SalaDao dao = new SalaDao();
        try {
            return dao.buscarTodos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar salas" + e.getLocalizedMessage());
        }
        return null;
    }

    public void excluir(long id) throws Exception {
        new SalaDao().excluir(id);
    }

    public Sala buscaSalaPorNome(String nome) throws Exception {
        SalaDao dao = new SalaDao();
        try {
            return dao.buscarPorNome(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar salas por nome" + e.getLocalizedMessage());
        }
        return null;
    }
    
    public List<Sala> buscaTodasSalasPorNome(String nome) throws Exception {
        SalaDao dao = new SalaDao();
        try {
            return dao.buscarTodosPorNome(nome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar salas por nome" + e.getLocalizedMessage());
        }
        return null;
    }
}
