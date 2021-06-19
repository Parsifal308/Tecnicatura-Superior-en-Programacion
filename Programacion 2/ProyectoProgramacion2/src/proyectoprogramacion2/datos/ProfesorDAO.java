/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.modelos.Profesor;

/**
 *
 * @author Guillermo Marinero
 */
public class ProfesorDAO extends Driver{
    private final String SQL_INSERT = "INSERT INTO profesor (profesor_dni, profesor_nombre, profesor_apellido, profesor_domicilio, profesor_telefono) VALUES (?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM profesor";
    private final String SQL_DELETE = "DELETE FROM profesor WHERE profesor_dni=?";
    private final String SQL_UPDATE = "UPDATE profesor SET profesor_nombre=?, profesor_apellido=?, profesor_domicilio=?, profesor_telefono=? WHERE profesor_dni=?";
    private final String SQL_FIND = "SELECT * FROM profesor WHERE profesor_dni = ?";
    
    public boolean crearProfesor(Profesor profesor) throws SQLException, ClassNotFoundException{
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
    
    public boolean actualizarProfesor(Profesor profesor) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_UPDATE);
            
            this.consulta.setInt(5, profesor.getDni());
            this.consulta.setString(1, profesor.getNombre());
            this.consulta.setString(2, profesor.getApellido());
            this.consulta.setString(3, profesor.getDomicilio());
            this.consulta.setInt(4, profesor.getTelefono());
            
            this.consulta.executeUpdate();
            
            System.out.println("Profesor actualizado con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al actualizar el profesor : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    public boolean eliminarProfesor(int profesorDNI) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_DELETE);
            
            this.consulta.setInt(1, profesorDNI);
            
            this.consulta.executeUpdate();
            
            System.out.println("Profesor eliminar con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al eliminar profesor : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    public ArrayList<Profesor> leerProfesores() throws ClassNotFoundException, SQLException{
        ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_SELECT);
        
            result = this.consulta.executeQuery();
        
            while(this.result.next()){
                Profesor profesor = new Profesor();
            
                profesor.setDni(result.getInt(1));
                profesor.setNombre(result.getString(2));
                profesor.setApellido(result.getString(3));
                profesor.setDomicilio(result.getString(4));
                profesor.setTelefono(result.getInt(5));

            
                listaProfesores.add(profesor);
            }
        }catch(SQLException e){
            System.out.println("se produjo un error al leer profesores de la base de datos: "+e);
        } finally {
            this.desconectarBD(result);
        }
        return listaProfesores;
    }  
     
    public Profesor buscarProfesor(int dni) throws SQLException{
        Profesor alumno = new Profesor();
        try{
            this.consulta = conn.prepareStatement(SQL_FIND);
            this.consulta.setInt(1, dni);
            this.result = this.consulta.executeQuery();
            
            while(this.result.next()){
                alumno.setDni(this.result.getInt(1));
                alumno.setNombre(this.result.getString(2));
                alumno.setApellido(this.result.getString(3));
                alumno.setDomicilio(this.result.getString(4));
                alumno.setTelefono(this.result.getInt(5));
                
            }
        }catch(SQLException e){
            System.out.println("Error al Buscar Alumno : " + e);            
        }finally{
            this.desconectarBD(this.result);
        }
        return alumno;
    }
           
}
