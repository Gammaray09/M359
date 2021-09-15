package Unit2_UsingObjects.PracticeQuiz;

public class ToyTester {
    public static void main(String[] args) {
        Toy myTruck = new Toy("Tonka", 10.00);

        double total = myTruck.calcTotal();

        System.out.println("Total cost: $" + total);

    }
}
