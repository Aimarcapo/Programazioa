package model;

public class Langileak {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;

    public Langileak(int identifikazio, String izen, String abizen, double sold) {
        id = identifikazio;
        izena = izen;
        abizena = abizen;
        soldata = sold;

    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getIzenOsoa() {
        return izena + "" + abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public double getUrtekoSoldata() {
        return soldata * 12;
    }

    public void setSoldata(double soldataBerria) {
        soldata = soldataBerria;
    }

    public double soldataIgo(int portzentaia) {
        soldata=(soldata * portzentaia) / 100;
        return soldata;
    }
    public String toString(){
        return" Identikazioa "+id+" Izena "+izena+" Abizena "+abizena+" Soldata "+soldata;
    }
    public static Langileak nireHamarLagunLangile(Langileak[]langilea){
        Langileak n=langilea[10];
        for(int i=0;i<langilea.length;i++){
            n=langilea[i];
        }
        return n;
    }
    public static Zatikia bilatu(String lan){
        int barra = lan.indexOf(" ");
        int strLen = lan.length();

        String strIzena = lan.substring(0, barra);
        String strId = lan.substring(barra + 1, strLen);

        int izena = Integer.parseInt(strIzena);

        int id = Integer.parseInt(strId);

        // Integer.toString(strGoikoa);
        
       

    }
}
