/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.modelos.Alumno;

/**
 *
 * @author Guillermo Marinero
 */
public class AlumnoDAO extends Driver{
    private final String SQL_INSERT = "INSERT INTO alumno (alumno_dni, alumno_nombre, alumno_apellido, alumno_domicilio, alumno_telefono) VALUES (?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM alumno";
    private final String SQL_DELETE = "DELETE FROM alumno WHERE alumno_dni=?";
    private final String SQL_UPDATE = "UPDATE alumno SET alumno_nombre=?, alumno_apellido=?, alumno_domicilio=?, alumno_telefono=? WHERE alumno_dni=?";
    private final String SQL_UPDATE_CARRERA = "UPDATE alumno SET alumno_codInscripcion=? WHERE alumno_dni=?";
    private final String SQL_FIND = "SELECT * FROM alumno WHERE alumno_dni=?";
    

    
    //FUNCIONA
    public boolean crearAlumno(Alumno alumno) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            
            this.consulta.setInt(1, alumno.getDni());
            this.consulta.setString(2, alumno.getNombre());
            this.consulta.setString(3, alumno.getApellido());
            this.consulta.setString(4, alumno.getDomicilio());
            this.consulta.setInt(5, alumno.getTelefono());
            
            this.consulta.executeUpdate();
            
            System.out.println("Alumno Agregado Con Exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al Crear : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean actualizarAlumno(Alumno alumno) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_UPDATE);
            
            this.consulta.setInt(5, alumno.getDni());
            this.consulta.setString(1, alumno.getNombre());
            this.consulta.setString(2, alumno.getApellido());
            this.consulta.setString(3, alumno.getDomicilio());
            this.consulta.setInt(4, alumno.getTelefono());
            
            this.consulta.executeUpdate();
            
            System.out.println("Alumno actualizado con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al modificar alumno : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean eliminarAlumno(int alumnoID) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_DELETE);
            
            this.consulta.setInt(1, alumnoID);
            
            this.consulta.executeUpdate();
            
            System.out.println("Alumno eliminado con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al eliminar alumno : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
        
    public ArrayList<Alumno> leerAlumnos() throws ClassNotFoundException, SQLException{
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_SELECT);
        
            result = this.consulta.executeQuery();
        
            while(this.result.next()){
                Alumno alumno = new Alumno();
            
                alumno.setDni(result.getInt(1));
                alumno.setNombre(result.getString(2));
                alumno.setApellido(result.getString(3));
                alumno.setDomicilio(result.getString(4));
                alumno.setTelefono(result.getInt(5));
                alumno.setInsCod(result.getInt(6));
            
                listaAlumnos.add(alumno);
            }
        }catch(SQLException e){
            System.out.println("se produjo un error al leer alumnos de la base de datos: "+e);
        } finally {
            this.desconectarBD(result);
        }
        return listaAlumnos;
    }  
    
    public Alumno buscarAlumno(int dni) throws SQLException{
        Alumno alumno = new Alumno();
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
                alumno.setInsCod(this.result.getInt(6));
                
            }
        }catch(SQLException e){
            System.out.println("Error al buscar alumno : " + e);            
        }finally{
            this.desconectarBD(this.result);
        }
        return alumno;
    }
}
    
    

