package random;
    //20 ausazko balioen taula.
public class Prog1 {
    public static void main(String[] args) {

        double z1 = 4.3;
        int z2 = (int)z1;

        System.out.printf("%2s %20s %12s %15s %12s \n", "idx", "Math.random()", "Bitarra", "Dadoa","Txanpona");
        System.out.println("==================================================================");
        int zut1;
        double zut2;
        int zut3; 
        int zut4;   //Bitarra
        String zut5;  //Txanpona
        
        for(int i=1; i<=20; i++)  {
            zut1 = i;
            zut2 = Math.random();
            zut3 = (zut2 >= 0.5) ? 1 : 0;
            zut4 = (int)(zut2*10);
            if(zut2<=0.5){
                zut5="Gurutzea";
            }
            else{
                zut5="Aurpegia";
            }
                System.out.printf("%2d) %20.20f %10s %10s %15s \n\n", zut1, zut2, zut3, zut4,zut5);
        }
    }

}