import java.util.ArrayList;

public class EuskalSelekzioa {
    private static int azkenId = 0;
    private static ArrayList<IntegranteSeleccion> selekzioa;

    public static void main(String[] args) {
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }

    }

    // "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11,
    // demarcacion=DEL}"
    public static void futbolariBat() {
        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.Aurrelaria);
        System.out.println(futbolista.toString());
        System.out.println(futbolista.entrenar());
        selekzioa.add(futbolista);
    }

    public static void bestePartaideBatzukSortu() {
        azkenId++;
        Entrenador entrenador = new Entrenador(azkenId, "Javier", "Clemente", 70, "Federación Vasca");

        azkenId++;
        Masajista masajista1 = new Masajista(azkenId, "Iñaki", "Sertxiberrieta", 23, "Fsioterapeuta", 9);

        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Ander", "Etxeburu", 27, 23, Demarkazioa.Defentsa);

        System.out.println(entrenador.toString());
        System.out.println(entrenador.concentrarse());
        System.out.println(entrenador.viajar());

        System.out.println(masajista1.toString());
        System.out.println(masajista1.concentrarse());
        System.out.println(masajista1.viajar());

        System.out.println(futbolista.toString());
        System.out.println(futbolista.concentrarse());
        System.out.println(futbolista.viajar());

        selekzioa.add(entrenador);
        selekzioa.add(masajista1);
        selekzioa.add(futbolista);

    }

    public static void selekzioOsoaSortu() {

        System.out.println("******** INTEGRANTES SELECCIÓN ********");
        for(int i = 0; i < selekzioa.size(); i++){
            System.out.println(selekzioa.get(i).toString());
        }

    }

    public static boolean partaideaEzabatu(int id) {

        boolean eliminado = false;

        for(int i = 0; i < selekzioa.size(); i++){
            if(selekzioa.get(i).getId() == id){
                eliminado = true;
                selekzioa.remove(i);
            }
        }

        return eliminado;
    }
}
