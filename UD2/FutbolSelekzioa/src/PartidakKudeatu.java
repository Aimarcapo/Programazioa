import java.util.ArrayList;
public class PartidakKudeatu {

    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList();
    private static Partida[] partidak = new Partida[200];

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

        selekzioa.add(new Futbolista(1, "Aitor", "Fernández", 29, 1, Demarkazioa.POR));
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
        selekzioa.add(new Futbolista(13, "Iago", "Herrerín", 32, 13, Demarkazioa.POR));
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

      return 0;
    }

    /**
     * Partida berri baten datuak erabiltzaileari eskatu eta partida objektua bueltatu.
     */
    public static Partida partidaBatenDatuakEskatu() {
       
        return null;
    }

    /** Partiden zerrenda bistaratu. */
    public static void partidakBistaratu() {
      
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