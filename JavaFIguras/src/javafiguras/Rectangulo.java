/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular perimetro de RECTANGULO 
 * @author Andres Forero
 * @version: 1.1.1
 * @since 03/09/2020
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
     * @return perimetro del rectangulo
     */
    @Override
    public double perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        perimetro = 2*perimetro;
        return perimetro;
    }
}
