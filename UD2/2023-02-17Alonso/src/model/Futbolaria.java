package model;

public class Futbolaria extends Kidea {
private int dortsala;

public Futbolaria(int id, String izena, String abizena, String jaiotzeData, int dortsala) {
    super(id, izena, abizena, jaiotzeData);
    this.dortsala = dortsala;
}

public int getDortsala() {
    return dortsala;
}

public void setDortsala(int dortsala) {
    this.dortsala = dortsala;
}

public void entrenatu(){
    
}

@Override
public String toString() {
    return "Futbolaria=>"+this.getId() +", " +this.getIzena()+" "+this.getAbizena()+", "+this.getUrtea()+", "+this.getDortsala()+" dortsala";
}
    
}
