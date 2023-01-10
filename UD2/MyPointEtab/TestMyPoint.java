package MyPointEtab;

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
    }
}