/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_ejasociacion;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Marinero
 */
public class Factura extends Comprobante {
    private float total;
    private ArrayList<Producto> mProducto;
    private Cliente mCliente;

    //CONSTRUCTORS
    public Factura() {
    }
    public Factura(float total, ArrayList<Producto> mProducto, Cliente mCliente, char tipo, int numero, Fecha fecha) {
        super(tipo, numero, fecha);
        this.total = total;
        this.mProducto = mProducto;
        this.mCliente = mCliente;
    }

    //GETTERS
    public float getTotal() {
        return total;
    }
    public ArrayList<Producto> getmProducto() {
        return mProducto;
    }
    public Cliente getmCliente() {
        return mCliente;
    }

    //SETTERS
    public void setTotal(float total) {
        this.total = total;
    }
    public void setmProducto(ArrayList<Producto> mProducto) {
        this.mProducto = mProducto;
    }
    public void setmCliente(Cliente mCliente) {
        this.mCliente = mCliente;
    }
    
    
}
