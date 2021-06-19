/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.modelos.Cursado;

/**
 *
 * @author Guillermo Marinero
 */
public class CursadoDAO extends Driver {
    private final String SQL_INSERT = "INSERT INTO cursado (cursado_alumnoDNi, cursado_codMat) VALUES (?,?)";
    private final String SQL_SELECT = "SELECT * FROM cursado";
    private final String SQL_DELETE = "DELETE FROM cursado WHERE cursado_alumnoDNi=? AND cursado_codMat=?";
    private final String SQL_UPDATE = "UPDATE cursado SET cursado_nota=? WHERE cursado_alumnoDNi=? AND cursado_codMat=?";
    private final String SQL_FIND = "SELECT * FROM cursado WHERE cursado_alumnoDNi=? AND cursado_codMat=?";
    
    public boolean crearCurso(Cursado cursado) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_INSERT);
            
            this.consulta.setInt(1, cursado.getAlumnoDNI());
            this.consulta.setInt(2, cursado.getCodMateria());
            
            this.consulta.executeUpdate();
            
            System.out.println("Cursado agregado con  exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al crear cursado : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    public boolean actualizarCursado(Cursado cursado) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_UPDATE);
            
            this.consulta.setInt(2, cursado.getAlumnoDNI());
            this.consulta.setInt(3, cursado.getCodMateria());
            this.consulta.setInt(1, cursado.getNotaObtenida());
            
            this.consulta.executeUpdate();
            
            System.out.println("Cursado actualizado con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al modificar cursado : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
    
    //FUNCIONA
    public boolean eliminarCursado(int alumnoDNI, int materiaCod) throws SQLException, ClassNotFoundException{
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_DELETE);
            
            this.consulta.setInt(1, alumnoDNI);
            this.consulta.setInt(2, materiaCod);
            
            this.consulta.executeUpdate();
            
            System.out.println("Cursado eliminado con exito");
            
            return true;

        }catch(SQLException e){
            System.out.println("Error al eliminar cursado : " + e);
            return false;   
        }finally {
            this.desconectarBD();
        }
    }
        
    public ArrayList<Cursado> leerCursados() throws ClassNotFoundException, SQLException{
        ArrayList<Cursado> listaCursados = new ArrayList<Cursado>();
        try{
            this.conectarBD();
            this.consulta = this.conn.prepareStatement(SQL_SELECT);
        
            result = this.consulta.executeQuery();
        
            while(this.result.next()){
                Cursado cursado = new Cursado();
            
                cursado.setAlumno(result.getInt(1));
                cursado.setCodMateria(result.getInt(2));
                cursado.setNotaObtenida(result.getInt(3));

                listaCursados.add(cursado);
            }
        }catch(SQLException e){
            System.out.println("se produjo un error al leer cursados de la base de datos: "+e);
        } finally {
            this.desconectarBD(result);
        }
        return listaCursados;
    }  
    
    public Cursado buscarCursado(int alumnoDNI, int materiaCod) throws SQLException{
        Cursado cursado = new Cursado();
        try{
            this.consulta = conn.prepareStatement(SQL_FIND);
            
            this.consulta.setInt(1, alumnoDNI);
            this.consulta.setInt(2, materiaCod);
            
            this.result = this.consulta.executeQuery();
            
            while(this.result.next()){
                cursado.setAlumno(this.result.getInt(1));
                cursado.setCodMateria(this.result.getInt(2));
                cursado.setNotaObtenida(this.result.getInt(3));

                
            }
        }catch(SQLException e){
            System.out.println("Error al buscar alumno : " + e);            
        }finally{
            this.desconectarBD(this.result);
        }
        return cursado;
    }
}
