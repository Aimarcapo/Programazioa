public class Bebida {
    private int id;
    private int litros;
    private double precio;
    private String marca;

    public Bebida(int id, int litros, double precio, String marca) {
        this.id = id;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLitros() {
        return litros;
    }
    public void setLitros(int litros) {
        this.litros = litros;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Bebida [id=" + id + ", litros=" + litros + ", precio=" + precio + ", marca=" + marca + "]";
    }
    
}
