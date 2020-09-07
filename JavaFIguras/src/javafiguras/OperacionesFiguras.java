/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafiguras;

/**
 * esta clase ABSTRACTA es la clase padre con los metodos genericos para el area,
 * perimetro e impresion de los resultados
 * @author Andres Forero
 * @version: 1.1.1
 * @since 03/09/2020
 */

public abstract class OperacionesFiguras {
    /**
     * Vector para los lados de las figuras
     */
    public double ladosFigura[];
    
    /**
     * variable que almacena el resultado del calculo de perimetro (L+L+L.....)
     */
    public double perimetro;
    
    /**
     * variable que almacena el resultado del calculo deL Area (B*H)
     */
    public double area = 1;
   
   /**
    * 
    * @param ladosFigura 
    */ 
    public OperacionesFiguras(double[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
    
    /**
     * constructor vacio para la clase CIRCULO
     */
    public OperacionesFiguras(){
    }
    
    /**
     * metodo general para calcular el perimetro de una figura (L+L+L...)
     * @return perimetro de las figuras
     */
    public double perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        
        return perimetro;
    }
    
    /**
     * metodo general para calcular el area de una figura (B*H)
     * @return area de las figuras
     */
    public double areaFiguras() {
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            area=area*ladosFigura[contador];
        }
        
        return area;
    }
    
    /**
     * imptimir el resultado de las operaciones anteriores
     */
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
