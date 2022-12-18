import java.util.Scanner;
import java.util.Arrays;
public class Menua {
    private static final int LAUKI_KOP = 10;
    private static Laukia[] laukiak = new Laukia[10];
    private static Scanner sc = new Scanner(System.in);
    private static int sortutakoak = 0;
    public static void main(String[] args) {

        boolean salir = false;
        int zenbakia; // Guardaremos la opcion del usuario
        String beteta;
        int kont;

       
        laukiak = new Laukia[LAUKI_KOP];
        int zabalera;
        int altuera;

        while (!salir) {

            System.out.printf("LAUKIA");
            System.out.println("===================================\n");

            System.out.println("1-Lauki berria sortu");
            System.out.println("2-Laukien taula ikusi");
            System.out.println("3-Lauki bat marraztu");
            System.out.println("4-Lauki handiena bilatu");
            System.out.println("5-Arraya automatikoki bete");
            System.out.println("6-Irten");
           

            System.out.println("Aukeratu zenbaki bat");
            zenbakia = sc.nextInt();

            switch (zenbakia) {
                case 1:
                sortu();

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
                arrayaBete(laukiak);
                break;
                    
                case 6:
                salir = true;
                break;
                default:
                    System.out.println("Solo números entre 1 y 5");

            }

        }
    }

    public static void sortu() {
        if (sortutakoak < LAUKI_KOP) {
            System.out.println("Lauki berria sortzen");
            laukiak[sortutakoak]=new Laukia();
            System.out.println("Sartu laukiaren zabalera:");
            laukiak[sortutakoak].setZabalera(sc.nextInt());
            System.out.println("Sartu laukiaren altuera:");
            laukiak[sortutakoak].setAltuera(sc.nextInt());
           
            sortutakoak++;
        } else {
            System.out.print("Ezin dira lauki gehiago sartu");
        }
    }

    public static void imprimatu() {
        
        System.out.println("Has seleccionado la opcion 2");
        System.out.printf("%10s %10s %12s %10s %10s  %15s\n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa",
                "Mota");
        System.out.println("==============================================================================\n");
        for (int i = 0, x = 1; i < sortutakoak; i++, x++) {
            System.out.printf("%5d %12d %10d %10d %10d %18s\n", x, laukiak[i].getZabalera(), laukiak[i].getAltuera(),
                    laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }
        System.out.println("");
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
    public static void arrayaBete(Laukia[] laukiak){
        for(int i=0;i<laukiak.length;i++){
            laukiak[i]=new Laukia((int)(Math.random()*10+1), (int)(Math.random()*10+1));
        }
        System.out.println("Sortu duzun arraya: ");
        System.out.println(Arrays.toString(laukiak));
    }
}