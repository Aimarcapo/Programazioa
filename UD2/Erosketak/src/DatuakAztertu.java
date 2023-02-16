import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;

public class DatuakAztertu {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Bezeroa> kontaktuak;
    private static ArrayList<Produktua> produktuKatalogoa;
    private static ArrayList<Erosketa> erosketenZerrenda;

    public static void main(String[] args) {
        boolean ondo = false;
        int opcion = 0;
        initialize();
        do {

            System.out.println("\n");
            System.out.println("*********************************************");
            System.out.println("*  EROSKETEN KUDEAKETA");
            System.out.println("*  ---------------------------------------");
            System.out.println("*  1.  Erosketen zerrenda");
            System.out.println("*  2.  Fakturazio osoa");
            System.out.println("*  3.  Bezerorik onena");
            System.out.println("*  4.  Helbidea bilatu");
            System.out.println("*  20. Irten");
            System.out.println("*  ---------------------------------------");
            do {
                try {
                    System.out.print("Aukeratu zenbaki bat: ");
                    opcion = sc.nextInt();
                    ondo = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Zenbaki bat izan behar da.");
                    sc.next();
                }
            } while (!ondo);

            System.out.println("");
            switch (opcion) {
                case 1:
                    erosketenZerrenda();
                    break;
                case 2:
                    fakturazioOsoa();
                    break;
                case 3:
                    bezerorikOnena();
                    break;
                case 4:
                    helbideaBilatu();
                    break;
                case 5:
                    erosketaKopuruaUrteEtaHilabeteko();
                    break;

                case 20:
                    break;
                default:
                    System.out.println("Sartutako aukera ez da existitzen.");
            }
        } while (opcion != 20);

        System.out.println("Programa bukatuta");
        initialize();
        erosketenZerrenda();
        fakturazioOsoa();
        bezerorikOnena();
        helbideaBilatu();
    }

