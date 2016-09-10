
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030481513011
 */
public class Aplic2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medBase, medAltura;
        Retangulo objRet = new Retangulo();
        
        System.out.println("Digite a Base: ");
        medBase = entrada.nextDouble();
        System.out.println("Digite a Altura: ");
        medAltura = entrada.nextDouble();
        
        
        objRet.setAltura(medAltura);
        objRet.setBase(medBase);
        
        System.out.println(objRet.getAltura());
        System.out.println(objRet.getBase());
        System.out.println(objRet.calcArea());
        System.out.println(objRet.calcPerimetro());
        
        System.out.println(objRet.calcDiagonal());
    }
    
}
