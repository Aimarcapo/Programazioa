package exekutagarria;

import model.Account;
import java.util.Scanner;

public class GastatuTaGastatu {
    public static void main(String[] args) {
        Account a1;
        int z = 0;
        a1 = new Account("b1", "Vale", 1000);
        int y=a1.getBalance();
        
        for (int x = 0; 150 < a1.getBalance(); x++) {
            System.out.println(a1.debit(150));
            z++;
        }
        int a=y-a1.getBalance();
System.out.println("Triste nago;"+a+"euro atera dut "+z+" aldiz eta orain "+a1.getBalance()+" euro ditut");
    }
}
