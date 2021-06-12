/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2021_tema_2;

/**
 *
 * @author Guillermo Marinero
 */
public class Paciente extends Persona{
    private Fecha fechaInternacion;
    private Diagnostico diagnostico;

    //COSNTRUCTORS
    public Paciente() {
        this.fechaInternacion = new Fecha();
        this.diagnostico = new Diagnostico();
    }
    public Paciente(int dni, String nombre, String apellido, char sexo) {
        super(dni, nombre, apellido, sexo);
        this.fechaInternacion = new Fecha();
        this.diagnostico = new Diagnostico();
    }

    //GETTERS
    public Fecha getFechaInternacion() {
        return fechaInternacion;
    }
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    //SETTERS
    public void setFechaInternacion(Fecha fechaInternacion) {
        this.fechaInternacion = fechaInternacion;
    }
    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
}
