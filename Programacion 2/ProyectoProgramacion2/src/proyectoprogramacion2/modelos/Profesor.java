/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

import java.sql.Date;

/**
 *
 * @author Guillermo Marinero
 */
public class Profesor extends Persona {
    
    public Profesor(int dni, String nombre, String apellido, Date fechaNac, String domicilio, int telefono) {
        super(dni, nombre, apellido, fechaNac, domicilio, telefono);
    }
    
    
}
