package br.uff.alocadorSalas.utilitarios;

import br.uff.alocadorSalas.controller.HorarioController;
import br.uff.alocadorSalas.controller.SalaController;
import br.uff.alocadorSalas.model.Aula;
import br.uff.alocadorSalas.model.Horario;
import br.uff.alocadorSalas.model.Sala;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import static org.apache.poi.ss.usermodel.CellStyle.ALIGN_CENTER;
import org.apache.poi.ss.usermodel.Font;

public class GeradorPlanilha {

    public String textoQuadroAntigo(Aula aula) {

        return "[" + aula.getTurma().getCurso().getSigla() + "] " + aula.getTurma().getDisciplina() + "("
                + aula.getTurma().getDisciplina().getCodigo() + ") \n" + aula.getHorario() + " "
                + aula.getTurma().getProfessor() + "\n";
    }

    public String textoQuadroNovo(Aula aula) {

        return "[" + aula.getTurma().getCurso().getSigla() + "] " + aula.getTurma().getDisciplina() + "("
                + aula.getTurma().getDisciplina().getCodigo() + ") \n" + aula.getTurma().getProfessor() + "\n";
    }

    public ArrayList<Time> criaListaHorariosPossiveis() throws Exception {
        ArrayList<Time> horariosPossiveis = new ArrayList<>();
        for (Horario horario : new HorarioController().listaHorarios()) {
            if (!horariosPossiveis.contains(horario.getHorarioInicial())) {
                horariosPossiveis.add(horario.getHorarioInicial());
            }
            if (!horariosPossiveis.contains(horario.getHorarioFinal())) {
                horariosPossiveis.add(horario.getHorarioFinal());
            }
        }
        Collections.sort(horariosPossiveis);
        return horariosPossiveis;
    }

    public void gerarQuadroAntigo(String nomeArquivo) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet firstSheet = workbook.createSheet("Sheet1");
        HSSFRow linha;
        HSSFCell celula;

        FileOutputStream fos = null;

