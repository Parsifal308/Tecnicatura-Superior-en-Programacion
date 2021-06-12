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
public class Programacion2_EjComposicion {

    public static void MostrarRecibo(Recibo r){
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Recibo " +r.getNumero()+ ":");
        System.out.println("|        Codigo de Proveedor: " +r.getProveedor().getCodigo());
        System.out.println("|        Razon Social Proveedor: " +r.getProveedor().getRazonSocial());
        System.out.println("|        Tipo Comprobante: " +r.getTipo());
        System.out.println("|        Fecha Comprobante: " +r.getFecha().getDia()+ "/" +r.getFecha().getMes()+ "/" +r.getFecha().getAnio());
        System.out.println("|        Detalle Recibo: " + r.getDetalle());
        System.out.println("|        Total Recibo: " + r.getTotal());
        System.out.println("|--------------------------------------------------|");
    }
    public static void main(String[] args) {
        
        Recibo r1 = new Recibo();
        r1.setDetalle("detalle recibo 1 :v");
        r1.setFecha(20, 40, 2021);
        r1.setNumero(100201);
        r1.setTipo('B');
        r1.setTotal(215.99f);
        r1.setProveedor(201, "razon social proveedor");
        
        Recibo r2 = new Recibo(202, "Pollos Primos S.R.L", 223.52f, "Cuartos de pollo...que se yo :P", 'A', 100202, 21, 04, 2021);
        
        MostrarRecibo(r1);
        MostrarRecibo(r2);
      
    }
    
}
