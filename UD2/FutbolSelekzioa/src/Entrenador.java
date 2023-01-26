public class Entrenador extends IntegranteSeleccion{
String idFederacion;

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
    String mensaje="Entrenamendua zuzentzen";
    return mensaje;
}
public String dirigirPartido(){
  String mensaje="Partida zuzentzen";
  return mensaje;

}

@Override
public String toString() {
    return super.toString()+ "->Entrenador [idFederacion=" + idFederacion + "]";
}





}