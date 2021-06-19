package Modelo;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class Universidad {
    private int id;
    private String nombre;
    private String descripcion;
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private ArrayList<Carrera> oferta;

    //CONSTRUCTORES
    public Universidad() {
        oferta = new ArrayList<Carrera>();
    }
    public Universidad(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        oferta = new ArrayList<Carrera>();
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public ArrayList<Profesor> getPlanillaProf() {
        return profesores;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public ArrayList<Carrera> getOferta() {
        return oferta;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    //METHODS
    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    public void agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }
    public void agregarCarrera(Carrera carrera){
        this.oferta.add(carrera);
    }
    
    
    
    
}
