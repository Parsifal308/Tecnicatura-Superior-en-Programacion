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
public class Medico extends Persona{
    private int nroMatricula;
    private ArrayList<Paciente> pacientes = new ArrayList();

    //CONSTRUCTORS
    public Medico() {
    }
    public Medico(int nroMatricula, int dni, String nombre, String apellido, char sexo) {
        super(dni, nombre, apellido, sexo);
        this.nroMatricula = nroMatricula;
    }
    
    //GETTERS
    public int getNroMatricula() {
        return nroMatricula;
    }
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    //SETTERS
    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    //METHODS
    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
}
