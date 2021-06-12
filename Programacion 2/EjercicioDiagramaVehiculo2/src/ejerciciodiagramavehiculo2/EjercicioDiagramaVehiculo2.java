/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramavehiculo2;

/**
 *
 * @author Guillermo Marinero
 */
public class EjercicioDiagramaVehiculo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo algunos vehiculos de diferentes tipos
        HondaXR600 honda1 = new HondaXR600(123.42, 150);
        HondaXR25 honda2 = new HondaXR25(93.1354, 120);
        FordFalcon falcon1 = new FordFalcon(112.4134, 140);
        Boing747 boing1 = new Boing747(0, 933.215, 988 );
        
        //Creo varias ruedas
        Rueda ruedaAvion = new Rueda("Carrefour xd", Tipo.avion);
        Rueda ruedaAvion2 = new Rueda("Michelin", Tipo.avion);
        Rueda ruedaMoto = new Rueda("Pirelli", Tipo.moto);
        
        
    }
    
}
