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
public class Cliente {
    private int codigo;
    private String razonSocial;

    //CONSTRUCTORS
    public Cliente() {
    }
    public Cliente(int codigo, String razonSocial) {
        this.codigo = codigo;
        this.razonSocial = razonSocial;
    }

    //GETTERS
    public int getCodigo() {
        return codigo;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    //SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}
