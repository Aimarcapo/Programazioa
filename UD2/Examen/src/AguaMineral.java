public class AguaMineral extends Bebida {
    private String origen;

    public AguaMineral(int id, int litros, int precio, String marca, String origen) {
        super(id, litros, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString()+"->AguaMineral [origen=" + origen + "]";
    }
    
}
