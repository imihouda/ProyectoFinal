public class Futbolista {
    private int idFutbolista;
    private String nombre;
    private String apellido;
    private int añoNacimiento;
    private String nacionalidad;
    private String nif;
    
    // Constructor
    public Futbolista(int idFutbolista, String nombre, String apellido, int añoNacimiento, String nacionalidad, String nif) {
        this.idFutbolista = idFutbolista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoNacimiento = añoNacimiento;
        this.nacionalidad = nacionalidad;
        this.nif = nif;
    }
    
    // Métodos getter y setter
    public int getIdFutbolista() {
        return idFutbolista;
    }
    
    public void setIdFutbolista(int idFutbolista) {
        this.idFutbolista = idFutbolista;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getNif() {
        return nif;
    }
    
    public void setNif(String nif) {
        this.nif = nif;
    }
}
