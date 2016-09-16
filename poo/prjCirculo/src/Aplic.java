
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medRaio;
       
        System.out.println("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        
        Circulo objCirc = new Circulo(medRaio);
        
        System.out.println("Raio: " + objCirc.getRaio());
        System.out.println("Area: " + objCirc.calcArea());
        System.out.println("Perimetro: " + objCirc.calcPerimetro());
    }
}
