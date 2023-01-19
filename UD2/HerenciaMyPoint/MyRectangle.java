package HerenciaMyPoint;

public class MyRectangle extends MyPoint {

    private MyPoint topLeft;
    private MyPoint bottonRight;

    public MyRectangle(int x, int y, MyPoint topLeft, MyPoint bottonRight) {
        super(x, y);
        this.topLeft = topLeft;
        this.bottonRight = bottonRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getbottonRight() {
        return bottonRight;
    }

    public void setbottonRight(MyPoint bottonRight) {
        this.bottonRight = bottonRight;
    }

    @Override
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottonRight=" + bottonRight + "]";
    }

    public double getAzalera() {    
        double azalera = (topLeft.getY() - bottonRight.getY()) * (bottonRight.getX() - topLeft.getX());
        return azalera;
    }

    public double getPerimeter() {
        double perimeter = 2*(topLeft.getY() - bottonRight.getY()) + 2*(bottonRight.getX() - topLeft.getX());
        return perimeter;
    }


    
}
