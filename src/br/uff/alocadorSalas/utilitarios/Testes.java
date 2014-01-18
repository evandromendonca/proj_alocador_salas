/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uff.alocadorSalas.utilitarios;

import br.uff.alocadorSalas.controller.AulaController;
import br.uff.alocadorSalas.controller.CursosController;
import br.uff.alocadorSalas.controller.DisciplinaController;
import br.uff.alocadorSalas.controller.HorarioController;
import br.uff.alocadorSalas.controller.ProfessorController;
import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.controller.TurmaController;
import java.sql.Time;
import javax.swing.JOptionPane;

/**
 *
 * @author Evandro
 */
public class Testes {

    public static void main(String[] args) {
        try {
            popularBanco();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas no teste!");
        }
    }

    public static void popularBanco() throws Exception {
        new CursosController().salvar("Ciência da Computação", "CC", 8);
        new CursosController().salvar("Engenharia de Produção", "EP", 10);
        new CursosController().salvar("Computação e Produção", "CC EP", 8);
        
        new SalaController().salvar("05-A", 35);
        new SalaController().salvar("05-B", 35);
        new SalaController().salvar("06-A", 20);
        new SalaController().salvar("06-B", 20);
        new SalaController().salvar("10", 40);
        new SalaController().salvar("11", 40);
        new SalaController().salvar("19", 20);
        new SalaController().salvar("20", 20);
        
        new ProfessorController().salvar("Fulano da Silva");
        new ProfessorController().salvar("Cicrano Oliva");
        new ProfessorController().salvar("Francisco Teobaldo");
        new ProfessorController().salvar("Oswaldo Aranha");
        new ProfessorController().salvar("Paulo André");
        new ProfessorController().salvar("Tia Anastácia");
        
        new DisciplinaController().salvar("Introdução a CC", 1, new CursosController().buscaCursoPorSigla("CC"), "TCC0001");
        new DisciplinaController().salvar("Fundamentos de Arquitetura", 1, new CursosController().buscaCursoPorSigla("CC"), "TCC0002");
        new DisciplinaController().salvar("Introdução a Engenharia de Produção", 1, new CursosController().buscaCursoPorSigla("EP"), "EPP0001");
        new DisciplinaController().salvar("Administração Financeira", 1, new CursosController().buscaCursoPorSigla("EP"), "EPP0002");
        new DisciplinaController().salvar("Programação de computadores I", 1, new CursosController().buscaCursoPorSigla("CC EP"), "TEC0001");
        new DisciplinaController().salvar("Cálculo I", 1, new CursosController().buscaCursoPorSigla("CC EP"), "TEC0002");
        
        new TurmaController().salvar("C1", 30, new DisciplinaController().buscarDisciplinaPorCodigo("TCC0001"), new ProfessorController().buscaProfessorPorNome("Fulano da Silva"), new CursosController().buscaCursoPorSigla("CC"));
        new TurmaController().salvar("C2", 20, new DisciplinaController().buscarDisciplinaPorCodigo("TCC0002"), new ProfessorController().buscaProfessorPorNome("Cicrano Oliva"), new CursosController().buscaCursoPorSigla("CC"));
        new TurmaController().salvar("E1", 35, new DisciplinaController().buscarDisciplinaPorCodigo("EPP0001"), new ProfessorController().buscaProfessorPorNome("Francisco Teobaldo"), new CursosController().buscaCursoPorSigla("EP"));
        new TurmaController().salvar("E2", 15, new DisciplinaController().buscarDisciplinaPorCodigo("EPP0002"), new ProfessorController().buscaProfessorPorNome("Oswaldo Aranha"), new CursosController().buscaCursoPorSigla("EP"));
        new TurmaController().salvar("CE1", 30, new DisciplinaController().buscarDisciplinaPorCodigo("TEC0001"), new ProfessorController().buscaProfessorPorNome("Paulo André"), new CursosController().buscaCursoPorSigla("CC EP"));
        new TurmaController().salvar("CE2", 30, new DisciplinaController().buscarDisciplinaPorCodigo("TEC0002"), new ProfessorController().buscaProfessorPorNome("Tia Anastácia"), new CursosController().buscaCursoPorSigla("CC EP"));
        
        new HorarioController().salvar(Time.valueOf("09:00:00"), Time.valueOf("11:00:00"));
        
        new AulaController().salvar("Segunda", new TurmaController().buscaTurmaPorNome("C1"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        new AulaController().salvar("Quarta", new TurmaController().buscaTurmaPorNome("C1"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        
        new AulaController().salvar("Segunda", new TurmaController().buscaTurmaPorNome("C2"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        new AulaController().salvar("Quarta", new TurmaController().buscaTurmaPorNome("C2"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        
        new AulaController().salvar("Segunda", new TurmaController().buscaTurmaPorNome("E1"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        new AulaController().salvar("Quarta", new TurmaController().buscaTurmaPorNome("E1"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        
        new AulaController().salvar("Terça", new TurmaController().buscaTurmaPorNome("E2"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        new AulaController().salvar("Quinta", new TurmaController().buscaTurmaPorNome("E2"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        
        new AulaController().salvar("Terça", new TurmaController().buscaTurmaPorNome("CE1"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        new AulaController().salvar("Quinta", new TurmaController().buscaTurmaPorNome("CE1"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        
        new AulaController().salvar("Terça", new TurmaController().buscaTurmaPorNome("CE2"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
        new AulaController().salvar("Quinta", new TurmaController().buscaTurmaPorNome("CE2"), null, new HorarioController().buscarPorHorarioInicialEFinal(Time.valueOf("09:00:00"), Time.valueOf("11:00:00")));
                        
    }

}
