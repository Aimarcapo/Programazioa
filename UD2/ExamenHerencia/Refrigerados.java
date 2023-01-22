package ExamenHerencia;

public class Refrigerados extends ProductoPrincipal {
    private int CodigoOrganismo;
    private int TemperaturaMantenimiento;

    public Refrigerados(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado,
            int codigoOrganismo, int temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote, paisDeOrigen, fechaDeEnvasado);
        this.CodigoOrganismo = codigoOrganismo;
        this.TemperaturaMantenimiento = temperaturaMantenimiento;
    }
    public int getCodigoOrganismo() {
        return CodigoOrganismo;
    }
    public void setCodigoOrganismo(int codigoOrganismo) {
        CodigoOrganismo = codigoOrganismo;
    }
    public int getTemperaturaMantenimiento() {
        return TemperaturaMantenimiento;
    }
    public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
        TemperaturaMantenimiento = temperaturaMantenimiento;
    }
    @Override
    public String toString() {
        return super.toString()  +  " -> Refrigerados [CodigoOrganismo=" + CodigoOrganismo + ", TemperaturaMantenimiento="
                + TemperaturaMantenimiento + "]";
    }
    
}
