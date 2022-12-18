package exekutagarriak;

import model.Liburua;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaNagusiaArrayList {

    private static ArrayList<Liburua> liburuakArrayList;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuakArrayList = Liburua.getLiburuenArrayLista();
        boolean salbuespena = false;

        int aukera = 0;
        do {
            do {
                try {

            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("-1.- Liburua gehitu");
            System.out.println("0.- Liburua ezabatu");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");

            salbuespena = true;
            
            } catch(InputMismatchException skippy) {
                System.out.println("Zenbaki bat sartu behar duzu aukeratutako aukera ejekutatzeko, saiatu berriz mesedez");
                sc.next();
            } catch(Exception skippy) {
                System.out.println("Akats bat gertatu da");
                System.out.println(skippy.getMessage());
            }

        }   while (!salbuespena);

            switch (aukera) {
                case -1:
                    liburuaGehitu();
                    break;
                case 0:
                    System.out.println("Zein liburu ezabatu nahi duzu? ");
                    int posizioa = sc.nextInt();
                    liburuaEzabatu(liburuakArrayList, posizioa);
                    break; 
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
        // METODO HAU OSATU BEHAR DUZU

        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("==========================");

        for (int i = 0; i < liburuakArrayList.size(); i++) {
            System.out.println(liburuakArrayList.get(i));
        }
    }

    public static void liburuenDatuGuztiakIkusi() {
        // METODO HAU OSATU BEHAR DUZU
        // ...
        double batazbeste = 0;
        int z = 0;
        
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.",
                "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }

        System.out.println();

        for (int i = 0; i < liburuakArrayList.size(); i++) {

            System.out.printf("%-3d %-30s %-20s %4d %4d %-11s %1s %-6.2f %-15s\n", i+1, liburuakArrayList.get(i).getIzenburua(), liburuakArrayList.get(i).getEgilea(), liburuakArrayList.get(i).getOrriKopurua(), liburuakArrayList.get(i).getUrtea(), liburuakArrayList.get(i).getGaia(), liburuakArrayList.get(i).getHizkuntza(), liburuakArrayList.get(i).getPrezioa(), liburuakArrayList.get(i).getKodea());
            batazbeste += liburuakArrayList.get(i).getOrriKopurua();
            z++;
            
        }

        batazbeste = batazbeste / z;

        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }

        System.out.println("");
        System.out.printf("%17sLiburuen bataz besteko orri kopurua: %.2f \n", " ", batazbeste );

        // ...
    }

    public static void liburuenPrezioaIrudikatu() {
        // METODO HAU OSATU BEHAR DUZU
        for (int i = 0; i < liburuakArrayList.size(); i++) {
        
            System.out.printf("%30s: %2s\n", liburuakArrayList.get(i).getIzenburua(), liburuakArrayList.get(i).getPrezioaIzartxotan());
        
    }
    }

    public static void zaharrenaBilatu() {
        // METODO HAU OSATU BEHAR DUZU
        int zaharrena = liburuakArrayList.get(0).getUrtea();
        int liburua = 0;
        for (int i = 0; i < liburuakArrayList.size(); i++) {
                if (liburuakArrayList.get(i).getUrtea() < zaharrena) {
                    zaharrena = liburuakArrayList.get(i).getUrtea();
                    liburua = i;
                }
            
        } 
        System.out.println("Liburu zaharrena " + zaharrena + " urtean argitaratu zen: " + liburuakArrayList.get(liburua));
    }

    public static void liburuaGehitu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu ezazu liburuaren izenburua: ");
        String izenburuBerria = sc.next();
        System.out.println("Sartu egilearen izena: ");
        String egileBerria = sc.next();
        System.out.println("Sartu ezazu orri kopurua: ");
        int orriKopuruBerria = sc.nextInt();
        System.out.println("Sartu liburuaren urtea: ");
        int urteBerria = sc.nextInt();
        System.out.println("Sartu liburuaren gaia: ");
        String gaiBerria = sc.next();
        System.out.println("Sartu liburuaren hizkuntza: ");
        char hizkuntzaBerria = sc.next().charAt(0);
        System.out.println("Sartu liburuaren prezioa: ");
        double prezioBerria = sc.nextDouble();

        liburuakArrayList.add(new Liburua(izenburuBerria, egileBerria, orriKopuruBerria, urteBerria, gaiBerria, hizkuntzaBerria, prezioBerria));
    }

    public static void liburuaEzabatu(ArrayList<Liburua> liburuakArrayList, int posizioa) {

        liburuakArrayList.remove(posizioa -1);
        System.out.println("Liburua ezabatua izan da");
    }


}
