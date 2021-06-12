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
public class Controlador {
    Modelo modelo;
    Calculadora vista;

    public Controlador() {

    }

    public Modelo getModelo() {
        return modelo;
    }

    public Calculadora getVista() {
        return vista;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setVista(Calculadora vista) {
        this.vista = vista;
    }
    
    
    public double GetSuma(double a, double b){
        return this.modelo.sumar(a, b);
    }
    public double GetResta(double a, double b){
        return this.modelo.restar(a, b);
    }
    public double GetMultiplicacion(double a, double b){
        return this.modelo.multiplicar(a, b);
    }
    public double GetDivision(double a, double b){
        return this.modelo.dividir(a, b);
    }
    public double GetPotencia(double a, double b){
        return this.modelo.potencia(a, b);
    }
}
