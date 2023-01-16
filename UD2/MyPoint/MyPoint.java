


public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[] getXY() {
        int[]XY={x, y};
        return XY;

    }

    public void setX(int x) {
        this.x = x;

    }
    
    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        int xtotal = this.x;
        int ytotal = this.y;
        double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }

    public double distance(int x2, int y2) {
        int xtotal = this.x - x2;
        int ytotal = this.y - y2;
        double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }

    public double distance(MyPoint p){
        int xtotal = this.x - p.x;
        int ytotal = this.y - p.y;
        double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyPoint other = (MyPoint) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
}