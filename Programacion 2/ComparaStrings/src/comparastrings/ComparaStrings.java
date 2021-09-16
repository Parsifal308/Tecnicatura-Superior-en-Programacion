/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparastrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Guillermo Marinero
 */
public class ComparaStrings {
    static HashMap<Character, Integer> mapaClaves = new HashMap<>(); //instancio mapiño
    
    HashMap SettearLetras(String primerString){

        for (int i = 0; i < primerString.length(); i++) {
            mapaClaves.put(primerString.charAt(i), 0); //recorro la palabra y agrego cada caracter como clave
        }
        return mapaClaves;
    }
    
    String CompararStrings(String s1, String s2){
        String s3;
        for (int i = 0; i < s1.length(); i++) {
            if(mapaClaves.get(s1.charAt(i)) != null){ //si el caracter existe como clave...
                
            }
            
        }
        return s3;
    }
    
    
    public static void main(String[] args) {


    }
    
}
