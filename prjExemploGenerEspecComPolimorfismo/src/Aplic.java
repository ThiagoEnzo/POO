
import fatec.poo.model.FuncionarioHorista;

/**
 * @author 0030482413056
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira","15/03/1978",15.80);
        
        funcHor.setQtdeHorTrab(90);
        System.out.println("Salario Bruto   => " + funcHor.calcSalBruto());
        System.out.println("Desconto        => " + funcHor.calcDesconto());
        System.out.println("Salario Liquido => " + funcHor.calcSalLiquido());
    }
    
}
