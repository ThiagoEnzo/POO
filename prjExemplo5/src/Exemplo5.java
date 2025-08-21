/**
 *
 * @author Thiago Enzo
 */
public class Exemplo5 {
    public static void main(String[] args) {
        int cont=1,x;
        x=(int)(Math.random()*100);
        System.out.println("\t\t\tTabuada do " + x +"\n");
        do{
            System.out.println(x+" x "+ cont + " = " + cont*x);
            cont++;
        }while(cont<=10);
    }
}