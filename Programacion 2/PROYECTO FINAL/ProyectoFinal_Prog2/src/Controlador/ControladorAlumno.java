package Controlador;

import Vistas.VistaAlumno;
import Vistas.VistaAlumno_SolicitarCertificado;
import Vistas.VistaEasterEgg;
import Vistas.VistaIngresarDato;
import Vistas.VistaInicio;
import Vistas.VistaOperacionExitosa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*@author Guillermo Marinero*/
public class ControladorAlumno implements ActionListener {
    private VistaInicio vInicio;
    private VistaAlumno vAlumno;

    private VistaAlumno_SolicitarCertificado vCertificado;
    private VistaEasterEgg vEasterEgg;
    private VistaOperacionExitosa vExito;
    private VistaIngresarDato vIngreso;

    public ControladorAlumno(VistaInicio vInicio, VistaAlumno vAlumno, VistaEasterEgg vEasterEgg, VistaAlumno_SolicitarCertificado vCertificado, VistaOperacionExitosa vExito, VistaIngresarDato vIngreso) {
        this.vInicio = vInicio;
        this.vAlumno = vAlumno;
        this.vEasterEgg = vEasterEgg;
        this.vCertificado = vCertificado;
        this.vExito = vExito;
        this.vIngreso = vIngreso;
        this.vInicio.getButton_InicioAlumno().addActionListener(this);
        this.vAlumno.getButton_Atras().addActionListener(this);
        this.vAlumno.getButton_EasterEgg().addActionListener(this);
        this.vAlumno.getButtor_SolicitarCertificado().addActionListener(this);
        this.vAlumno.getButton_SolicitarBoleto().addActionListener(this);
        this.vAlumno.getButton_EditarNombre().addActionListener(this);
        this.vAlumno.getButton_EditarEmail().addActionListener(this);
        this.vAlumno.getButton_EditarTelefono().addActionListener(this);
        this.vEasterEgg.getButton_Atras().addActionListener(this);
        this.vCertificado.getButton_Aceptar().addActionListener(this);
        this.vCertificado.getButton_Cancelar().addActionListener(this);
        this.vExito.getButton_Aceptar().addActionListener(this);
        this.vIngreso.getButton_Aceptar().addActionListener(this);
        this.vIngreso.getButton_Cancelar().addActionListener(this);
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vInicio.getButton_InicioAlumno())){
            vInicio.setVisible(false);
            vAlumno.setVisible(true);
        
        }else if(e.getSource().equals(vAlumno.getButton_Atras())){
            vAlumno.setVisible(false);
            vInicio.setVisible(true);     
            
        }else if(e.getSource().equals(vAlumno.getButton_EasterEgg())){
            vAlumno.setVisible(false);
            vEasterEgg.setVisible(true);
            
        }else if(e.getSource().equals(vEasterEgg.getButton_Atras())){
            vEasterEgg.setVisible(false);
            vAlumno.setVisible(true);
            
        }else if(e.getSource().equals(vAlumno.getButtor_SolicitarCertificado())){
            vCertificado.setVisible(true);
            
        }else if(e.getSource().equals(vCertificado.getButton_Aceptar())){
            //INTENTA GENERAR CERTIFICADO
            vExito.setVisible(true);
            vCertificado.setVisible(false);
            
        }else if(e.getSource().equals(vExito.getButton_Aceptar())){
            vExito.setVisible(false);
            vIngreso.setVisible(false);
            
        }else if(e.getSource().equals(vAlumno.getButton_SolicitarBoleto())){
            vExito.setVisible(true);
            
        }else if(e.getSource().equals(vIngreso.getButton_Aceptar())){
            //SI EL INGRESO DE DATOS ES EXITOSO
            vExito.setVisible(true);
            //SI NO ES EXITOSO
            
        }else if(e.getSource().equals(vIngreso.getButton_Cancelar())){
            vIngreso.setVisible(false);
            
        }else if(e.getSource().equals(vAlumno.getButton_EditarNombre())){
            //VENTANA PARA INGRESAR UN NUEVO NOMBRE Y CARGARLO EN LA BASE DE DATOS
            vIngreso.setVisible(true);
            
        }else if(e.getSource().equals(vAlumno.getButton_EditarEmail())){
            //VENTANA PARA INGRESAR UN NUEVO NOMBRE Y CARGARLO EN LA BASE DE DATOS
            vIngreso.setVisible(true);
            
        }else if(e.getSource().equals(vAlumno.getButton_EditarTelefono())){
            //VENTANA PARA INGRESAR UN NUEVO NOMBRE Y CARGARLO EN LA BASE DE DATOS
            vIngreso.setVisible(true);
            
        }

    }
    
}
