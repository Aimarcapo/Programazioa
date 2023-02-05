public class Entrenador extends IntegranteSeleccion {
    
    private String idFederacion;

    public Entrenador(int id, String nombre, String idFederacion) {
        super(id, nombre);
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public String dirigirEntrenamiento(){
        return "Dirigiendo entrenamiento";
    }
    public String dirigirPartido(){
        return "Dirigiendo partido";
    }

    @Override
    public String toString() {
        return super.toString()+"-> Entrenador [idFederacion=" + idFederacion + "]";
    }
    
}
