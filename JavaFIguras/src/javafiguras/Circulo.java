/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular el perimetro y area de CIRCULO
 * @author Andres Forero
 * @version: 1.1.2
 * @since 08/09/2020
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
    public void calcularPerimetroFiguras(){
        
        setPerimetro(2*pi*getRadio());
    }
    
    /**
     * Metodo especializado para calcular el area de un circulo
     * @return area de un circulo
     */
    @Override
    public void calcularAreaFiguras() {
        
        setArea(pi*Math.pow(getRadio(), 2));
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
