public class MyPoint {
    private int x=0;
    private int y=0;
    public MyPoint(){

    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y; 
    }
    public int getX() {
        return x;
    }
    public int[] getXY(){
        int[]XY={x, y};
        return XY;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double distance(){
        int xtotal=this.x;
        int ytotal=this.y;
        double distancia=Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }
    public double distance(int x2,int y2){
        int xtotal=this.x-x2;
        int ytotal=this.y-y2;
        double distancia=Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }
    public double distance(MyPoint p){
        int xtotal=this.getX()-p.getX();
        int ytotal=this.getY()-p.getY();
        double distancia=Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }
    @Override
    public String toString() {
        return "MyPoint [x=" + x + ", y=" + y + "]";
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
