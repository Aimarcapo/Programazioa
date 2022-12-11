package exekutagarria;

import java.util.Scanner;

import model.Zatikia;

public class Ariketa {
    public static void main(String[] args) {
        boolean zuzena = false;

        Scanner in = new Scanner(System.in);
        System.out.println("ARIKETA");
        System.out.println("=======");

        do {
            int eragiketa = (int) (Math.random() * 2 + 1);
            Zatikia zat1 = new Zatikia();
            Zatikia zat2 = new Zatikia();
            Zatikia erantzuna;
            if (eragiketa == 1) {
                System.out.print(zat1 + "+" + zat2 + "=");
                erantzuna = new Zatikia(in.next());//Erantzuna erregistratzeko balio du
                if (Zatikia.batu(zat1, zat2).hamartarBaliokidea() == erantzuna.hamartarBaliokidea()) {
                    zuzena = true;
                    System.out.println("Oso ondo");
                } else {
                    System.out.println("Saiatu Berriz!!");
                    zuzena = false;

                }
            }
            else{
                System.out.print(zat1+"*"+zat2+"=");
                erantzuna=new Zatikia(in.next());//Erantzuna erregistratzeko balio du
                if(Zatikia.biderkatu(zat1, zat2).hamartarBaliokidea()==erantzuna.hamartarBaliokidea()){
                    zuzena=true;
                    System.out.println("Oso ondo");
                }
                else{
                    System.out.println("Saiatu berriro");
                    zuzena=false;
                }
            }
        } while (!zuzena);//Zuzena false bezala deklaratu dugunez hasieran zuzena true izatera pasatzerakoan do while bukatu egingo da
in.close();
    }
}
