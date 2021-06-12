
package ejercicioclinica;

import static java.lang.Math.abs;

/*@author Guillermo Marinero*/
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    //Constructors
    public Fecha() {
    }
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    //Setters
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    //Getters
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnyo() {
        return anyo;
    }
    
    public boolean isBisiesto(){
        //hacer la cuenta esa super loca para saber si es bisiesto, alta paja
        return true;
    }
    public void imprimir(){
        //imprime, que mas va a hacer
    }
    public String dateToString(){
        String fechaString = dia+"/"+mes+"/"+anyo;
        return fechaString;
    }
    
    //dado otro objeto de esta clase, comparan los años con este objeto
    public int getDiferenciaAnyos(Fecha fecha){
        int diffAnyo;
        
        diffAnyo = this.anyo - fecha.anyo;
        return abs(diffAnyo);
    }
    
}
