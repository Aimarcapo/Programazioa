import java.util.Scanner;
public class gurutzea{
   public static void main(String args[]){
      int   my_input;
      
      Scanner my_scanner = new Scanner(System.in);
      System.out.print("Sartu zenbakia : ");
      my_input = my_scanner.nextInt();
      my_scanner.close();


      if(my_input % 2==0){

         System.out.print("Zembaki bakoitia jarri ");
      }
      
      for(int row = 1; row <= my_input; row++){
         for(int col = 1; col <= my_input; col++){
            
            if(row%((my_input+1)/2)==0){
               System.out.print("0 ");
            }
             else if (col%((my_input+1)/2)==0){
                System.out.print("0 ");
            }
            else{
               System.out.print("* ");
            }
            
         }
         System.out.println();
      }
   }
}
