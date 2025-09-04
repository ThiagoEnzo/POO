/**
 *
 * @author Thiago Enzo
 */
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        String unidade;
        int opc;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a unidade do raio do circulo:");
        unidade=entrada.next();
        
        System.out.print("Digite a medida do Raio: ");
        medRaio = entrada.nextDouble();
        
        Circulo objCir = new Circulo(unidade);
        objCir.setRaio(medRaio);
        
        System.out.println("A medida do raio do circulo: "+objCir.getRaio()+objCir.getUnidadeMedida());
        
        do{
            System.out.println("\n\n 1 - Area");
            System.out.println("2 - Perimetro");
            System.out.println("3 - Diametro");
            System.out.println("4 - Sair");
            
            opc = entrada.nextInt();
            switch(opc){
                    case 1:
                        System.out.println("Area = "+objCir.calcArea()+objCir.getUnidadeMedida());
                        break;
                    case 2:
                        System.out.println("Perimetro = "+objCir.calcPerimetro()+objCir.getUnidadeMedida());
                        break;
                    case 3:
                        System.out.println("Diametro = "+objCir.calcDiametro()+objCir.getUnidadeMedida());
                        break;
                    default:
                            break;
            }                     
        }while(opc<4);    
    }   
}
