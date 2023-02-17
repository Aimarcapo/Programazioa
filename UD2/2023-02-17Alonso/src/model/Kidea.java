package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public abstract class Kidea {
    protected int id;
    protected String izena;
    protected String abizena;
    protected LocalDate jaiotzeData = LocalDate.of(1900, 01, 01);
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Kidea(int id, String izena, String abizena, String jaiotzeData) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
       
        try {
            this.jaiotzeData = LocalDate.parse(jaiotzeData);
        } catch (DateTimeParseException e) {
            System.out.println(izena + "ezin izan da parseatu");
        }

    }

    public int getId() {
        return id;
    }

    public int getUrtea() {

        LocalDate now = LocalDate.now();

        return Period.between(jaiotzeData, now).getYears();

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public LocalDate getJaiotzeData() {

        return jaiotzeData;
    }

    public void setJaiotzeData(LocalDate jaiotzeData) {
        this.jaiotzeData = jaiotzeData;
    }

    abstract public void entrenatu();

    @Override
    public String toString() {
        return "Kidea [id=" + id + ", izena=" + izena + ", abizena=" + abizena + ", jaiotzeData=" + jaiotzeData + "]";
    }

}
