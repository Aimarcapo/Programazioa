
import java.util.Arrays;
import java.util.Scanner;

import model.Zatikia;

public class TestFaktor {
    public static void main(String[] args) {
        int n1;
        int n2;
        int[] emaitza;
        Scanner in = new Scanner(System.in);
        System.out.println("Bi zenbaki");
        n1 = in.nextInt();
        n2 = in.nextInt();
        in.close();
        emaitza = Zatikia.faktorizatu(n2);
        System.out.println(Arrays.toString(emaitza));
        emaitza = Zatikia.faktorizatu(n1);
        System.out.println(Arrays.toString(emaitza));
        System.out.println(Zatikia.mkt(n1, n2));
        System.out.println(Zatikia.zkh(n1, n2));

    }

}
