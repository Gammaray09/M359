package Unit2_UsingObjects.Examples;

public class WrapperClassExample {
    public static void main(String[] args) {

        // wrapper classes for int and double
        Integer x = new Integer(17);
        Double y = new Double(5.8);

        // extract the underlying value
        int xVal = x.intValue();
        double yVal = y.doubleValue();

        // prints value
        System.out.println(xVal);
        System.out.println(yVal);

        // java automatically boxes and unboxes for us
        Integer perYear = 2021;
        System.out.println(perYear);


        //1.Create a double variable using autoboxing and then have it print its value out
        Double gpa = 3.8;
        System.out.println("GPA:" + gpa);

        //print the min and max integer values
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
