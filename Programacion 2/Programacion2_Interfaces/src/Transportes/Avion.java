/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

import programacion2_interfaces.IVolar;

/**
 *
 * @author Guillermo Marinero
 */
public class Avion extends Transporte implements IVolar {
    
    String modelo;
    int capPasajeros;
    int capCombustible;
    
    public void Volar(){
        System.out.println("El avion vuela de destino a destino designado, haciendo paradas de ser necesario");
    }
    
    private void SolicitarCombustible(){
        System.out.println("Se solicita carga de combustible al centro de mando del aeropuerto");
    }

    public Avion(String modelo, int capPasajeros, int capCombustible, float peso) {
        super(peso);
        this.modelo = modelo;
        this.capPasajeros = capPasajeros;
        this.capCombustible = capCombustible;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public int getCapCombustible() {
        return capCombustible;
    }

    public float getPeso() {
        return peso;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public void setCapCombustible(int capCombustible) {
        this.capCombustible = capCombustible;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

   
    
}
