public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    public MyRectangle(MyPoint p1, MyPoint p2) {
      
        int left;
        int right;
        int top;
        int bottom;
        if(p1.getX()-p2.getX()<=0){
            left=p1.getX();
            right=p2.getX();
            if(p1.getY()-p2.getY()<=0){
            bottom=p1.getY();
            top=p2.getY();
            }
            else{
                top=p1.getY();
                bottom=p2.getY();  
            }
        }
        else{
            right=p1.getX();
            left=p2.getX();
            if(p1.getY()-p2.getY()<=0){
                bottom=p1.getY();
                top=p2.getY();
                }
                else{
                    top=p1.getY();
                    bottom=p2.getY();  
                }  
        }

        this.topLeft = new MyPoint(left, top);
        this.bottomRight = new MyPoint(right, bottom);
    }
    public double getAzalera(){
        return (topLeft.getY()-bottomRight.getY())*(bottomRight.getX()-topLeft.getX());
    }
    public double getPerimetroa(){
        return 2*(topLeft.getY()-bottomRight.getY())+2*(bottomRight.getX()-topLeft.getX());
    }
    public MyPoint getTopLeft() {
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    @Override
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
    
}
