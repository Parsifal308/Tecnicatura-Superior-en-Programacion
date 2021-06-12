/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_ejcomposicion;

/**
 *
 * @author Guillermo Marinero
 */
public class Proveedor {
    private int codigo;
    private String razonSocial;

    //CONSTRUCTORS
    public Proveedor() {
    }
    public Proveedor(int codigo, String razonSocial) {
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
