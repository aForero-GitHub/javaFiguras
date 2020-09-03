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
public class OperacionesFiguras {
    private float ladosFigura[];
    private float perimetro;
    private float area;

    public OperacionesFiguras(float[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
    
    public float perimetroFiguras(){
        
        for(int contador = 0;contador<ladosFigura.length;contador++){
            perimetro+=ladosFigura[contador];
        }
        return perimetro;
    }
    
    private float areaFiguras() {
        return 0;
    }
    
    private void imprimirResultado(){
        System.out.println("El Perimetro es de: " + perimetro);
        System.out.println("El Area es de: " + area);
    }
    
    public float[] getLadosFigura() {
        return ladosFigura;
    }

    public void setLadosFigura(float[] ladosFigura) {
        this.ladosFigura = ladosFigura;
    }
}
