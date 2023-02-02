package HerenciaTrabajadores;

public class Empleado {
    private String nombre;

    public Empleado(){
    }

    public Empleado(String nombre){
        this.nombre  = nombre;
    }

    public void setNombre(String nombre2) {
        this.nombre = nombre2;
    }
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
