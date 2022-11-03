import java.util.Scanner;

public class HitzEzkutua {

    /**
     
     */
    public static void main(String[] args) {
        String hitza = "Udazkena";

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu hitza : ");
        char hizkia = in.next().charAt(0);

        in.close();
        for (int i = 0; i <= hitza.length(); i++) {
            if (hizkia == hitza.charAt(i)) {
                System.out.print(hizkia);
            } else {
                System.out.print("-");
            }

        }

    }
}