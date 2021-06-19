/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

/**
 *
 * @author Guillermo Marinero
 */
public class Materia {
    private int codMateria;
    private String nombre;
    private Profesor profesor;

    public Materia(int codMateria, String nombre, Profesor profesor) {
        this.codMateria = codMateria;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
}
