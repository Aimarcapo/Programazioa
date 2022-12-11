package exekutagarria;
import model.Langileak;
public class NiLangile{
public static void main(String[] args) {
    Langileak bat;
    bat=new Langileak(0, "Aimar", "Alonso", 600);
System.out.println(bat.toString());
System.out.println(bat.getUrtekoSoldata());
System.out.println(bat.soldataIgo(150));
System.out.println(bat);
}
}