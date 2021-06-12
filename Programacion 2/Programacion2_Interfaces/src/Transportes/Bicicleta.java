/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

/**
 *
 * @author Guillermo Marinero
 */
public class Bicicleta extends Transporte{
    float rodado;
    String marca;
    String cuadro;
    String tipoFreno;
    
    private void AccionarFrenos(String tipoFreno){
        System.out.println("Se accionan los frenos");
        if(tipoFreno == "Discos"){
            System.out.println("Frena al toque, son tremendos los frenos de discos");
        }
        if(tipoFreno == "V-Brake"){
            System.out.println("Frena tranquilo, excepto que esten mojados, ahi te fuiste a la ñonga");
        }
    }

    public float getRodado() {
        return rodado;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuadro() {
        return cuadro;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public float getPeso() {
        return peso;
    }

    public void setRodado(float rodado) {
        this.rodado = rodado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuadro(String cuadro) {
        this.cuadro = cuadro;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Bicicleta(float rodado, String marca, String cuadro, String tipoFreno, float peso) {
        super(peso);
        this.rodado = rodado;
        this.marca = marca;
        this.cuadro = cuadro;
        this.tipoFreno = tipoFreno;
    }

    
    
    
    
    
}
