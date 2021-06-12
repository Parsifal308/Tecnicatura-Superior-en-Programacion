/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramavehiculos1;

/**
 *
 * @author Guillermo Marinero
 */
public class EjercicioDiagramaVehiculos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto(4, 4, "Andrés Trozado");
        Auto auto2 = new Auto(2, 3, "Helen Chufe");
        Moto moto1 = new Moto(1, "Dolores Delano");
        Moto moto2 = new Moto(2,"Penélope Luda");
        
        System.out.println(moto2.getDuenio() + " es dueño/a de una " + moto2.tipo()+ " de " +moto2.Ruedas + " rueda/s");
        System.out.println(moto1.getDuenio() + " es dueño/a de una " + moto1.tipo()+ " de " +moto1.Ruedas + " rueda/s");
        System.out.println(auto1.getDuenio() + " es dueño/a de un " + auto1.tipo()+ " de " +auto1.Ruedas + " rueda/s y " + auto1.getPuertas() + " puerta/s.");
        System.out.println(auto2.getDuenio() + " es dueño/a de un " + auto2.tipo()+ " de " +auto2.Ruedas + " rueda/s y " + auto2.getPuertas() + " puerta/s.");
    }
    
}
