public class Futbolista extends IntegrateSeleccion {
    private int dorsal;
    private Demarkazioa demarkazion;
    
    
    
    public Futbolista(int id, String nombre, int dorsal, Demarkazioa demarkazion) {
        super(id, nombre);
        this.dorsal = dorsal;
        this.demarkazion = demarkazion;
    }
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, Demarkazioa demarkazion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarkazion = demarkazion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public Demarkazioa getDemarkazion() {
        return demarkazion;
    }
    public void setDemarkazion(Demarkazioa demarkazion) {
        this.demarkazion = demarkazion;
    }
    @Override
    public String toString() {
        return super.toString()+"->Futbolista [dorsal=" + dorsal + ", demarkazion=" + demarkazion + "]";
    }
    public String entrenar(){
        String mensaje="Entrenatzen";
        return mensaje;
    }
    public String jugarPartido(){
        String mensaje="Partida jokatzen";
        return mensaje;
    }
    
}
