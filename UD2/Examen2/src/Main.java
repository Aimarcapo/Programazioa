import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // dada la lista de transportes y un rango minimo maximo de combustible (un
        // rango)
        ArrayList<Transporte> transportes = new ArrayList<>();
        ArrayList<Terrestres> terrestres = new ArrayList<>();
        ArrayList<Aereo> aereos = new ArrayList<>();

        transportes.add(new Aereo("Mercedes", 3, 50, "Ibiza", "F43"));
        transportes.add(new Aereo("Airbus", 4, 100, "Iberia", "G63"));
        transportes.add(new Aereo("Pelicano", 1, 70, "British", "B80"));
        transportes.add(new Terrestres("g678", 3, 90, 8, 1200));
        transportes.add(new Terrestres("Hero", 7, 130, 10, 2000));
        // metodo que muestre por pantalla toda la informacion de aquellos transportes
        // cuyos anos de antiguedad sean superiores a uno dado
        for (int i = 0; i < transportes.size(); i++) {
            if (transportes.get(i) instanceof Aereo) {
                aereos.add((Aereo) transportes.get(i));
            } else {
                terrestres.add((Terrestres) transportes.get(i));
            }
            System.out.println(transportes.get(i).toString());
        }
        maximoMinimoCombustible(20, 120, transportes);
        System.out.println(AnosAntiguedad(transportes));
        combustibleAleatorioa(transportes);

        for (int i = 0; i < terrestres.size(); i++) {
            System.out.println(terrestres.get(i).toString());
        }
        anosSuperioes(2, transportes);
        

        // usando terrestres aumentar numero aleatorio a la cantidad de combustible
        // total,numero entre 10 y 50 y se lo sumas al actual

    }

    public static String AnosAntiguedad(ArrayList<Transporte> p) {
        int sumAereo = 0;
        int sumTerrestre = 0;

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) instanceof Aereo) {
                sumAereo = p.get(i).getAnos_antiguedad() + sumAereo;
            } else {
                sumTerrestre = p.get(i).getAnos_antiguedad() + sumTerrestre;
            }
        }
        return "Antiguedad Aéreo = " + sumAereo + ", Antiguedad Terrestre = " + sumTerrestre;

    }

    public static void combustibleAleatorioa(ArrayList<Transporte> p) {
        for (int i = 0; i < p.size(); i++) {
            int d = (int) (Math.random() * (60 - 10)) + 10;
            int combustible = p.get(i).getCombustible() + d;
            p.get(i).setCombustible(combustible);
        }
    }

    public static void anosSuperioes(int d, ArrayList<Transporte> p) {

        for (int i = 0; i < p.size(); i++) {
            if (d < p.get(i).getAnos_antiguedad()) {
                System.out.println("Superiores " + p.get(i).toString());
            }

        }
    }
    public static void maximoMinimoCombustible(int min,int max,ArrayList<Transporte> p){
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getCombustible()>min && p.get(i).getCombustible()<max ){
                System.out.println("Transportes dentro de dicho rango " + p.get(i).toString());
            }
    }
}
}