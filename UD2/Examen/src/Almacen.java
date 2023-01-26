import java.util.Arrays;

public class Almacen {

    private Bebida[][] estanteria;
    private int filas;
    private int columnas;

    public Almacen(int filas, int columnas) {
        this.estanteria = new Bebida[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }

    public Bebida[][] getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(Bebida[][] estanteria) {
        this.estanteria = estanteria;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public double sumaTotalPrecios() {
        double total = 0;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; i++) {
                if (estanteria[i][j] != null) {
                    total += estanteria[i][j].getPrecio();
                }
            }
        }

        return total;
    }

    public double sumaTotalPreciosMarca(String marca) {
        double total = 0;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; i++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                    total += estanteria[i][j].getPrecio();
                }
            }
        }

        return total;
    }

    public double sumaTotalPreciosColumna(int columna) {
        double total = 0;

        if (columna >= 0 && columna < estanteria.length) {

            for (int i = 0; i < estanteria.length; i++) {
                if (estanteria[i][columna] != null) {
                    total += estanteria[i][columna].getPrecio();
                }
            }

        } else {
            System.out.println("La columna debe estar entre 0 y " + estanteria.length);
        }

        return total;
    }

    public void agregarBebida(Bebida b) {

        boolean esta = false;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getId() == b.getId()) {
                    esta = true;
                }
            }
        }

        if (esta == false) {
            for (int i = 0; i < estanteria.length; i++) {
                for (int j = 0; j < estanteria[0].length; j++) {
                    if (estanteria[i][j] == null) {
                        estanteria[i][j] = b;
                    }
                }
            }
        }

        if (esta == false) {
            System.out.println("Bebida añadida");
        } else {
            System.out.println("Ya existe la bebida en la estantería");
        }

    }

    public void eliminarBebida(int id) {
        boolean esta = false;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j].getId() == id) {
                    esta = true;
                    estanteria[i][j] = null;
                }
            }
        }

        if (esta == false) {
            System.out.println("Bebida no encontrada");
        } else {
            System.out.println("Bebida eliminada de la estantería");
        }

    }

    public void mostrarInformacion() {
        System.out.println("******** ESTANTERÍA ********  \n");
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    System.out.println(estanteria[i][j].toString());
                }
            }
            
        }

    }

}