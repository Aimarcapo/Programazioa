import java.util.Scanner;

public class Izartxoak {

    public static void main(String[] args) {
        int zenbakia;
        boolean isValid = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenbaki bat(1-10) : ");

        do {
            System.out.print("Esan zenbaki bat(1-10): ");
            zenbakia = in.nextInt();

            if (zenbakia > 0 && zenbakia < 10) {
                isValid = true;
            }

        } while (!isValid);
        for (int i = 1; i <= 50; i++) {
            if (i % zenbakia == 0) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
            if(i<50){
                System.out.print(" - ");
            }
        }
    }
}
