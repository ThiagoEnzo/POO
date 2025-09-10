
import fatec.poo.model.Aluno;


/**
 *
 * @author Thiago Enzo
 */
public class Aplic {

    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010, "Carlos Silveira","15/03/1978");
        
        System.out.println("Registro Escolar: "+objAlu.getRegEscolar());
        System.out.println("Nome: "+objAlu.getNome());
        System.out.println("Data de Nascimento: "+objAlu.getDataNascimento());
        System.out.println("Mensalidade: "+objAlu.getMensalidade());
    }
    
}
