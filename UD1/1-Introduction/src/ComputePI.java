public class ComputePI {
    
    public static void main (String[] args) {
        double sum = 0.0; double total=0;
      int MAX_DENOMINATOR = 1000;
      for(int denominator=1; denominator<=MAX_DENOMINATOR;denominator+=2){
         if (denominator%4==1){
            sum+=denominator;
         }
         else if(denominator%4==3){
            sum-=denominator;
         }
         else{
            System.out.print("Imposible");
         }
         total=4*sum;
      }
      System.out.print(total);
      
}
}

