package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectoprogramacion2.modelos.Inscripcion;
import proyectoprogramacion2.vistas.AltaInscripcion;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjInscripcion;

/*@author Guillermo Marinero*/
public class ControladorInscripcion implements ActionListener{
    Inscripcion inscripcion = new Inscripcion();
    private VistaInicio vIni;
    private MsjInscripcion vMsj;
    private AltaInscripcion vAlta;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ControladorInscripcion(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjInscripcion();
        this.vAlta = new AltaInscripcion();
        
        this.vAlta.getjButtonCancelar().addActionListener(this);
        this.vAlta.getjButtonAceptar().addActionListener(this);
                
        this.vMsj.getjButtonAceptar().addActionListener(this);
        
        this.vIni.getjButtonAgregarIns().addActionListener(this);
    }

    public void mostrarDatosTabla() throws ClassNotFoundException, SQLException{
        ArrayList<Inscripcion> listaInscripcion = inscripcion.getInscripcionDAO().leerInscripcion();
        Object[] unaInscripcion = new Object[6];
        
        modeloTabla = (DefaultTableModel)this.vIni.getjTableInscripcion().getModel();
        modeloTabla.getDataVector().removeAllElements();
        modeloTabla.fireTableDataChanged();  
              
        for (int i = 0; i < listaInscripcion.size(); i++) {
            unaInscripcion[0] = listaInscripcion.get(i).getCod();
            unaInscripcion[1] = listaInscripcion.get(i).getNombre();
            unaInscripcion[2] = listaInscripcion.get(i).getCarrera();

            modeloTabla.addRow(unaInscripcion);        
        }
        this.vIni.getjTableInscripcion().setModel(modeloTabla);      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAgregarIns())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            this.inscripcion.setCod(Integer.valueOf(vAlta.getjTextFieldCod().getText()));
            this.inscripcion.setNombre(String.valueOf(vAlta.getjTextFieldNombre().getText()));
            this.inscripcion.setCarrera(Integer.valueOf(vAlta.getjTextFieldCodCar().getText()));

            try {
                this.inscripcion.getInscripcionDAO().crearInscripcion(this.inscripcion);
                vMsj.setjLabelMensjae("Alumno Creado con Exito");
                vMsj.setVisible(true);
                vAlta.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException");
                vMsj.setVisible(true);
            }finally{
                this.inscripcion.cleanAtrib();
                this.vAlta.setjTextFieldCod("");
                this.vAlta.setjTextFieldNombre("");
                this.vAlta.setjTextFieldCodCar("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vMsj.getjButtonAceptar())){  
            vIni.setVisible(true);
            vMsj.setVisible(false); 
        }   
    } 
}
