
public class HasEight {
    public static void main(String[] args) {
        hasEight(7845);
    }

    public static boolean hasEight(int number) {

        while (number > 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
