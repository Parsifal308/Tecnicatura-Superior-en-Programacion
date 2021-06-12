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
public class Detective extends Persona{
    private String numeroPlaca;

    public Detective(String numeroPlaca, String nombre, String apellido, Foto foto) {
        super(nombre, apellido, foto);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }
    //POR QUE DEVOLVERIA UN BOOLEAN AL INVESTIGAR????
    public boolean investigarMafioso(Mafioso mafioso){
        return mafioso.investigar();
    }
}
