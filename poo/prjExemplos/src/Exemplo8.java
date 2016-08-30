
import java.util.Scanner;

/**
 *
 * @author 0030481513020
 */
public class Exemplo8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int RA;
        double Nota1, Nota2 , Media;
        String Nome;
        
        System.out.println("Digite o RA:");
        RA = entrada.nextInt();
        System.out.println("Digite a primeira nota:");
        Nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        Nota2 = entrada.nextDouble();
        System.out.println("Digite o nome:");
        Nome = entrada.next();
        
        Media = (Nota1+Nota2)/2;
        
        System.out.println("Media do Aulono: "+Media);
    }
    
}
