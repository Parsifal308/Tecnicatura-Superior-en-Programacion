/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramainvestigacionpolicial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guillermo Marinero
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private Foto foto;
    private List<MedioDeComunicacion> comunicaciones = new ArrayList();
    

    public Persona(String nombre, String apellido, Foto foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        List<Perfil> perfiles = new ArrayList();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Foto getFoto() {
        return foto;
    }

    public List<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void setComunicaciones(List<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }
    public void agregarPerfil(){
        
    }
    public boolean quitarPerfil(int indice){
        return false;
    }
}
