/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.modelos;

/**
 *
 * @author Guillermo Marinero
 */
public class Cursado {
    private int alumnoDNI;
    private int codMateria;
    private int notaObtenida;

    public Cursado(int alumno, int codMateria, int notaObtenida) {
        this.alumnoDNI = alumno;
        this.codMateria = codMateria;
        this.notaObtenida = notaObtenida;
    }

    public int getAlumno() {
        return alumnoDNI;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public int getNotaObtenida() {
        return notaObtenida;
    }

    public void setAlumno(int alumno) {
        this.alumnoDNI = alumno;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public void setNotaObtenida(int notaObtenida) {
        this.notaObtenida = notaObtenida;
    }
    
    
}
