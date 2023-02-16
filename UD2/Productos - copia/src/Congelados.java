public class Congelados extends Productos {
    private int temperatura;
    private Congelados tipo;

    public Congelados(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen,
            Productos nuevo, int temperatura, Congelados tipo) {
        super(fechaDeCaducidad, numeroDeLote, fechaEnvasado, paisDeOrigen, nuevo);
        this.temperatura = temperatura;
        this.tipo=tipo;
    }
    

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Congelados [temperatura=" + temperatura + "]";
    }

}
