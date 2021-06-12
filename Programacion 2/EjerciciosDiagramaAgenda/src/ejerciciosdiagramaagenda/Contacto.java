/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdiagramaagenda;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Marinero
 */
public class Contacto extends Persona{
    private Integer idContacto;
    private ContactoTipo tipo;
    private ArrayList<ContactoDomicilio> domicilio = new ArrayList();
    private ArrayList<ContactoTelefono> telefonos = new ArrayList();

    public Contacto(String nombre, String apellido, Integer idPersona, Integer idContacto, ContactoTipo tipo) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public ArrayList<ContactoDomicilio> getDomicilio() {
        return domicilio;
    }

    public ArrayList<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }
    public void addTelefono(ContactoTelefono telefono){
        this.telefonos.add(telefono);
    }
    public void addDomicilio(ContactoDomicilio domicilio){
        this.domicilio.add(domicilio);
    }
}
