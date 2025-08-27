/**
 *
 * @author Thiago Enzo
 */
public class Aplic {
    public static void main(String[] args) {
        // Definição do Ponteiro
        Retangulo objRet;
        
        //instanciação (alocação) de um objeto da classe Retnagulo
        objRet = new Retangulo();
        
        //Passagem de mensagem
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da Altura: "+ objRet.getAltura());
        System.out.println("Medida da Base: "+ objRet.getBase());
        System.out.println("Medida da Area: "+ objRet.calcArea());
        System.out.println("Medida do Perimetro: "+ objRet.calcPerimetro());
    }
    
}
