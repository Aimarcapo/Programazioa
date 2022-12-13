package model;

public class Liburua {

    /**
     * Liburuaren izenburua
     */
    private String izenburua;
    /**
     * Liburuaren egilearen izen abizenak
     */
    private String egilea;
    /**
     * Liburuaren orri kopurua. Zenbaki positibo bat dela ziurtatuko dugu
     * (Setterraren bidez). Ez badigute balio egokia eman, 0 balioa emango diogu
     * atributo honi.
     */
    private int orriKopurua;
    /**
     * Zein urtetan argitaratu den liburua. Uneko urtea baino handiagoa ez dela
     * ziurtatuko dugu (Seterraren bidez)
     */
    private int urtea;
    /**
     * Hiru balio hauetakoren bat izango du atributo honek: Fikzioa, Historikoa,
     * Bestelakoa. Seterraren bidez, horrela dela ziurtatuko dugu. "Bestelakoa"
     * da balio lehenetsia.
     */
    private String gaia;
    /**
     * Hiru balio hauetakoren bat izango du atributo honek: E(Euskara),
     * G(Gaztelera), I(Ingelesa). Seterraren bidez, horrela dela ziurtatuko
     * dugu. Ez badigute balio egokia eman, '-' balioa emango diogu atributo
     * honi.
     */
    private char hizkuntza;
    /**
     * Liburutegiak erosi zuenean, liburuagatik ordaindu zuena gordeko dugu.
     */
    private double prezioa;
    private String kodea;

    public Liburua(String izenburua, String egilea, int orriKopurua, int urtea, String gaia, char hizkuntza,
            double prezioa, String kode) {
        this.izenburua = izenburua;
        this.egilea = egilea;
        this.orriKopurua = orriKopurua;
        this.urtea = urtea;
        this.setGaia(gaia);
        this.setHizkuntza(hizkuntza);
        this.prezioa = prezioa;
        this.kodea = kodea;
    }

    public String getIzenburua() {
        return izenburua;
    }

    public void setIzenburua(String izenburua) {
        this.izenburua = izenburua;
    }

    public String getEgilea() {
        return egilea;
    }

    public void setEgilea(String egilea) {
        this.egilea = egilea;
    }

    public int getOrriKopurua() {
        return orriKopurua;
    }

    public void setOrriKopurua(int orriKopurua) {
        this.orriKopurua = orriKopurua;
    }

    public int getUrtea() {
        return urtea;
    }

    public void setUrtea(int urtea) {
        this.urtea = urtea;

    }

    public String getGaia() {
        gaia.toLowerCase();
        switch (gaia) {
            case "fikzioa":
                this.gaia = "Fikzioa";
                break;
            case "historikoa":
                this.gaia = "Historikoa";
                break;
            default:
                this.gaia = "Bestelakoa";
                break;
        }

        return gaia;
    }

    /**
     * Parametro bezala pasatu diguten gaia "FIKZIOA" bada (bai maiuskulaz edo
     * minuskulaz, edozein case-etan), "Fikzioa" balioa emango diogu atributoari.
     * Pasatu diguten
     * gaia "HISTORIKOA" bada (edozein case-tan), "Fikzioa" balioa emango diogu
     * atributoari. Beste kasuetan, "Bestelakoa" balioa emango diogu.
     */
    public void setGaia(String gaia) {
        this.gaia = gaia;
        // METODO HAU OSATU BEHAR DUZU
    }

    public char getHizkuntza() {

        return hizkuntza;

    }

    public void setHizkuntza(char hizkuntz) {
        switch (hizkuntza) {
            case 'e':
                this.hizkuntza = 'E';
                break;
            case 'E':
                this.hizkuntza = 'E';
                break;
            case 'g':
                this.hizkuntza = 'G';
                break;
            case 'G':
                this.hizkuntza = 'G';
                break;
            case 'i':
                this.hizkuntza = 'I';
                break;
            case 'I':
                this.hizkuntza = 'I';
                break;
            default:
                this.hizkuntza = '-';
                break;
        }

    }

