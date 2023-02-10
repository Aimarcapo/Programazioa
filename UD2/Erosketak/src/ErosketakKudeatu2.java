import java.util.ArrayList;
import java.util.Scanner;

public class ErosketakKudeatu2 {

    private static ArrayList<Bezeroa> kontaktuak;
    private static ArrayList<Produktua> produktuKatalogoak;
    private static ArrayList<Erosketa> erosketenZerrenda;

    public static void main(String[] args) {

        initialize();
        int aukera;
        boolean salir = false;
        menuNagusiaErakutsi();

        aukera = menuNagusiaErakutsi();
        while ((aukera = menuNagusiaErakutsi()) != 20) {
            switch (aukera) {
                case 1:
                    create();
                    break;
                case 2:
                    readMenuErakutsi();
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

    public static void initialize() {
        kontaktuak = new ArrayList<>();
        produktuKatalogoak = new ArrayList<>();
        erosketenZerrenda = new ArrayList<>();
    }

    public static int menuNagusiaErakutsi() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

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

        opcion = sc.nextInt();

        return opcion;

    }

    public static int readMenuErakutsi() {
        int opcion = 0;
        return opcion;
    }

    public static void create() {
        Scanner sc = new Scanner(System.in);
        String erosketaKodea;
        int bezeroKodea;
        double guztira;
        String epea;
        boolean epeea;
        System.out.println("Erosketa berria");
        System.out.println("===========================");
        System.out.print("Sartu erosketa kodea:");
        erosketaKodea = sc.next();
        System.out.println("Sartu bezero kodea:");
        bezeroKodea = sc.nextInt();
        System.out.println("Guztira ordaindu beharrekoa:");
        guztira = sc.nextDouble();
        System.out.println("Epekako erosketa da?(B/E)");
        epea = sc.next();
        if (epea.charAt(0) == 'B') {
            epeea = true;
        } else if (epea.charAt(0) == 'E') {
            epeea = false;
        }
        Erosketa erosketak=new Erosketa(erosketaKodea,bezeroKodea,guztira,epe);
        System.out.println("");

    }
}
