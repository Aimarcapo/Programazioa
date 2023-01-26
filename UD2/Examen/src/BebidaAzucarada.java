public class BebidaAzucarada extends Bebida{
    private int azucar;
    private boolean promoción;

    public BebidaAzucarada(int id, int litros, double precio, String marca, int azucar, boolean promoción) {
        super(id, litros, precio, marca);
        this.azucar = azucar;
        this.promoción = promoción;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public boolean isPromoción() {        
        return promoción;
    }

    public void setPromoción(boolean promoción) {
        this.promoción = promoción;
    }

    @Override
    public double getPrecio(){
        if(isPromoción()){
            return super.getPrecio()*0.9;
        }else{
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "-> BebidaAzucarada [azucar=" + azucar + ", promoción=" + promoción + "]";
    }
    
    
}
