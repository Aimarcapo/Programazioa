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
        return "Entrenando";
    }
    public String jugarPartido(){
        return "Jugando Partido";
    }
    @Override
    public String toString() {
        return super.toString()+"-> Futbolista [dorsal=" + dorsal + ", demarkazioa=" + demarkazioa + "]";
    }
    
    
}
