
public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        zenbakitzailea = (int) (Math.random() * 9 + 1);
        izendatzailea = (int) (Math.random() * 9 + 1);
    }

    public int getZenbakitzailea() {
        this.zenbakitzailea=zenbakitzailea;
        return zenbakitzailea;
    }

    public int getIzendatzailea() {
        this.izendatzailea=izendatzailea;
        return izendatzailea;
    }

    public void setZenbakitzailea(int zenbakitzaileBerria) {
        zenbakitzailea=(int)(Math.random()*9+1);
        zenbakitzailea = zenbakitzaileBerria;
    }

    public void setIzendatzailea(int izendatzaileaBerria) {
        izendatzailea=(int)(Math.random()*9+1);
        izendatzailea = izendatzaileaBerria;
    }

    public java.lang.String toString() {

        return "Zatikia" + zenbakitzailea + "/" + izendatzailea;
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        Zatikia zat3=new Zatikia(zat3.zenbakitzailea,zat3.getIzendatzailea());
       zat3.zenbakitzailea=zat1.getZenbakitzailea() * zat2.getZenbakitzailea();
zat3.izendatzailea=zat1.getIzendatzailea()*zat2.getIzendatzailea();
        return zat3;
        
    }
}