    public static void initialize() {
        String[] emailak;
        emailak = new String[2];
        emailak[0] = "idazkaria@uni.eus";
        emailak[1] = "zuzendari@uni.eus";

        kontaktuak = new ArrayList<>();

        kontaktuak.add(new Pertsona(1, "Karlos", "Argiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus"));

        kontaktuak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus"));
        kontaktuak.add(new Enpresa(3, "CIFP Uni Eibar-Ermua LHII", "Uni", "Otaola Etorbidea 29", emailak));

        produktuKatalogoa = new ArrayList<>();

        produktuKatalogoa.add(new Produktua("C01", "Toshiba Satellite Pro", 450));

        produktuKatalogoa.add(new Produktua("C02", "HP Pavilion", 600));

        produktuKatalogoa.add(new Produktua("T01", "Samsung Galaxy", 210));

        produktuKatalogoa.add(new Produktua("T02", "iPhone XX", 1300));

        erosketenZerrenda = new ArrayList<>();

        /*********** EROSKETA *************/

        ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();

        lehenErosketaProduktuak.add(produktuKatalogoa.get(0));

        lehenErosketaProduktuak.add(produktuKatalogoa.get(1));

        lehenErosketaProduktuak.add(produktuKatalogoa.get(2));

        ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();

        lehenErosketaUnitateak.add(4);

        lehenErosketaUnitateak.add(2);

        lehenErosketaUnitateak.add(3);

        erosketenZerrenda.add(new Erosketa("E18-01", "2018-09-25", kontaktuak.get(1), lehenErosketaProduktuak,

                lehenErosketaUnitateak, 3630));

        /*********** EROSKETA *************/

        ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();

        bigarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

        ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();

        bigarrenErosketaUnitateak.add(15);

        erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24", kontaktuak.get(0),

                bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 6750));

        /*********** EROSKETA *************/

        ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();

        hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

        hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(3));

        ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();

        hirugarrenErosketaUnitateak.add(1);

        hirugarrenErosketaUnitateak.add(1);

        erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09", kontaktuak.get(0),

                hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 660));

        /*********** EROSKETA: 4 *************/

        ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();

        laugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

        laugarrenErosketaProduktuak.add(produktuKatalogoa.get(1));

        laugarrenErosketaProduktuak.add(produktuKatalogoa.get(3));

        ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();

        laugarrenErosketaUnitateak.add(3);

        laugarrenErosketaUnitateak.add(1);

        laugarrenErosketaUnitateak.add(1);

        erosketenZerrenda.add(new EpekakoErosketa("E19-02", "2019-02-09",

                kontaktuak.get(1), laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 3250, 300, 12));

        /*********** EROSKETA: 5 *************/

        erosketenZerrenda.add(new Erosketa("E21-01", "2021-01-17",

                kontaktuak.get(2), null, null, 15000));

        /*********** EROSKETA 6 *************/

        erosketenZerrenda.add(new Erosketa("E22-01", "2022-01-18",

                kontaktuak.get(2), null, null, 6600));

        /*********** EROSKETA 7 *************/

        erosketenZerrenda.add(new EpekakoErosketa("E22-02", "2022-02-20",

                kontaktuak.get(0), null, null, 135000, 8000, 20));

        /*********** EROSKETA 8 *************/

        erosketenZerrenda.add(new Erosketa("E22-03", "2022-02-21",

                kontaktuak.get(2), null, null, 7550));

        /*********** EROSKETA 9 *************/

        erosketenZerrenda.add(new EpekakoErosketa("E22-04", "2022-02-27",

                kontaktuak.get(0), null, null, 32500, 3000, 12));

        /*********** EROSKETA 10 *************/

        erosketenZerrenda.add(new Erosketa("E23-01", "2023-01-02",

                kontaktuak.get(2), null, null, 2560));

        /*********** EROSKETA 11 *************/

        erosketenZerrenda.add(new Erosketa("E23-02", "2023-02-02",

                kontaktuak.get(0), null, null, 1300));

        /*********** EROSKETA 12 *************/

        erosketenZerrenda.add(new Erosketa("E23-03", "2023-02-02",

                kontaktuak.get(1), null, null, 1050));

        /*********** EROSKETA 13 *************/

        erosketenZerrenda.add(new EpekakoErosketa("E23-04", "2023-02-12",

                kontaktuak.get(2), null, null, 33800, 3000, 12));

    }

    public static void erosketenZerrenda() {
        System.out.println("\nEPEKAKO EROSKETEN TXOSTENA");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-15s %-25s\n", "NumPed", "Fecha", "Cliente",
                "Guztira",
                "Epeka", "Kuota", "Epeak", "OrdaindukoDena", "GainetikOrdainduBeharrekoa");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i) instanceof EpekakoErosketa) {

                System.out.println(((EpekakoErosketa) erosketenZerrenda.get(i)).toStringLuzea2());
            }
        }
    }

    public static double fakturazioOsoa() {
        double sum = 0;
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            sum += erosketenZerrenda.get(i).getGuztira();
        }
        System.out.println("Fakturazio osoa :" + sum);
        return sum;
    }

    public static void bezerorikOnena() {
        Erosketa onena = erosketenZerrenda.get(0);
        for (int i = 1; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i) != null) {
                if (erosketenZerrenda.get(i).getGuztira() > onena.getGuztira()) {
                    onena = erosketenZerrenda.get(i);
                }
            }
        }
        System.out.print("Bezerorik onena: " + onena.getBezeroa());

    }

    public static void helbideaBilatu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zein helbide nahi duzu bilatzea? ");
        String helbidea = sc.next();
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i).getBezeroa().getHelbidea().startsWith(helbidea)) {
                System.out.println("Aurkitu da bilatu nahi zenuena" + erosketenZerrenda.get(i));
            }
        }
        sc.close();
    }

public static void erosketaKopuruaUrteEtaHilabeteko(){
    int eguna;
    int urtea;
    Month hilabetea;
    System.out.println("\nEPEKAKO EROSKETEN TXOSTENA");
            System.out.printf("%-25s %-10s %-10s %-10s %-10s %-10s %-10s %-15s %-25s\n", "Urtea", "Enero", "Febrero", "Guztira",
                    "Epeka", "Kuota", "Epeak","OrdaindukoDena","GainetikOrdainduBeharrekoa");
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            for(int j=2018;j<=2023;j++){
                if(j==erosketenZerrenda.get(i).getData().getYear()){
                    
                  for(int z=1;z<=12;z++){
                    int count=0;
                    if(z==erosketenZerrenda.get(i).getData().getMonthValue()){
                        count++;
                        
                    }
                    System.out.println(erosketenZerrenda.get(i).getKodea()+" "+j+" "+z+" "+count);
                  }
                  
                }
            }
            
    }
}
}
