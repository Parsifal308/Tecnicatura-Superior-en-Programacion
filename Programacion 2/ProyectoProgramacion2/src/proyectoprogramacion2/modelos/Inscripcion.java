/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

import java.sql.Date;
import proyectoprogramacion2.datos.InscripcionDAO;

/**
 *
 * @author Guillermo Marinero
 */
public class Inscripcion {
    private InscripcionDAO inscripcionDAO = new InscripcionDAO();
    private int codInscrip;
    private String nombre;
    private int codCarrera;
    private int alumnoDNI;


    public Inscripcion() {
    }

    public Inscripcion(int cod, String nombre, int carrera, int dni) {
        this.codInscrip = cod;
        this.nombre = nombre;
        this.codCarrera = carrera;
        this.alumnoDNI = dni;
    }

    public int getCod() {
        return codInscrip;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarrera() {
        return codCarrera;
    }

    public void setCod(int cod) {
        this.codInscrip = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(int carrera) {
        this.codCarrera = carrera;
    }
    public void cleanAtrib(){
        this.setCarrera(0);
        this.setNombre(null);
        this.setCod(0);
    }

    public InscripcionDAO getInscripcionDAO() {
        return inscripcionDAO;
    }

    public int getAlumnoDNI() {
        return alumnoDNI;
    }

    public void setAlumnoDNI(int alumnoDNI) {
        this.alumnoDNI = alumnoDNI;
    }
  

   
    
    
}
