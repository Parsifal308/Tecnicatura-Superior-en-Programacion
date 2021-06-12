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
public abstract class Auto extends Vehiculo {
    public final int N_RUEDAS = 4;

    public Auto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void cambiarRueda(Rueda rueda){
        if(this.getRuedas().size() >= N_RUEDAS){
            System.out.println("Todas las ruedas puestas. No se pueden agregar una rueda sin indicar antes cual sacar");
        }else{
            this.getRuedas().add(rueda);
        }
    }
    @Override
    public void cambiarRueda(Rueda ruedaNueva, Rueda ruedaAntigua){
        this.getRuedas().remove(ruedaAntigua);
        this.getRuedas().add(ruedaNueva);
    }
    
    
}
