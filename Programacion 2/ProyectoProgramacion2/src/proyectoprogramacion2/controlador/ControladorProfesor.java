package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectoprogramacion2.modelos.Profesor;
import proyectoprogramacion2.vistas.AltaDocente;
import proyectoprogramacion2.vistas.BajaProfesor;
import proyectoprogramacion2.vistas.InscribirProfesor;
import proyectoprogramacion2.vistas.ModificarDocente;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjProfesor;
/* @author Guillermo Marinero*/
public class ControladorProfesor implements ActionListener{
    Profesor profesor = new Profesor();
    private VistaInicio vIni;
    private MsjProfesor vMsj;
    private AltaDocente vAlta;
    private BajaProfesor vBaja;
    private ModificarDocente vMod;
    private InscribirProfesor vIns;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    



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
        
        this.vAlta.getjButtonAceptar().addActionListener(this);
        this.vAlta.getjButtonCancelar().addActionListener(this);
        
        this.vBaja.getjButtonAceptar().addActionListener(this);
        this.vBaja.getjButtonCancelar().addActionListener(this);
        
        this.vMod.getjButtonAceptar().addActionListener(this);
        this.vMod.getjButtonCancelar().addActionListener(this);
        
        this.vIns.getjButtonAceptar().addActionListener(this);
        this.vIns.getjButtonCancelar().addActionListener(this);
        
        this.vMsj.getjButtonAceptar().addActionListener(this);
    }
 
    public void mostrarDatosTabla() throws ClassNotFoundException, SQLException{
        ArrayList<Profesor> listaProfesores = profesor.getProfesorDAO().leerProfesores();
        Object[] unProfesor = new Object[5];
        
        modeloTabla = (DefaultTableModel)this.vIni.getjTableProfesor().getModel();
        modeloTabla.getDataVector().removeAllElements();
        modeloTabla.fireTableDataChanged();  
              
        for (int i = 0; i < listaProfesores.size(); i++) {
            unProfesor[0] = listaProfesores.get(i).getDni();
            unProfesor[1] = listaProfesores.get(i).getNombre();
            unProfesor[2] = listaProfesores.get(i).getApellido();
            unProfesor[3] = listaProfesores.get(i).getDomicilio();
            unProfesor[4] = listaProfesores.get(i).getTelefono();
        
            modeloTabla.addRow(unProfesor);        
        }
        this.vIni.getjTableProfesor().setModel(modeloTabla);      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonNuevoProfe())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            this.profesor.setDni(Integer.valueOf(vAlta.getjTextFieldDNI().getText()));
            this.profesor.setNombre(String.valueOf(vAlta.getjTextFieldNombre().getText()));
            this.profesor.setApellido(String.valueOf(vAlta.getjTextFieldApellido().getText()));
            this.profesor.setDomicilio(String.valueOf(vAlta.getjTextFieldDom().getText()));
            this.profesor.setTelefono(Integer.valueOf(vAlta.getjTextFieldTel().getText()));
            try {
                this.profesor.getProfesorDAO().crearProfesor(this.profesor);
                vMsj.setjLabelMensjae("Profesor Creado con Exito");
                vMsj.setVisible(true);
                vAlta.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException");
                vMsj.setVisible(true);
            }finally{
                this.profesor.cleanAtrib();
                this.vAlta.setjTextFieldDNI("");
                this.vAlta.setjTextFieldNombre("");
                this.vAlta.setjTextFieldApellido("");
                this.vAlta.setjTextFieldDom("");
                this.vAlta.setjTextFieldTel("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModProfe())){  
            vMod.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vMod.getjButtonAceptar())){ 
            this.profesor.setDni(Integer.valueOf(vMod.getjTextFieldDNI().getText()));
            this.profesor.setNombre(String.valueOf(vMod.getjTextFieldNombre().getText()));
            this.profesor.setApellido(String.valueOf(vMod.getjTextFieldApellido().getText()));
            this.profesor.setDomicilio(String.valueOf(vMod.getjTextFieldDom().getText()));
            this.profesor.setTelefono(Integer.valueOf(vMod.getjTextFieldTel().getText()));
            try {
                this.profesor.getProfesorDAO().actualizarProfesor(this.profesor);
                vMsj.setjLabelMensjae("Alumno actualizado con Exito");
                vMsj.setVisible(true);
                vMod.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al actualizar");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al actualizar");
                vMsj.setVisible(true);
            }finally{
                this.profesor.cleanAtrib();
                this.vMod.setjTextFieldDNI("");
                this.vMod.setjTextFieldNombre("");
                this.vMod.setjTextFieldApellido("");
                this.vMod.setjTextFieldDom("");
                this.vMod.setjTextFieldTel("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else if(e.getSource().equals(vMod.getjButtonCancelar())){  
            vMod.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonElimProfe())){  
            vBaja.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vBaja.getjButtonAceptar())){ 
            this.profesor.setDni(Integer.valueOf(vBaja.getjTextFieldDNI().getText()));
            try {
                this.profesor.getProfesorDAO().eliminarProfesor(this.profesor.getDni());
                vMsj.setjLabelMensjae("Alumno eliminado con Exito");
                vMsj.setVisible(true);
                vBaja.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al intentar eliminar datos de alumno");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al intentar elinar datos del alumno");
                vMsj.setVisible(true);
            }finally{
                this.profesor.cleanAtrib();
                this.vBaja.setjTextFieldDNI("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProfesor.class.getName()).log(Level.SEVERE, null, ex);
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
