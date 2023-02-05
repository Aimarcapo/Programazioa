public class Aereo extends Transporte {
    private String compania;
    private String aerolinea;
    
    public Aereo(String modelo, int anos_antiguedad, int combustible, String compania, String aerolinea) {
        super(modelo, anos_antiguedad, combustible);
        this.compania = compania;
        this.aerolinea = aerolinea;
    }
    public String getCompania() {
        return compania;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
    public String getAerolinea() {
        return aerolinea;
    }
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    @Override
    public String toString() {
        return super.toString()+"->Aereo [compania=" + compania + ", aerolinea=" + aerolinea + "]";
    }
   
    
}
