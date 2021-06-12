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
public class Moto extends Vehiculo implements Motor{

    public Moto(int Ruedas, String duenio) {
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

    @Override
    public int getRuedas() {
        return Ruedas;
    }

    @Override
    public String getDuenio() {
        return duenio;
    }

    @Override
    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }

    @Override
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    @Override
    public String tipo() {
        return "Moto";
    }
    
}
