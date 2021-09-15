package Unit2_UsingObjects.Examples.cars;
import java.util.Scanner;

public class carTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for car name
        System.out.println("Enter Car Name:");
        String carName = input.nextLine();

        System.out.println("Enter Model Year Name:");
        int modelYear = input.nextInt();

        // create a car 2018 Honda Accord
        Car car1 = new Car(carName, modelYear);
        car1.printInfo();

    }

}
