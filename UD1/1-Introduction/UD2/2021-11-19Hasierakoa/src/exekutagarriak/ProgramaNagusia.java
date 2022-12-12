package exekutagarriak;

import model.Liburua;
import java.util.Scanner;

public class ProgramaNagusia {

    private static Liburua[] liburuak;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuSorta();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() {
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("========");
        for (int i = 0; i <= liburuak.length; i++) {
            if (liburuak[i] != null) {
                System.out.println(liburuak[i]);
            }

        }
    }
    // METODO HAU OSATU BEHAR DUZU

    public static void liburuenDatuGuztiakIkusi() {
        // METODO HAU OSATU BEHAR DUZU
        // ...
        int batura=0;
        
        System.out.printf("%-3s %-20s %-15s %10s %4s %-11s %5s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.",
                "G.", "H.", "P.", "K.");
        System.out
                .println("========================================================================================\n");
        for (int i = 0; i < 100; i++) {
            if (liburuak[i] != null) {
              
                System.out.printf("%-3s %-20s %-15s %10s %4s %-11s %5s %-6s %-15s  \n", i, liburuak[i].getIzenburua(),
                        liburuak[i].getEgilea(), liburuak[i].getOrriKopurua(), liburuak[i].getUrtea(),
                        liburuak[i].getGaia(), liburuak[i].getHizkuntza(), liburuak[i].getPrezioa(),
                        liburuak[i].getKodea());
                        batura=batura+liburuak[i].getOrriKopurua();
                        
            } 
        }
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < 100; i++) {
            
        System.out.println((double)batura);
    }
    }
    public static void liburuenPrezioaIrudikatu() {
        // METODO HAU OSATU BEHAR DUZU
    }

    public static void zaharrenaBilatu() {
        // METODO HAU OSATU BEHAR DUZU
    }

}
