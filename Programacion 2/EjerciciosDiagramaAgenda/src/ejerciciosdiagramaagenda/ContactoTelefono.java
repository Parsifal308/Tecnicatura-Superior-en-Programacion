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
public class ContactoTelefono {
    private Integer idContactoTelefono;
    private String codigo;
    private String numero;

    public ContactoTelefono(Integer idContactoTelefono, String codigo, String numero) {
        this.idContactoTelefono = idContactoTelefono;
        this.codigo = codigo;
        this.numero = numero;
    }

    public Integer getIdContactoTelefono() {
        return idContactoTelefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
