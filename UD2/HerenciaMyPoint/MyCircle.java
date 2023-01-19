package HerenciaMyPoint;

public class MyCircle extends MyPoint {

    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, MyPoint center, int radius) {
        super(x, y);
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MyPoint(x, y);
    }

    public double distance(MyCircle p) {
        return this.center.distance(p.center);
    }

    public boolean isInside(MyPoint puntua) {
        boolean inside = false;

        if (puntua.distance(this.center) < radius) {
            inside = true;
        }

        return inside;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        int c = getCenter().getX();
        return c;
    }

    public int[] getCenterXY() {
        int[] coordenada = new int[2];
        coordenada[0] = getCenter().getX();
        coordenada[1] = getCenter().getY();
        return coordenada;
    }

    public double getCircumference() {
        return Math.PI * radius * radius;
    }

    public void setCenterX(int x) {
        getCenter().setX(x);
    }

    public void setCenterXY(int x, int y) {
        getCenter().setXY(x, y);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle [center=" + center + ", radius=" + radius + "]";
    }

}
