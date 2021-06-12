/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_ejasociacion;

/**
 *
 * @author Guillermo Marinero
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;

    //CONSTRUCTORS
    public Comprobante() {
    }
    public Comprobante(char tipo, int numero, Fecha fecha) {
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = fecha;
    }

    //GETTERS
    public char getTipo() {
        return tipo;
    }
    public int getNumero() {
        return numero;
    }
    public Fecha getFecha() {
        return fecha;
    }

    //SETTERS
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
}
