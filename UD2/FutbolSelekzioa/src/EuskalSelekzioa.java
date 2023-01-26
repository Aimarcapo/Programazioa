public class EuskalSelekzioa {
    public static int azkenId = 0;

    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    public static void futbolariBat() {
        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL);
        System.out.println(futbolista);
        System.out.println(futbolista.entrenar());
    }

    public static void bestePartaideBatzukSortu() {
        azkenId++;
        Entrenador entrenador = new Entrenador(azkenId, "Javier", "Clemente", 70, "Bai");
        azkenId++;
        Masajista masajista = new Masajista(azkenId, "Iñaki", "Sertxiberrieta", 30, "Fisoterapeuta", 8);
        azkenId++;
        Futbolista futbolista = new Futbolista(azkenId, "Ander", "Etxeburu", 26, 8, Demarkazioa.PORT);
        System.out.println(entrenador);
        System.out.println(entrenador.concentrarse());
        System.out.println(entrenador.viajar());
        System.out.println(masajista);
        System.out.println(masajista.concentrarse());
        System.out.println(masajista.viajar());
        System.out.println(futbolista);
        System.out.println(futbolista.concentrarse());
        System.out.println(futbolista.viajar());
    }

    public static void selekzioOsoaSortu() {
for(int i=0;i<=azkenId;i++){
    selkz
}
    }

    public static boolean partaideaEzabatu(int id) {

        return false;
    }
}
