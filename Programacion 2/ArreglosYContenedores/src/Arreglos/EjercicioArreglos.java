
package Arreglos;

import java.util.Scanner;

public class EjercicioArreglos {
    static Scanner sc = new Scanner(System.in);
    
    static void SettearArregloEnteros(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese numero ->"+(i+1)+"<- del arreglo");
            arreglo[i] = sc.nextInt();
        }
    }
    
    static void SettearMatrizEnteros(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("ingrese numero ->"+(i+1)+"."+(j+1)+"<- de la matriz");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    static int[] NuevoArregloEnteros(){
        int tamaño;
        System.out.println("Ingrese tamaño del arreglo");
        tamaño = sc.nextInt();
        int nuevoArrelgo[] = new int[tamaño];
        for (int i = 0; i < nuevoArrelgo.length; i++) {
            System.out.println("ingrese entero para la posicion: "+(i+1));
            nuevoArrelgo[i] = sc.nextInt();
        }
        return nuevoArrelgo;
    }
    
    static int[][] NuevaMatrizEnteros(){
        int filas, columnas;
        System.out.println("Ingrese cantidad de filas: ");
        filas = sc.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        columnas = sc.nextInt();
        int nuevaMatriz[][] = new int[filas][columnas];
        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz[i].length; j++) {
                System.out.println("ingrese entero para la posicion "+(i+1)+"."+(j+1)+": ");
                nuevaMatriz[i][j]= sc.nextInt();
            }
        }
        return nuevaMatriz;
    }
    
    static void mostrarArregloEnteros(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("| "+arreglo[i]+" |");
        }
    }
    static void mostrarMatrizEnteros(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" | "+ matriz[i][j]);
            }
            System.out.print(" | \n");
        }
    }
    
    
    
    public static void main(String[] args) {
    int vector5[] = new int[]{1,2,3,4,54};
    int matriz3x3[][] = new int[3][3];
    
    int vectorNuevo[] = NuevoArregloEnteros();
    int matrizNueva[][] = NuevaMatrizEnteros();
    
    mostrarArregloEnteros(vector5);
    mostrarArregloEnteros(vectorNuevo);
    
    mostrarMatrizEnteros(matriz3x3);
    mostrarMatrizEnteros(matrizNueva);
    
        
    }
}
