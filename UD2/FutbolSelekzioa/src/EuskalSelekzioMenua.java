import java.util.ArrayList;
import java.util.Scanner;

public class EuskalSelekzioMenua {
    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        selekzioOsoaSortu();
        boolean aukeraEgokia = false;
        int aukera;
        do {

            System.out.println();
            System.out.println("**********************************************************");
            System.out.println("\tEUSKAL SELEKZIOA");
            System.out.println("----------------------------------");
            System.out.println(
                    "1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...) ");
            System.out.println("2. Partaideen datuak ikusi taldekatuta ");
            System.out.println("3. Partaideak alfabetikoki inprimatu");
            System.out.println(
                    "4. Aldaketa (Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz) ");
            System.out.println("5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez) ");
            System.out.println("6. Futbolariak alfabetikoki inprimatu");
            System.out.println("0. Irten ");
            System.out.println("");
            System.out.println("Sartu zenbaki bat(0-6): ");

            aukera = in.nextInt();

            switch (aukera) {

                case 1:
                    partaideakIkusi();
                    break;
                case 2:
                    partaideakTaldekatu();
                    break;

            }

        } while (aukera != 0);
    }

    public static void selekzioOsoaSortu() {
        System.out.println("******** INTEGRANTES SELECCIÓN ********");
        selekzioa.add(new Futbolista(++azkenId, "Aitor", "Fernández", 29, 1, Demarkazioa.POR));

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

        selekzioa.add(new Futbolista(++azkenId, "Iago", "Herrerín", 32, 13, Demarkazioa.POR));

        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 26, 14, Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId, "Jesús", "Areso", 21, 15, Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 23, 16, Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 21, 17, Demarkazioa.MED));

        selekzioa.add(new Entrenador(++azkenId, "Javier", "Clemente", 0, "F1"));

        selekzioa.add(new Entrenador(++azkenId, "Joseba", "Núñez", 0, "F2"));

        selekzioa.add(new Entrenador(++azkenId, "Markel", "Lautadahandi", 0, "F3"));

        selekzioa.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 0, "Fisioterapeuta", 0));

        selekzioa.add(new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 0));
    }

    public static void partaideakIkusi() {
        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i));
        }

    }

    public static void partaideakTaldekatu() {

        EuskalSelekzioa.selekzioOsoaSortu();
        for (int index = 0; index < EuskalSelekzioa.selekzioa.size(); index++) {
            if (index == 0) {
                System.out.println("");
                System.out.println("FUTBOLARIAK\n==============");
            } else if (index == 17) {
                System.out.println("");
                System.out.println("ENTRENATZAILEAK\n==============");
            } else if (index == 20) {
                System.out.println("");
                System.out.println("MASAJISTAK\n==============");
            } else if (index == 21) {
                System.out.println("");
                System.out.println("BESTELAKOAK\n==============");
            }
            System.out.println(EuskalSelekzioa.selekzioa.get(index));
        }
    }
}
