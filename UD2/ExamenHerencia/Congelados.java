package ExamenHerencia;

public class Congelados extends ProductoPrincipal {
   
    private int temperaturaDeManteninimiento;

    public Congelados(String fechaCaducidad, int numeroLote, String paisDeOrigen, String fechaDeEnvasado,
            int temperaturaDeManteninimiento) {
        super(fechaCaducidad, numeroLote, paisDeOrigen, fechaDeEnvasado);
        this.temperaturaDeManteninimiento = temperaturaDeManteninimiento;
    }

    public int getTemperaturaDeManteninimiento() {
        return temperaturaDeManteninimiento;
    }

    public void setTemperaturaDeManteninimiento(int temperaturaDeManteninimiento) {
        this.temperaturaDeManteninimiento = temperaturaDeManteninimiento;
    }

    @Override
    public String toString() {
        return super.toString()  + " ->  Congelados [temperaturaDeManteninimiento=" + temperaturaDeManteninimiento + "]";
    }

   
    
    

}
