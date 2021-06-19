/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import proyectoprogramacion2.modelos.Cursado;

/**
 *
 * @author Guillermo Marinero
 */
public class CursadoDAO extends Driver {
    private final String SQL_INSERT = "INSERT INTO cursado (cursado_alumnoDNi, cursado_codMat,cursado_nota) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM cursado";
    private final String SQL_DELETE = "DELETE FROM cursado WHERE cursado_alumnoDNi=?";
    private final String SQL_UPDATE = "UPDATE cursado SET cursado_codMat=?, cursado_nota=? WHERE cursado_alumnoDNi=?";
    private final String SQL_FIND = "SELECT * FROM cursado WHERE cursado_alumnoDNi=?";
    public boolean crearCurso(Cursado cursado) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            
            this.consulta.setInt(1, cursado.getAlumno());
            this.consulta.setInt(2, cursado.getCodMateria());
            this.consulta.setInt(3, cursado.getNotaObtenida());
            
            this.consulta.executeUpdate();
            
            System.out.println("Curso Agregado Con Exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al Crear : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
}
