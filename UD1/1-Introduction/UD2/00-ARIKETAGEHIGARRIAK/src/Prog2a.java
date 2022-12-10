public class Prog2a {
    
    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        try {
            System.out.println(zenbakiak[8]);
        } catch (Exception ex) {
            System.out.println("Salbuespena gertatu da.");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
    }
}