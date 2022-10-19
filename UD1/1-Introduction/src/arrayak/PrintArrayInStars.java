package arrayak;
import java.util.Scanner;


public class PrintArrayInStars { 
  public static void main(String[] args){


    final int numItems;
    int[] items;  
    
    Scanner in = new Scanner(System.in);
  System.out.print("Enter the number of items: ");
  numItems = in.nextInt();
  items = new int[numItems];
  if (items.length > 0) {

    for (int i = 0; i < items.length; ++i) {
       System.out.println("Enter the value of all items separated  : ");
       items[i] = in.nextInt();
       

    }
 }

  for (int idx = 0; idx < items.length; ++idx) {  // row
    System.out.print(idx + ": ");
    // Print value as the number of stars
    for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
       System.out.print("*");
       System.out.print();
      // column
      
      
    
 
 


}
}
}
}