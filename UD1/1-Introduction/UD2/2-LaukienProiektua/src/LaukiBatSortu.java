import java.util.Scanner;

public class LaukiBatSortu {

    public static void main(String[] args) { // Program entry point
        // Declare and Construct an instance of the Circle class called c1
        Scanner sc = new Scanner(System.in);
        int zabalera;
        int altuera;
        System.out.println("Sartu laukoaren zabalera ");
        zabalera = sc.nextInt();
        System.out.print("Sartu laukiaren altuera");
        altuera = sc.nextInt();
        sc.close();
        Laukia l1 = new Laukia(zabalera, altuera);

        System.out.println("Zabalera:  " + l1.getZabalera());
        System.out.println("Altuera:  " + l1.getAltuera());
        System.out.println(
                "Lauki karratua sortu duzu:  =>" + l1.getMota() + "[" + l1.getAltuera() + "x" + l1.getZabalera() + "]");

        System.out.println("Honela marraztuta");
        l1.marraztuBeteta();
        System.out.println("Honela hutsik");
        l1.marraztuHutsik();


    }
}