/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030481513011
 */
public class Aplic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        objRet.setAltura(40.5);
        objRet.setBase(35);
        
        System.out.println(objRet.getAltura());
        System.out.println(objRet.getBase());
        System.out.println(objRet.calcArea());
        System.out.println(objRet.calcPerimetro());
        
        System.out.println(objRet.calcDiagonal());
        
    }
    
}
