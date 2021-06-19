
package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectoprogramacion2.vistas.AltaInscripcion;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjInscripcion;

/*@author Guillermo Marinero*/
public class ControladorInscripcion implements ActionListener{
    private VistaInicio vIni;
    private MsjInscripcion vMsj;
    private AltaInscripcion vAlta;

    public ControladorInscripcion(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjInscripcion();
        this.vAlta = new AltaInscripcion();
        
        this.vAlta.getjButtonCancelar().addActionListener(this);
        this.vAlta.getjButtonAceptar().addActionListener(this);
                
        this.vMsj.getjButtonAceptar().addActionListener(this);
        
        this.vIni.getjButtonAgregarIns().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAgregarIns())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            //SI EXITO
            vMsj.setVisible(true);
            vAlta.setVisible(false);  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vMsj.getjButtonAceptar())){  
            vIni.setVisible(true);
            vMsj.setVisible(false);
            
        }   
    } 
}
