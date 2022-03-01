package Unit9_Inheritance.Examples.Shapes;

public class Rectangle extends Shape{
    private int length;
    private int width;
    private int numSide;

    public Rectangle(String name, String color, int length, int width, int numSide) {
        super(name, color);
        this.length = length;
        this.width = width;
        this.numSide = 4;
    }
}
