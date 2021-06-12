/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2021_tema_2;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Marinero
 */
public class Especialidad {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Medico> medicos = new ArrayList();

    //CONSTRUCTOS
    public Especialidad() {
        this.habitaciones = new ArrayList();
    }
    public Especialidad(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList();
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }
    
    //METHODS
    public void addHabitacion(Habitacion habitacion){
        this.habitaciones.add(habitacion);
    }
    public void addMedico(Medico medico){
        this.medicos.add(medico);
    }
}
