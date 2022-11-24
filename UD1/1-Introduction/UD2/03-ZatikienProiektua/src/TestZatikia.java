import java.util.Scanner;
public class TestZatikia {
    
    public static void main(String[] args) {

        Zatikia zat1;
        zat1=new Zatikia(6,8);
        System.out.println(zat1);
        Zatikia zat2;
        zat2=new Zatikia(2,11);
        System.out.println(zat2);
        System.out.println(Zatikia.biderkatu(zat1,zat2));
        
}
}