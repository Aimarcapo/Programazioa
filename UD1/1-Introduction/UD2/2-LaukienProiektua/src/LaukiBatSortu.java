import java.util.Scanner;

public class LaukiBatSortu {
    
    public static void main(String[] args) { // Program entry point
        // Declare and Construct an instance of the Circle class called c1
        System.out.println("Hiru lauki sortu dituzu: ");
        Laukia l1 = new Laukia();
        System.out.println("Zabalera:  "+l1.getZabalera());
        
        System.out.println("Altuera:  "+l1.getAltuera());
        System.out.println("Lauki karratua sortu duzu:  =>Laukia[" + l1.getAltuera()+"x"+l1.getZabalera()+"]");
        System.out.println("Honela dago marraztuta:");
        for(int i=1;i<=l1.getZabalera();i++);
}
}