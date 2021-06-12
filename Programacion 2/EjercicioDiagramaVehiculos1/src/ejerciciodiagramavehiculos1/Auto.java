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
public class Auto extends Vehiculo implements Motor{
    private int puertas;

    public Auto(int puertas, int Ruedas, String duenio) {
        super(Ruedas, duenio);
        this.puertas = puertas;
    }
    @Override
    public double Precio(){
        return 0;
    }
    @Override
    public double VelocidadMaxima(){
        return 0;
    }

    public int getPuertas() {
        return puertas;
    }


    @Override
    public int getRuedas() {
        return Ruedas;
    }

    @Override
    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }

    @Override
    public String tipo() {
        return "Automovil";
    }
    
}
