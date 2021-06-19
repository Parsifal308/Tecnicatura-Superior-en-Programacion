package Modelo;
/*@author Guillermo Marinero*/
public abstract class Persona {
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private int legajo;
    private String domCalle;
    private int domNum;  
    private String user;
    private String pass;

    //CONSTRUCTORES
    public Persona() {
    }
    public Persona(int id, int dni, String nombre, String apellido, String email, int telefono, int legajo, String domCalle, int domNum, String user, String pass) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.legajo = legajo;
        this.domCalle = domCalle;
        this.domNum = domNum;
        this.user = user;
        this.pass = pass;
    }
   
    //GETTERS
    public int getId() {
        return id;
    }
    public int getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public int getTelefono() {
        return telefono;
    }
    public int getLegajo() {
        return legajo;
    }
    public String getDomCalle() {
        return domCalle;
    }
    public int getDomNum() {
        return domNum;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public void setDomCalle(String domCalle) {
        this.domCalle = domCalle;
    }
    public void setDomNum(int domNum) {
        this.domNum = domNum;
    }
    
    
}
