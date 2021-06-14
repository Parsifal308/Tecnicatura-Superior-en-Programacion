package Modelo;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class PlanEstudios {
    private int anio;
    private String descripcion;
    private ArrayList<Materia> materiasPlan = new ArrayList<Materia>();

    //CONSTRUCTORES
    public PlanEstudios() {
    }
    public PlanEstudios(int anio, String descripcion) {
        this.anio = anio;
        this.descripcion = descripcion;
    }

    //GETTERS
    public int getAnio() {
        return anio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public ArrayList<Materia> getMateriasPlan() {
        return materiasPlan;
    }

    //SETTERS
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //METHODS
    public void agregarMateria(Materia materia){
        this.materiasPlan.add(materia);
    }
    
}
