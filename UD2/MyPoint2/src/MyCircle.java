public class MyCircle extends MyPoint{
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
    center=new MyPoint(0,0);
    int radius = 1;
    }

public MyCircle(int x,int y,int radius){
    center=new MyPoint(x,y);
    this.radius=radius;
}

    public MyCircle(MyPoint circle, int radius) {
        this.center.setX(circle.getX()); 
        this.center.setY(circle.getY()); 
        this.radius = radius;
    }
  public double distance (MyCircle p ){
    return  this.distance(p.center);
    
  }
}
