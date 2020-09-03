/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leerOpcion = new Scanner(System.in);
        Scanner leerDimensionLado = new Scanner(System.in);
        
        float lados[] = {2,2,2};
        int tamanio = 0;
        float radio=0;
        int opcion = 0;
        Cuadrado cuadrado = new Cuadrado(lados);
        Rectangulo rectangulo = new Rectangulo(lados);
        Triangulo triangulo = new Triangulo(lados);
        Circulo circulo = new Circulo(lados);
        
        System.out.println("De que figura desea conoser AREA y PERIMETRO: "+
                "\n(1.) Cuadrado"+
                "\n(2.) Rectangulo"+
                "\n(3.) Triangulo"+
                "\n(4.) Circulo"+
                "\n"+
                "\nSeleccione una opcion: ");
        opcion = leerOpcion.nextInt();
        
        switch(opcion){
            case 1:
                /*Cuadrado
                tamanio = 1;
                for(int i = 0; i<tamanio; i++){
                    System.out.println("Ingrese la medida de los lados del cuadrado: ");
                    lados[i]= leerDimensionLado.nextFloat();
                }*/
                System.out.println("El Perimetro del cuadrado es de: "+ cuadrado.perimetroFiguras());
                break;
            case 2:
                //Rectangulo
                System.out.println("El Perimetro del rectangulo es de: "+ rectangulo.perimetroFiguras());
                break;
            case 3:
                //Triangulo
                System.out.println("El Perimetro del triangulo es de: "+ triangulo.perimetroFiguras());
                break;
            case 4:
                //Circulo
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
    }
    
}
