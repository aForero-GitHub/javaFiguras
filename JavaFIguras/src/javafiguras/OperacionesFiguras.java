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

public abstract class OperacionesFiguras {
    public double ladosFigura[];
    public double perimetro;
    public double area = 1;
   
    
    public OperacionesFiguras(double[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
    
    public OperacionesFiguras(){
    }
    
    //metodo general para calcular el perimetro de una figura (L+L+L...)
    public double perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        
        return perimetro;
    }
    
    //metodo general para calcular el area de una figura (B*H)
    public double areaFiguras() {
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            area=area*ladosFigura[contador];
        }
        
        return area;
    }
    
    //imptimir el resultado de las operaciones anteriores
    public void imprimirResultado(){
        System.out.println("El Perimetro es de: " + perimetroFiguras()+"\n");
        
        System.out.println("El Area es de: " + areaFiguras()+"\n");
    }
    
    public double[] getLadosFigura() {
        return ladosFigura;
    }

    public void setLadosFigura(double[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
}
