/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular el perimetro y area de CIRCULO
 * @author Andres Forero
 * @version: 1.1.1
 * @since 03/09/2020
 */

public class Circulo extends OperacionesFiguras{
    
    /**
     * Radio del circulo
     */
    public double radio;
    
    /**
     * PI es una constante
     */
    private final double pi = 3.14159265359;
    
    /**
     * 
     * @param radio radio del circulo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     *Metodo especializado para calcular el perimetro de un circulo
     * @return perimetro de un circulo
     */
    @Override
    public double perimetroFiguras(){
        
        perimetro = 2*pi*radio;
        
        return perimetro;
    }
    
    /**
     * Metodo especializado para calcular el area de un circulo
     * @return area de un circulo
     */
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
