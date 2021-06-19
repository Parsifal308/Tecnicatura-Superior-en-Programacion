/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

import java.sql.Date;
import proyectoprogramacion2.datos.ProfesorDAO;

/**
 *
 * @author Guillermo Marinero
 */
public class Profesor extends Persona {
    
    ProfesorDAO profesorDAO = new ProfesorDAO();
    int codMateria;

    public Profesor() {
    }

    public Profesor(int dni, String nombre, String apellido, Date fechaNac, String domicilio, int telefono, int codMateria) {
        super(dni, nombre, apellido, fechaNac, domicilio, telefono);
        this.codMateria=codMateria;
    }

    public ProfesorDAO getProfesorDAO() {
        return profesorDAO;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }
    
    
    
    
}
