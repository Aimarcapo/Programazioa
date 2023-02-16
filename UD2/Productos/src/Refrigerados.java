public class Refrigerados extends Productos {
    private int codigoOrganismo;
   private int temperatura;
   private Productos producto=null;

public Refrigerados(String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen,
        Productos nuevo, int codigoOrganismo, int temperatura) {
    super(fechaDeCaducidad, numeroDeLote, fechaEnvasado, paisDeOrigen, nuevo);
    this.codigoOrganismo = codigoOrganismo;
    this.temperatura = temperatura;
}

public int getCodigoOrganismo() {
    return codigoOrganismo;
}
public void setCodigoOrganismo(int codigoOrganismo) {
    this.codigoOrganismo = codigoOrganismo;
}
public int getTemperatura() {
    return temperatura;
}
public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
}
@Override
public String toString() {
    return super.toString()+"-> Refrigerados [codigoOrganismo=" + codigoOrganismo + ", temperatura=" + temperatura + "]";
}
   
}
