/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.modelos.Carrera;

/**
 *
 * @author Guillermo Marinero
 */
public class CarreraDAO extends Driver{
    private final String SQL_INSERT = "INSERT INTO carrera (carrera_cod, carrera_nombre, carrera_duracion) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM carrera";
    private final String SQL_DELETE = "DELETE FROM carrera WHERE carrera_cod=?";
    private final String SQL_UPDATE = "UPDATE carrera SET carrera_nombre=?, carrera_duracion=? WHERE carrera_cod=?";
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
    
    public boolean actualizarCarrera(Carrera carrera) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_UPDATE);
            
            this.consulta.setInt(3, carrera.getCodigo());
            this.consulta.setString(1, carrera.getNombre());
            this.consulta.setInt(2, carrera.getDuracion());

            this.consulta.executeUpdate();
            
            System.out.println("Carrera actualizada con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al modificar carrera : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    
    public boolean eliminarCarrera(int codCarrera) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_DELETE);
            
            this.consulta.setInt(1, codCarrera);
            
            this.consulta.executeUpdate();
            
            System.out.println("Carrera eliminada con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al eliminar carrera : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    
    public ArrayList<Carrera> leerCarreras() throws ClassNotFoundException, SQLException{
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>();
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_SELECT);
        
            result = this.consulta.executeQuery();
        
            while(this.result.next()){
                Carrera carrera = new Carrera();
            
                carrera.setCodigo(result.getInt(1));
                carrera.setNombre(result.getString(2));
                carrera.setDuracion(result.getInt(3));
            
                listaCarreras.add(carrera);
            }
        }catch(SQLException e){
            System.out.println("se produjo un error al leer las carreras de la base de datos: "+e);
        } finally {
            this.desconectarBD(result);
        }
        return listaCarreras;
    }  
    
    
    public Carrera buscarAlumno(int dni) throws SQLException{
        Carrera carrera = new Carrera();
        try{
            this.consulta = conn.prepareStatement(SQL_FIND);
            this.consulta.setInt(1, dni);
            this.result = this.consulta.executeQuery();
            
            while(this.result.next()){
                carrera.setCodigo(this.result.getInt(1));
                carrera.setNombre(this.result.getString(2));
                carrera.setDuracion(this.result.getInt(3));         
            }
        }catch(SQLException e){
            System.out.println("Error al buscar carrera : " + e);            
        }finally{
            this.desconectarBD(this.result);
        }
        return carrera;
    }
}
