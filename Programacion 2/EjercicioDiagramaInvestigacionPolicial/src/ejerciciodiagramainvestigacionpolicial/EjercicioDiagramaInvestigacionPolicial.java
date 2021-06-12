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
public class EjercicioDiagramaInvestigacionPolicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Detective detective1 = new Detective("IDDQD 52", "James", "Gordon", new Foto("/Fotos/Detectives","JamesGordon.png"));
        Mafioso mafioso1 = new Mafioso("Juan", "Pepetoide", new Foto("/Fotos/Mafiosos","JuanPepetoide.png"));
        Direccion direccion1 = new Direccion("asdasd", 123, Localidad.Mendoza);
        Lugar lugar1 = new Lugar("Parque San Martin", direccion1);
        
        detective1.investigarMafioso(mafioso1);
        detective1.getComunicaciones().add(new MedioDeComunicacion("Medio super sutil", TipoMedio.palomaMensajera));
        mafioso1.agregarLugar(lugar1);
    }
    
}
