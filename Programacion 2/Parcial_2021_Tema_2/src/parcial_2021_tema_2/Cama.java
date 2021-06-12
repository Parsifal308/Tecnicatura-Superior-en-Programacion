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
public class Cama {

    private Paciente paciente;
    private int num;
    //CONSTRUCTOR
    public Cama(int num) {
        this.num = num;
    }

    //GETTER
    public Paciente getPaciente() {
        return paciente;
    }

    public int getNum() {
        return num;
    }

    //SETTER
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
