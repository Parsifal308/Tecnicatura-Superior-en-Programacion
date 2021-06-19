/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectoprogramacion2.vistas.AltaDocente;
import proyectoprogramacion2.vistas.BajaProfesor;
import proyectoprogramacion2.vistas.InscribirProfesor;
import proyectoprogramacion2.vistas.ModificarDocente;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjProfesor;

/**
 *
 * @author Guillermo Marinero
 */
public class ControladorProfesor implements ActionListener{
    private VistaInicio vIni;
    private MsjProfesor vMsj;
    private AltaDocente vAlta;
    private BajaProfesor vBaja;
    private ModificarDocente vMod;
    private InscribirProfesor vIns;

    public ControladorProfesor(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjProfesor();
        this.vAlta = new AltaDocente();
        this.vBaja = new BajaProfesor();
        this.vMod = new ModificarDocente();
        this.vIns = new InscribirProfesor();
        
        this.vIni.getjButtonNuevoProfe().addActionListener(this);
        this.vIni.getjButtonElimProfe().addActionListener(this);
        this.vIni.getjButtonModProfe().addActionListener(this);
        this.vIni.getjButtonInsProfe().addActionListener(this);
        
        this.vAlta.getjButtonAceptar().addActionListener(this);
        this.vAlta.getjButtonCancelar().addActionListener(this);
        
        this.vBaja.getjButtonAceptar().addActionListener(this);
        this.vBaja.getjButtonCancelar().addActionListener(this);
        
        this.vMod.getjButtonAceptar().addActionListener(this);
        this.vMod.getjButtonCancelar().addActionListener(this);
        
        this.vIns.getjButtonAceptar().addActionListener(this);
        this.vIns.getjButtonCancelar().addActionListener(this);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonNuevoProfe())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            //SI EXITO
            vMsj.setVisible(true);
            vAlta.setVisible(false);  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModProfe())){  
            vMod.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vMod.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            vMod.setVisible(false);
            
        }else if(e.getSource().equals(vMod.getjButtonCancelar())){  
            vMod.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonElimProfe())){  
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
            
        }else if(e.getSource().equals(vIns.getjButtonAceptar())){  
            vIni.setVisible(true);
            vIns.setVisible(false);
            
        }else if(e.getSource().equals(vIns.getjButtonCancelar())){  
            vIns.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonInsProfe())){  
            vIns.setVisible(true);
            vIni.setVisible(false);
            
        }
    }
    
    
    
}
