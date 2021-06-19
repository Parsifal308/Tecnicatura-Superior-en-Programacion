package Modelo;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class Carrera {
    private String nombre;
    private TipoCarrera tipo;
    private String descripcion;
    private ArrayList<PlanEstudios> planesEstudio;

    //CONSTRUCTORES
    public Carrera(String nombre, TipoCarrera tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.planesEstudio = new ArrayList<PlanEstudios>();
    }
    public Carrera() {
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public TipoCarrera getTipo() {
        return tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList getPlanesEstudio() {
        return planesEstudio;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(TipoCarrera tipo) {
        this.tipo = tipo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //METHODS
    public void agregarPlan(PlanEstudios plan){
        this.planesEstudio.add(plan);
    }
    
}
enum TipoCarrera{
    INGENIERIA,
    POSTGRADO,
    LICENCIATURA,
    MAESTRIA,
    ESPECIALIZACION,
    TECNICATURA_SUPERIOR,
    CURSO_POSTGRADO    
}
