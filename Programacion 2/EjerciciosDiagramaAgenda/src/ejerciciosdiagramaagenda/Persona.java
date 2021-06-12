/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdiagramaagenda;

/**
 *
 * @author Guillermo Marinero
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private Integer idPersona;

    public Persona(String nombre, String apellido, Integer idPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
