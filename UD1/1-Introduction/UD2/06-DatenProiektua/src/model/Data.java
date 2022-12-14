package model;

import java.util.stream.IntStream;

public class Data {
    private int[] days = IntStream.range(1, 32).toArray();
    private int[] months = IntStream.range(1, 12).toArray();
    private int[] years = IntStream.range(1900, 9999).toArray();

    private int day;
    private int month;
    private int year;

    public Data(int day, int year, int month) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String getHilabeteaLetretan() {
        String[] letrak = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Urria",
                "Azaroa", "Abendua" };
        return letrak[month - 1];
    }

    public String getHilabeteaLetretan(String hizkuntza) {
        if (hizkuntza == "EU") {

            String[] letrak = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Urria",
                    "Azaroa", "Abendua" };
            return letrak[month - 1];
        } else if (hizkuntza == "EN") {
            String[] ingelesa = { "January","February","March","April","May","June","July","August","September","October","November","December" };
            return ingelesa[month - 1];
        }
        else if(hizkuntza=="GA"){
            String[] gaztelera={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
            return gaztelera[month-1];
        }
else{
    String[] letrak = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila","Abuztua","Iraila", "Urria",
    "Azaroa", "Abendua" };
return letrak[month - 1];
}
    }

}
