package arrayak;
import java.util.Scanner;

public class PrintArrayInStars1 {
    
    public static void main(String[] args) {
boolean isValid=false;
        Scanner input = new Scanner(System.in);
        int NUM_ITEMS;
        int collection[];
        String stars = "";
        do{
            System.out.print("Enter the size of the array: ");
            NUM_ITEMS = input.nextInt();
            if(NUM_ITEMS>0){
            isValid=true;
        }
    }while(!isValid);
    collection=new int[NUM_ITEMS];
    for (int i=0;i<NUM_ITEMS;i++){
        do{
            System.out.println("Enter the numbers separated: "+i);
            collection[i]= input.nextInt();
            if(collection[i]>0){
            isValid=true;
            }
            else{
                isValid=false;
            }
    }while(!isValid);

}
input.close();
for(int i = 0; i < collection.length; i++){
    for(int p=0;p<collection[i];p++){
        stars=stars+" *";
    }
    System.out.print(i+" :");
    System.out.println(stars+"("+collection[i] +")");
    stars = "";

}
}
}