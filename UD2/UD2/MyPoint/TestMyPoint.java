

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint p0 = new MyPoint(0, 0);
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(24, 60);
        System.out.println(" p0 => " + p0);
        System.out.println(" p1 => " + p1);
        System.out.println(" p2 => " + p2);

        System.out.println(" p0 => " + p0.distance());
        System.out.println(" p1 => " + p1.distance());
        System.out.println(" p2 => " + p2.distance(p3));
        MyPoint puntuenarraya[] = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            MyPoint puntu = new MyPoint(i + 1, i + 1);
            puntuenarraya[i] = puntu;
        }
        System.out.println("puntuen arraya =>" + Arrays.toString(puntuenarraya));

        MyPoint puntuenarrayaa[] = new MyPoint[100];
        for (int i = 0; i < 100; i++) {
            MyPoint puntu = new MyPoint(i , i );
            puntuenarrayaa[i] = puntu;
            
        }
        System.out.println("puntuen arraya =>" + Arrays.toString(puntuenarrayaa));
        MyPoint ausazko[] = new MyPoint[5];
        for (int i = 0; i < 5; i++) {
            MyPoint puntua = new MyPoint((int) (Math.random() * 10), (int) (Math.random() * 10));
            ausazko[i] = puntua;
            
        }
        System.out.println("puntuen arraya =>" + Arrays.toString(ausazko));
        System.out.println();
        System.out.println("puntuen arraya =>" + Arrays.toString(p1.getXY()));
    }
}