package HerenciaTrabajadores;

public class Directivo extends Empleado{

    private int edad;

    public Directivo(String nombre,int edad) {
        super(nombre);
        this.edad = edad;
    }

    

    public String toString(){
        return super.toString()+"-> Directivo y tiene "+this.edad+" años";
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }
}
