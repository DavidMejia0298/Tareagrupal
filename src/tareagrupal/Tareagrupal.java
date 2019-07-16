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
public class Tareagrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Deportista deportista = new Deportista();
        
        System.out.println(estudiante.informacion);
        System.out.println(estudiante.obtenernombre);
        System.out.println(estudiante.obtenercuenta);
        
        System.out.println(deportista.informacion);
        System.out.println(deportista.obtenerdeporte);
        System.out.println(deportista.obtenerañospractica);     

    }
    
}
