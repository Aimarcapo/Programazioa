public class Transporte {
    private String modelo;
    private int anos_antiguedad;
    private int combustible;

    public Transporte() {
        this.anos_antiguedad = 5;
        this.combustible = 40;
    }

    public Transporte(String modelo, int anos_antiguedad, int combustible) {
        this.modelo = modelo;
        this.anos_antiguedad = anos_antiguedad;
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnos_antiguedad() {
        return anos_antiguedad;
    }

    public void setAnos_antiguedad(int anos_antiguedad) {
        this.anos_antiguedad = anos_antiguedad;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Transporte [modelo=" + modelo + ", anos_antiguedad=" + anos_antiguedad + ", combustible=" + combustible
                + "]";
    }

    // ADEMAS SE SABE QUE PARA CADA TRANSPORTE SE DEBE SABER LA CAPACIDAD DE
    // COMBUSTIBLE.Metodos:Por defecto combustible cantidad debe tener un valor de
    // 40 y anos 5.Clase main que tenga un atributo que sea arraylist de transporte
    // Crear 3 transportes aereos y 2 terrestres.
    //
}
