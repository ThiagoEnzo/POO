/**
 *
 * @author Thiago Enzo
 */
public class Aluno {
    
    private int ra;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;
    
    public void setRA(int a){
        ra = a;
    }
    public void setNtPrv1(double np1){
        ntPrv1 = np1;
    }
    public void setNtPrv2(double np2){
        ntPrv2 = np2;
    }
    public void setNtTrab1(double nt1){
        ntTrab1 = nt1;
    }
    public void setNtTrab2(double nt2){
        ntTrab2 = nt2;
    }
    
    public int getRA(){
        return ra;
    }
    public double getNtProv1(){
        return ntPrv1;
    }
    public double getNtProv2(){
        return ntPrv2;
    }
    public double getNtTrab1(){
        return ntTrab1;
    }
    public double getNtTrab2(){
        return ntTrab2;
    }
    public double calcMediaProvas(){
        return (0.75*((ntPrv1+2*ntPrv2)/3));
    }
    public double calcMediaTrabalhos(){
        return (0.25*((ntTrab1+ntTrab2)/2));
    }
    public double calcMediaFinal(){
        return (calcMediaTrabalhos() + calcMediaProvas());
    }
}
