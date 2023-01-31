public class MyCircle extends MyPoint {
  private MyPoint center;
  private int radius = 1;

  public MyCircle() {
    center = new MyPoint(0, 0);
    int radius = 1;
  }

  public MyCircle(int x, int y, int radius) {
    center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint circle, int radius) {
    this.center.setX(circle.getX());
    this.center.setY(circle.getY());
    this.radius = radius;
  }

  public double distance(MyCircle p) {
    return this.distance(p.center);

  }

  public boolean isInside(MyPoint puntua) {
    boolean bai;
    if (puntua.distance(this.center) < radius) {
      bai = true;
    } else {
      bai = false;
    }
    return bai;
  }

  public MyPoint getCenter() {
    return center;
  }

  public int getCenterX() {
    return this.center.getX();
  }

  public int getCenterY() {
    return this.center.getY();
  }

  public int[] getCenterXY() {
    int[] XY = new int[2];
    return XY;
  }

  public void setCenter(MyPoint center) {
    this.center = center;
  }

  public void setCenterX(int x) {
    this.center.setX(x);
  }

  public void setCenterY(int y) {
    this.center.setY(y);
  }

  public void setCenterXY(int x, int y) {
    this.center.setXY(x, y);
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return super.toString() + "-> MyCircle [center=" + center + ", radius=" + radius + "]";
  }

}
