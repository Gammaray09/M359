package Unit9_Inheritance.Examples.Shapes;

public class Shape {
    private String name;
    private String color;


    public Shape() {
        this.name = "No Name Given";
        this.color = "No Color Given";
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
