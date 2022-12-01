import java.util.Scanner;

public class TestZatikia {

    

    public static void main(String[] args) {

        Zatikia zat1;
        zat1 = new Zatikia(6, 8);
        System.out.println(zat1);
        Zatikia zat2;
        String zat="428/13";
        zat2 = new Zatikia(11, 11);
        System.out.println(zat2);
        System.out.println(Zatikia.biderkatu(zat1, zat2));
        System.out.println(Zatikia.batu(zat1, zat2));
        System.out.println(zat1.isBaliokidea(zat2));
       System.out.println(new Zatikia("7/12"));
        

    }
}