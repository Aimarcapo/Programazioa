package arraylist;

import java.util.ArrayList;

public class arrayvsarraylist {
    public static void main(String[] args) {

        ArrayList<String> ikasleenArrayLista = new ArrayList();
        ikasleenArrayLista.add("Jon");
        ikasleenArrayLista.add("Hodei");
        ikasleenArrayLista.add("Karmele");
        ikasleenArrayLista.add("Markel");
        System.out.println("Bigarren ikasle: " + ikasleenArrayLista.get(1));
        for (int i = 0; i < ikasleenArrayLista.size(); i++) {
            System.out.println(ikasleenArrayLista.get(i));
        }
        for (String ikaslea : ikasleenArrayLista) {
            System.out.println(ikaslea + " estimatua");
        }
        ikasleenArrayLista.remove(0);
        System.out.println("======================================================");

        String[] izenenArraya = new String[3];
        izenenArraya[0] = "Jaimito";
        izenenArraya[1] = "Jorgito";
        izenenArraya[2] = "Juanito";
        System.out.println("Bigarren izena: " + izenenArraya[1]);
        for (String izena : izenenArraya) {
            System.out.println("Mr. " + izena);
        }
        izenenArraya[0] = null;
    }

}