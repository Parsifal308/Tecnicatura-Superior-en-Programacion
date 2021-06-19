/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoprogramacion2.controlador.ControladorAlumno;
import proyectoprogramacion2.controlador.ControladorCarrera;
import proyectoprogramacion2.controlador.ControladorCursado;
import proyectoprogramacion2.controlador.ControladorInscripcion;
import proyectoprogramacion2.controlador.ControladorMateria;
import proyectoprogramacion2.controlador.ControladorProfesor;
import proyectoprogramacion2.datos.Driver;
import proyectoprogramacion2.modelos.Alumno;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjAlumno;

/**
 *
 * @author Guillermo Marinero
 */
public class ProyectoProgramacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Inicializo la interfaz grafica principal
        VistaInicio vIni = new VistaInicio();
        
        //Inicializo los ocntroladores
        ControladorAlumno contAlum = new ControladorAlumno(vIni);
        ControladorCarrera contCarr = new ControladorCarrera(vIni);
        ControladorCursado contCurs = new ControladorCursado(vIni);
        ControladorInscripcion contIns = new ControladorInscripcion(vIni);
        ControladorMateria contMat = new ControladorMateria(vIni);
        ControladorProfesor contProf = new ControladorProfesor(vIni);
        
        //interfaz grafica principal
        vIni.setVisible(true);
        
        
        //Testeando la conexion de mierda
        Driver driver = new Driver();
        driver.conectarBD();  

        //Se cargan los datos de la base de datos en las tablas al iniciar
        contAlum.mostrarDatosTabla();
        contCarr.mostrarDatosTabla();
        contMat.mostrarDatosTabla();
        contCurs.mostrarDatosTabla();
        contProf.mostrarDatosTabla();
        contIns.mostrarDatosTabla();

    }
    
}
