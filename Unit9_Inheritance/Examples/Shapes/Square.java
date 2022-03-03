package Unit9_Inheritance.Examples.Shapes;

public class Square extends Rectangle{

    public Square(String name, String color, int length) {
        super(name, color, length, length);
    }




    @Override
    public String toString() {
        return "Shape(" + super.getName() +"):"+
                super.getLength()+ "x" + super.getWidth()+",SideLength(" +super.getNumSide() +"), "
                + super.getColor();
    }
}
