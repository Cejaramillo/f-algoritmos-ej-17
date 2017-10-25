/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author Carolina
 */
public class Carrrera {
    private String nombre;
    private String modalidad;
    
    public Carrrera(){
        modalidad = "distancia";
    }
    
    public Carrrera(String md){
        modalidad = md;
    }
    
    public Carrrera(String md, String n){
        modalidad = md;
        nombre = n;
    }
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecer_modalidad(String n){
        modalidad = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Modalidad %s - Carrera %s\n",
                obtener_modalidad(), obtener_nombre());
        return cadena;
    }

    
}
