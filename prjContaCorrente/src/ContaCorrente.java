/**
 *
 * @author Thiago Enzo
 * 
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int n ,double s){
        numero = n;
        saldo = s;        
    }
    public int getNumero (){
        return (numero);           
    }
    public double getSaldo(){
        return (saldo);
    }
    public void sacar(int r){
        saldo = saldo - r;
    }
    public void depositar(double d){
        saldo = saldo + d;
    }    
}

