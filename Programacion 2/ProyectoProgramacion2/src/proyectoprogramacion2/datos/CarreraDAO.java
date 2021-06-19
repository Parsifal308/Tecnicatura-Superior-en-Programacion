/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import proyectoprogramacion2.modelos.Carrera;

/**
 *
 * @author Guillermo Marinero
 */
public class CarreraDAO extends Driver{
    private final String SQL_INSERT = "INSERT INTO carrera (carrera_cod, carrera_nombre, carrera_duracion) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM carrera";
    private final String SQL_DELETE = "DELETE FROM carrera WHERE carrera_cod=?";
    private final String SQL_UPDATE = "UPDATE carrera SET carrera_nombre=?,carrera_duracion=? WHERE carrera_cod=?";
    private final String SQL_FIND = "SELECT * FROM carrera WHERE carrera_cod=?";
    public boolean crearCarrera(Carrera carrera) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            
            this.consulta.setInt(1, carrera.getCodigo());
            this.consulta.setString(2, carrera.getNombre());
            this.consulta.setInt(3, carrera.getDuracion());
            
            this.consulta.executeUpdate();
            
            System.out.println("Carrera Agregada Con Exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al Crear : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
}
