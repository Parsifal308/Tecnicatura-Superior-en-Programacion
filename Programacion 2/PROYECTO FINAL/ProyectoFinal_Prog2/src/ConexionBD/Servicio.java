/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Guillermo Marinero
 */
public class Servicio extends Driver{
    public void verTodosAlumnos(){
        try {
            this.conectarBD("123.0.0.1", "bd_universidad", "root", "1234");
            this.consulta = this.conn.prepareStatement("SELECT dni_Alumno, nombre_Alumno FROM alumnos");
            this.result = this.consulta.executeQuery();
            while(this.result.next()){
                System.out.println("id: "+this.result.getInt("dni_Alumno") + "nombre: " + this.result.getString("nombre_Alumno"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
