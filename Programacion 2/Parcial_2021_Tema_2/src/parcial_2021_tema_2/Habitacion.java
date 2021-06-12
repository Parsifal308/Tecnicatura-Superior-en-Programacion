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
public class Habitacion {
    private int numero;
    private ArrayList<Cama> camas;

    //CONSTRUCTOR
    public Habitacion(int numero) {
        this.numero = numero;
        this.camas = new ArrayList();
    }
    
    //GETTERS
    public int getNumero() {
        return numero;
    }
    public ArrayList<Cama> getCamas() {
        return camas;
    }
    
    //SETTERS
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCamas(ArrayList<Cama> camas) {
        this.camas = camas;
    }
    
    //METHODS
    public void addCama(Cama cama){
        this.camas.add(cama);
    }
}
