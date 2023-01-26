public class IntegrateSeleccion {
    protected int id;
    protected String nombre;
    private String apellido;
    private int edad;
    
    public IntegrateSeleccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public IntegrateSeleccion(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "IntegrateSeleccion [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + "]";
    }
    public String concentrarse(){
        String mensaje="Kontzetratzen";
        return mensaje;
    }
    public String viajar(){
        String mensaje="Bidaiatzen";
        return mensaje;
    }
    
}
