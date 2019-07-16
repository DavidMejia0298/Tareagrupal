/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareagrupal;

/**
 *
 * @author fam
 */
public abstract class Persona {
    private String Nombre;
    private String Numcuenta;
    public String Deporte;
    public String Añospractica;
            
    public Persona(){
    }
    
    public void establecernombre(String nombre){
        this.Nombre = nombre;
    }
    public String obtenernombre(){
        return this.Nombre;
    }
    
    public void establecercuenta(String cuenta){
        this.Numcuenta = cuenta;
    }
    public String obtenercuenta(){
        return this.Numcuenta;
    }
    
    public void establecerdeporte(String deporte){
        this.Deporte = deporte; 
    }
    public String obtenerdeporte(){
        return this.Deporte;
    }
    
    public void establecerañospractica(String añospractica){
        this.Añospractica = añospractica;
    }
    public String obtenerañospractica(){
        return this.Añospractica;
    }
    
    
    abstract String informacion();
}
