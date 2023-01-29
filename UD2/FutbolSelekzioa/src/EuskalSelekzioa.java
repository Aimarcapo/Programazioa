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
        Futbolista futbolista = new Futbolista(azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println(futbolista.toString());
        System.out.println(futbolista.entrenar());
        selekzioa.add(futbolista);
    }

    public static void bestePartaideBatzukSortu() {
        azkenId++;
        Entrenador entrenador = new Entrenador(azkenId, "Javier", "Clemente", 70, "Federación Vasca");

        azkenId++;
        Masajista masajista1 = new Masajista(azkenId, "Iñaki", "Sertxiberrieta", 23, "Fisioterapeuta", 9);

        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Ander", "Etxeburu", 27, 23, Demarkazioa.DEF);

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
        selekzioa.add(new Futbolista(++azkenId,"Aitor","Fernández",29,1,Demarkazioa.POR));

        selekzioa.add(new Futbolista(++azkenId,"Unai","Bustinza",28,2,Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId,"Mikel","Balenziaga",32,3,Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId,"Asier","Illarramendi",30,4,Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId,"Iñigo","Martínez",29,5,Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId,"Mikel","San José",31,6,Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId,"Gaizka","Larrazabal",23,7,Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId,"Manu","García",34,8,Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId,"Aritz","Aduriz",39,9,Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId,"Javier","Eraso",30,10,Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId,"Asier","Villalibre",23,11,Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId,"Aihen","Muñoz",23,12,Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId,"Iago","Herrerín",32,13,Demarkazioa.POR));

        selekzioa.add(new Futbolista(++azkenId,"Aritz","Elustondo",26,14,Demarkazioa.MED));

        selekzioa.add(new Futbolista(++azkenId,"Jesús","Areso",21,15,Demarkazioa.DEF));

        selekzioa.add(new Futbolista(++azkenId,"Iñigo","Vicente",23,16,Demarkazioa.DEL));

        selekzioa.add(new Futbolista(++azkenId,"Daniel","Vivian",21,17,Demarkazioa.MED));

    

        selekzioa.add(new Entrenador(++azkenId,"Javier","Clemente",0,"F1"));

        selekzioa.add(new Entrenador(++azkenId,"Joseba","Núñez",0,"F2"));

        selekzioa.add(new Entrenador(++azkenId,"Markel","Lautadahandi",0,"F3"));

        

        selekzioa.add(new Masajista(++azkenId,"Iñaki","Sertxiberrieta",0,"Fisioterapeuta",0));

        

        selekzioa.add(new IntegranteSeleccion(++azkenId,"Ander","Etxeburu",0));

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
