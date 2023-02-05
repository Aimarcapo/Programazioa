public class Masajista extends IntegranteSeleccion {
    private String titulacion;
    private int aniosExperiencia;
    public Masajista(int id, String nombre, String titulacion, int aniosExperiencia) {
        super(id, nombre);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public String darMasaje(){
        return "Dando masaje";
    }
    @Override
    public String toString() {
        return super.toString()+"-> Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
    }
    
}