    public double getPrezioa() {
        return prezioa;
    }

    /**
     * Liburuaren prezioaren araberako izartxo segida bat itzuliko du metodo
     * honek. Izartxo bat euroko eta zentimo solteak kontutan izan gabe.
     */
    public String getPrezioaIzartxotan(String z) {
        int i = 0;
        String izarrak = "*";
        while (i <= this.getPrezioa()) {
            i++;
        }
        int j = i - 1;
        for (; j > 1; j--) {
            /**
             * De esta manera si omities la parte de int pero pones su ";" entonces sera un
             * for normal pero sin declarar una nueva variable y deberas usar una ya creada
             */

            izarrak += "*";

        }
        return izarrak;
    }
    // METODO HAU ALDATU BEHAR DUZU

    public void setPrezioa(double prezioa) {/* Void esan nahi duela ez duela ezer bueltatzen */
        this.prezioa = prezioa;
    }

    /**
     * Liburu bakoitzaren kodea automatikoki kalkulatu eta itzuliko du metodo
     * honek hurrengo balioak kateatuz: GaiarenLehenKarakterea, egilearen
     * abizena eta izenburuaren lehen sei hizkiak, espazioak kontatu gabe Adibidez:
     * "FLiuElbosq", "FTolkienTheHob", "FTolkienTheLor", "BElorriagaMatxin",...
     */
    public String getKodea() {
        if (this.getIzenburua().length() < 5) {
            return this.getGaia().charAt(0)
                    + this.getEgilea().substring(this.getEgilea().indexOf(" ") + 1, this.getEgilea().length())
                    + this.getIzenburua();
        } else {
            return this.getGaia().charAt(0)
                    + this.getEgilea().substring(this.getEgilea().indexOf(" ") + 1, this.getEgilea().length())
                    + this.getIzenburua().substring(0, 5);
        }
    }

    /**
     * Liburutegian momentu jakin batean dauden liburuen katalogoa itzultzen du.
     *
     * @return Liburuen array bat. Arrayak hutsuneak izan ditzake.
     */
    public static Liburua[] getLiburuSorta() {
        final int TAMAINA = 10; // Itzuliko dugun arrayaren tamaina. Gehienez hartu ditzakeen liburuak.
        Liburua[] liburuak = new Liburua[TAMAINA];
        liburuak[0] = new Liburua("El bosque oscuro", "Cixin Liu", 408, 2008, "FIKZIOA", 'g', 12.95, "Fl23");
        liburuak[1] = new Liburua("The Hobbit", "J.R.R. Tolkien", 413, 1937, "fikzioa", 'i', 20.95, "Fl43");
        liburuak[2] = new Liburua("The Lord of the Rings", "J.R.R. Tolkien", 122, 1954, "FIkziOA", 'I', 15.95, "FL54");
        liburuak[3] = new Liburua("Matxinsaltoen belarriak", "Unai Elorriaga", 122, 2006, "?", 'E', 10.95, "K76");
        liburuak[4] = new Liburua("Las brujas", "Roald Dahl", 222, 1983, "Fikzioa", 'G', 10.95, "K45");
        liburuak[5] = new Liburua("Boy", "Roald Dahl", 122, 1984, "HISTORIKOA", 'I', 5.95, "K87");
        liburuak[7] = new Liburua("Obabakoak", "Bernardo Atxaga", 392, 1988, "FIKZIOA", 'E', 22.50, "AH56");

        return liburuak;
    }

    /**
     * Liburua klaseko objektu bat String motako formatu honetan bueltatzen du:
     * izenburua (egilea)
     */
    @Override
    public String toString() {
        // METODO HAU ALDATU BEHAR DUZU
        return izenburua + "(" + egilea + ")";
    }

}
