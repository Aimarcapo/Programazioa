package model;

import java.util.stream.IntStream;

public class Data{
private int[] day=IntStream.range(1, 32).toArray();
private int[] month=IntStream.range(1, 12).toArray();
private int[] year=IntStream.range(1900, 9999).toArray();;






public Data(int[] i,int[] j,int[] k){
this.year=i;
this.month=j;
this.day=k;

}
public int[] getDay(){
    return this.day;
}
public int[] getMonth(){
    return this.month;
}
public int[] getYear(){
    return this.year;
}
public void setDay(int[] day){
    this.day=day;
}
public void setMonth(int[] month){
    this.month=month;
}
public void setYear(int[] year){
    this.year=year;
}
public String toString(){
    return day +"/"+month+"/"+year;
}
public void setDay(int i) {
}
public void setDate(int[] day,int[] month, int[] year){
    this.day=day;
    this.month=month;
    this.year=year;

}
}