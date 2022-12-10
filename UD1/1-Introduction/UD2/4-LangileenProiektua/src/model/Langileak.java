package model;

public class Langileak {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    public Langileak(int identifikazio,String izen,String abizen,double sold){
id=identifikazio;
izena=izen;
abizena=abizen;
soldata=sold;

    }
    public int getId(){
        return id;
    }
    public String getIzena(){
        return izena;
    }
    public String getAbizena(){
        return abizena;
    }
    public String getIzenOsoa(){
        return izena+""+abizena;
    }
    public double getSoldata(){
        return soldata;
    }
    public double getUrtekoSoldata(){
        return soldata*12;
    }
    public void setSoldata(double soldataBerria){
        soldata=soldataBerria;
    }
    public double soldataIgo(int portzentaia){
        return (soldata*portzentaia)/100;
    }
}
