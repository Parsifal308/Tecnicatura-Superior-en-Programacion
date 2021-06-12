/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_ejcomposicion;

/**
 *
 * @author Guillermo Marinero
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;

    //CONSTRUCTOR
    public Comprobante() {
        this.fecha = new Fecha();
    }
    public Comprobante(char tipo, int numero,int fechaDia, int fechaMes, int fechaAnio) {
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = new Fecha(fechaDia, fechaMes, fechaAnio);
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
    public void setFecha(int dia, int mes, int anio) {
        this.fecha = new Fecha(dia, mes, anio);
    }
    
    
    
    
}
