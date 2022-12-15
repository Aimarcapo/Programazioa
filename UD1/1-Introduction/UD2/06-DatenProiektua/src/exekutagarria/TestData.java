package exekutagarria;
import model.Data;
public class TestData {
    public static void main(String[] args) {
        Data d1;
        d1=new Data(1899, 12, 13);
        d1.setDay(13);
        System.out.println(d1);
    }
}
