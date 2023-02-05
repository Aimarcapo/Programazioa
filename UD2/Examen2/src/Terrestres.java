public class Terrestres extends Transporte {
    private int ruedas;
    private int km_recorridos;
 
    
    public Terrestres(String modelo, int anos_antiguedad, int combustible, int ruedas, int km_recorridos) {
        super(modelo, anos_antiguedad, combustible);
        this.ruedas = ruedas;
        this.km_recorridos = km_recorridos;
    }


    public int getRuedas() {
        return ruedas;
    }


    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }


    public int getKm_recorridos() {
        return km_recorridos;
    }


    public void setKm_recorridos(int km_recorridos) {
        this.km_recorridos = km_recorridos;
    }


    @Override
    public String toString() {
        return super.toString()+"->Terrestres [ruedas=" + ruedas + ", km_recorridos=" + km_recorridos + "]";
    }
    
}
