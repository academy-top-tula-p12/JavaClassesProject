package shapes;

public class Rectangle extends Shape {
    double width;
    double height;

    {
        width = 0;
        height = 0;
    }

    public Rectangle(){}
    public Rectangle(int x, int y, double width, double height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double Square() {
        return width * height;
    }

    @Override
    public double Perimetr() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " [" + width + "|" + height + "]";
        return result;
    }
}
