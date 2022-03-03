package Unit9_Inheritance.Examples.Shapes;

public class Circle extends Shape{
    private int radius;


    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }


    public double findArea(){
        double area =  Math.PI * Math.pow(radius,2);
        return area;
    }

    @Override
    public String toString() {
        return "Shape(" + super.getName() +"): Radius("+this.radius + "), " + super.getColor();
    }
}

