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
public class Bicicleta extends Vehiculo {

    public Bicicleta(int Ruedas, String duenio) {
        super(Ruedas, duenio);
    }

    @Override
    public double Precio(){
        return 0;
    }
    @Override
    public double VelocidadMaxima(){
        return 0;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }
    
    
}
