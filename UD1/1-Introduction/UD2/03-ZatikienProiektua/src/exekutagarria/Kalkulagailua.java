package exekutagarria;

import java.util.Scanner;

import model.Zatikia;

public class Kalkulagailua {
    public static void main(String[] args) {
        System.out.println("KALKULAGAILUA");
        System.out.println("===========================");

        Zatikia zat1;
        Zatikia zat2;
        Zatikia emaitza;
        char eragiketa;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu lehen zatikia: ");
        zat1 = new Zatikia(in.next());
        System.out.print("bigarren lehen zatikia: ");
        zat2 = new Zatikia(in.next());
        System.out.print("Aukeratu eragiketa (+ edo x): ");
        eragiketa = in.next().charAt(0);// Con in.next se guarda como un scanner y luego el charat sirve para que el
                                        // scanner sepa que posicion tiene que tomar en cuenta en este caso como es 0 solo tomara en cuenta el primer char
        in.close();

        if (eragiketa == '+') {
            emaitza = Zatikia.batu(zat1, zat2);
            System.out.println(zat1 + " + " + zat2 + " = " + emaitza);
        } else {
            emaitza = Zatikia.biderkatu(zat1, zat2);
            System.out.println(zat1 + " x " + zat2 + " = " + emaitza);
        }
        System.out.println("SINPLIFIKATUTA: " + emaitza.sinplifikatu());
    }
}