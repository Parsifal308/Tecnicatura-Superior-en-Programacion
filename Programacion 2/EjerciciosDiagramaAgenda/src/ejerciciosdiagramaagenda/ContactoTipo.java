/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdiagramaagenda;

/**
 *
 * @author Guillermo Marinero
 */
public class ContactoTipo {
    private Integer idContactoTipo;
    private String descripcion;

    public ContactoTipo(Integer idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }

    public Integer getIdContactoTipo() {
        return idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
