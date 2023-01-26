
 public class Futbolista extends IntegranteSeleccion {
    private int dorsal;
    private Demarkazioa demarkazioa;

    public Futbolista(int id, String nombre, int dorsal, Demarkazioa demarkazioa) {
        super(id, nombre);
        this.dorsal = dorsal;
        this.demarkazioa = demarkazioa;
    }
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, Demarkazioa demarkazioa) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarkazioa = demarkazioa;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public Demarkazioa getDemarkazioa() {
        return demarkazioa;
    }
    public void setDemarkazioa(Demarkazioa demarkazioa) {
        this.demarkazioa = demarkazioa;
    }
    
    public String entrenar(){
        String mensaje = "Estoy entrenando";
        return mensaje;
    }
    public String jugarPartido(){
        String mensaje="Jokatzen";
        return mensaje;
    }
    public String toString(){
        return"Futbolista{id="+getId()+", nombre="+getNombre()+", apellidos="+getApellidos()+", edad="+getEdad()+", dorsal="+getDorsal()+", demarcacion="+getDemarkazioa()+"}";
    }
    
}
