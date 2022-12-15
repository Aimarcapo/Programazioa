public class Prog1a {
    public static void main(String[] args) {
        int[] zenbakiak = { 1, 15, 2 };
        try {
            System.out.println(zenbakiak[8]);
        } catch (Exception ex) {/*
                                 * Exception ex significa que en el caso de que en el try no se encuentre
                                 * correcto hara lo que aparezca dentro del catch
                                 */
            System.out.println("Salbuespena gertatu da.");
        }
    }
}
