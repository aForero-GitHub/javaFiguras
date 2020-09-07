/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular el area y perimetro de los CUADRADOS
 * @author Andres Forero
 * @version: 1.1.1
 * @since 03/09/2020
 */

public class Cuadrado extends OperacionesFiguras{

    /**
     * 
     * @param ladosFigura vector para los lados de la figura
     */
    public Cuadrado(double[] ladosFigura) {
        super(ladosFigura);
    }
    
    /**
     * Metodo especializado para calcula para calcular el perimetro de un cuadrado, 
     * se toma uno de sus lados y se multiplica por 4
     * @return perimetro de un cuadrado
     */
    
    @Override
    public double perimetroFiguras(){
        perimetro =ladosFigura[0]*4;
        return perimetro;
    }
    
    /**
     * Metodo especializado para calcular el area de un cuadrado, se toma uno de 
     * sus lados y se multiplica por 2
     * @return area de un cuadrado
     */
    @Override
    public double areaFiguras() {
        for(int contador = 0;contador<ladosFigura.length;contador++){
            area=2*ladosFigura[contador];
        }
        return area;
    }
      
}
