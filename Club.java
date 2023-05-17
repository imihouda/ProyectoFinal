public class Club {
    private int idClub;
    private String nombreOficial;
    private int añoCreacion;
    private String nombreEstadio;
    
    // Constructor
    public Club(int idClub, String nombreOficial, int añoCreacion, String nombreEstadio) {
        this.idClub = idClub;
        this.nombreOficial = nombreOficial;
        this.añoCreacion = añoCreacion;
        this.nombreEstadio = nombreEstadio;
    }
    
    // Métodos getter y setter
    public int getIdClub() {
        return idClub;
    }
    
    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }
    
    public String getNombreOficial() {
        return nombreOficial;
    }
    
    public void setNombreOficial(String nombreOficial) {
        this.nombreOficial = nombreOficial;
    }
    
    public int getAñoCreacion() {
        return añoCreacion;
    }
    
    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
    
    public String getNombreEstadio() {
        return nombreEstadio;
    }
    
    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }
}
