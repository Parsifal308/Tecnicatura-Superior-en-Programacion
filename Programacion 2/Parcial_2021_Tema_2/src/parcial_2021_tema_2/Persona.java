/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2021_tema_2;

/**
 *
 * @author Guillermo Marinero
 */
public abstract class Persona {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected char sexo;

    //CONSTRUCTORS
    public Persona() {
    }
    public Persona(int dni, String nombre, String apellido, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }
    
    //GETTERS
    public int getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public char getSexo() {
        return sexo;
    }
    
    //SETTERS
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
