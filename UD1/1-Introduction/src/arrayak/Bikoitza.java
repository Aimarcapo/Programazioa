package arrayak;

import java.util.Arrays;
import java.util.Scanner;

public class Bikoitza {

    public static void main(String[] args) {
        final int TAMAINA = 5;

        Scanner in = new Scanner(System.in);
        int[] zenbakiak = new int[TAMAINA];
        int[] bikoitzak = new int[TAMAINA];

        System.out.print("Sartu itzazu" + TAMAINA + "Zenbakiak espaziosz banaduta:");

        for (int i = 0; i < TAMAINA; ++i) {
            zenbakiak[i] = in.nextInt();

        }
        in.close();

        for (int i = 0; i < TAMAINA; ++i) {
            bikoitzak[i] = zenbakiak[i] * 2;
        }
        System.out.println(Arrays.toString(zenbakiak));
        System.out.println(Arrays.toString(bikoitzak));
    }

}
