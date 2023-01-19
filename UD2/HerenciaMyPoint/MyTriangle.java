package HerenciaMyPoint;

public class MyTriangle extends MyPoint {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    public MyTriangle(int x, int y, MyPoint v1, MyPoint v2, MyPoint v3) {
        super(x, y);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 =  new MyPoint(x1,y1);
        this.v2 =  new MyPoint(x2,y2);
        this.v3 =  new MyPoint(x3,y3);
    }


    @Override
    public String toString() {
        return "MyTriangle [v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
    }

    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }

    public double getPerimeter() {
        double perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }

    public String getType() {

        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);

        String type = "";

        if (a == b && a == c) {
            type = "Aldekidea";
        }
        if (a == b && a != c) {
            type = "Isozelea";
        } else {
            type = "Eskalenoa";
        }

        return type;

    }

    
    
}
