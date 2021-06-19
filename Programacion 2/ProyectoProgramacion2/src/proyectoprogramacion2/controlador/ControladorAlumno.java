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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
    
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ControladorAlumno(VistaInicio vIni) throws ClassNotFoundException, SQLException {
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
    
    //FUNCIONA
    public void mostrarDatosTabla() throws ClassNotFoundException, SQLException{
        ArrayList<Alumno> listaAlumnos = alumno.getAlumnoDAO().leerAlumnos();
        Object[] unAlumno = new Object[6];
        
        modeloTabla = (DefaultTableModel)this.vIni.getjTableAlumno().getModel();
        modeloTabla.getDataVector().removeAllElements();
        modeloTabla.fireTableDataChanged();  
              
        for (int i = 0; i < listaAlumnos.size(); i++) {
            unAlumno[0] = listaAlumnos.get(i).getDni();
            unAlumno[1] = listaAlumnos.get(i).getNombre();
            unAlumno[2] = listaAlumnos.get(i).getApellido();
            unAlumno[3] = listaAlumnos.get(i).getDomicilio();
            unAlumno[4] = listaAlumnos.get(i).getTelefono();
            unAlumno[5] = listaAlumnos.get(i).getInsCod();
        
            modeloTabla.addRow(unAlumno);        
        }
        this.vIni.getjTableAlumno().setModel(modeloTabla);      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAltaAlumno())){  
            altaAlum.setVisible(true);
            vIni.setVisible(false);
            
            
            //BOTON ACEPTAR DEL ALTA ALUMNO
        }else if(e.getSource().equals(altaAlum.getjButtonAceptarAltaAlumno())){  
            this.alumno.setDni(Integer.valueOf(altaAlum.getjTextFieldDNI().getText()));
            this.alumno.setNombre(String.valueOf(altaAlum.getjTextFieldNombre().getText()));
            this.alumno.setApellido(String.valueOf(altaAlum.getjTextFieldApellido().getText()));
            this.alumno.setDomicilio(String.valueOf(altaAlum.getjTextFieldDom().getText()));
            this.alumno.setTelefono(Integer.valueOf(altaAlum.getjTextFieldDNI().getText()));
            try {
                this.alumno.getAlumnoDAO().crearAlumno(this.alumno);
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
                this.altaAlum.setjTextFieldDNI("");
                this.altaAlum.setjTextFieldNombre("");
                this.altaAlum.setjTextFieldApellido("");
                this.altaAlum.setjTextFieldDom("");
                this.altaAlum.setjTextFieldTel("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }else if(e.getSource().equals(altaAlum.getjButtonCancelar())){  
            altaAlum.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModificarAlumno())){  
            modAlum.setVisible(true);
            vIni.setVisible(false);
        
            
            //BOTON ACEPTAR DE MODIFICAR ALUMNO:
        }else if(e.getSource().equals(modAlum.getjButtonAceptar())){ 
            this.alumno.setDni(Integer.valueOf(modAlum.getjTextFieldDNI().getText()));
            this.alumno.setNombre(String.valueOf(modAlum.getjTextFieldNombre().getText()));
            this.alumno.setApellido(String.valueOf(modAlum.getjTextFieldApellido().getText()));
            this.alumno.setDomicilio(String.valueOf(modAlum.getjTextFieldDom().getText()));
            this.alumno.setTelefono(Integer.valueOf(modAlum.getjTextFieldTel().getText()));
            try {
                this.alumno.getAlumnoDAO().actualizarAlumno(this.alumno);
                vMsj.setjLabelMensjae("Alumno actualizado con Exito");
                vMsj.setVisible(true);
                modAlum.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al actualizar");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al actualizar");
                vMsj.setVisible(true);
            }finally{
                this.alumno.cleanAtrib();
                this.modAlum.setjTextFieldDNI("");
                this.modAlum.setjTextFieldNombre("");
                this.modAlum.setjTextFieldApellido("");
                this.modAlum.setjTextFieldDom("");
                this.modAlum.setjTextFieldTel("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
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
                this.bajaAlum.setjTextFieldDNI("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }
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
