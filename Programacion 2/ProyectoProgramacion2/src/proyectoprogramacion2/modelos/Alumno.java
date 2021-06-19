/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

import java.sql.Date;
import java.sql.SQLException;
import proyectoprogramacion2.datos.AlumnoDAO;

/**
 *
 * @author Guillermo Marinero
 */
public class Alumno extends Persona {
    private AlumnoDAO alumnoDAO = new AlumnoDAO();
    private int insCod;
     
    public Alumno() {
    }

    public Alumno(Inscripcion inscripcion, int dni, String nombre, String apellido, Date fechaNac, String domicilio, int telefono, int insCod) {
        super(dni, nombre, apellido, fechaNac, domicilio, telefono);
        this.insCod = insCod;

    }

    public int getInsCod() {
        return insCod;
    }

    public void setInsCod(int insCod) {
        this.insCod = insCod;
    }

    public AlumnoDAO getAlumnoDAO() {
        return alumnoDAO;
    }
    
 

    
    
    
}
