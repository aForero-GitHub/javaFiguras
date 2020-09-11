/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

import java.util.Scanner;

/**
 * Esta clase contiene toda la logica correspondiente al menu de opciones, a demas de 
 * capturar las variables ingresadas por el usuario para hacer los calculos correspondientes
 * @author Andres Forero
 * @version: 2.0.2
 * @since 03/09/2020
 */
public class MenuOperaciones {
    
    
    private AreaPerimetroFiguras figuras[] = new AreaPerimetroFiguras[4];
    
    /**
     * vector para enviar los lados capturados a la clase correspondiente
     */
    private double lados[] = new double[2];
    
    /**
     * capturar el radio del circulo que se quiere calcular
     */
    private double radio;
    
    /**
     * seleccion de las opciones del menu SWITCH
     */
    private int opcion;
    
    /**
     * Validar si se desea calcular el area y perimetro de otra figura
     * S/s = SI
     * N/n = NO
     */
    private String opcion2;
    
    /**
     * referencia para indicar al usuario el lado que esta ingresando en 
     * los calculos de rectangulo y triangulo 
     */
    int n = 1;
    
    public MenuOperaciones() {
    }

    /**
     * Este medoto se encarga de mostrar el menu de opciones y recibir las variables 
     * ingresadas por los usuarios para realizar los calculos necesarios.
     */
    public void menuPrincipal() {

        
        
        Scanner leerOpcion = new Scanner(System.in);
        Scanner leerOpcion2 = new Scanner(System.in);
        Scanner leerDimensionLado = new Scanner(System.in);
        
        

        do {
            System.out.println("De que figura desea conoser AREA y PERIMETRO: "
                    + "\n(1.) Cuadrado"
                    + "\n(2.) Rectangulo"
                    + "\n(3.) Triangulo"
                    + "\n(4.) Circulo"
                    + "\n"
                    + "\nSeleccione una opcion: ");
            opcion = leerOpcion.nextInt();

            switch (opcion) {

                case 1:

                    //Cuadrado
                    System.out.println("Ingrese la medida de los lados del cuadrado: ");
                    lados[0] = leerDimensionLado.nextDouble();
                    
                    figuras[0]=new Cuadrado(lados);
                    figuras[0].calcularPerimetroFiguras();
                    figuras[0].calcularAreaFiguras();
                    OperacionesFiguras opFiguras = (OperacionesFiguras) figuras[0];
                    opFiguras.imprimirAreaPerimetro();

                    break;

                case 2:

                    //Rectangulo
                    for (int i = 0; i < lados.length; i++) {
                        System.out.println("Ingrese la medida " + n++ + " del rectangulo: ");
                        lados[i] = leerDimensionLado.nextDouble();
                    }
                    
                    figuras[1]=new Rectangulo(lados);
                    figuras[1].calcularPerimetroFiguras();
                    figuras[1].calcularAreaFiguras();
                    OperacionesFiguras opFiguras1 = (OperacionesFiguras) figuras[1];
                    opFiguras1.imprimirAreaPerimetro();

                    break;

                case 3:

                    //Triangulo
                    for (int i = 0; i < lados.length; i++) {
                        System.out.println("Ingrese la medida " + n++ + " del triangulo: ");
                        lados[i] = leerDimensionLado.nextDouble();
                    }
                    
                    figuras[2]=new Triangulo(lados);
                    figuras[2].calcularPerimetroFiguras();
                    figuras[2].calcularAreaFiguras();
                    OperacionesFiguras opFiguras2 = (OperacionesFiguras) figuras[2];
                    opFiguras2.imprimirAreaPerimetro();

                    break;

                case 4:

                    //Circulo
                    System.out.println("Ingrese el radio del circulo: ");
                    radio = leerDimensionLado.nextDouble();
                    
                    figuras[3]=new Cuadrado(lados);
                    figuras[3].calcularPerimetroFiguras();
                    figuras[3].calcularAreaFiguras();
                    OperacionesFiguras opFiguras3 = (OperacionesFiguras) figuras[3];
                    opFiguras3.imprimirAreaPerimetro();

                    break;

                default:

                    System.out.println("Opcion no valida");

            }
            //S/s = si N/n = no
            System.out.println("¿Quieres calcular otra figura? S/s N/n");
            
            opcion2 = leerOpcion2.nextLine();
            
        } while (!opcion2.equals("n") && !opcion2.equals("N"));
    }

}
