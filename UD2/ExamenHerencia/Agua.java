package ExamenHerencia;

public class Agua extends Congelados {

    private int salinidad;

    public Agua(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado,
            int temperaturaDeManteninimiento, int salinidad) {
        super(fechaCaducidad, numeroLote, paisDeOrigen, fechaDeEnvasado, temperaturaDeManteninimiento);
        this.salinidad = salinidad;
    }

    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return super.toString() +" -> Agua [salinidad=" + salinidad + "]";
    }

    

}
