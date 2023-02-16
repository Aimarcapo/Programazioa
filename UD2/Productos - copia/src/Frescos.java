public class Frescos extends Productos {

    

    public Frescos(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen,
            Productos nuevo) {
        super(fechaDeCaducidad, numeroDeLote, fechaEnvasado, paisDeOrigen, nuevo);
    }

    @Override
    public String toString() {
        return super.toString()+"->Frescos []";
    }
    
    
    
    
}
