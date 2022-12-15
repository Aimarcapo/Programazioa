import java.util.Arrays;

public class Handiena {
    private static Zatikia[] zatikiak = new Zatikia[5];

    public static void hasieratu(){
        zatikiak[0]= new Zatikia(2,3);
        zatikiak[1]= new Zatikia(-2,3);
        zatikiak[2]= new Zatikia(3,4);
        zatikiak[3]= new Zatikia(7,8);
        zatikiak[4]= new Zatikia(9,11);
    }

    /** OSATU EZAZU METODO HAU */
    public static Zatikia handiena(){
        Zatikia max = zatikiak[0];
        for (int i = 1; i < zatikiak.length && zatikiak[i] != null; i++) {
            if (zatikiak[i].isBiggerThan(max)) {
               max = zatikiak[i];
            }
         }
         return max;
        
    }
    public static void main(String[] args){
        hasieratu();
        System.out.println(Arrays.toString(zatikiak) + " zatikien arteko zatikirik handiena "+ handiena() +" da.");
    }
}
