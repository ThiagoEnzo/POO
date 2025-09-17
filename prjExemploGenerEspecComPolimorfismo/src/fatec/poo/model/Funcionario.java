
package fatec.poo.model;

/*
 * @author Thiago Enzo
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    // Metodo abstrato 
    // Apresenta apenas a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return (0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }
}
