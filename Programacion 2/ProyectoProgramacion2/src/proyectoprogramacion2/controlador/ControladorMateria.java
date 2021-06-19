/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyectoprogramacion2.vistas.AltaMateria;
import proyectoprogramacion2.vistas.BajaMateria;
import proyectoprogramacion2.vistas.ModificarMateria;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjMateria;

/**
 *
 * @author Guillermo Marinero
 */
public class ControladorMateria implements ActionListener{
    private VistaInicio vIni;
    private MsjMateria vMsj;
    private AltaMateria vAlta;
    private BajaMateria vBaja;
    private ModificarMateria vMod;

    public ControladorMateria(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjMateria();
        this.vAlta = new AltaMateria();
        this.vBaja = new BajaMateria();
        this.vMod = new ModificarMateria();
        
        this.vIni.getjButtonAgregarMat().addActionListener(this);
        this.vIni.getjButtonEliminarMat().addActionListener(this);
        this.vIni.getjButtonModMateria().addActionListener(this);
        this.vIni.getjButtonInsProfe().addActionListener(this);
        
        this.vMsj.getjButtonAceptar().addActionListener(this);
        
        this.vAlta.getjButtonAceptar().addActionListener(this);
        this.vAlta.getjButtonCancelar().addActionListener(this);
        
        this.vBaja.getjButtonAceptar().addActionListener(this);
        this.vBaja.getjButtonCancelar().addActionListener(this);
        
        this.vMod.getjButtonAceptar().addActionListener(this);
        this.vMod.getjButtonCancelar().addActionListener(this);
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAgregarMat())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            //SI EXITO
            vMsj.setVisible(true);
            vAlta.setVisible(false);  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModMateria())){  
            vMod.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vMod.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            vMod.setVisible(false);
            
        }else if(e.getSource().equals(vMod.getjButtonCancelar())){  
            vMod.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonEliminarMat())){  
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
