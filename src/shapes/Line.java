package shapes;

public class Line extends Point{
    int dx;
    int dy;

    {
        dx = dy = 0;
    }

    public int getDX(){ return dx; }
    public int getDY(){ return dy; }
    public void setDX(int value){ dx = value; }
    public void setDY(int value){ dy = value; }

    public Line(){}
    public Line(int x, int y, int dx, int dy){
        super(x, y);
        this.dx = dx;
        this.dy = dy;
    }

    public Line(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
    }

    public String ToString(){
        return "Line: (" + x + "," + y + ") - (" + (x + dx) + "," + (y + dy) + ")";
    }
}
