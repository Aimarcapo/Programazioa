
public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }

    public Zatikia() {
        zenbakitzailea = (int) (Math.random() * 9 + 1);
        izendatzailea = (int) (Math.random() * 9 + 1);
    }

    public int getZenbakitzailea() {

        return zenbakitzailea;
    }

    public int getIzendatzailea() {

        return izendatzailea;
    }

    public void setZenbakitzailea(int zenbakitzaileBerria) {
        zenbakitzailea = (int) (Math.random() * 9 + 1);
        zenbakitzailea = zenbakitzaileBerria;
    }

    public void setIzendatzailea(int izendatzaileaBerria) {
        izendatzailea = (int) (Math.random() * 9 + 1);
        izendatzailea = izendatzaileaBerria;
    }

    public java.lang.String toString() {

        return "Zatikia" + zenbakitzailea + "/" + izendatzailea;
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia zat3;
        zat3 = new Zatikia(zat1.getZenbakitzailea() * zat2.getZenbakitzailea(),
                zat1.getIzendatzailea() * zat2.getIzendatzailea());
        return zat3;

    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {
        Zatikia zat4;
        zat4 = new Zatikia(
                zat1.getZenbakitzailea() * zat2.getIzendatzailea() + zat2.getZenbakitzailea() * zat1.getIzendatzailea(),
                zat1.getIzendatzailea() * zat2.getIzendatzailea());
        return zat4;

    }

    public void batu(Zatikia besteZatbat) {
        this.zenbakitzailea = this.zenbakitzailea * besteZatbat.izendatzailea
                + this.izendatzailea * besteZatbat.zenbakitzailea;
                this.izendatzailea=this.izendatzailea*besteZatbat.zenbakitzailea;

    }

    public double hamartarBaliokidea() {
        double baliokidea;
        baliokidea = (this.zenbakitzailea / this.izendatzailea);
        return baliokidea;
    }

    public boolean isBaliokidea(Zatikia z) {
        boolean baliokideaa = false;
        if (this.zenbakitzailea % this.izendatzailea != 0) {
            baliokideaa = true;
        }
        return baliokideaa;
    }

    public boolean isBiggerThan(Zatikia x) {
        boolean bigger = false;
        if (this.hamartarBaliokidea() > x.hamartarBaliokidea()) {

            bigger = true;
        }
        return bigger;
    }
}
