/**
 *
 * @author Thiago Enzo
 */
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        int opc;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a medida do Raio: ");
        medRaio = entrada.nextDouble();
        
        Circulo objCir = new Circulo();
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("\n\n 1 - Area");
            System.out.println("2 - Perimetro");
            System.out.println("3 - Diametro");
            System.out.println("4 - Sair");
            
            opc = entrada.nextInt();
            switch(opc){
                    case 1:
                        System.out.println("Area = "+objCir.calcArea());
                        break;
                    case 2:
                        System.out.println("Perimetro = "+objCir.calcPerimetro());
                        break;
                    case 3:
                        System.out.println("Diametro = "+objCir.calcDiametro());
                        break;
                    default:
                            break;
            }                     
        }while(opc<4);    
    }   
}
