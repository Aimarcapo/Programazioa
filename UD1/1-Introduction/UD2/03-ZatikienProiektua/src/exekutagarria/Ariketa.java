package exekutagarria;

import java.util.Scanner;

import model.Zatikia;

public class Ariketa {
    public static void main(String[] args) {
        boolean zuzena = false;

        Scanner in = new Scanner(System.in);
        System.out.println("ARIKETA");
        System.out.println("=======");
        do {
            int eragiketa = (int) (Math.random() * 2 + 1);
            System.out.println(eragiketa);
            Zatikia zat1 = new Zatikia();
            Zatikia zat2 = new Zatikia();
            Zatikia erantzuna;
            if (eragiketa == 1) {
                System.out.println(zat1 + "+" + zat2 + "=");
                erantzuna = new Zatikia(in.next());
                if (erantzuna.hamartarBaliokidea() == Zatikia.batu(zat1, zat2).hamartarBaliokidea()) {
                    zuzena = true;
                    System.out.println("Oso ondo!");
                } else {
                    zuzena = false;
                    System.out.println("Saiatu berriro");
                }

            } else {
                System.out.println(zat1 + "x" + zat2 + "=");
                erantzuna = new Zatikia(in.next());
                if (erantzuna.hamartarBaliokidea() == Zatikia.biderkatu(zat1, zat2).hamartarBaliokidea()) {
                    zuzena = true;
                    System.out.println("Oso ondo!");
                } else {
                    zuzena = false;
                    System.out.println("Saiatu berriro");
                }
            }
            in.close();
        } while (!zuzena);

    }
}
