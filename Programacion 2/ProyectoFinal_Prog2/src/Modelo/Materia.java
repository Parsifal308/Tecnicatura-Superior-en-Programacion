package Modelo;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class Materia {
    private String nombre;
    private String codigo;
    private int horas;
    private ArrayList comisiones = new ArrayList();

    //CONSTRUCTORES
    public Materia(String nombre, String codigo, int horas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
    }
    public Materia() {
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getHoras() {
        return horas;
    }
    public ArrayList getComisiones() {
        return comisiones;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setComisiones(ArrayList comisiones) {
        this.comisiones = comisiones;
    }
    
    
}
