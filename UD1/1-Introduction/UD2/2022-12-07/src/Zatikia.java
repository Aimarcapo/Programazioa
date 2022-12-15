public class Zatikia {
    private int goikoa;
    private int behekoa;

    /**
     * Konstruktore honek, atributuen balio biak parametro bezala jasoko ditu.
     * IDE-ak gai dira automatikoki horrelako konstruktoreak generatzeko. Adibidez,
     * Netbeans-en: "Source => Insert Code" *
     * 
     * @param zenbakitzailea
     * @param izendatzailea
     */
    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.goikoa = zenbakitzailea;
        this.behekoa = izendatzailea;
        sinplifikatu();
    }

    /**
     * Konstruktore lehenetsiak, ausazko zatiki bat sortuko du. Bai
     * zenbakitzailea bai izendatzailea 1 eta 10 bitartean dauden zenbakiak
     * izango dira. //Sinplifikatuta egongo da.
     */
    public Zatikia() {
        goikoa = (int) (Math.random() * 10) + 1;
        behekoa = (int) (Math.random() * 10 + 1);
        sinplifikatu();
    }

    /**
     * Konstruktore honek "zenbakitzaile/izendatzaile" formatua daukan String-a
     * jasoko du eta bertatik zatiki berriaren zenbakitzaile eta izandatzaile
     * atributoak ebatzi edo aterako ditu.
     *
     * @param zatIdatzia x/y formatuko Stringa
     */
    public Zatikia(String zatIdatzia) {
        this.goikoa = Integer.parseInt(zatIdatzia.substring(0, zatIdatzia.indexOf("/")));
        this.behekoa = Integer.parseInt(zatIdatzia.substring(zatIdatzia.indexOf("/") + 1));
        sinplifikatu();
    }

    public int getGoikoa() {
        return goikoa;
    }

    public void setGoikoa(int goikoa) {
        this.goikoa = goikoa;
    }

    public int getBehekoa() {
        return behekoa;
    }

    public void setBehekoa(int behekoa) {
        this.behekoa = behekoa;
    };

    /**
     * Returns a string representation of the fraction,
     * in the zenbakitzailea/izendatzailea form. Adibidez, 4/5
     * 
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return goikoa + "/" + behekoa;
    }

    /**
     * Metodo estatiko honek zatiki biren arteko biderketa bueltatzen du, baina
     * jasotako zatikiak aldatu gabe.
     *
     * @param zat1
     * @param zat2
     * @return Biderketaren emaitzari dagokion Zatiki objektua
     */
    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {

        Zatikia zat3 = new Zatikia(1, 1);
        zat3.goikoa = zat1.goikoa * zat2.goikoa;
        zat3.behekoa = zat1.behekoa * zat2.behekoa;
        zat3.sinplifikatu();
        return zat3;
    }

    /**
     * Uneko zatikia ahalik eta gehien sinplifikatzen du.
     * 
     * @return zatiki sinplifikatua
     */
    public Zatikia sinplifikatu() {
        int i = 2;
        while (i <= Math.abs(goikoa) || i <= Math.abs(behekoa)) {
            if (goikoa % i == 0 && behekoa % i == 0) {
                behekoa = behekoa / i;
                goikoa = goikoa / i;
            } else {
                i++;
            }
        }
        return this;
    }

    public double hamartarBaliokidea() {
        return (double) this.goikoa / this.behekoa;
    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        boolean emaitza;
        if (this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()) {
            emaitza = true;
        } else {
            emaitza = false;
        }
        return emaitza;
    }

    /** OSATU EZAZU METODO HAU:
     * Zenbakitzailea eta izendatzaileak daukaten zeinuaren arabera metodo 
     * honek true edo false itzuliko du.
     * 
     */
    public boolean isPositive() {
        if(this.hamartarBaliokidea()>=0){
        return true;
        }
        else {
        return false;
    }
     }
    }
