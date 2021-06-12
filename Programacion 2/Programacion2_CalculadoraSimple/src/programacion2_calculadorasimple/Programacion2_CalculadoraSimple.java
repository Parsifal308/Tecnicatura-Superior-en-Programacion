/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_calculadorasimple;

/**
 *
 * @author Guillermo Marinero
 */

public class Programacion2_CalculadoraSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Modelo modelo = new Modelo();
        Calculadora vista = new Calculadora();
        
        modelo.setControlador(controlador);
        vista.setControlador(controlador);
        controlador.setModelo(modelo);
        controlador.setVista(vista);

        
        controlador.getVista().setVisible(true);
        
    }
    
}
