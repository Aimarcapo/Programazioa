package HerenciaMyPoint;

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
        return x;
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

    

    @Override
    public String toString() {
        return "MyPoint [x=" + x + ", y=" + y + "]";
    }

    public double distance(){
        int xtotal = this.x;
        int ytotal = this.y;
        //double distancia = Math.sqrt(Math.pow(xtotal, 2) + Math.pow(ytotal, 2));
        double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }
    
    public double distance(MyPoint p){
        int xtotal = this.x - p.getX();
        int ytotal = this.y - p.getY();
        double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }

    public double distance(int x2, int y2) {
        int xtotal = this.x - x2;
        int ytotal = this.y - y2;
        double distancia = Math.sqrt(xtotal * xtotal + ytotal * ytotal);
        return distancia;
    }

    public int[] getXY() {
        int[] coordenada =new int[2];
        coordenada[0] = getX();//3
        coordenada[1]= getY();//4
        return coordenada;
    }

    public void setXY(int x, int y){
        int[] coordenada = getXY();
        coordenada[0] =  x;
        coordenada[1] =  y; 
    }

}
