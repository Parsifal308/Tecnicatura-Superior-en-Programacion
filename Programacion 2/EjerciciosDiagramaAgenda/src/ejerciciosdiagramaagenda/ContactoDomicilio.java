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
public class ContactoDomicilio {
    private Integer idContactoDomicilio;
    private String descripcion;

    public ContactoDomicilio(Integer idContactoDomicilio, String descripcion) {
        this.idContactoDomicilio = idContactoDomicilio;
        this.descripcion = descripcion;
    }

    public Integer getIdContactoDomicilio() {
        return idContactoDomicilio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
