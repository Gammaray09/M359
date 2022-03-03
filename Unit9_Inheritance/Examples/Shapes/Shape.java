package Unit9_Inheritance.Examples.Shapes;

public class Shape {
    private String name;
    private String color;


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }




    public String getName() { return name; }
    public String getColor() { return color; }

    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }

}
