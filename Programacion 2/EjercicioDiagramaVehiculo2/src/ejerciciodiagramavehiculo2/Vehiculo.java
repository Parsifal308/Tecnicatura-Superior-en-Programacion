/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramavehiculo2;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Marinero
 */
public abstract class Vehiculo implements Desplazable{
    private double velocidadPromedio;
    private int velocidadMaxima;
    private ArrayList<Rueda> ruedas;
    
    public void romperInercia(){
        
    }

    public Vehiculo(double velocidadPromedio, int velocidadMaxima) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
        ruedas = new ArrayList();
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public ArrayList getRuedas(){
        return ruedas;
    }
    
    
    public void cambiarRueda(Rueda ruedaNueva){
        
    }
    public void cambiarRueda(Rueda ruedaNueva, Rueda ruedaAntigua){
        
    }
    @Override
    public void esquivarObstaculo(){
        
    }
}
