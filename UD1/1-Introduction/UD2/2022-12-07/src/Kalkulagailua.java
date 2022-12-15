
/** Erabiltzaileak adierazitako kalkulua egingo du programa honek. 
 * Mota honetako eragiketak egiteko gai izan behar da: 
 * 1/2 x 1/2 x 1/2 x 1/2 = 1/16
 * 11/2 x 2/11 x -4/5 = -4/5
 */

import java.util.Scanner;
public class Kalkulagailua {

    public static void main(String[] args) {
        Zatikia[] zat;
        
        
        int kopurua;
        final Scanner in = new Scanner(System.in);
        kopurua=in.nextInt();
        zat=new Zatikia[kopurua];
        for (int i = 0; i <= zat.length; i++) {
            System.out.println(i + "-LAUKIAREN DATUAK");
            zat[i] = new Zatikia();
            System.out.println("Goikoa");
            zat[i].setGoikoa(in.nextInt());
            System.out.println("Altuera");
            zat[i].setBehekoa(in.nextInt());

        }
       for(int x=0;x<zat.length;x++){
System.out.println(Zatikia.biderkatu(zat[x], zat[x+1])); 
       }
    }
}
