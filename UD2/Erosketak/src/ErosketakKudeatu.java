import java.util.ArrayList;
import java.util.Scanner;

public class ErosketakKudeatu {

    private static ArrayList<Bezeroa> kontaktuak;
    private static ArrayList<Produktua> produktuKatalogoak;
    private static ArrayList<Erosketa> erosketenZerrenda;

    public static void main(String[] args) {

        initialize();
        menuNaguisaErakutsi();
    }

    public static void initialize() {
        kontaktuak = new ArrayList<>();
        produktuKatalogoak = new ArrayList<>();
        erosketenZerrenda = new ArrayList<>();
    }

    public static void menuNaguisaErakutsi() {

        int opcion = 0;

        boolean salir = false;

        while (!salir) {
            System.out.println("\n");
            System.out.println("*********************************************");
            System.out.println("*  EROSKETEN KUDEAKETA");
            System.out.println("*  ---------------------------------------");
            System.out.println("*  1.  Create (Datuak gehitu)");
            System.out.println("*  2.  Read (Ikusi)");
            System.out.println("*  3.  Update (Aldatu)");
            System.out.println("*  4.  Delete (Ezabatu)");
            System.out.println("*  20. Irten");
            System.out.println("*  ---------------------------------------");
            System.out.print("* Aukeratu zenbaki bat: ");
            opcion = readMenuErakutsi();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 20:
                    System.out.println("Programa bukatuta");
                    salir = true;
                    break;
                default:
                    System.out.println("Erantzun okerra");
                    break;
            }
        }

    }

    public static int readMenuErakutsi() {
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        return opcion;
    }
}
