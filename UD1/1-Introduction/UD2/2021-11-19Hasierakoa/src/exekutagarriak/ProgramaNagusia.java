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

    public static void liburuenDatuGuztiakIkusi() {
        double batazbestekoa = 0;
        int x = 0;
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.",
                "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {/**
                                        * Esto sirve para repetir hasta 100 veces el icono "= y despues de cumplir esas
                                        * 1000 al acabar el for pasara a la linea siguiente"
                                        */
            System.out.print("=");
        }
        System.out.println("");
        for (int i = 0; i < liburuak.length; i++) {
            /**
             * esto sirve para que solo se printeen la misma cantidad de filas que libros
             * haya
             */
            if (liburuak[i] != null) {/**
                                       * dentro del for para que solo nos inprima los huecos donde haya libros ponemos
                                       * la condicion de solo poner los huecos de array que no sean nulls
                                       */
                System.out.printf("%-3d %-30s %-20s %4d %4d %-11s %1s %-6.2f %-15s\n", (i + 1),
                        liburuak[i].getIzenburua(), liburuak[i].getEgilea(), liburuak[i].getOrriKopurua(),
                        liburuak[i].getUrtea(), liburuak[i].getGaia(), liburuak[i].getHizkuntza(),
                        liburuak[i].getPrezioa(), liburuak[i].getKodea());
                x++;
                batazbestekoa += liburuak[i].getOrriKopurua();
            }
        }
        batazbestekoa = batazbestekoa / x;

        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.printf("%30sLiburuen batez besteko orri kopurua: %.2f \n", " ", batazbestekoa);
    }

    public static void liburuenPrezioaIrudikatu() {
        for (int i = 0; i < liburuak.length; i++) {/*
                                                    * Si pusieramos en vez de"<" pusieramos"<="entonces intentaria
                                                    * ejecutar un espazio mas alla de cuando finalizara el array
                                                    * sin el "=" sin embargo la cosa cambia ya que antes de contar el
                                                    * siguiente array analizaria si esta esta vacio o no
                                                    */
            if (liburuak[i] != null) {
                System.out.println(liburuak[i].getIzenburua() + "=" + liburuak[i].getPrezioaIzartxotan());
            }
            // METODO HAU OSATU BEHAR DUZU
        }
    }

    public static void zaharrenaBilatu() {
        int max = liburuak[0].getUrtea();/*
                                          * Se declarra el max con el array para que coja el valor del array y que en el
                                          */
        int liburua = 0;
        for (int i = 0; i < liburuak.length; i++) {/*
                                                    * Se utiliza el que sea menor para que no llegue a ser igual que 10
                                                    * ya que en realidad no son 10 huecos
                                                    */
            if (liburuak[i] != null) {
                if (liburuak[i].getUrtea() < max) {
                    max = liburuak[i].getUrtea();
                    liburua = i;
                    // METODO HAU OSATU BEHAR DUZU
                }
            }
        }
        System.out.println("Liburu  zaharrena " + max + "argiratu zen,izena:" + liburuak[liburua]);
    }

}