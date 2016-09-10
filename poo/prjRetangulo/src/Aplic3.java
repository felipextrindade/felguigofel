
import java.util.Scanner;


/**
 *
 * @author 0030481513020
 */
public class Aplic3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo MatRet[] = new Retangulo[4];
        int x;
        for (x=0;x<MatRet.length;x++){
            System.out.println("Retangulo "+(x+1)+":");
            MatRet[x] = new Retangulo();
            System.out.println("Digite a altura:");
            MatRet[x].setAltura(entrada.nextDouble());
            System.out.println("Digite a base:");
            MatRet[x].setBase(entrada.nextDouble());
        }
        for (x=0;x<MatRet.length;x++){
            System.out.println("Retamgulo " + (x+1) +":");
            System.out.println("Base:" + MatRet[x].getBase());
            System.out.println("Altura:" + MatRet[x].getAltura());
            System.out.println("Area:" + MatRet[x].calcArea());
            System.out.println("Perimetro:" + MatRet[x].calcPerimetro());
            System.out.println("Diagonal:" + MatRet[x].calcDiagonal()+"\n");
        }
    }
    
}
