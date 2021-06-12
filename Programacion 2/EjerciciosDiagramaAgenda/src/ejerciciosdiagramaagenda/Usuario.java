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
public class Usuario extends Persona {
    private Integer idUsuario;
    private String usuario;
    private String password;
    private ArrayList<Contacto> contactos;

    public Usuario(Integer idPersona, String nombre, String apellido, Integer idUsuario, String usuario, String password) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    public void addContacto(Contacto contacto){
        this.contactos.add(contacto);
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
