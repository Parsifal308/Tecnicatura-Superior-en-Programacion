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
public class Foto {
    private String pathToFile;
    private String nombre;
    private float tamanio;

    public Foto(String pathToFile, String nombre) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public String getNombre() {
        return nombre;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
