/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

/**
 *
 * @author Guillermo Marinero
 */
public class Carrera {
    private int codigo;
    private String nombre;
    private int duracion;

    public Carrera(int codigo, String nombre, int duracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
