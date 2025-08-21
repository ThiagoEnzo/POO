/**
 *
 * @author Thiago Enzo
 */
public class Exemplo4 {
    public static void main(String[] args) {
        int cont,i=1;
        
        while(i<=10){
            System.out.println("\t\t\tTabuada do " + i +"\n");
            cont=1;
            while(cont<=10){
                System.out.println(i+" x "+ cont + " = " + cont*i);
                cont++;
            }
            i++;
        }
    }    
}