        try {

            Font f = workbook.createFont();
            f.setBoldweight(Font.BOLDWEIGHT_BOLD);

            CellStyle cs = workbook.createCellStyle();
            cs.setWrapText(true);
            cs.setAlignment(ALIGN_CENTER);
            cs.setFont(f);

            linha = firstSheet.createRow(0);

            celula = linha.createCell(0);
            celula.setCellValue("");
            celula.setCellStyle(cs);

            celula = linha.createCell(1);
            celula.setCellValue("2ª FEIRA");
            celula.setCellStyle(cs);

            celula = linha.createCell(2);
            celula.setCellValue("3ª FEIRA");
            celula.setCellStyle(cs);

            celula = linha.createCell(3);
            celula.setCellValue("4ª FEIRA");
            celula.setCellStyle(cs);

            celula = linha.createCell(4);
            celula.setCellValue("5ª FEIRA");
            celula.setCellStyle(cs);

            celula = linha.createCell(5);
            celula.setCellValue("6ª FEIRA");
            celula.setCellStyle(cs);

            int i = 1;
            List<Sala> salas = new SalaController().listaSalas();
            for (Sala s : salas) {

                linha = firstSheet.createRow(i);

                celula = linha.createCell(0);
                celula.setCellValue(s.getNome());
                celula.setCellStyle(cs);

                List<Aula> aulas = s.getAulas();
                for (Aula aula : aulas) {
                    if (aula.getDiaSemana().equalsIgnoreCase("Segunda")) {

                        celula = linha.createCell(1);
                        celula.setCellValue(linha.getCell(1).getStringCellValue() + textoQuadroAntigo(aula));
                        celula.setCellStyle(cs);

                    } else if (aula.getDiaSemana().equalsIgnoreCase("Terça")) {

                        celula = linha.createCell(2);
                        celula.setCellValue(linha.getCell(2).getStringCellValue() + textoQuadroAntigo(aula));
                        celula.setCellStyle(cs);

                    } else if (aula.getDiaSemana().equalsIgnoreCase("Quarta")) {

                        celula = linha.createCell(3);
                        celula.setCellValue(linha.getCell(3).getStringCellValue() + textoQuadroAntigo(aula));
                        celula.setCellStyle(cs);

                    } else if (aula.getDiaSemana().equalsIgnoreCase("Quinta")) {

                        celula = linha.createCell(4);
                        celula.setCellValue(linha.getCell(4).getStringCellValue() + textoQuadroAntigo(aula));
                        celula.setCellStyle(cs);

                    } else if (aula.getDiaSemana().equalsIgnoreCase("Sexta")) {

                        celula = linha.createCell(5);
                        celula.setCellValue(linha.getCell(5).getStringCellValue() + textoQuadroAntigo(aula));
                        celula.setCellStyle(cs);

                    }
                }
                i++;
            }

            firstSheet.autoSizeColumn(0);
            firstSheet.autoSizeColumn(1);
            firstSheet.autoSizeColumn(2);
            firstSheet.autoSizeColumn(3);
            firstSheet.autoSizeColumn(4);
            firstSheet.autoSizeColumn(5);

            fos = new FileOutputStream(new File(nomeArquivo + ".xls"));
            workbook.write(fos);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao exportar arquivo");
            throw e;
        } finally {
            try {
                fos.flush();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void gerarQuadroNovo(String nomeArquivo) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = null;
        HSSFRow linha;
        HSSFCell celula;
        String diaSemana = "";

        FileOutputStream fos = null;

        try {
            Font f = workbook.createFont();
            f.setBoldweight(Font.BOLDWEIGHT_BOLD);

            CellStyle cs = workbook.createCellStyle();
            cs.setWrapText(true);
            cs.setAlignment(ALIGN_CENTER);
            cs.setFont(f);

            for (int k = 1; k < 6; k++) {

                switch (k) {
                    case 1:
                        sheet = workbook.createSheet("2ª FEIRA");
                        diaSemana = "Segunda";
                        break;
                    case 2:
                        sheet = workbook.createSheet("3ª FEIRA");
                        diaSemana = "Terça";
                        break;
                    case 3:
                        sheet = workbook.createSheet("4ª FEIRA");
                        diaSemana = "Quarta";
                        break;
                    case 4:
                        sheet = workbook.createSheet("5ª FEIRA");
                        diaSemana = "Quinta";
                        break;
                    case 5:
                        sheet = workbook.createSheet("6ª FEIRA");
                        diaSemana = "Sexta";
                        break;
                }

                int i = 1;
                List<Time> horas = criaListaHorariosPossiveis();
                for (Time hora : horas) {
                    linha = sheet.createRow(i);
                    celula = linha.createCell(0);
                    celula.setCellValue(hora.toString());
                    celula.setCellStyle(cs);
                    i++;
                }

                linha = sheet.createRow(0);
                celula = linha.createCell(0);
                celula.setCellValue("");
                celula.setCellStyle(cs);

                sheet.autoSizeColumn(0);

                i = 1;
                List<Sala> salas = new SalaController().listaSalas();
                for (Sala sala : salas) {

                    celula = linha.createCell(i);
                    celula.setCellValue(sala.getNome());
                    celula.setCellStyle(cs);

                    List<Aula> aulas = sala.getAulas();
                    for (Aula aula : aulas) {

                        for (int l = 0; l < horas.size(); l++) {

                            if ((l + 1) >= horas.size()) {
                                break;
                            }

                            Time hora1 = horas.get(l);
                            Time hora2 = horas.get(l + 1);

                            if ((aula.getHorario().getHorarioInicial().getTime() < hora2.getTime())
                                    && (aula.getHorario().getHorarioFinal().getTime() > hora1.getTime())
                                    && (aula.getDiaSemana().equalsIgnoreCase(diaSemana))) {

                                celula = sheet.getRow(l + 1).createCell(i);
                                celula.setCellValue(celula.getStringCellValue() + textoQuadroNovo(aula));
                                celula.setCellStyle(cs);

                            }
                        }
                    }
                    sheet.autoSizeColumn(i);
                    i++;
                }
            }

            fos = new FileOutputStream(new File(nomeArquivo + ".xls"));
            workbook.write(fos);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao exportar arquivo");
        } finally {
            try {
                fos.flush();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
