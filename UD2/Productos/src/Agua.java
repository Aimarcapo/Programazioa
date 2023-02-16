public class Agua extends Congelados {
    private int sal;

    

    public Agua(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen, Productos nuevo,
            int temperatura, Congelados tipo, int sal) {
        super(fechaDeCaducidad, numeroDeLote, fechaEnvasado, paisDeOrigen, nuevo, temperatura, tipo);
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Agua [sal=" + sal + "]";
    }
    
    
}
