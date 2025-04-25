package shapes;

public abstract class Shape {
    Point point;

    {
        point = new Point();
    }

    public Shape(){}
    public Shape(Point point){
        this.point = point;
    }
    public Shape(int x, int y){
        this.point = new Point(x, y);
    }

    public Point getPoint(){ return point; }
    public void setPoint(Point value){ point = value; }
    public void setPoint(int x, int y){ point = new Point(x, y); }

    public abstract double Square();
    public abstract double Perimetr();

    @Override
    public String toString() {
        return "(" + point.x + "," + point.y + ")";
    }
}
