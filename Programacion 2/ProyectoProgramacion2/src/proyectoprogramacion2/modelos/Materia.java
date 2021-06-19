/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

import proyectoprogramacion2.datos.MateriaDAO;

/**
 *
 * @author Guillermo Marinero
 */
public class Materia {
    private MateriaDAO materiaDAO = new MateriaDAO();
    private int codMateria;
    private String nombre;
    private int profesorDNI;
    private String nombreProfe;

    public Materia(int codMateria, String nombre, int profesor, String nombreProfe) {
        this.codMateria = codMateria;
        this.nombre = nombre;
        this.profesorDNI = profesor;
        this.nombreProfe = nombreProfe;
    }

    public Materia() {
    }

    public int getCodMateria() {
        return codMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProfesorDNI() {
        return profesorDNI;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesorDNI(int profesor) {
        this.profesorDNI = profesor;
    }

    public MateriaDAO getMateriaDAO() {
        return materiaDAO;
    }
    public void cleanAtrib(){
        this.setCodMateria(0);
        this.setNombre(null);
        this.setProfesorDNI(0);
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }
    
}
