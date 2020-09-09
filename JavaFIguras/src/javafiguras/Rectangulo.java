/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular perimetro de RECTANGULO 
 * @author Andres Forero
 * @version: 1.2.1
 * @since 08/09/2020
 */

public class Rectangulo extends OperacionesFiguras{

    /**
     * 
     * @param ladosFigura vector para los lados de la figura
     */
    public Rectangulo(double[] ladosFigura) {
        super(ladosFigura);
    }
    
    /**
     * Metodo especializado para calcular el perimetro de un rectangulo
     */
    @Override
    public void calcularPerimetroFiguras(){
        
        for(int contador = 0;contador<getLadosFigura().length;contador++){
            perimetro+=getLadosFigura()[contador];
        }
        setPerimetro(2*perimetro);
    }

    /**
     * Metodo especializado para calcular el Area de un rectangulo
     */
    @Override
    public void calcularAreaFiguras() {
        setArea(getLadosFigura()[0]*getLadosFigura()[1]);
    }
}
