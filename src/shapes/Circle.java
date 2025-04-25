package shapes;

public class Circle extends Shape {
    double radius;

    public Circle(int x, int y, double radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double Square() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double Perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "((" + radius + "))";
        return result;
    }
}
