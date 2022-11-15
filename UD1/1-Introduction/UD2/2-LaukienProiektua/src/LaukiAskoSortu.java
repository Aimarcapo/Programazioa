import java.util.Scanner;

public class LaukiAskoSortu {
    public static void main(String[] args) {
        int kont;
        Laukia[] laukiak;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sartu lauki kopurua ");
        kont = sc.nextInt();
        laukiak = new Laukia[kont];
        for (int i = 0; i < laukiak.length; i++) {
            System.out.println(i + "-LAUKIAREN DATUAK");
            laukiak[i] = new Laukia();
            System.out.println("Zabalera");
            laukiak[i].setZabalera(sc.nextInt());
            System.out.println("Altuera");
            laukiak[i].setAltuera(sc.nextInt());

        }
        sc.close();
        System.out.printf("%10s %12s %10s %10s %15s\n", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("==============================================================================\n");
        for (int i = 0, x = 1; i < laukiak.length; i++, x++) {
            System.out.printf("%5d %10d %10d %10d %10d %15s \n", laukiak[i].getZabalera(), laukiak[i].getAltuera(),
                    laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }
    }
}