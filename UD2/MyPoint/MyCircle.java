
public class MyCircle{
private MyPoint center=new MyPoint(0,0);
private int radius=1;

public MyCircle() {
}

public MyCircle(int x, int y,int radius) {
    center.setX(x);
    center.setY(y);
    this.radius=radius;
}
public MyCircle(MyPoint center,int radius) {
   this.center.setX(center.getX());
   this.center.setY(center.getY());
    this.radius=radius;
}
public double distance(MyCircle p){
    return this.center.distance(p.center);

    /*
    int xtotal = this.center.distance() - p.x;
    int ytotal = this.y - p.y;
    double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
    return distancia;
    */
}
public boolean isInside(MyPoint puntua){
    if(puntua.distance(this.center)<radius){
return true;
    }
    else{
        return false;
    }
}
public double getArea(){
   return Math.PI *(radius*radius);
}
public MyPoint getCenter(){
return center;
}
public int getCenterX(){
    return this.center.getX();
}
public int getCenterY(){
    return this.center.getY();
}
public int[2] getCenterXY(){
    return this.center.getXY();
}
public String toString(){
    return "MyCircle[radius="+radius+",center="+center+"]";
}
}