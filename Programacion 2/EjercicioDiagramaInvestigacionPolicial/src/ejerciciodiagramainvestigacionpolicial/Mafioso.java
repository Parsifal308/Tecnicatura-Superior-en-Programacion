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
public class Mafioso extends Persona implements Investigable{
    private List<Lugar> lugaresFrecuentes = new ArrayList();

    public Mafioso(String nombre, String apellido, Foto foto) {
        super(nombre, apellido, foto);
    }

    public void agregarLugar(Lugar lugar){
        lugaresFrecuentes.add(lugar);
    }
    
    //POR QUE DEVOLVERIA UN BOOLEAN AL QUITAR UN LUGAR????
    public boolean quitarLugar(Lugar lugar){
        lugaresFrecuentes.remove(lugar);
        return false;
        
    }
    @Override
    public boolean investigar(){
        return false;
        
    }
    
    
}
