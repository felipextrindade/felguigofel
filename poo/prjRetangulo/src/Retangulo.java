/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030481513011
 */
public class Retangulo {
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    public Retangulo() {
        
    }
    
    public double calcArea() {
        double area = this.altura*this.base;
        return area;
    }
    
    public double calcPerimetro() {
        double perimetro = 2*(this.altura) + 2*(this.base);
        return perimetro;
    }
    
    public double calcDiagonal() {
        double diagonal = 0;
        diagonal = Math.sqrt((this.base*this.base)+(this.altura*this.altura));
        return diagonal;
    }
}
