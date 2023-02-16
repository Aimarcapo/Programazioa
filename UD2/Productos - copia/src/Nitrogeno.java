public class Nitrogeno extends Congelados {
    private String metodo;
    private int tiempo;
    
    public Nitrogeno(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen,
            Productos nuevo, int temperatura, Congelados tipo, String metodo, int tiempo) {
        super(fechaDeCaducidad, numeroDeLote, fechaEnvasado, paisDeOrigen, nuevo, temperatura, tipo);
        this.metodo = metodo;
        this.tiempo = tiempo;
    }
    public String getMetodo() {
        return metodo;
    }
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public String toString() {
        return  super.toString()+"-> Nitrogeno [metodo=" + metodo + ", tiempo=" + tiempo + "]";
    }
    
}
