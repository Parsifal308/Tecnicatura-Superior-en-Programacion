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
public class Inscripcion {
    private int cod;
    private String nombre;
    private Date fecha;
    private Carrera carrera;
    private Alumno alumno;

    public Inscripcion(int cod, String nombre, Date fecha, Carrera carrera, Alumno alumno) {
        this.cod = cod;
        this.nombre = nombre;
        this.fecha = fecha;
        this.carrera = carrera;
        this.alumno = alumno;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
}
