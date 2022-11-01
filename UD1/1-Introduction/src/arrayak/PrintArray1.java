package arrayak;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray1 {

    public static void main(String[] args) {
        int numItems;
        int[] items;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        numItems = input.nextInt();

        items=new int[numItems];
        if(items.length>0){

            for (int i = 0; i < items.length; ++i) {
                System.out.print(" ");
                items[i] = input.nextInt();
        
             }
          }
            System.out.println("The values are :" +Arrays.toString(items));
        }
        
            
    
    
}

