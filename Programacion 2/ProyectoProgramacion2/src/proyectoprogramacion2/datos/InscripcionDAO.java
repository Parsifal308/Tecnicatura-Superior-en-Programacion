/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.datos;

/**
 *
 * @author Guillermo Marinero
 */
public class InscripcionDAO {
     private final String SQL_INSERT = "INSERT INTO inscripcion (inscripcion_cod, inscripcion_nombre, inscripcion_codCar) VALUES (?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM inscripcion";
    private final String SQL_DELETE = "DELETE FROM inscripcion WHERE inscripcion_cod=?";
    private final String SQL_UPDATE = "UPDATE inscripcion SET inscripcion_nombre=?, inscripcion_codCar=? WHERE inscripcion_cod=?";
}
