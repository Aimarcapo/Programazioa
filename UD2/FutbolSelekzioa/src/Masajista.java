public class Masajista extends IntegrateSeleccion {
    private String titulacion;
    private int aniosexperiencia;
    
    public Masajista(int id, String nombre, String titulacion, int aniosexperiencia) {
        super(id, nombre);
        this.titulacion = titulacion;
        this.aniosexperiencia = aniosexperiencia;
    }
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosexperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosexperiencia = aniosexperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosexperiencia() {
        return aniosexperiencia;
    }
    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }
    @Override
    public String toString() {
        return super.toString()+"-> Masajista [titulacion=" + titulacion + ", aniosexperiencia=" + aniosexperiencia + "]";
    }
    public String darMasaje(){
        String mensaje="Masajea ematen";
        return mensaje;
    }
}
