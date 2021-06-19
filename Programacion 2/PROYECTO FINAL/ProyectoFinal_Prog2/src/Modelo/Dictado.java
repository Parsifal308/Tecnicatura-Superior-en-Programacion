package Modelo;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class Dictado {
    private String Comision;
    private TURNO turno;
    private Carrera carrera;
    private AÑO año;
    private ArrayList<Profesor> docentes = new ArrayList<Profesor>(); // [Profesor | Materia]
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private Materia materia;

            
}
enum TURNO{
    MAÑANA,
    TARDE,
    NOCHE
}
enum AÑO{
    PRIMERO,
    SEGUNDO,
    TERCERO,
    CUARTO,
    QUINTO
}
