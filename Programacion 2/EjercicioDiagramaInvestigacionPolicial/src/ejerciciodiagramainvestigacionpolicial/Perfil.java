/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramainvestigacionpolicial;

/**
 *
 * @author Guillermo Marinero
 */
public class Perfil {
    private int tipoPerfil;
    private String descripcion;

    public Perfil(int tipoPerfil, String descripcion) {
        this.tipoPerfil = tipoPerfil;
        this.descripcion = descripcion;
    }

    public Perfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    
    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
