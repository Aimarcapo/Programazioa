import java.util.Scanner;

public class Seguida1 {
    
    public static void main(String[] args) {
        int number;
        int quantity;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: "); // No newline for prompting message
        number = in.nextInt();
        System.out.print("Enter quantity: "); // No newline for prompting message
        quantity = in.nextInt();
        in.close();
        for(int i=1;i<=number;i++){
            System.out.println(i);
            if(i%quantity==0){
                System.out.println("=====");

            }
        }
}
}