import br.uff.alocadorSalas.dao.CursoDao;
import br.uff.alocadorSalas.dao.ProfessorDao;
import br.uff.alocadorSalas.model.Curso;
import br.uff.alocadorSalas.model.Professor;

/**
 *
 * @author Evandro
 */
public class MainTeste {
    
    public static void main(String[] args) throws Exception{
        Curso curso = new Curso();
        curso.setNome("computacao");
        curso.setQuantidadePeriodos(8);
        curso.setSigla("ic");
        
        CursoDao cdao = new CursoDao();
        cdao.salvar(curso);
        
        curso = new Curso();
        curso.setNome("matematica");
        curso.setQuantidadePeriodos(8);
        curso.setSigla("mt");
        cdao.salvar(curso);
        
        Professor prof = new Professor();
        prof.setNome("mareana");
        prof.setCurso(curso);
        
        ProfessorDao pdao = new ProfessorDao();
        pdao.salvar(prof);
                
    }
    
}
