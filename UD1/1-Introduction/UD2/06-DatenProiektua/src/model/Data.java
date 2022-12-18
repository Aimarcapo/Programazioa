package model;

import java.util.stream.IntStream;

public class Data {
    private int[] days = IntStream.range(1, 32).toArray();
    private int[] months = IntStream.range(1, 12).toArray();
    private int[] years = IntStream.range(1900, 9999).toArray();

    private int day ;
    private int month;
    private int year;

    public Data(int year, int month, int day) {
    if(day>=1 && day<=31&&year<=9999&&year>=1900&& month<=12 &&month>=1){
        this.year = year;
        this.month = month;
        this.day = day;

    }
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
        if(day<=32&&day>=1){
        this.day = day;
    }
}

    public void setMonth(int month) {
        if(month<=12&&month>=1){
        this.month = month;
    }
    }
    public void setYear(int year) {
        if(year>=1900&&year<=9999){
        this.year = year;
    }
    }
    public String toString() {
        return year + "/" + month + "/" +day ;
    }

    public void setDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String getHilabeteaLetretan() {

        String[] defektuz = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila",
                "Abuztua",
                "Iraila", "Urria", "Azaroa", "Abendua" };

        return defektuz[month - 1];

    }

    public String getHilabeteaLetretan(String hizkuntzak) {
        String[] defektuz = { "Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila",
                "Abuztua",
                "Iraila", "Urria", "Azaroa", "Abendua" };
        if (hizkuntzak == "EU") {
            return defektuz[month - 1];
        } else if (hizkuntzak == "EN") {
            String[] ingelesa = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October", "November", "December" };
            return ingelesa[month - 1];

        } else if (hizkuntzak == "ES") {
            String[] gaztelera = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                    "Septiembre", "Octubre", "Noviembre", "Diciembre" };
            return gaztelera[month - 1];
        } else {
            return defektuz[month - 1];
        }

    }
}
