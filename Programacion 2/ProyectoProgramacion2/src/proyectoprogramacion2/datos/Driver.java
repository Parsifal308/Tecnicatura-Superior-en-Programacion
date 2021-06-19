/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;
import java.sql.*;
/**
 *
 * @author Guillermo Marinero
 */
public class Driver {
    
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATA_BASE = "bdprogramacion2";
    private static final String SSL = "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";
    
    protected Connection conn;
    protected PreparedStatement consulta;
    protected ResultSet result;
 
    public void conectarBD() throws ClassNotFoundException, SQLException{  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(URL + DATA_BASE + SSL, USER_NAME, PASSWORD);
            if (conn != null) {
                System.out.println("Conexión Exitosa!");
                System.out.println("Conectado a : " + URL + DATA_BASE + SSL);
            } 
        }catch (ClassNotFoundException e) {
            System.err.println("Error De Conexión! :  " + e);
            System.err.println("Error De Conexión A Base De Datos!\n " + e);
            System.exit(0);
        } catch(SQLException e){
            System.err.println("Error De Conexión! :  " + e);
            System.err.println("Error De Conexión A Base De Datos!\n " + e);
            System.exit(0);                
        }
    }
    
    public void desconectarBD() throws SQLException{
        try {
            this.conn.close();
            this.consulta.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void desconectarBD(ResultSet resultSet) throws SQLException{
        try {
            this.conn.close();
            this.consulta.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}