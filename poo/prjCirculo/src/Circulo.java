/**
 *
 * @author dimas
 */
public class Circulo {
    private double raio;
    
    //definição do método construtor
    public Circulo(double r){
        raio = r;
    }
    
    public double getRaio(){
        return(raio);
    }
    
    public double calcArea(){
        return(Math.PI * Math.pow(raio, 2));
    }
    
    public double calcPerimetro(){
        return(2 * Math.PI * raio);
    }
}
