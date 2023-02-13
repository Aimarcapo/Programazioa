import java.util.ArrayList;
import java.util.Scanner;



public class ErosketakKudeatu2 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList<>();
    private static ArrayList<Erosketa> erosketak = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;
        initialize();
        do {
            System.out.println("\n");
            System.out.println("*********************************************");
            System.out.println("*  EROSKETEN KUDEAKETA");
            System.out.println("*  ---------------------------------------");
            System.out.println("*  1.  Create (Datuak gehitu)");
            System.out.println("*  2.  Read (Ikusi)");
            System.out.println("*  3.  Update (Aldatu)");
            System.out.println("*  4.  Delete (Ezabatu)");
            System.out.println("*  20. Irten");
            System.out.println("*  ---------------------------------------");
            System.out.print("* Aukeratu zenbaki bat: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    create2();
                    break;
                case 2:
                    readMenuErakutsi();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 20:
                    break;
                default:
                    System.out.println("Erantzun okerra");
                    break;

            }
        } while (opcion != 20);

        System.out.println("Programa bukatuta");
    }

    public static void initialize() {
        // EROSKETAK SORTU
        // LEHENENGO EROSKETA SORTU
        ArrayList<Produktua> produktuak1 = new ArrayList<>();
        ArrayList<Integer> unitateak1 = new ArrayList<>();
        produktuak1.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak1.add(4);
        produktuak1.add(new Produktua("C02", "HP Pavilion", 600));
        unitateak1.add(2);
        produktuak1.add(new Produktua("T01", "Samsung Galaxy", 210));
        unitateak1.add(3);
        erosketenZerrenda.add(new Erosketa("E18-01", "2018-09-25",
                new Pertsona(2, "Martin", "Berasategui", "Mirakontxa z/g. DONOSTIA.", "mbera@donostia.eus"),
                produktuak1,
                unitateak1, 3630));
        // BIGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak2 = new ArrayList<>();
        ArrayList<Integer> unitateak2 = new ArrayList<>();
        produktuak2.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak2.add(15);
        erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24",
                new Pertsona(1, "Karlos", "Arguiñano", "Hondartza Pasialekua z/g. ZARAUTZ", "kargi@zarautz.eus"),
                produktuak2, unitateak2, 6750));
        // HIRUGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak3 = new ArrayList<>();
        ArrayList<Integer> unitateak3 = new ArrayList<>();
        produktuak3.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak3.add(1);
        produktuak3.add(new Produktua("T01", "Samsung Galaxy", 210));
        unitateak3.add(1);
        erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09",
                new Pertsona(1, "Karlos", "Arguiñano", "Hondartza Pasialekua z/g. ZARAUTZ", "kargi@zarautz.eus"),
                produktuak3, unitateak3, 660));
        // LAUGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak4 = new ArrayList<>();
        ArrayList<Integer> unitateak4 = new ArrayList<>();
        produktuak4.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        unitateak4.add(3);
        produktuak4.add(new Produktua("C02", "HP Pavilion", 600));
        unitateak4.add(1);
        produktuak4.add(new Produktua("T02", "iPhone XX", 1300));
        unitateak4.add(1);
        erosketenZerrenda.add(new EpekakoErosketa("E19-02", "2019-02-09",
                new Pertsona(1, "Karlos", "Arguiñano", "Hondartza Pasialekua z/g. ZARAUTZ", "kargi@zarautz.eus"),
                produktuak4, unitateak4, 3250, 12, false, 300));
        // BOSTGARREN EROSKETA SORTU
        ArrayList<Produktua> produktuak5 = new ArrayList<>();
        ArrayList<Integer> unitateak5 = new ArrayList<>();
        produktuak5.add(new Produktua("C02", "HP Pavilion", 600));
        unitateak5.add(25);
        String[] kontaktoenEmailak;
        kontaktoenEmailak = new String[2];
        kontaktoenEmailak[0] = "kontakto1@gmail.com";
        kontaktoenEmailak[1] = "kontakto2@gmail.com";
        erosketenZerrenda.add(new Erosketa("E21-01", "2020-01-17",
                new Enpresa(3, "Otaola Etorbidea 29. EIBAR.", "Uni Eibar-Ermua", "UNI", kontaktoenEmailak), produktuak5,
                unitateak5, 15000));
    }

   

    public static int readMenuErakutsi() {
        int opcion;

        do {
            System.out.println("*************************************************");
            System.out.println("READ MENUA");
            System.out.println("------------------------------------------------");
            System.out.println("1. Erosketen zerrenda");
            System.out.println("2. Fakturazio osoa");
            System.out.println("3. Bezerorik onena");
            System.out.println("4. Helbidea bilatu");
            System.out.println("5. Epekako erosketen txostena");
            System.out.println("20. Menu nagusira itzuli");
            System.out.println("------------------------------------------------");

            System.out.print("Aukeratu zenbaki bat: ");
            opcion = sc.nextInt();

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
                    epekakoErosketenTxostena();
                    break;
                case 20:

                    break;
                default:
                    System.out.println("Sartutako erantzuna ez da egokia.");
            }
        } while (opcion != 20);

        return opcion;
    }

    public static void create2() {
        
        String erosketaKodea;
        int bezeroKodea;
        double guztira;
        char epekakoa;
        boolean egiaztatu;
        Bezeroa cliente=erosketenZerrenda.get(0).getBezeroa();
        System.out.println("EROSKETA BERRIA");
        System.out.println("------------------------------------------------");
        System.out.print("Sartu erosketa kodea: ");
        erosketaKodea = sc.next();
        System.out.println("Sartu bezero kodea");
        bezeroKodea = sc.nextInt();
        System.out.println("Sartu guztira");
        guztira = sc.nextDouble();
        System.out.print("Epekako erosketa da? (B/E) ");
        epekakoa = sc.next().charAt(0);
        if (epekakoa == 'B') {
            egiaztatu = true;
        } else {
            egiaztatu = false;
        }
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (bezeroKodea == erosketenZerrenda.get(i).getBezeroa().getKodea()) {
                cliente = erosketenZerrenda.get(i).getBezeroa();
            }
        }
        
            erosketenZerrenda.add(new Erosketa(erosketaKodea, cliente, guztira));
        

    }

    public static void create() {
        String erosketaKodea;
        String data;
        ArrayList<Produktua> produktuak = new ArrayList<>();
        ArrayList<Integer> unitateak = new ArrayList<>();
        char besteProd;
        String bezeroMota;
        Bezeroa bezeroa;
        double guztira;
        char erantzunaMota;
        boolean epekakoa;

        // ALDAGAIAK ESKATU ETA GORDE
        System.out.println("EROSKETA BERRIA");
        System.out.println("------------------------------------------------");
        System.out.print("Sartu erosketa kodea: ");
        erosketaKodea = sc.next();
        System.out.print("Sartu erosketaren data (uuuu-hh-ee): ");
        data = sc.next();
        System.out.println("Erositako produktua/k:");
        // PRODUKTUAK ARRAYLISTA BETE PRODUKTUAK SORTUZ
        do {
            String produktuKode;
            String produktuIzena;
            double prezioa;

            System.out.print("\tKodea: ");
            produktuKode = sc.next();
            Scanner sc = new Scanner(System.in);
            System.out.print("\tIzena: ");
            produktuIzena = sc.nextLine();
            System.out.print("\tPrezioa: ");
            prezioa = sc.nextDouble();
sc.close();
            produktuak.add(new Produktua(produktuKode, produktuIzena, prezioa));

            System.out.print("\tBeste produktu bat gorde nahi duzu? (B/E) ");
            besteProd = sc.next().charAt(0);
        } while (besteProd != 'E');
        // UNITATEAK ARRAYLISTA BETE
        System.out.println("Erositako produktuen unitateak");
        for (int i = 0; i < produktuak.size(); i++) {
            System.out.print("\t" + (i + 1) + ". " + produktuak.get(i).getIzena() + ": ");
            unitateak.add(sc.nextInt());
        }
        // BEZEROA GORDE
        // ZEIN BEZERO MOTA DEN JAKIN
        System.out.print("Zein bezero mota da? (Pertsona/Enpresa) ");
        bezeroMota = sc.next().toLowerCase();
        // BEZEROAREN PARAMETROAK BETE
        if (bezeroMota.equals("pertsona")) {
            // ALDAGAIAK SORTU
            int bezeroKode;
            String helbidea;
            String bezeroIzena;
            String abizena;
            String emaila;

            // ALDAGAIAK ESKATU
            System.out.print("\tKodea: ");
            bezeroKode = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\tHelbidea: ");
            helbidea = sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("\tIzena: ");
            bezeroIzena = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("\tAbizena: ");
            abizena = sc3.nextLine();
            System.out.print("\tEmaila: ");
            emaila = sc.next();
sc1.close();
sc3.close();
sc2.close();
            // BEZEROA SORTU
            bezeroa = new Pertsona(bezeroKode, helbidea, bezeroIzena, abizena, emaila);
        } else if (bezeroMota.equals("enpresa")) {
            // ALDAGAIAK SORTU
            int bezeroKode;
            String helbidea;
            String izenJuridikoa;
            String izenKomertziala;
            String[] kontaktoenEmailak;

            // ALDAGAIAK ESKATU
            System.out.print("\tKodea: ");
            bezeroKode = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\tHelbidea: ");
            helbidea = sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("\tIzen juridikoa: ");
            izenJuridikoa = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("\tIzen komertziala: ");
            izenKomertziala = sc3.nextLine();
            System.out.print("\tKontakturako email kopurua: ");
            kontaktoenEmailak = new String[sc.nextInt()];
            for (int i = 0; i < kontaktoenEmailak.length; i++) {
                System.out.print("\t\t" + (i + 1) + ". Emaila: ");
                kontaktoenEmailak[i] = sc.next();
            }
sc1.close();
sc2.close();
sc3.close();
            // BEZEROA SORTU
            bezeroa = new Enpresa(bezeroKode, helbidea, izenJuridikoa, izenKomertziala, kontaktoenEmailak);
        } else {
            System.out.println("\tSartutako erantzuna ez da egokia.");
            System.out.println("\tNULL balioak jarriko ditugu.");
            bezeroa = new Pertsona(0, null, null, null, null);
        }
        System.out.print("Guztira ordaindu beharrekoa: ");
        guztira = sc.nextDouble();
        // EROSKETA MOTA JAKIN
        System.out.print("Epekako erosketa da? (B/E) ");
        erantzunaMota = sc.next().charAt(0);
        if (erantzunaMota == 'B') {
            epekakoa = true;
        } else {
            epekakoa = false;
        }
        // EROSKETA SORTU
        if (!epekakoa) {
            erosketak.add(new Erosketa(erosketaKodea, data, bezeroa, produktuak, unitateak, guztira));
        } else {
            // EPEKAKO EROSKETA SORTU, BEHAR DIREN DATUAK ESKATUZ
            int epeKop;
            char ordainketaErantzuna;
            boolean ordainketaBukatuta;
            double kuota;

            System.out.print("Epekako erosketaren epe kopurua: ");
            epeKop = sc.nextInt();
            System.out.print("Ordainketa bukatuta dago? (B/E) ");
            ordainketaErantzuna = sc.next().charAt(0);
            if (ordainketaErantzuna == 'B') {
                ordainketaBukatuta = true;
            } else {
                ordainketaBukatuta = false;
            }
            System.out.print("Epe bakoitzaren kuota: ");
            kuota = sc.nextDouble();
            erosketak.add(new EpekakoErosketa(erosketaKodea, data, bezeroa, produktuak, unitateak, guztira, epeKop,
                    ordainketaBukatuta, kuota));
        }
    }

    public static void update() {
        String kodigoa;
        char[] kodigoberri;
        System.out.println("EROSKETA BATEN KODIGOA BERRIZTU");
        System.out.println("------------------------------------------------");
        System.out.print("Zein erosketaren kodigoa berriztu nahi duzu, esan orain duen kodigoa:");
        kodigoa = sc.next();
        System.out.print("Kodigo berria: ");
        kodigoberri = sc.next().toCharArray();
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i).getKodea().equals(kodigoa)) {
                erosketenZerrenda.get(i).setKodea(kodigoberri);
            }
        }
    }

    public static void delete() {
        String kodigoa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Zein erosketa borratu nahi duzu, esan bere kodigoa:");
        kodigoa = sc.next();
sc.close();
        for (int i = 0; i < erosketak.size(); i++) {
            if (erosketenZerrenda.get(i).getKodea().equals(kodigoa)) {
                erosketenZerrenda.remove(i);
            }
        }
        
    }

    public static void erosketenZerrenda() {
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            System.out.println((i + 1) + ". " + erosketenZerrenda.get(i).toString());
            System.out.println("");
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
        System.out.println("Zein helbide nahi duzu bilatzea? ");
        String helbidea = sc.next();
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i).getBezeroa().getHelbidea().startsWith(helbidea)) {
                System.out.println("Aurkitu da bilatu nahi zenuena" + erosketenZerrenda.get(i));
            }
        }
        sc.close();
    }

    public static void epekakoErosketenTxostena() {
        System.out.println("\nEPEKAKO EROSKETEN TXOSTENA");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Data", "Bezeroa", "Guztira", "Epeak",
                "Kuota", "GuztiraEP", "Ordaindua");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------\n");
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i) instanceof EpekakoErosketa) {

                System.out.println(((EpekakoErosketa) erosketenZerrenda.get(i)).toStringLuzea());
            }
        }
    }
    
}