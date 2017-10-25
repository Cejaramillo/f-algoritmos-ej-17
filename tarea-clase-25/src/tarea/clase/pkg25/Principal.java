/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.clase.pkg25;

/**
 *
 * @author Carolina
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera c = new Carrera();
        c.establecer_nombre("Informatica");
        c.establecer_modalidad("Distancia");
        System.out.println(c);
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.obtener_modalidad());
        
        Carrera c3 = new Carrera("Sistemas", "Semipresencial");
        System.out.println(c3.obtener_modalidad()+c3.obtener_nombre());
        c3.establecer_nombre("Distancia");
        System.out.println(c3.obtener_modalidad()+c3.obtener_nombre());
        c3.establecer_modalidad(c3.obtener_modalidad().toUpperCase()+c.obtener_nombre());
        System.out.println(c3.obtener_modalidad());
    }
    
}
