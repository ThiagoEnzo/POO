
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 * @author Thiago Enzo
 */
public class Aplic {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira","15/03/1978",15.80);
        
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Programador");
        
        System.out.println("Registro            => " + funcHor.getRegistro());
        System.out.println("Nome                => " + funcHor.getNome());
        System.out.println("Data de Admissao    => " + funcHor.getDtAdmissao());
        System.out.println("Cargo               => " + funcHor.getCargo());
        System.out.println("Salario Bruto       => " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto            => " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificação        => " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido     => " + df.format(funcHor.calcSalLiquido()));
    
    
    
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Ana Julia","20/02/1960",650);
        
        funcMen.setNumSalMin(2.5);
        funcMen.setCargo("Aux. Administrativo");
        
        System.out.println("Registro            => " + funcMen.getRegistro());
        System.out.println("Nome                => " + funcMen.getNome());
        System.out.println("Data de Admissao    => " + funcMen.getDtAdmissao());
        System.out.println("Cargo               => " + funcMen.getCargo());
        System.out.println("Salario Bruto       => " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto            => " + df.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido     => " + df.format(funcMen.calcSalLiquido()));
    }
    
}
