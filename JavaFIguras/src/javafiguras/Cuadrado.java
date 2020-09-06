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

public class Cuadrado extends OperacionesFiguras{

    public Cuadrado(double[] ladosFigura) {
        super(ladosFigura);
    }
    
    /*para calcular el perimetro de un cuadrado se toma uno de 
    sus lados y se multiplica por 4 */
    
    @Override
    public double perimetroFiguras(){
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro =ladosFigura[contador]*4;
        }
        return perimetro;
    }
    
    /*Para calcular el area de un cuadrado se toma uno de sus lados y 
    se multiplica por 2 */
    @Override
    public double areaFiguras() {
        for(int contador = 0;contador<ladosFigura.length;contador++){
            area=2*ladosFigura[contador];
        }
        return area;
    }
      
}
