package Modelo;
/*@author Guillermo Marinero*/
public class DictadoAlumno {
    private Dictado dictado;
    private ESTADO estado;
}
enum ESTADO{
    LIBRE,
    REGULAR,
    INSCRIPTO,
    PROMOCION_DIRECTA
}
