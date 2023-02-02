package ExamenHerencia;

public class ProductoPrincipal {

    private String fechaCaducidad;
    private int numeroLote;
    private String paisDeOrigen;
    private String fechaDeEnvasado;
    
    public ProductoPrincipal(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.paisDeOrigen = paisDeOrigen;
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }
    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    @Override
    public String toString() {
        return "ProductoPrincipal [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", paisDeOrigen="
                + paisDeOrigen + ", fechaDeEnvasado=" + fechaDeEnvasado + "]";
    }

    

}
