
package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class EjercicioArrayList {
    static Scanner sc = new Scanner(System.in);
    
    static void RecorrerVectorArrayList(ArrayList<Integer> arreglo){
        System.out.println("--------------------------");
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println("| "+(i+1)+" |");
        }
        System.out.println("--------------------------");
    }
    
    static void RecorrerMatrizArrayList(ArrayList<ArrayList<Double>> arreglo){
        System.out.println("--------------------------");
        for (int i = 0; i < arreglo.size(); i++) {
            for (int j = 0; j < arreglo.get(i).size(); j++) {
                System.out.print(" | "+arreglo.get(i).get(j));
            }
            System.out.print(" | \n");
            
        }
        System.out.println("--------------------------");
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList();
        ArrayList<ArrayList<Double>> matriz = new ArrayList<ArrayList<Double>>();
        
        
        arreglo.add(12);
        arreglo.add(12415);
        arreglo.add(6714);
        RecorrerVectorArrayList(arreglo);
        
        
        matriz.add(new ArrayList<Double>());
        matriz.add(new ArrayList<Double>());
        matriz.get(0).add(1.12);
        matriz.get(0).add(2.15);
        matriz.get(0).add(3.66);
        matriz.get(1).add(4.39);
        matriz.get(1).add(5.94);
        matriz.get(1).add(6.82);
        RecorrerMatrizArrayList(matriz);
    }
}
