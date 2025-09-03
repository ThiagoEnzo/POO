/**
 *
 * @author Thiago Enzo
 */

import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int ra,opc;
        double prv1,prv2;
        double trab1,trab2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o RA do Aluno:");
        ra = entrada.nextInt();
        System.out.print("Nota Prova 1: ");
        prv1 = entrada.nextDouble();
        System.out.print("Nota Prova 2: ");
        prv2 = entrada.nextDouble();
        System.out.print("Nota Trabalho 1: ");
        trab1 = entrada.nextDouble();
        System.out.print("Nota Trabalho 2: ");
        trab2 = entrada.nextDouble();
        
        Aluno objAlu = new Aluno();
        objAlu.setRA(ra);
        objAlu.setNtPrv1(prv1);
        objAlu.setNtPrv2(prv2);
        objAlu.setNtTrab1(trab1);
        objAlu.setNtTrab2(trab2);
        
        do{
            System.out.println("1-Exibir Nota das Provas/Trabalhos");
            System.out.println("2-Exibir Média dos Trabalhos/Provas");
            System.out.println("3-Exibir Média Final");
            System.out.println("4-Sair");
            System.out.print("\n\t Digite a opção:");
            
            opc=entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.println("RA : "+objAlu.getRA());
                    System.out.println("Nota Prova 1 : "+objAlu.getNtProv1());
                    System.out.println("Nota Prova 2 : "+objAlu.getNtProv2());
                    System.out.println("Nota Trabalho 1 : "+objAlu.getNtTrab1());
                    System.out.println("Nota Trabalho 2 : "+objAlu.getNtTrab2());
                    break;
                case 2:
                    System.out.println("RA : "+objAlu.getRA());
                    System.out.println("Media das Provas : "+objAlu.calcMediaProvas());
                    System.out.println("Media dos Trabalhos : "+objAlu.calcMediaTrabalhos());
                    break;
                case 3:
                    System.out.println("RA : "+objAlu.getRA());
                    System.out.println("Media Final : "+objAlu.calcMediaFinal());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Invalida - Tenta Outra");
                }
        }while(opc != 4);
    }   
}
