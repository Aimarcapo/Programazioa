package ExamenHerencia;

public class Nitrogeno extends Congelados {
    private int segundos;
    private String metodo;
    
    public Nitrogeno(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado,
            int temperaturaDeManteninimiento, int segundos, String metodo) {
        super(fechaCaducidad, numeroLote, paisDeOrigen, fechaDeEnvasado, temperaturaDeManteninimiento);
        this.segundos = segundos;
        this.metodo = metodo;
    }
    
    public int getsegundos() {
        return segundos;
    }
    public void setsegundos(int segundos) {
        this.segundos = segundos;
    }
    public String getMetodo() {
        return metodo;
    }
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    @Override
    public String toString() {
        return super.toString()+ " -> Nitrogeno [segundos=" + segundos + ", metodo=" + metodo + "]";
    }
    
}
