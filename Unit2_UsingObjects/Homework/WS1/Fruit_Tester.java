package Unit2_UsingObjects.Homework.WS1;

public class Fruit_Tester {
    public static void main(String[] args) {
        Fruit myFruit1 = new Fruit("Mango", true);
        myFruit1.printInfo();

        Fruit myfruit2 = new Fruit("Pineapple", false);
        myfruit2.printInfo();

        int fruit2Servings = myfruit2.getServings();
        System.out.println(fruit2Servings);
    }
}
