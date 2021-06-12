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
public abstract class Vehiculo {
    protected int Ruedas;
    protected String duenio;

    public Vehiculo(int Ruedas, String duenio) {
        this.Ruedas = Ruedas;
        this.duenio = duenio;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public double Precio(){
        return 0;
    }
    public double VelocidadMaxima(){
        return 0;
    }
}
