package proyectoprogramacion2.datos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*@author Guillermo Marinero*/
public class TesteoDeServicio extends Driver{
    public void verTodosAlumnos(){
        try {
            this.conectarBD();
            this.consulta = this.conn.prepareStatement("SELECT dni_Alumno, nombre_Alumno FROM alumnos");
            this.result = this.consulta.executeQuery();
            while(this.result.next()){
                System.out.println("id: "+this.result.getInt("dni_Alumno") + "nombre: " + this.result.getString("nombre_Alumno"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteoDeServicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteoDeServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
