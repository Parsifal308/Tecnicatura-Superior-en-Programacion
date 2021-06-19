/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

import java.sql.Date;

/**
 *
 * @author Guillermo Marinero
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private String domicilio;
    private int telefono;

    public Persona() {
    }

    
    
    public Persona(int dni, String nombre, String apellido, Date fechaNac, String domicilio, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
      
    public void cleanAtrib(){
        this.setApellido(null);
        this.setDni(0);
        this.setDomicilio(null);
        this.setFechaNac(null);
        this.setNombre(null);
        this.setTelefono(0);
    }
    
}
