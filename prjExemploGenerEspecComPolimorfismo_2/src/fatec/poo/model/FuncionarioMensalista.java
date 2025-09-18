
package fatec.poo.model;

/**
  * @author Thiago Enzo
 */
public class FuncionarioMensalista extends Funcionario{
    private double numSalMin;
    private double valSalMin;
    
    public FuncionarioMensalista(int r, String n, String dtAdm, double vhm){
        super(r,n,dtAdm);
        valSalMin = vhm;
    }
    
    public void setNumSalMin(double nsm){
        numSalMin = nsm;
    }
    public double calcSalBruto(){
        return(valSalMin * numSalMin);
    }
}
