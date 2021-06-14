package main;

import Controlador.Controlador;
import Modelo.Alumno;
import Modelo.Carrera;
import Modelo.Comision;
import Modelo.Dictado;
import Modelo.DictadoAlumno;
import Modelo.Materia;
import Modelo.PlanEstudios;
import Modelo.Profesor;
import Modelo.Universidad;
import Vistas.VistaAdministrador;
import Vistas.VistaAlumno;
import Vistas.VistaCarrera;
import Vistas.VistaDocente;
import Vistas.VistaInicio;
import Vistas.VistaLogin;
import Vistas.VistaUniversidad;

/*@author Guillermo Marinero*/
public class ProyectoFinal_Prog2 {

    public static void main(String[] args) {
        //Instancio Vistas
        VistaInicio VInicio = new VistaInicio();
        VistaAdministrador VAdmin = new VistaAdministrador();
        VistaAlumno VAlumno = new VistaAlumno();
        VistaCarrera VCarrera = new VistaCarrera();
        VistaDocente VDocente = new VistaDocente();
        VistaLogin VLogin = new VistaLogin();
        VistaUniversidad VUni = new VistaUniversidad();
        
        //Instancio clases del modelo
        Alumno alumno = new Alumno();
        Carrera carrera = new Carrera();
        Comision comision = new Comision();
        Dictado dictado = new Dictado();
        DictadoAlumno dictadoAlumno = new DictadoAlumno();
        Materia materia = new Materia();
        PlanEstudios plan = new PlanEstudios();
        Profesor profe = new Profesor();
        Universidad uni = new Universidad();
                
        //Instancio mi controlador 
        Controlador c = new Controlador(alumno, carrera, dictado, dictadoAlumno, comision, profe, materia, plan, VUni, VAdmin, VAlumno, VCarrera, VDocente, VLogin, VUni, VInicio);
        
        //algo por aca
        
        c.getVistaInicio().setVisible(true);
    }
    
}
