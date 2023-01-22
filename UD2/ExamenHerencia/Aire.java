package ExamenHerencia;

public class Aire extends Congelados{
    private int Nitrogeno;
    private int Oxigeno;
    private int C02;
    private int VaporH20;

    public Aire(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado,
            int temperaturaDeManteninimiento, int nitrogeno, int oxigeno, int c02, int vaporH20) {
        super(fechaCaducidad, numeroLote, paisDeOrigen, fechaDeEnvasado, temperaturaDeManteninimiento);
        
        Nitrogeno = nitrogeno;
        Oxigeno = oxigeno;
        C02 = c02;
        VaporH20 = vaporH20;
    }

    public int getNitrogeno() {
        return Nitrogeno;
    }
    public void setNitrogeno(int nitrogeno) {
        Nitrogeno = nitrogeno;
    }
    public int getOxigeno() {
        return Oxigeno;
    }
    public void setOxigeno(int oxigeno) {
        Oxigeno = oxigeno;
    }
    public int getC02() {
        return C02;
    }
    public void setC02(int c02) {
        C02 = c02;
    }
    public int getVaporH20() {
        return VaporH20;
    }
    public void setVaporH20(int vaporH20) {
        VaporH20 = vaporH20;
    }
    @Override
    public String toString() {
        return super.toString()+" -> Aire [Nitrogeno=" + Nitrogeno + ", Oxigeno=" + Oxigeno + ", C02=" + C02 + ", VaporH20=" + VaporH20+ "]";
    }

    
}
