package MyPoint;

public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {
        center = new MyPoint(0,0);
        this.radius=1;
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;

    }

    public MyCircle(MyPoint center, int radius) {
        this.center.setX(center.getX());
        this.center.setY(center.getY());
        this.radius = radius;
    }

    public double distance(MyCircle p) {
        return this.center.distance(p.center);

        /*
         * int xtotal = this.center.distance() - p.x;
         * int ytotal = this.y - p.y;
         * double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
         * return distancia;
         */
    }

    public boolean isInside(MyPoint puntua) {
        if (puntua.distance(this.center) < radius) {
            return true;
        } else {
            return false;
        }
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public int[] getCenterXY() {
        int[] XY = new int[2];
        return XY;
    }

    public int getCenterY(){
        return this.center.getY();
    }
    public double getCircumference() {
        return Math.PI * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
      this.center=center;
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public void setRadius(int radiuss) {
        this.radius = radiuss;
    }

    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";
    }
}