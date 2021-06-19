package proyectoprogramacion2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectoprogramacion2.modelos.Materia;
import proyectoprogramacion2.vistas.AltaMateria;
import proyectoprogramacion2.vistas.BajaMateria;
import proyectoprogramacion2.vistas.ModificarMateria;
import proyectoprogramacion2.vistas.VistaInicio;
import proyectoprogramacion2.vistas.MsjMateria;
/*@author Guillermo Marinero*/
public class ControladorMateria implements ActionListener{
    Materia materia = new Materia();
    private VistaInicio vIni;
    private MsjMateria vMsj;
    private AltaMateria vAlta;
    private BajaMateria vBaja;
    private ModificarMateria vMod;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ControladorMateria(VistaInicio vIni) {
        this.vIni = vIni;
        this.vMsj = new MsjMateria();
        this.vAlta = new AltaMateria();
        this.vBaja = new BajaMateria();
        this.vMod = new ModificarMateria();
        
        this.vIni.getjButtonAgregarMat().addActionListener(this);
        this.vIni.getjButtonEliminarMat().addActionListener(this);
        this.vIni.getjButtonModMateria().addActionListener(this);
        
        this.vMsj.getjButtonAceptar().addActionListener(this);
        
        this.vAlta.getjButtonAceptar().addActionListener(this);
        this.vAlta.getjButtonCancelar().addActionListener(this);
        
        this.vBaja.getjButtonAceptar().addActionListener(this);
        this.vBaja.getjButtonCancelar().addActionListener(this);
        
        this.vMod.getjButtonAceptar().addActionListener(this);
        this.vMod.getjButtonCancelar().addActionListener(this);
    }
    
    public void mostrarDatosTabla() throws ClassNotFoundException, SQLException{
        ArrayList<Materia> listaMaterias = materia.getMateriaDAO().leerMaterias();
        Object[] unaMateria = new Object[4];
        
        modeloTabla = (DefaultTableModel)this.vIni.getjTableMateria().getModel();
        modeloTabla.getDataVector().removeAllElements();
        modeloTabla.fireTableDataChanged();  
              
        for (int i = 0; i < listaMaterias.size(); i++) {
            unaMateria[0] = listaMaterias.get(i).getCodMateria();
            unaMateria[1] = listaMaterias.get(i).getNombre();
            unaMateria[2] = listaMaterias.get(i).getProfesorDNI();
            unaMateria[3] = listaMaterias.get(i).getNombreProfe();
        
            modeloTabla.addRow(unaMateria);        
        }
        this.vIni.getjTableMateria().setModel(modeloTabla);      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vIni.getjButtonAgregarMat())){  
            vAlta.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vAlta.getjButtonAceptar())){  
            this.materia.setCodMateria(Integer.valueOf(vAlta.getjTextFieldCod().getText()));
            this.materia.setNombre(String.valueOf(vAlta.getjTextFieldNombre().getText()));
            this.materia.setProfesorDNI(Integer.valueOf(vAlta.getjTextFieldDocente().getText()));
            try {
                this.materia.getMateriaDAO().crearMateria(this.materia);
                vMsj.setjLabelMensjae("Materia creada con exito");
                vMsj.setVisible(true);
                vAlta.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException");
                vMsj.setVisible(true);
            }finally{
                this.materia.cleanAtrib();
                this.vAlta.setjTextFieldCod("");
                this.vAlta.setjTextFieldNombre("");
                this.vAlta.setjTextFieldDocente("");
                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
            
        }else if(e.getSource().equals(vAlta.getjButtonCancelar())){  
            vAlta.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonModMateria())){  
            vMod.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vMod.getjButtonAceptar())){ 
            this.materia.setCodMateria(Integer.valueOf(vMod.getjTextFieldCod().getText()));
            this.materia.setNombre(String.valueOf(vMod.getjTextFieldNombre().getText()));
            this.materia.setProfesorDNI(Integer.valueOf(vMod.getjTextFieldDocente().getText()));

            try {
                this.materia.getMateriaDAO().actualizarAlumno(this.materia);
                vMsj.setjLabelMensjae("Materia actualizada con exito");
                vMsj.setVisible(true);
                vMod.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al actualizar");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al actualizar");
                vMsj.setVisible(true);
            }finally{
                this.materia.cleanAtrib();
                this.vMod.setjTextFieldCod("");
                this.vMod.setjTextFieldNombre("");
                this.vMod.setjTextFieldDocente("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else if(e.getSource().equals(vMod.getjButtonCancelar())){  
            vMod.setVisible(false);
            vIni.setVisible(true);
            
        }else if(e.getSource().equals(vIni.getjButtonEliminarMat())){  
            vBaja.setVisible(true);
            vIni.setVisible(false);
            
        }else if(e.getSource().equals(vBaja.getjButtonAceptar())){ 
            //SI EXITO
            this.materia.setCodMateria(Integer.valueOf(vBaja.getjTextFieldDNI().getText()));
            try {
                this.materia.getMateriaDAO().eliminarAlumno(this.materia.getCodMateria());
                vMsj.setjLabelMensjae("Carrera eliminada con Exito");
                vMsj.setVisible(true);
                vBaja.setVisible(false); 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una SQLException al intentar eliminar datos de alumno");
                vMsj.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                vMsj.setjLabelMensjae("Se produjo una ClassNotFoundException al intentar elinar datos del alumno");
                vMsj.setVisible(true);
            }finally{
                this.materia.cleanAtrib();
                this.vBaja.setjTextFieldDNI("");

                try {
                    this.mostrarDatosTabla();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMateria.class.getName()).log(Level.SEVERE, null, ex);
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
