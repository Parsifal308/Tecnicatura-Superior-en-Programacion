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
public class Rueda {
    private String marca;
    private Tipo tipo;

    public Rueda(String marca, Tipo tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Tipo getTipo(){
        return this.tipo;
    }
    
}
enum Tipo{
    avion,
    moto,
    automovil,
    bicicleta,
    tutu
}
