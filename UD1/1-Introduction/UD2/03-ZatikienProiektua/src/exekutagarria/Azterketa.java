package exekutagarria;

import java.util.Scanner;

import model.Zatikia;

public class Azterketa {
    public static void main(String[] args) throws InterruptedException {// throws Interrupted Exception sirve para luego
                                                                        // que haya un tiempo de espera hasta que te
                                                                        // inprima la respuesta

        System.out.println("Azterketa");
        System.out.println("========");
        int nota = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {// Con esto va sumando el numero de la galdera a la vez que repite el proceso de
                                      // cada ariketa hasta que haya habido 10 repeticiones
            // Es decir 10 ejercicios
            int eragiketa = (int) (Math.random() * 2 + 1);
            Zatikia zat1 = new Zatikia();
            Zatikia zat2 = new Zatikia();
            Zatikia erantzuna;

            System.out.println((i + 1) + ". GALDERA:");

            if (eragiketa == 1) {
                System.out.print(zat1 + " + " + zat2 + " = ");
                erantzuna = new Zatikia(in.next());
                if (erantzuna.hamartarBaliokidea() == Zatikia.batu(zat1, zat2).hamartarBaliokidea()) {
                    nota++;
                }
            } else {
                System.out.print(zat1 + " x " + zat2 + " = ");
                erantzuna = new Zatikia(in.next());
                if (erantzuna.hamartarBaliokidea() == Zatikia.biderkatu(zat1, zat2).hamartarBaliokidea()) {
                    nota++;
                }
            }
        }

        in.close();
        System.out.println("Hartu arnasa nota esan arte");
        for (int x = 0; x < 3; x++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println("");

        System.out.println("NOTA: " + nota);
        if (nota < 5) {
            System.out.println("Gehiago esfortzatu beharko zara...");
        } else if (nota >= 5 && nota < 9) {
            System.out.println("OSO ONDO! Gainditu egin duzu.");
        } else {
            System.out.println("ZORIONAK!! BIKAIN EGIN DUZU AZTERKETA!!");
        }
    }
}
