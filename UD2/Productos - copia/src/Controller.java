import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private static ArrayList<Productos> listaProductos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        initialize();
        do {
            System.out.println("MENU");
            System.out.println("1- Crear un producto");
            System.out.println("2-Buscar producto por un numero de lote");
            System.out.println("3-Eliminar producto por un numero de lote");
            System.out.println("4- Leer productos");
            System.out.println("5-Exit");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    create();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    leer();
                    break;

            }
        } while (opcion != 5);
    }

    public static void initialize() {
        listaProductos.add(new Productos("2023-1-2", 1, "292", "Suiza",
                new Congelados(null, 0, null, null, null, 0, new Aire(null, 0, null, null, null, 0, null, 0, 0, 0, 0))));
    }

    public static void create() {
        int tipo;
        String fechaDeCaducidad;
        int numeroLote;
        String fechaEnvasado;
        String paisDeOrigen;
        System.out.println("Que fecha de Caducidad quiere?");
        fechaDeCaducidad = sc.next();
        System.out.println("Diga un numero de lote");
        numeroLote = sc.nextInt();
        System.out.println("Diga una fecha de envasado");
        fechaEnvasado = sc.next();
        System.out.println("Diga un pais de origen");
        paisDeOrigen = sc.next();
        System.out.println("Que tipo de producto quiere?");
        System.out.println("Introduzca 1 para fresco");
        System.out.println("Introduzca 2 para refrigerado");
        System.out.println("Introduzca 3 para congelado");
        tipo = sc.nextInt();

        if (tipo == 1) {

            listaProductos.add(new Productos(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen,
                    new Frescos(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null)));
        } else if (tipo == 2) {
            int codigodeOrganismo;
            int temperatura;
            System.out.println("Introduce un codigo de organismo");
            codigodeOrganismo = sc.nextInt();
            System.out.println("Introduce la temperatura de mantenimiento");
            temperatura = sc.nextInt();
            listaProductos.add(new Productos(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen,
                    new Refrigerados(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, codigodeOrganismo,
                            temperatura)));

        } else if (tipo == 3) {
            int congelado;
            System.out.println("Que tipo de congelado quiere");
            System.out.println("Introduzca 1 para aire");
            System.out.println("Introduzca 2 para agua");
            System.out.println("Introduzca 3 para nitrogeno");
            congelado = sc.nextInt();
            if (congelado == 1) {
                int nitrógeno;
                int oxígeno;
                int dióxidoDeCarbono;
                int vaporDeAgua;
                System.out.println("Introduzca cantidad de nitrogeno");
                nitrógeno=sc.nextInt();
                System.out.println("Introduzca cantidad de oxigeno");
                oxígeno=sc.nextInt();
                System.out.println("Introduzca cantidad de C02");
                dióxidoDeCarbono=sc.nextInt();
                System.out.println("Itrdouzca cantidad vapor de agua");
                vaporDeAgua=sc.nextInt();
                listaProductos.add(new Productos(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen,
                        new Congelados(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, congelado,
                                new Aire(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, congelado, null, nitrógeno, oxígeno, dióxidoDeCarbono, vaporDeAgua))));
            }
            else if (congelado==2){
                int sal;
                System.out.println("Cuanta salinidad de agua");
                sal=sc.nextInt();
                listaProductos.add(new Productos(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen,
                        new Congelados(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, congelado,
                                new Agua(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, congelado, null, sal))));
            }
            else if(congelado==3){
                String metodo;
                int tiempo;
                System.out.println("Que nombre tiene el metodo");
                metodo=sc.next();
                System.out.println("Cuanto tiempo ha estado congelado en nitrogeno");
                tiempo=sc.nextInt();
                listaProductos.add(new Productos(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen,
                new Congelados(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, congelado,
                        new Nitrogeno(fechaDeCaducidad, numeroLote, fechaEnvasado, paisDeOrigen, null, congelado, null, metodo, tiempo))));
            }

        }

    }

    public static void buscar() {
        int numero;
        System.out.println("Que numero de lote quiere introducir:");
        numero = sc.nextInt();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getNumeroDeLote() == numero) {
                System.out.println(
                        "Este es el producto" + listaProductos.get(i).toString() + "cuyo numero de lote es" + numero);
            }
        }
    }

    public static void delete() {
        int numero;
        System.out.println("Que numero de lote quiere introducir:");
        numero = sc.nextInt();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getNumeroDeLote() == numero) {
                listaProductos.remove(i);
                System.out.println("Se ha eliminado dicho producto");
            }
        }
    }

    public static void leer() {
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i));
        }
    }
}