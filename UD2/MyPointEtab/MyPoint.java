
package MyPointEtab;

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
}