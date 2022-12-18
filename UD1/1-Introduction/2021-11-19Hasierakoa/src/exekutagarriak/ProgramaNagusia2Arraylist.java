package exekutagarriak;

import model.Liburua;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ProgramaNagusia2Arraylist {
    private static ArrayList<Liburua>liburuak;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuenArrayLista();
        boolean ondo = false;
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
                    ondo = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Zenbaki bat sartu behar duzu");
                    sc.next();
                }
                    catch (Exception ex){
                        System.out.println("Akats bat gertatu da");
                        System.out.println(ex.getMessage());
                    }
                

            } while (!ondo);
            switch (aukera) {
                case -1:
                liburuakGehitu();
                break;
                case 0:
                System.out.println("Zein posizioko liburua kendu nahi duzu");
                int posizioa=sc.nextInt();
                liburuaKendu(posizioa);
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
        System.out.println("LIBURUAK");
        System.out.println("=============");
        for (int i = 0; i <= liburuak.size(); i++) {
            
                System.out.println(liburuak.get(i));
                // METODO HAU OSATU BEHAR DUZU
            
        }
    }

    public static void liburuenDatuGuztiakIkusi() {
        // METODO HAU OSATU BEHAR DUZU
        // ...
        int x = 0;
        double average = 0;
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.",
                "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int i = 0; i < liburuak.size(); i++) {
            
                System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-25s\n", (i + 1),
                        liburuak.get(i).getIzenburua(), liburuak.get(i).getEgilea(), liburuak.get(i).getOrriKopurua(),
                        liburuak.get(i).getUrtea(), liburuak.get(i).getGaia(), liburuak.get(i).getHizkuntza(),
                        liburuak.get(i).getPrezioa(), liburuak.get(i).getKodea());
                x++;
                average = average + liburuak.get(i).getOrriKopurua();
            
        }
        average = average / x;
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.printf("                             Bataz besteko orriak:" + average);

        // ...
    }

    public static void liburuenPrezioaIrudikatu() {
        for (int i = 0; i < liburuak.size(); i++) {
        
                System.out.println(liburuak.get(i).getIzenburua() + "=" + liburuak.get(i).getPrezioaIzartxotan());
                // METODO HAU OSATU BEHAR DUZU
            
        }
    }

    public static void zaharrenaBilatu() {
        int liburua = 0;
        int max = liburuak.get(0).getUrtea();
        for (int i = 0; i < liburuak.size(); i++) {
            
                if (liburuak.get(i).getUrtea() < max) {
                    max = liburuak.get(i).getUrtea();
                    liburua = i;
                
            }
        }
        System.out.println(liburuak.get(liburua) + "da urte honetakoa dena" + max);
        // METODO HAU OSATU BEHAR DUZU
    }
    public static void liburuakGehitu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu izenburua");
        String izenburua=sc.next();
        System.out.println("Sartu egilea");
        String egilea=sc.next();
        System.out.println("Sartu orri kopurua");
        int orriKopurua=sc.nextInt();
        System.out.println("Sartu urtea");
        int urtea=sc.nextInt();
        System.out.println("Sartu gaia");
        String gaia=sc.next();
        System.out.println("Sartu hizkuntza");
        char hizkuntza=sc.next().charAt(0);
        System.out.println("Sartu prezioa");
        int prezioa=sc.nextInt();
        liburuak.add(new Liburua(izenburua, egilea, orriKopurua, urtea, gaia, hizkuntza, prezioa));
    }
    public static void liburuaKendu(int posizioa){
       liburuak.remove(posizioa-1);
       System.out.println("Liburua kendu da");
    }
}
