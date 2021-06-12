/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramainvestigacionpolicial;

/**
 *
 * @author Guillermo Marinero
 */
public class Direccion {
    private String nombre;
    private int numero;
    private Localidad localidad;

    public Direccion(String nombre, int numero, Localidad localidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public Localidad getLocalidad() {
        return localidad;
    }
    
}
 enum Localidad{
    GodoyCruz,
    LasHeras,
    Mendoza,
    Lujan,
    Guaymallen
}
