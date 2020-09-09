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
 * @version: 2.0.0
 * @since 08/09/2020
 */

public abstract class OperacionesFiguras implements AreaPerimetroFiguras{
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
    public double area;

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
     * imptimir el resultado de las operaciones anteriores
     */
    public void imprimirAreaPerimetro(){
        System.out.println("El Perimetro es de: " + getPerimetro()+"\n");
        
        System.out.println("El Area es de: " + getArea()+"\n");
    }
    
    public double[] getLadosFigura() {
        return ladosFigura;
    }

    public void setLadosFigura(double[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
