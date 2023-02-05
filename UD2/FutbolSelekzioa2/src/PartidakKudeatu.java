import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PartidakKudeatu {

    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList();
    private static Partida[] partidak = new Partida[200];
    private static int contador=0;

    /** Programa honek selekzioa eta hasierako partiden datuak kargatu ondoren erabiltzaileari datu
     * gehiago dauzkan galdetuko dio.
     * Jarraian partiden zerrenda bistaratuko da eta amaitzeko partiden inguruko estadistikak bistaratuko ditu.
     */
    public static void main(String[] args) {
       
    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     * 
     */
    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(1, "Aitor", "Fernández", 29, 1, Demarkazioa.PORT));
        selekzioa.add(new Futbolista(2, "Unai", "Bustinza", 28, 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(3, "Mikel", "Balenziaga", 32, 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(4, "Asier", "Illarramendi", 30, 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(5, "Iñigo", "Martínez", 29, 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(6, "Mikel", "San José", 31, 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(7, "Gaizka", "Larrazabal", 23, 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(8, "Manu", "García", 34, 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(9, "Aritz", "Aduriz", 39, 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(10, "Javier", "Eraso", 30, 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(11, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(12, "Aihen", "Muñoz", 23, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(13, "Iago", "Herrerín", 32, 13, Demarkazioa.PORT));
        selekzioa.add(new Futbolista(14, "Aritz", "Elustondo", 26, 14, Demarkazioa.MED));
        selekzioa.add(new Futbolista(15, "Jesús", "Areso", 21, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(16, "Iñigo", "Vicente", 23, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(17, "Daniel", "Vivian", 21, 17, Demarkazioa.MED));

        selekzioa.add(new Entrenador(18, "Javier", "Clemente", 0, "F1"));
        selekzioa.add(new Entrenador(19, "Joseba", "Núñez", 0, "F2"));
        selekzioa.add(new Entrenador(20, "Markel", "Lautadahandi", 0, "F3"));

        selekzioa.add(new Masajista(21, "Iñaki", "Sertxiberrieta", 0, "Fisioterapeuta", 0));

        selekzioa.add(new IntegranteSeleccion(22, "Ander", "Etxeburu", 0));
    }

    /**
     * Wikipediako orrian agertzen diren lehen partiden datuak txertatu partiden
     * arrayean.
     */
    public static int hasierakoPartidakErregistratu() {
        partidak[contador++] = new Partida(LocalDate.of(1990, 03, 21), "Errumania", null);
        partidak[contador++] = new Partida(LocalDate.of(1993, 12, 22), "Bolivia", null);
        partidak[contador++] = new Partida(LocalDate.of(1994, 12, 23), "Rusia", null);
        partidak[contador++] = new Partida(LocalDate.of(1995, 12, 22), "Paraguay", null);
        partidak[contador++] = new Partida(LocalDate.of(1996, 12, 26), "Estonia", null);
        partidak[contador++] = new Partida(LocalDate.of(2021, 12, 28), "Brazil", null);
        partidak[contador++] = new Partida(LocalDate.of(2022, 12, 28), "Senegal", null);
        return contador;
    }

    /**
     * Partida berri baten datuak erabiltzaileari eskatu eta partida objektua bueltatu.
     */
    public static Partida partidaBatenDatuakEskatu() {
        String erantzun;
        Scanner sc = new Scanner(System.in);
        char opcion = 'a';
        ArrayList<Futbolista> tarjetas = new ArrayList<>();
        Partida p = null;
        while(opcion!='e'){
            System.out.println("Partida baten datuak sartu nahi dituzu (b/e):");
            opcion=sc.next().charAt(0);
            if (opcion == 'b') {
                System.out.println(" Noiz jokatu zen (uuuu-hh-ee)?");
                String fecha=sc.next();
                String [] resultado =fecha.split("-");
                System.out.println("Noren kontra?");
                String rival = sc.next();

                System.out.println(
                        "Selekzioko jokalariren batek jaso al zuen txartelik? (Sartu dorsalak, komaz banatuta edo sakatu ENTER)");
                String amonestados = sc.next();

                String[] lista_amonestados = amonestados.split(",");
        }
    }
        return null;
    }

    /** Partiden zerrenda bistaratu. */
    public static void partidakBistaratu() {
        System.out.println("PARTIDEN ZERRENDA");
        System.out.println("=======================");

        for (int i = 0; i < partidak.length; i++) {
            if (partidak[i] != null) {
                System.out.println(partidak[i].toString());
            }
        }
      
    }

/**
 *  Metodo honek hainbat estatistika kalkulatu eta kontsolatik inprimatuko ditu.
 *  Adibidez: 
 * 
 *   - Jokatutako partida kopurua
 *   - Zein izan den partidarik gogorrena txartel kopuruari dagokionez 
 *   - Txartel kopurua jokalariko
 *   - Txartel gehien lortu duen jokalariaren izena
 *   - Zenbat partida jolastu den urteko
 *   - Duela zenbat urte jolastu zen lehen partida
 *   - Partiden zein portzentai jokatu den abenduan
 *   - ...
 */
    public static void estatistikak() {
    }

 }