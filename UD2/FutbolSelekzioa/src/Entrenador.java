public class Entrenador extends IntegrateSeleccion {
    private String idFederacion;

   

    public Entrenador(int id, String nombre, String idFederacion) {
        super(id, nombre);
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Entrenador [idFederacion=" + idFederacion + "]";
    }
    public String dirigirEntrenamiento(){
        String mensaje="Entrenamendua zuzentzen";
        return mensaje;
    }
    private String dirigirPartido(){
        String mensaje="Partida zuzentzen";
        return mensaje;
    }
}
