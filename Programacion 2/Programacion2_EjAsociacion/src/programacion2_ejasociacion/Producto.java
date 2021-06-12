/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_ejasociacion;

/**
 *
 * @author Guillermo Marinero
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    //CONSTRUCTORS
    public Producto() {
    }
    public Producto(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //GETTERS
    public int getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public float getPrecio() {
        return precio;
    }

    //SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
