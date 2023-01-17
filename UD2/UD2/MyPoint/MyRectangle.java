public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint p1, MyPoint p2) {
        int left, right, top, bottom;
        if (p1.getX() - p2.getX() <= 0) {
            left = p1.getX();
            right = p2.getX();
            if (p1.getY() - p2.getY() <= 0) {
                bottom = p1.getY();
                top = p2.getY();

                this.topLeft = new MyPoint(left, top);
                this.bottomRight = new MyPoint(right, bottom);

            } else {
                top = p1.getY();
                bottom = p2.getY();
                this.topLeft = new MyPoint(left, top);
                this.bottomRight = new MyPoint(right, bottom);
            }
        }
        else{
            right = p1.getX();
             left = p2.getX();
            if (p1.getY() - p2.getY() <= 0) {
                bottom = p1.getY();
                top = p2.getY();

                this.topLeft = new MyPoint(left, top);
                this.bottomRight = new MyPoint(right, bottom);

            } else {
                top = p1.getY();
                bottom = p2.getY();
                this.topLeft = new MyPoint(left, top);
                this.bottomRight = new MyPoint(right, bottom);
            }
        }
    }
}
