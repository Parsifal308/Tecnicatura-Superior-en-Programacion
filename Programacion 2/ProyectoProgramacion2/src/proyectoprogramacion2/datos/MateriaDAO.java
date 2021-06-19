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
public class MateriaDAO {
     private final String SQL_INSERT = "INSERT INTO materia (materia_cod, materia_nombre, materia_profDNI) VALUES (?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM materia";
    private final String SQL_DELETE = "DELETE FROM materia WHERE materia_cod=?";
    private final String SQL_UPDATE = "UPDATE materia SET materia_nombre =?, materia_profDNI=? WHERE materia_cod=?";
    private final String SQL_FIND = "SELECT * FROM materia WHERE materia_cod =?";
}
