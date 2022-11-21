package random;

public class Prog1 {
    public static void main(String [] args){
        double z1=4.3;
        int z2=7;
        System.out.printf("%2s %21s %12s %21s \n","idx","Math.random()", "Aierten B","zut2*10");
        System.out.println("==============================================");
        int zut1;
        double zut2;
        int zut3;
        double zut4;
        int dadoa;
        String zut5;
        for(int i=1;i<=20;i++){
            zut1 =i;
            zut2=Math.random();
            zut3=(zut2<0.5)?0:1;
            zut4=zut2*10;
            System.out.printf("%2d) %20.19f %12d %20.19f \n\n",zut1,zut2,zut3,zut4);




        }
    }
}
