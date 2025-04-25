package shapes;

import airflight.City;

public class Point {
    protected int x;
    protected int y;

    {
        x = 0;
        y = 0;
    }

    public int getX(){ return x; }
    public int getY(){ return y; }
    public void setX(int value){ x = value; }
    public void setY(int value){ y = value; }

    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String ToString(){
        return "Point: (" + x + "," + y + ")";
    }
}

