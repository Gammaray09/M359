package Unit9_Inheritance.Examples.Shapes;

public class Circle extends Shape{
    private String radius;


    public Circle(String name, String color, String radius) {
        super(name, color);
        this.radius = radius;
    }
}
