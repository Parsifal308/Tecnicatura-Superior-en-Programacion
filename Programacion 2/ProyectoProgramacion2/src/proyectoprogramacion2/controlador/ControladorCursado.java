package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectoprogramacion2.modelos.Cursado;
import proyectoprogramacion2.vistas.AltaCursado;
import proyectoprogramacion2.vistas.AsignarNota;
import proyectoprogramacion2.vistas.BajaCursado;
import proyectoprogramacion2.vistas.ModificarNota;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjCursado;

/* @author Guillermo Marinero*/
public class ControladorCursado implements ActionListener {
    Cursado cursado = new Cursado();
    DefaultTableModel modeloTabla = new DefaultTableModel();
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
        public void mostrarDatosTabla() throws ClassNotFoundException, SQLException{
        ArrayList<Cursado> listaCursados = cursado.getCursadoDAO().leerCursados();
        Object[] unCursado = new Object[3];
        
        modeloTabla = (DefaultTableModel)this.vIni.getjTableCursado().getModel();
        modeloTabla.getDataVector().removeAllElements();
        modeloTabla.fireTableDataChanged();  
              
        for (int i = 0; i < listaCursados.size(); i++) {
            unCursado[0] = listaCursados.get(i).getAlumnoDNI();
            unCursado[1] = listaCursados.get(i).getCodMateria();
            unCursado[2] = listaCursados.get(i).getNotaObtenida();
        
            modeloTabla.addRow(unCursado);        
        }
        this.vIni.getjTableCursado().setModel(modeloTabla);      
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAltaCursado())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            this.cursado.setCodMateria(Integer.valueOf(vAlta.getjTextFieldCodMat().getText()));
            this.cursado.setAlumno(Integer.valueOf(vAlta.getjTextFieldNombre().getText()));
            try {
                this.cursado.getCursadoDAO().crearCurso(this.cursado);
                vMsj.setjLabelMensjae("Cursado creada con exito");
                vMsj.setVisible(true);
                vAlta.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException");
                vMsj.setVisible(true);
            }finally{
                this.cursado.cleanAtrib();
                this.vAlta.setjTextFieldCodMat("");
                this.vAlta.setjTextFieldNombre("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModificarNota())){  
            vModNota.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vModNota.getjButtonAceptar())){ 
            this.cursado.setAlumno(Integer.valueOf(vModNota.getjTextFieldAlumnoDNI().getText()));
            this.cursado.setCodMateria(Integer.valueOf(vModNota.getjTextFieldCodMat().getText()));
            this.cursado.setNotaObtenida(Integer.valueOf(vModNota.getjTextFieldNota().getText()));

            try {
                this.cursado.getCursadoDAO().actualizarCursado(this.cursado);
                vMsj.setjLabelMensjae("Cursado actualizado con Exito");
                vMsj.setVisible(true);
                vModNota.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al actualizar");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al actualizar");
                vMsj.setVisible(true);
            }finally{
                this.cursado.cleanAtrib();
                this.vModNota.setjTextFieldAlumnoDNI("");
                this.vModNota.setjTextFieldCodMat("");
                this.vModNota.setjTextFieldNota("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else if(e.getSource().equals(vModNota.getjButtonCancelar())){  
            vModNota.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonBajaCursado())){  
            vBaja.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vBaja.getjButtonAceptar())){ 
            this.cursado.setAlumno(Integer.valueOf(vBaja.getjTextFieldAlumnoDNI().getText()));
            this.cursado.setCodMateria(Integer.valueOf(vBaja.getjTextFieldCodMat().getText()));
            try {
                this.cursado.getCursadoDAO().eliminarCursado(this.cursado.getAlumnoDNI(), this.cursado.getCodMateria());
                vMsj.setjLabelMensjae("Cursado eliminado con Exito");
                vMsj.setVisible(true);
                vBaja.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al intentar eliminar datos de alumno");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al intentar elinar datos del alumno");
                vMsj.setVisible(true);
            }finally{
                this.cursado.cleanAtrib();
                this.vBaja.setjTextFieldAlumnoDNI("");
                this.vBaja.setjTextFieldCodMat("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCursado.class.getName()).log(Level.SEVERE, null, ex);
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
