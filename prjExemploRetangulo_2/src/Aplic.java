
import java.util.Scanner;

/**
 *
 * @author Thiago Enzo
 */
public class Aplic {

   
    public static void main(String[] args) {
       double medAlt, medBase;
       int opcao;
       //instanciaçao de um objeto da classe Scanner
       Scanner entrada = new Scanner (System.in);
       
        System.out.print("Digite a medida da altura do retângulo: ");
        
        medAlt = entrada.nextDouble(); // scanf("%lf", &medAlt)//
        /** Scanner { nextdouble() =  %f em c, nextint() = %i e next()=%c */
        
        System.out.print("Digite a medida da base do retângulo: ");
        
        medBase = entrada.nextDouble();
        
        //instnciaçao de um objeto da classe Retangulo
        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
                
        do{
            System.out.println("\n\n 1 - Consultar medida da area");
            System.out.println("2 - Consultar medida do perimetro");
            System.out.println("3 - Consultar medida da diagonal");
            System.out.println("4 - Encerrar");
            System.out.println("\n\t\tDigite a opçao: ");
            opcao = entrada.nextInt(); // scanf("%d", &opcao)
            
            if(opcao == 1){
                System.out.println("Medida da Area: "+ objRet.calcArea());
            }else{
                if(opcao == 2){
                System.out.println("Medida da Perimetro: "+ objRet.calcPerimetro());
                }else{
                    if(opcao == 3){
                    System.out.println("Medida da Diagonal: "+ objRet.calcDiagonal());
                    }
                } 
            }
            
            switch(opcao){
                case 1:
                    System.out.println("Medida da Area2: "+ objRet.calcArea());
                    break;
                case 2:
                    System.out.println("Medida da Perimetro2: "+ objRet.calcPerimetro());
                    break;
                case 3:
                    System.out.println("Medida da Diagonal2: "+ objRet.calcDiagonal());
                    break;
                default:
                    break;                    
            }            
        }while(opcao < 4);
    }    
}
