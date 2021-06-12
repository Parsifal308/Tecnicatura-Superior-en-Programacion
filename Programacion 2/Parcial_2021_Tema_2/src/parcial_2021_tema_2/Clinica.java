/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2021_tema_2;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Marinero
 */
public class Clinica {
    private ArrayList<Especialidad> especialidades;

    //COSNTRUCTOR
    public Clinica() {
        this.especialidades = new ArrayList();
    }

    //GETTER
    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    //SETTER
    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    //METHOD
    public void addEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }
    
}
