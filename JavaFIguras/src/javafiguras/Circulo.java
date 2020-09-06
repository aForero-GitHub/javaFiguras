/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * @author Andres Forero
 * @version: 1.0.0
 * @since 03/09/2020
 */

public class Circulo extends OperacionesFiguras{
    
    public double radio;
    
    //PI es una constante 
    private final double pi = 3.14159265359;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetroFiguras(){
        
        perimetro = 2*pi*radio;
        
        return perimetro;
    }
    
    @Override
    public double areaFiguras() {
        
        area = pi*Math.pow(radio, 2);
        
        return area;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
