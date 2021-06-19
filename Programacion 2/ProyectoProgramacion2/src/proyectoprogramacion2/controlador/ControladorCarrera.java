/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectoprogramacion2.vistas.AltaCarrera;
import proyectoprogramacion2.vistas.BajaCarrera;
import proyectoprogramacion2.vistas.ModificarCarrera;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjCarrera;

/**
 *
 * @author Guillermo Marinero
 */
public class ControladorCarrera implements ActionListener{
    private AltaCarrera vAlta;
    private BajaCarrera vBaja;
    private ModificarCarrera vModificar;
    private VistaInicio vIni;
    private MsjCarrera vMsj;

    public ControladorCarrera(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjCarrera();
        this.vAlta = new AltaCarrera();
        this.vBaja = new BajaCarrera();
        this.vModificar = new ModificarCarrera();
        
        this.vAlta.getjButtonAceptar().addActionListener(this);
        this.vAlta.getjButtonCancelar().addActionListener(this);
        
        this.vBaja.getjButtonAceptar().addActionListener(this);
        this.vBaja.getjButtonCancelar().addActionListener(this);
        
        this.vModificar.getjButtonAceptar().addActionListener(this);
        this.vModificar.getjButtonCancelar().addActionListener(this);
        
        this.vIni.getjButtonAgregarCarrera().addActionListener(this);
        this.vIni.getjButtonEliminarCarrera().addActionListener(this);
        this.vIni.getjButtonModCarrera().addActionListener(this);
        
        this.vMsj.getjButtonAceptar().addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAgregarCarrera())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            //SI EXITO
            vMsj.setVisible(true);
            vAlta.setVisible(false);  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModCarrera())){  
            vModificar.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vModificar.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            vModificar.setVisible(false);
            
        }else if(e.getSource().equals(vModificar.getjButtonCancelar())){  
            vModificar.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonEliminarCarrera())){  
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
            
        }
        
    }
    
}
