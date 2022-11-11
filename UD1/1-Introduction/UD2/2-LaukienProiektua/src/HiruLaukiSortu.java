public class HiruLaukiSortu {
    public static void main(String[] args) { // Program entry point
        // Declare and Construct an instance of the Circle class called c1
        System.out.println("Hiru lauki sortu dituzu: ");
        Laukia l1 = new Laukia(7, 1);
        System.out.println("[" + l1.getAltuera()+"x"+l1.getZabalera()+"]");
        Laukia l2 = new Laukia(2, 1);
        System.out.println("[" + l2.getAltuera()+"x"+l2.getZabalera()+"]");
        Laukia l3 = new Laukia(2, 6);
        System.out.println("[" + l3.getAltuera()+"x"+l3.getZabalera()+"]");
}
}