import java.util.Scanner;

public class Izenak {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final String R="R";
        String hitzak[];
        String izkia;
        
        
        hitzak= new String[8];
      

        Scanner in = new Scanner(System.in);  
        System.out.print("Idatzi 8 izen: ");   
        //takes an integer input         
           
        for (int i = 0; i < hitzak.length; i++)   
        {  
        hitzak[i]=in.next();
        }
        System.out.print("Sakatu R(everse) izenak atzekoz aurrera ikusteko:");
        izkia=in.next();
       
    if(izkia.equals(R)){
        for(int i=1, z=7;z>=0;z--,i++){
            System.out.print(i+"-"+hitzak[z]);
            System.out.println(""); 
        }
        //for-each loop to print the string 
       }
        in.close();
        }
    }

        
        
        

      

        
    

        
    
