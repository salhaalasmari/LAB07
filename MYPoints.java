public class MYPoints {
    private int x;
    private  int y ;
    private  int z;

    public MYPoints(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z=z;
    }
public MYPoints(int x){
        this.x=x;
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
        return "MYPoints{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
