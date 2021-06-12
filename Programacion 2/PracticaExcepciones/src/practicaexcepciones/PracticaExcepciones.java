/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexcepciones;

import java.util.Scanner;

/**
 *
 * @author Guillermo Marinero
 */
public class PracticaExcepciones {

    private static double result, numerador, denominador;
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double calculo;
        
        System.out.println("Por favor, ingrese el numerador: ");
        numerador = sc.nextInt();
        
        System.out.println("Por favor, ingrese el denominador: ");
        denominador = sc.nextInt();
        
        
        calculo = calcular(numerador, denominador);
        System.out.println("El resultado es: " + calculo);
    }
    
    public static double dividir(double a, double b) throws Exception{
        if(b == 0) throw new Exception();
        return a/b;
    }
    
    public static double resta(double a, double b){
        return a - b;
    }
    
    public static double calcular (double a, double b){
        try{
            result = resta(a, b) + dividir(a, b);
        } catch(Exception ex){
            System.out.println("Ha ocurrido un error!");
            System.out.println("Por favor, ingrese nuevamente un denominador: ");
            denominador = sc.nextInt();
            calcular(a, denominador);
        }
        return result;
    }
}
