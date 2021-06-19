/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import proyectoprogramacion2.modelos.Profesor;

/**
 *
 * @author Guillermo Marinero
 */
public class ProfesorDAO extends Driver{
    private final String SQL_INSERT = "INSERT INTO profesor (profesor_dni, profesor_nombre, profesor_apellido, profesor_domicilio, profesor_telefono) VALUES (?,?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM profesor";
    private final String SQL_DELETE = "DELETE FROM profesor WHERE profesor_dni=?";
    private final String SQL_UPDATE = "UPDATE profesor SET profesor_nombre=?, profesor_apellido=?, profesor_domicilio=?, profesor_telefono=? WHERE profesor_dni=?";
    private final String SQL_FIND = "SELECT * FROM profesor WHERE profesor_dni = ?";
    
    public boolean crearAlumno(Profesor profesor) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            
            this.consulta.setInt(1, profesor.getDni());
            this.consulta.setString(2, profesor.getNombre());
            this.consulta.setString(3, profesor.getApellido());
            this.consulta.setString(4, profesor.getDomicilio());
            this.consulta.setInt(5, profesor.getTelefono());
            
            this.consulta.executeUpdate();
            
            System.out.println("Profesor Agregado Con Exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al Crear : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
}
