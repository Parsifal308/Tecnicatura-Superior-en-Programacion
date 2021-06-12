/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_ejasociacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guillermo Marinero
 */
public class Programacion2_EjAsociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        c1.setCodigo(001);
        c1.setRazonSocial("Consumidor Final");
        
        Cliente c2 = new Cliente(002, "Consumidor Final");
        
        Fecha fecha1 = new Fecha();
        fecha1.setDia(20);
        fecha1.setMes(04);
        fecha1.setAnio(2021);
        
        Fecha fecha2 = new Fecha(21,04,2021);
        
        Producto p1 = new Producto();
        p1.setCodigo(001);
        p1.setDescripcion("Cacho de Patai");
        p1.setPrecio(5f);
        
        Producto p2 = new Producto(002, "Pan con Jamon", 2.50f);
        
        ArrayList<Producto> productos = new ArrayList();
        productos.add(p1);
        productos.add(p2);
        
        Factura factura2 = new Factura(10f, productos, c1, 'A', 001, fecha1);
        
        Factura factura1 = new Factura();
        factura1.setFecha(fecha2);
        factura1.setNumero(002);
        factura1.setTipo('B');
        factura1.setTotal(5f);
        factura1.setmCliente(c2);
        factura1.setmProducto(productos);
        
        System.out.println("|------------------------------------------|");
        System.out.println("|FACTURA NUMERO: " +factura1.getNumero());
        System.out.println("|   Tipo: " +factura1.getTipo());
        System.out.println("|   Fecha: " +factura1.getFecha().getDia()+"/ "+factura1.getFecha().getMes()+"/ "+factura1.getFecha().getAnio());
        System.out.println("|   Numero: " +factura1.getNumero());
        System.out.println("|   Cliente: " +factura1.getmCliente().getCodigo());
        System.out.println("|   Razon Social: " +factura1.getmCliente().getRazonSocial());
        System.out.println("|");
        System.out.println("|   Productos: " +productos.size());
        System.out.println("|       Producto: " +productos.get(0).getCodigo());
        System.out.println("|       Codigo: " +productos.get(0).getCodigo());
        System.out.println("|       Precio: " +productos.get(0).getPrecio());
        System.out.println("|       Descripcion: " +productos.get(0).getDescripcion());
        System.out.println("|");
        System.out.println("|       Producto: " +productos.get(1).getCodigo());
        System.out.println("|       Codigo: " +productos.get(1).getCodigo());
        System.out.println("|       Precio: " +productos.get(1).getPrecio());
        System.out.println("|       Descripcion: " +productos.get(1).getDescripcion());
        
    }
    
}
