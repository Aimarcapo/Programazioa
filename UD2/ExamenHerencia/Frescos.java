package ExamenHerencia;

public class Frescos extends ProductoPrincipal {

    public Frescos(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado) {
        super(fechaCaducidad, numeroLote, paisDeOrigen, fechaDeEnvasado);
    }
    

    @Override
    public String toString() {
        return super.toString()+ " ->  Frescos";
    }

    
    
    
}
