/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagramainvestigacionpolicial;

/**
 *
 * @author Guillermo Marinero
 */
public class MedioDeComunicacion {
    private String descripcion;
    private TipoMedio tipoMedio;

    public MedioDeComunicacion(String descripcion, TipoMedio tipoMedio) {
        this.descripcion = descripcion;
        this.tipoMedio = tipoMedio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }
    
}
enum TipoMedio{
    palomaMensajera,
    señalesDeHumo,
    queSeYoh
}
