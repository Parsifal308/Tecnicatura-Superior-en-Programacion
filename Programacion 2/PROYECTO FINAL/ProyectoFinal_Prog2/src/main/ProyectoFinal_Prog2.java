package main;

import ConexionBD.Servicio;
import Controlador.ControladorAlumno;
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
import Vistas.VistaAlumno_SolicitarCertificado;
import Vistas.VistaCarrera;
import Vistas.VistaDocente;
import Vistas.VistaEasterEgg;
import Vistas.VistaIngresarDato;
import Vistas.VistaInicio;
import Vistas.VistaOperacionExitosa;
import Vistas.VistaUniversidad;

/*@author Guillermo Marinero*/
public class ProyectoFinal_Prog2 {

    public static void main(String[] args) {
        //Instancio Vistas
        VistaInicio vInicio = new VistaInicio();
        VistaAdministrador vAdmin = new VistaAdministrador();
        VistaAlumno vAlumno = new VistaAlumno();
        VistaCarrera vCarrera = new VistaCarrera();
        VistaDocente vDocente = new VistaDocente();
        VistaUniversidad vUni = new VistaUniversidad();
        VistaEasterEgg vEG = new VistaEasterEgg();
        VistaAlumno_SolicitarCertificado vCertificado = new VistaAlumno_SolicitarCertificado();
        VistaOperacionExitosa vExito = new VistaOperacionExitosa();
        VistaIngresarDato vIngreso = new VistaIngresarDato();
        
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
                
        //Instancio mis Controladores
        ControladorAlumno conAlumno = new ControladorAlumno(vInicio, vAlumno, vEG, vCertificado, vExito, vIngreso);
        
        //Inicio Vistas
        vInicio.setVisible(true);
        
        //testeo consulta base de datos
        //Servicio nuevo = new Servicio();
        //nuevo.verTodosAlumnos();
       
    }
    
}
