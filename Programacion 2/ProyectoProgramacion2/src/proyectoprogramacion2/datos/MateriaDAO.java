/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.modelos.Materia;

/**
 *
 * @author Guillermo Marinero
 */
public class MateriaDAO extends Driver {
     private final String SQL_INSERT = "INSERT INTO materia (materia_cod, materia_nombre, materia_profDNI) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM materia";
    private final String SQL_DELETE = "DELETE FROM materia WHERE materia_cod=?";
    private final String SQL_UPDATE = "UPDATE materia SET materia_nombre =?, materia_profDNI=? WHERE materia_cod=?";
    private final String SQL_FIND = "SELECT * FROM materia WHERE materia_cod =?";
    
     public boolean crearMateria(Materia materia) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            
            this.consulta.setInt(1, materia.getCodMateria());
            this.consulta.setString(2, materia.getNombre());
            this.consulta.setInt(3, materia.getProfesorDNI());

            this.consulta.executeUpdate();
            
            System.out.println("Mateia agregada Con Exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al crear materia : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean actualizarAlumno(Materia materia) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_UPDATE);
            
            this.consulta.setInt(3, materia.getCodMateria());
            this.consulta.setString(1, materia.getNombre());
            this.consulta.setInt(2, materia.getProfesorDNI());

            this.consulta.executeUpdate();
            
            System.out.println("Materia actualizada con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al modificar materia : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean eliminarAlumno(int materiaCod) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_DELETE);
            
            this.consulta.setInt(1, materiaCod);
            
            this.consulta.executeUpdate();
            
            System.out.println("Materia eliminada con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al eliminar materia : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
        
    public ArrayList<Materia> leerMaterias() throws ClassNotFoundException, SQLException{
        ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_SELECT);
        
            result = this.consulta.executeQuery();
        
            while(this.result.next()){
                Materia materia = new Materia();
            
                materia.setCodMateria(result.getInt(1));
                materia.setNombre(result.getString(2));
                materia.setProfesorDNI(result.getInt(3));

                listaMaterias.add(materia);
            }
        }catch(SQLException e){
            System.out.println("se produjo un error al leer materias de la base de datos: "+e);
        } finally {
            this.desconectarBD(result);
        }
        return listaMaterias;
    }  
    
    public Materia buscarMateria(int materiaCod) throws SQLException{
        Materia materia = new Materia();
        try{
            this.consulta = conn.prepareStatement(SQL_FIND);
            this.consulta.setInt(1, materiaCod);
            this.result = this.consulta.executeQuery();
            
            while(this.result.next()){
                materia.setCodMateria(this.result.getInt(1));
                materia.setNombre(this.result.getString(2));
                materia.setProfesorDNI(this.result.getInt(3));
                materia.setNombreProfe(this.result.getString(3));
            }
        }catch(SQLException e){
            System.out.println("Error al buscar materia : " + e);            
        }finally{
            this.desconectarBD(this.result);
        }
        return materia;
    }
}
