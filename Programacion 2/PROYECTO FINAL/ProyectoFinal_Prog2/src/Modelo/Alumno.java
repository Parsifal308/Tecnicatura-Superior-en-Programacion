package Modelo;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class Alumno extends Persona{
    private ESTADO_ACADEMICO estado;
    private ArrayList<DictadoAlumno> cursados;
    private ArrayList<Carrera> cursando = new ArrayList<Carrera>();
    
    public Alumno() {
        this.cursados = new ArrayList<DictadoAlumno>();
    }  

    public Alumno(ESTADO_ACADEMICO estado, int id, int dni, String nombre, String apellido, String email, int telefono, int legajo, String domCalle, int domNum, String user, String pass) {
        super(id, dni, nombre, apellido, email, telefono, legajo, domCalle, domNum, user, pass);
        this.estado = estado;
        this.cursados = new ArrayList<DictadoAlumno>();
    }
}
enum ESTADO_ACADEMICO{
    INGRESANTE,
    EGRESADO,
    REGULAR,
    IRREGULAR,
}
