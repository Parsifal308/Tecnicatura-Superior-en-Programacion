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
public class Recibo extends Comprobante {
    private Proveedor proveedor;
    private float total;
    private String detalle;

    public Recibo() {
        this.proveedor = new Proveedor();
    }
    public Recibo(int codProveedor, String razonSocialProveedor, float total, String detalle, char tipo, int numero, int fechaDia, int fechaMes, int fechaAnio) {
        super(tipo, numero, fechaDia, fechaMes, fechaAnio);
        this.proveedor = new Proveedor(codProveedor, razonSocialProveedor);
        this.total = total;
        this.detalle = detalle;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    public float getTotal() {
        return total;
    }
    public String getDetalle() {
        return detalle;
    }

    public void setProveedor(int codProveedor, String razonSocialProveedor) {
        this.proveedor = new Proveedor(codProveedor, razonSocialProveedor);
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
