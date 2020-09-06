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

public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuOperaciones menu = new MenuOperaciones();
        
        /* en el metodo MenuPrincipal dela clase MenuPrincipal 
        se encuentra toda la logica del menu.*/
        
        menu.menuPrincipal();   
    }   
}