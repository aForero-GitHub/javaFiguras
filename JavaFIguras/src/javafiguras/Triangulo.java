/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular el area y perimetos de TRIANGULO
 * @author Andres Forero
 * @version: 1.1.2
 * @since 08/09/2020
 */

public class Triangulo extends OperacionesFiguras{

    /**
     * 
     * @param ladosFigura vector para los lados de la figura
     */
    public Triangulo(double[] ladosFigura) {
        super(ladosFigura);
    }
    
    /**
     * Metodo especializado para calcular el perimetro de un triangulo rectangulo
     */
    @Override
    public void calcularPerimetroFiguras(){
        setPerimetro(2*getLadosFigura()[0]+getLadosFigura()[1]);
    }
    
    /**
     * Metodo especializado para calcular el area de un triangulo rectangulo
     */
    @Override
    public void calcularAreaFiguras() {
        setArea((getLadosFigura()[0]*getLadosFigura()[1])/2);
    }
    
}
