/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiguras;

import java.util.Scanner;

/**
 * @author Andres Forero
 * @version: 1.0.0
 * @since 03/09/2020
 */
public class MenuOperaciones {

    private double lados[] = new double[2];
    private double radio;
    private int opcion;
    private String opcion2;
    int n = 1;// referencia del lado a ingresar en rectangulo y triangulo 

    public MenuOperaciones() {
    }

    public void menuPrincipal() {

        Scanner leerOpcion = new Scanner(System.in);
        Scanner leerOpcion2 = new Scanner(System.in);
        Scanner leerDimensionLado = new Scanner(System.in);

        Cuadrado cuadrado = new Cuadrado(lados);
        Rectangulo rectangulo = new Rectangulo(lados);
        Triangulo triangulo = new Triangulo(lados);

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
                    for (int i = 0; i < lados.length; i++) {
                        System.out.println("Ingrese la medida de los lados del cuadrado: ");
                        lados[i] = leerDimensionLado.nextDouble();
                    }
                    cuadrado.imprimirResultado();

                    break;

                case 2:

                    //Rectangulo
                    for (int i = 0; i < lados.length; i++) {
                        System.out.println("Ingrese la medida " + n++ + " del rectangulo: ");
                        lados[i] = leerDimensionLado.nextDouble();
                    }

                    rectangulo.imprimirResultado();

                    break;

                case 3:

                    //Triangulo
                    for (int i = 0; i < lados.length; i++) {
                        System.out.println("Ingrese la medida " + n++ + " del triangulo: ");
                        lados[i] = leerDimensionLado.nextDouble();
                    }
                    triangulo.imprimirResultado();

                    break;

                case 4:

                    //Circulo
                    System.out.println("Ingrese el radio del circulo: ");
                    radio = leerDimensionLado.nextDouble();

                    //PREGUNTAR-----------------------------------------------------
                    Circulo circulo = new Circulo(radio);
                    circulo.imprimirResultado();

                    break;

                default:

                    System.out.println("Opcion no valida");

            }
            
            System.out.println("¿Quieres calcular otra figura? S/s N/n");
            
            opcion2 = leerOpcion2.nextLine();
            
        } while (!opcion2.equals("n") && !opcion2.equals("N"));
    }

}
