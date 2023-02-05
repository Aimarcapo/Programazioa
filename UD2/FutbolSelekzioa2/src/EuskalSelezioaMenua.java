import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class EuskalSelezioaMenua {
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
                case 3:
                    partaideakAlfabetikokiIkusi();
                    break;
                case 4:
                    aldaketa();
                    break;
                case 5:
                    bilatu();
                    break;
                case 6:
                    futbolariakAlfabetikokiIkusi();
                    break;

            }

        } while (aukera != 0);
    }

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
    }

    public static void partaideakIkusi() {
        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i).toString());
        }
    }

    public static void partaideakTaldekatu() {
        ArrayList<IntegranteSeleccion> futbolistak = new ArrayList<>();
        ArrayList<IntegranteSeleccion> entrenatzaileak = new ArrayList<>();
        ArrayList<IntegranteSeleccion> masajistak = new ArrayList<>();
        ArrayList<IntegranteSeleccion> besteak = new ArrayList<>();
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i) instanceof Futbolista) {
                futbolistak.add(selekzioa.get(i));
            }
            if (selekzioa.get(i) instanceof Entrenador) {
                entrenatzaileak.add(selekzioa.get(i));
            }
            if (selekzioa.get(i) instanceof Masajista) {
                masajistak.add(selekzioa.get(i));
            }
           else{
            besteak.add(selekzioa.get(i));
           }
        }
    }
  public static void futbolariakAlfabetikokiIkusi(){
    ArrayList<IntegranteSeleccion> futbolistak = new ArrayList<>();
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i).getClass() == Futbolista.class) {
                futbolistak.add(selekzioa.get(i));
            }
        }

        Collections.sort(futbolistak, new Comparator<IntegranteSeleccion>() {
           
            public int compare(IntegranteSeleccion o1, IntegranteSeleccion o2) {
                return o1.getApellidos().compareTo(o2.getApellidos());
            }
        });

        for (int i = 0; i < futbolistak.size(); i++) {
            System.out.println(futbolistak.get(i));
        }
  }
 public static void aldaketa(){
    String postua;
    Scanner in = new Scanner(System.in);
    System.out.println("Nor aldatu nahi duzu postuz (Idatzi id-a): ");
    int id = in.nextInt();

    for (int i = 0; i < selekzioa.size(); i++) {
        if (selekzioa.get(i).getId() == id) {
            System.out.println(((Futbolista)selekzioa.get(i)) + " posizioan zegoen, zein posiziora aldatu nahi duzu (POR, DEF, MED, DEL)?");
            postua = in.next();
            switch(postua){
                case "POR":
                    ((Futbolista)selekzioa.get(i)).setDemarkazioa(Demarkazioa.PORT);
                    System.out.println("Ondo aldatu da.");
                    break;
                case "DEF":
                    ((Futbolista)selekzioa.get(i)).setDemarkazioa(Demarkazioa.DEF);
                    System.out.println("Ondo aldatu da.");
                    break;
                case "MED":
                    ((Futbolista)selekzioa.get(i)).setDemarkazioa(Demarkazioa.MED);
                    System.out.println("Ondo aldatu da.");
                    break;
                case "DEL":
                    ((Futbolista)selekzioa.get(i)).setDemarkazioa(Demarkazioa.DEL);
                    System.out.println("Ondo aldatu da.");
                    break;
                default:
                    System.out.println("Sartutako aukera ez da egokia.");
            }
        }
    }
 }
 public static void partaideakAlfabetikokiIkusi(){
    ArrayList<String> izenAbizenak = new ArrayList<>();

    //izen abizenak gordetzeko arraylista sortu
    for (int i = 0; i < selekzioa.size(); i++) {
        izenAbizenak.add(selekzioa.get(i).getApellidos() + ", " + selekzioa.get(i).getNombre());
    }

    //izen abizenen arraylista ordenatu
    //GALDETU KONSTRUKTOREARI BURUZ, ZEBA NULL?
    izenAbizenak.sort(null); 

    System.out.println("\nSelekzioko partaide guztiak alfabetikoki ordenatuta:");
    
    for (int i = 0; i < izenAbizenak.size(); i++) {
        System.out.println(izenAbizenak.get(i));
    }

    System.out.println("");
 }
 public static void bilatu(){
    String abizena;
    Scanner in = new Scanner(System.in);

    System.out.println("Zein jokalariaren datuak ikusi nahi dituzu (esan abizena)?");
    abizena = in.next();
    for(int i=0;i<selekzioa.size();i++){
        if(selekzioa.get(i).getApellidos()==abizena){
            System.out.println(selekzioa.get(i).toString());
        }
    }
}
}