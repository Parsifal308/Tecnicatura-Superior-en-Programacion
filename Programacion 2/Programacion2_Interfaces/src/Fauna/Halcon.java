/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fauna;

import programacion2_interfaces.IVolar;

/**
 *
 * @author Guillermo Marinero
 */
public class Halcon extends Ave implements IVolar{

    public void Volar() {
      System.out.println("El halcon vuela de forma mas improvisada y en cortas distancias dentro de su habitat");
    }

    public Halcon(String nombre, float longitud) {
        super(nombre, longitud);
    }
    
}
