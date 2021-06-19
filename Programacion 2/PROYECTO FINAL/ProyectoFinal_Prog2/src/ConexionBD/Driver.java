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
    protected PreparedStatement consulta;
    protected ResultSet result;
 
    public void conectarBD(String servidor, String bd, String usuario, String contraseña) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor +"/"+bd, usuario, contraseña);
    }
    
    public void desconectarBD() throws SQLException{
        this.conn.close();
        this.consulta.close();
    }
    
    public void desconectarBD(ResultSet resultSet) throws SQLException{
        this.conn.close();
        this.consulta.close();
        resultSet.close();
    }
}