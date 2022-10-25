package arrayak;

import java.util.Scanner;

public class Bikoitza {

    public static void main(String[] args) {
        int numItems;
        int[] items;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        numItems = input.nextInt();
        items = new int[numItems];

 
        if (items.length > 0) {
      
           for (int i = 0; i < items.length; ++i) {
              System.out.print("Enter the value of all items separated  : ");
              items[i] = input.nextInt();
              
           }
           
               
               
            
           for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
               
               System.out.print("The values are: [" + items[i] + "]");
            } else {
               
               System.out.println("The values are: [" + items[i] + "]");
            }
            System.out.println("The values are: [" + items[i] + "]");
            }
            
         }
       
        }
    
    }