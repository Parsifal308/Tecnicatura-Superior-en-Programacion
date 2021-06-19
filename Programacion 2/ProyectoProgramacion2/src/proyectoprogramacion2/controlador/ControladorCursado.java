package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectoprogramacion2.vistas.AltaCursado;
import proyectoprogramacion2.vistas.AsignarNota;
import proyectoprogramacion2.vistas.BajaCursado;
import proyectoprogramacion2.vistas.ModificarNota;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjCursado;

/* @author Guillermo Marinero*/
public class ControladorCursado implements ActionListener {
    private VistaInicio vIni;
    private MsjCursado vMsj;
    private AltaCursado vAlta;
    private BajaCursado vBaja;
    private ModificarNota vModNota;
    private AsignarNota vAgregarNota;

    public ControladorCursado(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjCursado();
        this.vAlta = new AltaCursado();
        this.vBaja = new BajaCursado();
        this.vModNota = new ModificarNota();
        this.vAgregarNota = new AsignarNota();
        
        this.vIni.getjButtonAltaCursado().addActionListener(this);
        this.vIni.getjButtonBajaCursado().addActionListener(this);
        this.vIni.getjButtonAsignarNota().addActionListener(this);
        this.vIni.getjButtonModificarNota().addActionListener(this);
        
        this.vMsj.getjButtonAceptar().addActionListener(this);
        
        this.vAlta.getjButtonAceptar().addActionListener(this);
        this.vAlta.getjButtonCancelar().addActionListener(this);
        
        this.vBaja.getjButtonAceptar().addActionListener(this);
        this.vBaja.getjButtonCancelar().addActionListener(this);
        
        this.vModNota.getjButtonAceptar().addActionListener(this);
        this.vModNota.getjButtonCancelar().addActionListener(this);
        
        this.vAgregarNota.getjButtonAceptar().addActionListener(this);
        this.vAgregarNota.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAltaCursado())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            //SI EXITO
            vMsj.setVisible(true);
            vAlta.setVisible(false);  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModificarNota())){  
            vModNota.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vModNota.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            vModNota.setVisible(false);
            
        }else if(e.getSource().equals(vModNota.getjButtonCancelar())){  
            vModNota.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonBajaCursado())){  
            vBaja.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vBaja.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            vBaja.setVisible(false);
            
        }else if(e.getSource().equals(vBaja.getjButtonCancelar())){  
            vBaja.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vMsj.getjButtonAceptar())){  
            vIni.setVisible(true);
            vMsj.setVisible(false);
            
        }else if(e.getSource().equals(vIni.getjButtonAsignarNota())){  
            vModNota.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vIni.getjButtonAsignarNota())){  
            vModNota.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAgregarNota.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            vAgregarNota.setVisible(false);
            
        }else if(e.getSource().equals(vAgregarNota.getjButtonCancelar())){  
            vAgregarNota.setVisible(false);
            vIni.setVisible(true);
            
        }
    }
    
    
    
}
