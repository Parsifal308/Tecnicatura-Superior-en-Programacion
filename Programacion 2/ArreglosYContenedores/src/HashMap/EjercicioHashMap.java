/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.util.HashMap;

/**
 *
 * @author Guillermo Marinero
 */
public class EjercicioHashMap {
     public static void main(String[] args) {
    
        HashMap<Integer,Persona> asdas = new HashMap<Integer, Persona>();
        
        Persona p1 = new Persona(34512134, "Juan", "Molina");
        Persona p2 = new Persona(44112334, "Julie", "Gonzalez");
        Persona p3= new Persona(12543625, "Filiberto", "Flores");
        
        asdas.put(1, p1);
        asdas.put(2, p2);
        asdas.put(3, p3);
        
        for (Integer i : asdas.keySet()){
            
            System.out.println(" =>" + i + " =>" + asdas.get(i).getName());
        }
     }
}
