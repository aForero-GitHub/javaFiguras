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

public class Rectangulo extends OperacionesFiguras{

    public Rectangulo(double[] ladosFigura) {
        super(ladosFigura);
    }
    
    @Override
    public double perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        perimetro = 2*perimetro;
        return perimetro;
    }
}
