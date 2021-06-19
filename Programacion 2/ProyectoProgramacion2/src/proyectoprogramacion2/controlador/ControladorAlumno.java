/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoprogramacion2.modelos.Alumno;
import proyectoprogramacion2.vistas.AltaAlumno;
import proyectoprogramacion2.vistas.BajaAlumno;
import proyectoprogramacion2.vistas.ModificarAlumno;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjAlumno;

/**
 *
 * @author Guillermo Marinero
 */
public class ControladorAlumno implements ActionListener{
    private Alumno alumno = new Alumno();
    
    private AltaAlumno altaAlum;
    private ModificarAlumno modAlum;
    private BajaAlumno bajaAlum;
    private VistaInicio vIni;
    private MsjAlumno vMsj;

    public ControladorAlumno(VistaInicio vIni) {
        this.altaAlum = new AltaAlumno();
        this.modAlum = new ModificarAlumno();
        this.bajaAlum = new BajaAlumno();
        this.vMsj = new MsjAlumno();
        this.vIni = vIni;

        
        this.vIni.getjButtonAltaAlumno().addActionListener(this);
        this.vIni.getjButtonModificarAlumno().addActionListener(this);
        this.vIni.getjButtonEliminarAlumno().addActionListener(this);
        
        this.altaAlum.getjButtonAceptarAltaAlumno().addActionListener(this);
        this.altaAlum.getjButtonCancelar().addActionListener(this);
        
        this.modAlum.getjButtonAceptar().addActionListener(this);
        this.modAlum.getjButtonCancelar().addActionListener(this);
        
        this.bajaAlum.getjButtonAceptar().addActionListener(this);
        this.bajaAlum.getjButtonCancelar().addActionListener(this); 
        
        this.vMsj.getjButtonAceptar().addActionListener(this);
    }

    public AltaAlumno getAltaAlum() {
        return altaAlum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAltaAlumno())){  
            altaAlum.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(altaAlum.getjButtonAceptarAltaAlumno())){  
            //SI EXITO
            this.alumno.setDni(Integer.valueOf(altaAlum.getjTextFieldDNI().getText()));
            this.alumno.setNombre(String.valueOf(altaAlum.getjTextFieldNombre().getText()));
            this.alumno.setApellido(String.valueOf(altaAlum.getjTextFieldApellido().getText()));
            this.alumno.setDomicilio(String.valueOf(altaAlum.getjTextFieldDom().getText()));
            this.alumno.setTelefono(Integer.valueOf(altaAlum.getjTextFieldDNI().getText()));
            try {
                this.alumno.getAlumnoDAO().crearAlumno(alumno);
                vMsj.setjLabelMensjae("Alumno Creado con Exito");
                vMsj.setVisible(true);
                altaAlum.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException");
                vMsj.setVisible(true);
            }finally{
                this.alumno.cleanAtrib();
            }
        
        }else if(e.getSource().equals(altaAlum.getjButtonCancelar())){  
            altaAlum.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModificarAlumno())){  
            modAlum.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(modAlum.getjButtonAceptar())){ 
            //SI EXITO
            vMsj.setVisible(true);
            modAlum.setVisible(false);
            
        }else if(e.getSource().equals(modAlum.getjButtonCancelar())){  
            modAlum.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonEliminarAlumno())){  
            bajaAlum.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(bajaAlum.getjButtonAceptar())){ 
            //SI EXITO
            this.alumno.setDni(Integer.valueOf(bajaAlum.getjTextFieldDNI().getText()));
            try {
                this.alumno.getAlumnoDAO().eliminarAlumno(this.alumno.getDni());
                vMsj.setjLabelMensjae("Alumno eliminado con Exito");
                vMsj.setVisible(true);
                bajaAlum.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al intentar eliminar datos de alumno");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al intentar elinar datos del alumno");
                vMsj.setVisible(true);
            }finally{
                this.alumno.cleanAtrib();
            }
            vMsj.setVisible(true);
            bajaAlum.setVisible(false);
            
        }else if(e.getSource().equals(bajaAlum.getjButtonCancelar())){  
            bajaAlum.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vMsj.getjButtonAceptar())){  
            vIni.setVisible(true);
            vMsj.setVisible(false);
            
        }
        
        
            
        
    }
    
    
}
