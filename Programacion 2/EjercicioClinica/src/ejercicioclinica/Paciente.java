
package ejercicioclinica;

import java.util.ArrayList;

/* @author Guillermo Marinero*/
public class Paciente {
    private String nSIP;
    private String nombreApellidos;
    private char setso;
    private Fecha fechaNacimiento;
    private ArrayList<Diagnostico> diagosticos;

    public Paciente(String nSIP, String nombreApellidos, char setso, int diaNac, int mesNac, int anyoNac) {
        this.nSIP = nSIP;
        this.nombreApellidos = nombreApellidos;
        this.setso = setso;
        this.fechaNacimiento = new Fecha(diaNac, mesNac, anyoNac);
        this.diagosticos = new ArrayList<Diagnostico>();
    }

    public String getnSIP() {
        return nSIP;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public char getSetso() {
        return setso;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public int getEdad(){
        int edad = 0;//borrar este cero despues
        //buscar fecha de hoy y restarle fecha de nacimiento
        return edad;
    }
    
    
    
}
