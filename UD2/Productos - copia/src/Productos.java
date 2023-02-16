public class Productos{
    private String fechaDeCaducidad;
    private int numeroDeLote;
    private String fechaEnvasado;
    private String paisDeOrigen;
    public Productos(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen,Productos nuevo) {
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisDeOrigen = paisDeOrigen;
       
    }
    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }
    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    public int getNumeroDeLote() {
        return numeroDeLote;
    }
    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    @Override
    public String toString() {
        return "Productos [fechaDeCaducidad=" + fechaDeCaducidad + ", numeroDeLote=" + numeroDeLote + ", fechaEnvasado="
                + fechaEnvasado + ", paisDeOrigen=" + paisDeOrigen + "]";
    }
    
    
    
}