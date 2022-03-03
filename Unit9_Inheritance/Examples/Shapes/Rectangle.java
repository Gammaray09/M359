package Unit9_Inheritance.Examples.Shapes;

public class Rectangle extends Shape{
    private int length;
    private int width;
    private int numSide;


    public Rectangle() {
        super("Rectangle", "Black");
        this.length = length;
        this.width = width;
        numSide = 4;
    }
    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
        numSide = 4;
    }


    public double findArea(){
        double area = this.length * this.width;
        return area;
    }

    public void scaleSize(double scale){
        this.length *= scale;
        this.width *= scale;
    }


    @Override
    public String toString() {
        return "Shape(" + super.getName() +"):"+
                this.length + "x" + this.width+",SideLength("+this.numSide+"), "+ super.getColor();
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
    public int getNumSide() { return numSide; }

    public void setLength(int length) { this.length = length; }
    public void setWidth(int width) { this.width = width; }
    public void setNumSide(int numSide) { this.numSide = numSide; }
}

