/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.modelos.Inscripcion;

/**
 *
 * @author Guillermo Marinero
 */
public class InscripcionDAO extends Driver{
     private final String SQL_INSERT = "INSERT INTO inscripcion (inscripcion_cod, inscripcion_nombre, inscripcion_codCar) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM inscripcion";
    private final String SQL_DELETE = "DELETE FROM inscripcion WHERE inscripcion_cod=?";
    private final String SQL_UPDATE = "UPDATE inscripcion SET inscripcion_nombre=?, inscripcion_codCar=? WHERE inscripcion_cod=?";
    private final String SQL_FIND = "SELECT * FROM alumno WHERE inscripcion_cod=?";
    private final String SQL_INSERT_INTO_ALUMNO = "UPDATE alumno SET alumno_codInscripcion=? WHERE alumno_dni=?";
    
    public boolean crearInscripcion(Inscripcion inscripcion) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            this.consulta.setInt(1, inscripcion.getCod());
            this.consulta.setString(2, inscripcion.getNombre());
            this.consulta.setInt(3, inscripcion.getCarrera());
            this.consulta.executeUpdate();
            
            System.out.println("Inscripcion agregada con exito");
            
            this.consulta = this.conn.prepareStatement(SQL_INSERT_INTO_ALUMNO);
            this.consulta.setInt(1, inscripcion.getCod());
            this.consulta.setInt(2, inscripcion.getAlumnoDNI());
            this.consulta.executeUpdate();
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al crear inscripcion : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean actualizarInscripcion(Inscripcion inscripcion) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_UPDATE);
            
            this.consulta.setInt(3, inscripcion.getCod());
            this.consulta.setString(1, inscripcion.getNombre());
            this.consulta.setInt(2, inscripcion.getCarrera());

            this.consulta.executeUpdate();
            
            System.out.println("Inscripcion actualizada con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al modificar inscripcion : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean eliminarInscripcion(int codInscripcion) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_DELETE);
            
            this.consulta.setInt(1, codInscripcion);
            
            this.consulta.executeUpdate();
            
            System.out.println("Inscripcion eliminada con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al eliminar inscripcion : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
        
    public ArrayList<Inscripcion> leerInscripcion() throws ClassNotFoundException, SQLException{
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<Inscripcion>();
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_SELECT);
        
            result = this.consulta.executeQuery();
        
            while(this.result.next()){
                Inscripcion inscripcion = new Inscripcion();
            
                inscripcion.setCod(result.getInt(1));
                inscripcion.setNombre(result.getString(2));
                inscripcion.setCarrera(result.getInt(3));
            
                listaInscripciones.add(inscripcion);
            }
        }catch(SQLException e){
            System.out.println("se produjo un error al leer inscripciones de la base de datos: "+e);
        } finally {
            this.desconectarBD(result);
        }
        return listaInscripciones;
    }  
    
    public Inscripcion buscarAlumno(int codInscripcion) throws SQLException{
        Inscripcion inscripcion = new Inscripcion();
        try{
            this.consulta = conn.prepareStatement(SQL_FIND);
            this.consulta.setInt(1, codInscripcion);
            this.result = this.consulta.executeQuery();
            
            while(this.result.next()){
                inscripcion.setCod(this.result.getInt(1));
                inscripcion.setNombre(this.result.getString(2));
                inscripcion.setCarrera(this.result.getInt(3));         
            }
        }catch(SQLException e){
            System.out.println("Error al buscar inscripcion : " + e);            
        }finally{
            this.desconectarBD(this.result);
        }
        return inscripcion;
    }
}
