
/** Programa honetan Euskal Selekzioko datuekin egingo dugu lan.
*  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
*
*  
* 
*/
import java.util.ArrayList;

public class EuskalSelekzioa {

    private static int azkenId = 0;
    private static ArrayList<IntegranteSeleccion> selekzioa;

    /**
     * Programa honek metodo desberdinei deituko die banan banan.
     * Beharbada ez diozu koherentzia handirik topatuko programa osoari.
     * Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen
     * trebatzea.
     * 
     */
    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du:
     * "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11,
     * demarcacion=DEL}"
     * Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     * Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki
     * dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat)
     * erabili dezakezu
     * partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {
        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println(futbolista.toString());
        System.out.println(futbolista.entrenar());
    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta
     * bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {
        azkenId++;
        Entrenador entrenador = new Entrenador(azkenId, "Javier", "Clemente", 70, "Federación Vasca");

        azkenId++;
        Masajista masajista = new Masajista(azkenId, "Iñaki", "Sertxiberrieta", 23, "Fisioterapeuta", 9);

        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Ander", "Etxeburu", 27, 23, Demarkazioa.DEF);
        System.out.println(entrenador.toString());
        System.out.println(entrenador.concentrarse());
        System.out.println(entrenador.viajar());
        System.out.println(masajista.toString());
        System.out.println(masajista.concentrarse());
        System.out.println(masajista.viajar());
        System.out.println(futbolista.toString());
        System.out.println(futbolista.concentrarse());
        System.out.println(futbolista.viajar());
    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko
     * ArrayList estatiko baten.
     * 
     */
    public static void selekzioOsoaSortu() {
        System.out.println("******** INTEGRANTES SELECCIÓN ********");
        selekzioa.add(new Futbolista(++azkenId, "Aitor", "Fernández", 29, 1, Demarkazioa.PORT));

        selekzioa.add(new Futbolista(++azkenId, "Unai", "Bustinza", 28, 2, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Mikel", "Balenziaga", 32, 3, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Asier", "Illarramendi", 30, 4, Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Martínez", 29, 5, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Mikel", "San José", 31, 6, Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId, "Gaizka", "Larrazabal", 23, 7, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Manu", "García", 34, 8, Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Aduriz", 39, 9, Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId, "Javier", "Eraso", 30, 10, Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId, "Aihen", "Muñoz", 23, 12, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Iago", "Herrerín", 32, 13, Demarkazioa.PORT));

        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 26, 14, Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId, "Jesús", "Areso", 21, 15, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 23, 16, Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 21, 17, Demarkazioa.MED));

        selekzioa.add(new Entrenador(++azkenId, "Javier", "Clemente", 0, "F1"));

        selekzioa.add(new Entrenador(++azkenId, "Joseba", "Núñez", 0, "F2"));

        selekzioa.add(new Entrenador(++azkenId, "Markel", "Lautadahandi", 0, "F3"));

        selekzioa.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 0, "Fisioterapeuta", 0));

        selekzioa.add(new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 0));
        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i).toString());
        }
    }

    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return
     */
    public static boolean partaideaEzabatu(int id) {
        boolean eliminado = false;
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i).getId() == id) {
                eliminado = true;
                selekzioa.remove(i);
            }
            
        }
        return eliminado;
    }
}