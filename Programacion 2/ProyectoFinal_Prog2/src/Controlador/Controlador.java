/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Carrera;
import Modelo.Comision;
import Modelo.Dictado;
import Modelo.DictadoAlumno;
import Modelo.Materia;
import Modelo.PlanEstudios;
import Modelo.Profesor;
import Vistas.VistaAdministrador;
import Vistas.VistaUniversidad;
import Vistas.VistaAlumno;
import Vistas.VistaCarrera;
import Vistas.VistaDocente;
import Vistas.VistaInicio;
import Vistas.VistaLogin;


/**
 *
 * @author Guillermo Marinero
 */
public class Controlador {
    
    //MODELOS
    private Alumno alumno;
    private Carrera carrera;
    private Dictado dictado;
    private DictadoAlumno dictadoAlumno;
    private Comision comision;
    private Profesor profesor;
    private Materia materia;
    private PlanEstudios plan;
    private VistaUniversidad universidad;
    
    //VISTAS
    private VistaAdministrador admin;
    private VistaAlumno VistaAlumno;
    private VistaCarrera VistaCarrera;
    private VistaDocente VistaDocente;
    private VistaLogin VistaLogin;
    private VistaUniversidad VistaUniversidad;
    private VistaInicio VistaInicio;

    //CONSTRUCTOR
    public Controlador(Alumno alumno, Carrera carrera, Dictado dictado, DictadoAlumno dictadoAlumno, Comision comision, Profesor profesor, Materia materia, PlanEstudios plan, VistaUniversidad universidad, VistaAdministrador admin, VistaAlumno VistaAlumno, VistaCarrera VistaCarrera, VistaDocente VistaDocente, VistaLogin VistaLogin, VistaUniversidad VistaUniversidad, VistaInicio VistaInicio) {
        this.alumno = alumno;
        this.carrera = carrera;
        this.dictado = dictado;
        this.dictadoAlumno = dictadoAlumno;
        this.comision = comision;
        this.profesor = profesor;
        this.materia = materia;
        this.plan = plan;
        this.universidad = universidad;
        this.admin = admin;
        this.VistaAlumno = VistaAlumno;
        this.VistaCarrera = VistaCarrera;
        this.VistaDocente = VistaDocente;
        this.VistaLogin = VistaLogin;
        this.VistaUniversidad = VistaUniversidad;
        this.VistaInicio = VistaInicio;
    }

    //GETTERS

    public Alumno getAlumno() {
        return alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Dictado getDictado() {
        return dictado;
    }

    public DictadoAlumno getDictadoAlumno() {
        return dictadoAlumno;
    }

    public Comision getComision() {
        return comision;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Materia getMateria() {
        return materia;
    }

    public PlanEstudios getPlan() {
        return plan;
    }

    public VistaUniversidad getUniversidad() {
        return universidad;
    }

    public VistaAdministrador getAdmin() {
        return admin;
    }

    public VistaAlumno getVistaAlumno() {
        return VistaAlumno;
    }

    public VistaCarrera getVistaCarrera() {
        return VistaCarrera;
    }

    public VistaDocente getVistaDocente() {
        return VistaDocente;
    }

    public VistaLogin getVistaLogin() {
        return VistaLogin;
    }

    public VistaUniversidad getVistaUniversidad() {
        return VistaUniversidad;
    }

    public VistaInicio getVistaInicio() {
        return VistaInicio;
    }
    
    
}
