package br.uff.alocadorSalas.controller;

import br.uff.alocadorSalas.dao.SalaDao;
import br.uff.alocadorSalas.model.Sala;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class SalaController {

    public void salvar(int numero, int quantidadeUtil) throws Exception {
        Sala sala = new Sala();
        sala.setNumero(numero);
        sala.setQuantidadeUtil(quantidadeUtil);

        new SalaDao().salvar(sala);
    }

    public void alterar(long id, int numero, int quantidadeUtil) throws Exception {
        Sala sala = new Sala();
        sala.setId(id);
        sala.setNumero(numero);
        sala.setQuantidadeUtil(quantidadeUtil);

        new SalaDao().salvar(sala);
    }

    public List<Sala> listaSalas() throws Exception {
        SalaDao dao = new SalaDao();
        try {
            return dao.findAll();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar salas" + e.getLocalizedMessage());
        }
        return null;
    }

    public void excluir(long id) throws Exception {
        new SalaDao().excluir(id);
    }

}
