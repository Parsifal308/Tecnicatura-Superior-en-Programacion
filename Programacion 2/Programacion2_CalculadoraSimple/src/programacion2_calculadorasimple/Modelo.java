/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_calculadorasimple;

import static java.lang.Math.pow;

/**
 *
 * @author Guillermo Marinero
 */
public class Modelo {

    Controlador controlador;
    
    public Modelo() {;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
    public double sumar(double a, double b){
        return (a + b);
    }
    public double restar(double a, double b){
        return (a - b);
    }
    public double multiplicar(double a, double b){
        return (a * b);
    }
    public double dividir(double a, double b){
        return (a / b);
    }
    public double potencia(double a, double b){
        return (pow(a, b));  
    }
}
