/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

/**
 *
 * @author Andres Forero
 */
public abstract class OperacionesFiguras {
    private double ladosFigura[];
    private double perimetro;
    private double area;

    public OperacionesFiguras(double[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
    
    public double perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        return perimetro;
    }
    
    private double areaFiguras() {
        return 0;
    }
    
    private void imprimirResultado(){
        System.out.println("El Perimetro es de: " + perimetro);
        System.out.println("El Area es de: " + area);
    }
    
    public double[] getLadosFigura() {
        return ladosFigura;
    }

    public void setLadosFigura(double[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
}
