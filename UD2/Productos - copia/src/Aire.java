public class Aire extends Congelados {
    private int nitrógeno;
    private int oxígeno;
    private int dióxidoDeCarbono;
    private int vaporDeAgua;
    
    public Aire(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen, Productos nuevo,
            int temperatura, Congelados tipo, int nitrógeno, int oxígeno, int dióxidoDeCarbono, int vaporDeAgua) {
        super(fechaDeCaducidad, numeroDeLote, fechaEnvasado, paisDeOrigen, nuevo, temperatura, tipo);
        this.nitrógeno = nitrógeno;
        this.oxígeno = oxígeno;
        this.dióxidoDeCarbono = dióxidoDeCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }
    public int getNitrógeno() {
        return nitrógeno;
    }
    public void setNitrógeno(int nitrógeno) {
        this.nitrógeno = nitrógeno;
    }
    public int getOxígeno() {
        return oxígeno;
    }
    public void setOxígeno(int oxígeno) {
        this.oxígeno = oxígeno;
    }
    public int getDióxidoDeCarbono() {
        return dióxidoDeCarbono;
    }
    public void setDióxidoDeCarbono(int dióxidoDeCarbono) {
        this.dióxidoDeCarbono = dióxidoDeCarbono;
    }
    public int getVaporDeAgua() {
        return vaporDeAgua;
    }
    public void setVaporDeAgua(int vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }
    @Override
    public String toString() {
        return super.toString()+"-> Aire [nitrógeno=" + nitrógeno + ", oxígeno=" + oxígeno + ", dióxidoDeCarbono=" + dióxidoDeCarbono
                + ", vaporDeAgua=" + vaporDeAgua + "]";
    }
    
}
