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
public class Diagnostico {
    private String texto;
    private NivelDiagnostico nivelDiagnostico;
    private Tratamiento tratamiento;

    
    //CONSTRUCTORS
    public Diagnostico() {
    }
    public Diagnostico(String texto, NivelDiagnostico diagSeveridad, Tratamiento tratamiento) {
        this.texto = texto;
        this.nivelDiagnostico = diagSeveridad;
        this.tratamiento = tratamiento;
    }
    
    //GETTERS
    public String getTexto() {
        return texto;
    }
    public NivelDiagnostico getNivelDiagnostico() {
        return nivelDiagnostico;
    }
    public Tratamiento getTratamiento() {
        return tratamiento;
    }
    
    //SETTERS

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void setNivelDiagnostico(NivelDiagnostico nivelDiagnostico) {
        this.nivelDiagnostico = nivelDiagnostico;
    }
    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
   
}
