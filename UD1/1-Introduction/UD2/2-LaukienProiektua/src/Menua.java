import java.util.Scanner;

public class Menua {
    private static final int LAUKI_KOP = 10;
    private static Laukia[] laukiak = new Laukia[10];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int zenbakia; // Guardaremos la opcion del usuario
        String beteta;
        int kont;

        int sortutakoak = 0;

        int zabalera;
        int altuera;

        while (!salir) {

            System.out.printf("LAUKIA");
            System.out.println("===================================\n");

            System.out.println("1-Lauki berria sortu");
            System.out.println("2-Laukien taula ikusi");
            System.out.println("3-Lauki bat marraztu");
            System.out.println("4-Lauki handiena bilatu");
            System.out.println("5-Irten");

            System.out.println("Aukeratu zenbaki bat");
            zenbakia = sc.nextInt();

            switch (zenbakia) {
                case 1:
                    if (sortutakoak < LAUKI_KOP) {
                        System.out.println("Lauki berria sortzen");
                        System.out.println("Sartu laukiaren zabalera:");
                        zabalera = sc.nextInt();
                        System.out.println("Sartu laukiaren altuera:");
                        altuera = sc.nextInt();
                        laukiak[sortutakoak] = new Laukia(zabalera, altuera);
                        sortutakoak++;
                    } else {
                        System.out.print("Ezin dira lauki gehiago sartu");
                    }

                    break;
                case 2:

                    imprimatu();

                    break;
                case 3:
                    marraztu();
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");

            }

        }
    }

    public static void sortu() {

    }

    public static void imprimatu() {
        System.out.println("Has seleccionado la opcion 2");
        System.out.printf("%10s %10s %12s %10s %10s  %15s\n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa",
                "Mota");
        System.out.println("==============================================================================\n");
        for (int i = 0, x = 1; i < laukiak.length; i++, x++) {
            if(laukiak[i]!=null){
            System.out.printf("%5d %12d %10d %10d %10d %18s\n", x, laukiak[i].getZabalera(), laukiak[i].getAltuera(),
                    laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }
        
    }
    }
    public static void marraztu() {
        int z;
        String beteta;
        System.out.println("Zenbatgarren laukia nahi duzu marraztu?");
        z = sc.nextInt();
        System.out.printf("Beteta ala hutsik");
        beteta = sc.next();
        z = z - 1;
        if (beteta.charAt(0) == 'B') {
            laukiak[z].marraztuBeteta();
        } else if (beteta.charAt(0) == 'H') {
            laukiak[z].marraztuHutsik();
        } else {
            System.out.println("Idatzi H edo B");
        }
    }

    public static void handiena() {
        Laukia bigger = new Laukia();
        bigger = Laukia.getTheBiggest(laukiak);
        System.out.println("Laukirik handiena hau da:" + bigger.toString());
    }
}