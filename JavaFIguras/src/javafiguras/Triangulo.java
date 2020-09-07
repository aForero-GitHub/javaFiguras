/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 * Clase encargada de calcular el area y perimetos de TRIANGULO
 * @author Andres Forero
 * @version: 1.1.1
 * @since 03/09/2020
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
     * 
     * Metodo especializado para calcular el perimetro de un triangulo rectangulo
     * @return perimetro del triangulo
     */
    @Override
    public double perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        perimetro = 2*ladosFigura[0]+ladosFigura[1];
        return perimetro;
    }
    
    /**
     * Metodo especializado para calcular el area de un triangulo rectangulo
     * @return area de un triangulo
     */
    @Override
    public double areaFiguras() {
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            area=area*ladosFigura[contador];
        }
        
        area = area/2;
        
        return area;
    }
    
}
