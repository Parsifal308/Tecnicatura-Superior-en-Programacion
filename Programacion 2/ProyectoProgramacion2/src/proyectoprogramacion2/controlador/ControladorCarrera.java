package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectoprogramacion2.modelos.Carrera;
import proyectoprogramacion2.vistas.AltaCarrera;
import proyectoprogramacion2.vistas.BajaCarrera;
import proyectoprogramacion2.vistas.ModificarCarrera;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjCarrera;

/*@author Guillermo Marinero*/
public class ControladorCarrera implements ActionListener{
    Carrera carrera = new Carrera();
    private AltaCarrera vAlta;
    private BajaCarrera vBaja;
    private ModificarCarrera vModificar;
    private VistaInicio vIni;
    private MsjCarrera vMsj;
    DefaultTableModel modeloTabla = new DefaultTableModel();

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
    
    public void mostrarDatosTabla() throws ClassNotFoundException, SQLException{
        ArrayList<Carrera> listaCarreras = carrera.getCarreraDAO().leerCarreras();
        Object[] unaCarrera = new Object[3];
        
        modeloTabla = (DefaultTableModel)this.vIni.getjTableCarrera().getModel();
        modeloTabla.getDataVector().removeAllElements();
        modeloTabla.fireTableDataChanged();  
              
        for (int i = 0; i < listaCarreras.size(); i++) {
            unaCarrera[0] = listaCarreras.get(i).getCodigo();
            unaCarrera[1] = listaCarreras.get(i).getNombre();
            unaCarrera[2] = listaCarreras.get(i).getDuracion();
        
            modeloTabla.addRow(unaCarrera);        
        }
        this.vIni.getjTableCarrera().setModel(modeloTabla);      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAgregarCarrera())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            this.carrera.setCodigo(Integer.valueOf(vAlta.getjTextFieldCod().getText()));
            this.carrera.setNombre(String.valueOf(vAlta.getjTextFieldNombre().getText()));
            this.carrera.setDuracion(Integer.valueOf(vAlta.getjTextFieldDuracion().getText()));
            try {
                this.carrera.getCarreraDAO().crearCarrera(this.carrera);
                vMsj.setjLabelMensjae("Carrera creada con exito");
                vMsj.setVisible(true);
                vAlta.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException");
                vMsj.setVisible(true);
            }finally{
                this.carrera.cleanAtrib();
                this.vAlta.setjTextFieldCod("");
                this.vAlta.setjTextFieldNombre("");
                this.vAlta.setjTextFieldDuracion("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModCarrera())){  
            vModificar.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vModificar.getjButtonAceptar())){ 
            this.carrera.setCodigo(Integer.valueOf(vModificar.getjTextFieldCod().getText()));
            this.carrera.setNombre(String.valueOf(vModificar.getjTextFieldNombre().getText()));
            this.carrera.setDuracion(Integer.valueOf(vModificar.getjTextFieldDuracion().getText()));

            try {
                this.carrera.getCarreraDAO().actualizarCarrera(this.carrera);
                vMsj.setjLabelMensjae("Alumno actualizado con Exito");
                vMsj.setVisible(true);
                vModificar.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al actualizar");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al actualizar");
                vMsj.setVisible(true);
            }finally{
                this.carrera.cleanAtrib();
                this.vModificar.setjTextFieldCod("");
                this.vModificar.setjTextFieldNombre("");
                this.vModificar.setjTextFieldDuracion("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else if(e.getSource().equals(vModificar.getjButtonCancelar())){  
            vModificar.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonEliminarCarrera())){  
            vBaja.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vBaja.getjButtonAceptar())){ 
            //SI EXITO
            this.carrera.setCodigo(Integer.valueOf(vBaja.getjTextFieldDNI().getText()));
            try {
                this.carrera.getCarreraDAO().eliminarCarrera(this.carrera.getCodigo());
                vMsj.setjLabelMensjae("Carrera eliminada con Exito");
                vMsj.setVisible(true);
                vBaja.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al intentar eliminar datos de alumno");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al intentar elinar datos del alumno");
                vMsj.setVisible(true);
            }finally{
                this.carrera.cleanAtrib();
                this.vBaja.setjTextFieldCod("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCarrera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
