/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;
import java.sql.*;
/**
 *
 * @author Guillermo Marinero
 */
public class Driver {
    protected Connection conn;
    protected PreparedStatement statement;
    protected ResultSet result;
 
    public void conectarBD(String servidor, String bd, String usuario, String contraseña) throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.driver");
        
    }
}