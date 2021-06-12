
package ejercicioclinica;

import java.util.ArrayList;

/*@author Guillermo Marinero*/
public class Diagnostico {
    private String texto;
    private TipoDiagnostico tipo;
    private ArrayList<Tratamiento> tratamiento;

    //Constructors
    public Diagnostico(TipoDiagnostico tipo) {
        this.tipo = tipo;
        tratamiento = new ArrayList();
    }
    public Diagnostico(String texto, TipoDiagnostico tipo) {
        this.texto = texto;
        this.tipo = tipo;
        tratamiento = new ArrayList();
    }
    
    //Getters
    public String getTexto() {
        return texto;
    }
    public TipoDiagnostico getTipo() {
        return tipo;
    }
    public ArrayList<Tratamiento> getTratamiento() {
        return tratamiento;
    }
    
    public void Tratar(Tratamiento t){
        //se trata la wea
    }
    
    //supongo que hace esto....nose
    public boolean EsAlta(){
        if(tipo.equals("tdAlta")){
            return true;
        }else{
            return false;
        }

    }
}
enum TipoDiagnostico{
    tdAlta,
    tdLeve,
    tdGrave,
    tdMuyGrave
}
