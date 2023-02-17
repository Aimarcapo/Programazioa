package model;

public class Atezaina extends Futbolaria{
    private int jasotakoGolak = 0;
    private int geratutakoGolak = 0;

    public Atezaina(int id, String izena, String abizena, String jaiotzeData, int dortsala, int jasotakoGolak,
            int geratutakoGolak) {
        super(id, izena, abizena, jaiotzeData, dortsala);
        this.jasotakoGolak = jasotakoGolak;
        this.geratutakoGolak = geratutakoGolak;
    }

    public int getJasotakoGolak() {
        return jasotakoGolak;
    }

    public void setJasotakoGolak(int jasotakoGolak) {
        this.jasotakoGolak = jasotakoGolak;
    }

    public int getGeratutakoGolak() {
        return geratutakoGolak;
    }

    public void setGeratutakoGolak(int geratutakoGolak) {
        this.geratutakoGolak = geratutakoGolak;
    }

    public void baloiaGeratu() {
        this.geratutakoGolak = geratutakoGolak + 1;
    }

    public void golaJaso() {
        this.jasotakoGolak = jasotakoGolak + 1;
    }

    @Override
    public String toString() {
        return "Atezaina =>"+this.getId()+","+this.getIzena()+" "+this.getAbizena()+", "+this.getUrtea()+", "+this.getDortsala()+" dortsala "+this.getGeratutakoGolak()+" geratuak "+this.getJasotakoGolak()+" jasoak";
    }
    

}